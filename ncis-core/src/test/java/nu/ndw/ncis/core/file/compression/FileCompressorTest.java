package nu.ndw.ncis.core.file.compression;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.spy;

@ExtendWith(MockitoExtension.class)
class FileCompressorTest {

    private static final String FILE_NAME = "filename";

    private final FileCompressor fileCompressor = spy(FileCompressor.class);

    @ParameterizedTest
    @EnumSource(Compression.class)
    void testShouldHaveCorrectExtensionGivenCertainFileCompressorIsUsed(Compression compression) {
        willReturn(compression).given(fileCompressor).getType();

        String fileNameWithExtension = fileCompressor.getFileNameWithExtension(FILE_NAME);
        assertThat(fileNameWithExtension)
                .isNotNull()
                .endsWith(compression.getExtension());
    }

    @ParameterizedTest
    @EnumSource(Compression.class)
    void testShouldHaveOneExtensionGivenFileNameAlreadyContainsExtension(Compression compression) {
        willReturn(compression).given(fileCompressor).getType();

        String fileNameWithExtension =
                fileCompressor.getFileNameWithExtension(FILE_NAME + compression.getExtension());
        assertThat(fileNameWithExtension)
                .isNotNull()
                .endsWith(compression.getExtension())
                .doesNotEndWith(compression.getExtension() + compression.getExtension());
    }
}
