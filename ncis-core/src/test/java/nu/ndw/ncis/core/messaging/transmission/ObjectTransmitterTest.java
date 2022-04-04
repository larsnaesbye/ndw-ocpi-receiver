package nu.ndw.ncis.core.messaging.transmission;

import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.cloud.service.CloudStorageService;
import nu.ndw.ncis.core.exception.NdwCloudStorageException;
import nu.ndw.ncis.core.exception.NdwMessagingException;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.messaging.publisher.RabbitMQPublisher;
import nu.ndw.ncis.core.parsing.StringToObjectParser;
import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyMap;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ObjectTransmitterTest {
    private static final String CONTENT = "content";
    private static final String FILE_NAME_PREFIX = "fileNamePrefix";
    private static final String TEST_EXCEPTION_MESSAGE = "Test Exception";
    private static final String FILEWRAPPER_CONTENT_FIELD_NAME = "content";

    @Mock
    private CloudStorageService cloudStorageService;

    @Mock
    private StringToObjectParser<Object> stringToObjectParser;

    @Mock
    private RabbitMQPublisher rabbitMQPublisher;

    @Mock
    private FileCompressor fileCompressor;

    private ObjectTransmitter<Object> objectTransmitterString;

    public static final Object TEST_OBJECT = new Object();

    @BeforeEach
    @SuppressWarnings("unchecked")
    void setUp() {
        objectTransmitterString = new ObjectTransmitter<>(
                cloudStorageService,
                stringToObjectParser,
                FILE_NAME_PREFIX,
                rabbitMQPublisher,
                fileCompressor);
    }

    @Test
    void testTransmitObjectWithoutException() {
        doReturn(CONTENT).when(stringToObjectParser).parseObjectToString(TEST_OBJECT);
        doAnswer(x -> x.getArgument(0)).when(fileCompressor).getFileNameWithExtension(anyString());

        objectTransmitterString.transmitObject(TEST_OBJECT);

        ArgumentCaptor<FileWrapper> fileWrapperArgumentCaptor = ArgumentCaptor.forClass(FileWrapper.class);
        verify(cloudStorageService).saveFileToCloud(fileWrapperArgumentCaptor.capture());

        assertThat(fileWrapperArgumentCaptor.getValue()).isNotNull()
                                                        .hasFieldOrPropertyWithValue(FILEWRAPPER_CONTENT_FIELD_NAME,
                                                                                     CONTENT.getBytes(
                                                                                             StandardCharsets.UTF_8))
                                                        .extracting(FileWrapper::getFileName,
                                                                    as(InstanceOfAssertFactories.STRING))
                                                        .startsWith(FILE_NAME_PREFIX);

        verify(rabbitMQPublisher).send(fileWrapperArgumentCaptor.getValue().getFileName());
    }

    @Test
    void testTransmitObjectParserThrowsException() {
        NdwProcessingException testException = new NdwProcessingException(TEST_EXCEPTION_MESSAGE);
        doThrow(testException).when(stringToObjectParser).parseObjectToString(TEST_OBJECT);

        Throwable throwable = catchThrowable(() -> objectTransmitterString.transmitObject(TEST_OBJECT));

        assertThat(throwable).isSameAs(testException);
    }

    @Test
    void testTransmitObjectCloudStorageThrowsException() {
        doReturn(CONTENT).when(stringToObjectParser).parseObjectToString(TEST_OBJECT);

        NdwCloudStorageException testException = new NdwCloudStorageException(TEST_EXCEPTION_MESSAGE);
        doThrow(testException).when(cloudStorageService).saveFileToCloud(any(FileWrapper.class));

        Throwable throwable = catchThrowable(() -> objectTransmitterString.transmitObject(TEST_OBJECT));

        assertThat(throwable).isSameAs(testException);
    }

    @Test
    void testTransmitObjectRabbitmqThrowsException() {
        when(stringToObjectParser.parseObjectToString(TEST_OBJECT)).thenReturn(CONTENT);
        doAnswer(x -> x.getArgument(0)).when(fileCompressor).getFileNameWithExtension(anyString());

        NdwMessagingException testException = new NdwMessagingException(TEST_EXCEPTION_MESSAGE);
        doThrow(testException).when(rabbitMQPublisher).send(anyString());

        Throwable throwable = catchThrowable(() -> objectTransmitterString.transmitObject(TEST_OBJECT));

        assertThat(throwable).isSameAs(testException);
    }
}
