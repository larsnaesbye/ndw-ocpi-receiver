package nu.ndw.ncis.core.file.compression;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.spy;

@ExtendWith(MockitoExtension.class)
class FileDecompressorTest {

    private static final String FILE_NAME = "filename";
    private final FileDecompressor fileDecompressor = spy(FileDecompressor.class);

    @ParameterizedTest
    @EnumSource(Compression.class)
    void testShouldHaveExtensionRemovedGivenCertainFileCompressorIsUsed(Compression compression) {
        willReturn(compression).given(fileDecompressor).getType();

        String fileNameWithoutExtension =
                fileDecompressor.getFileNameWithoutExtension(FILE_NAME + compression.getExtension());
        assertThat(fileNameWithoutExtension)
                .isNotNull()
                .isEqualTo(FILE_NAME);
    }

    @ParameterizedTest
    @EnumSource(Compression.class)
    void testShouldHaveNoChangesGivenFileNameAlreadyIsWithoutExtension(Compression compression) {
        willReturn(compression).given(fileDecompressor).getType();

        String fileNameWithoutExtension =
                fileDecompressor.getFileNameWithoutExtension(FILE_NAME);
        assertThat(fileNameWithoutExtension)
                .isNotNull()
                .isEqualTo(FILE_NAME);
    }
}
