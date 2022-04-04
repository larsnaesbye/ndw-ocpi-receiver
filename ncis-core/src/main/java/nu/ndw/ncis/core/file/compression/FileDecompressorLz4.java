package nu.ndw.ncis.core.file.compression;

import net.jpountz.lz4.LZ4FrameInputStream;
import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class FileDecompressorLz4 implements FileDecompressor {
    private static final int BUFFER_SIZE = 1024;

    /**
     * @deprecated
     */
    @Deprecated(since = "2.3.0")
    public FileWrapper decompressFile(FileWrapper compressedFile) throws NdwProcessingException {
        try {
            return FileWrapper.builder()
                    .fileName(removeLz4Extension(compressedFile.getFileName()))
                    .content(decompressContent(compressedFile.getContent()))
                    .build();
        } catch (NdwProcessingException e) {
            throw new NdwProcessingException("Unable to unzip file \"" + compressedFile.getFileName() + "\".", e);
        }
    }

    public InputStream decompressStream(InputStream compressedInputStream) {
        try {
            return new LZ4FrameInputStream(compressedInputStream);
        } catch (IOException exception) {
            throw new NdwProcessingException("Unable to unzip file.", exception);
        }
    }

    public byte[] decompressContent(byte[] compressedContent) {
        try (var bais = new ByteArrayInputStream(compressedContent);
             var fis = new LZ4FrameInputStream(bais);
             var baos = new ByteArrayOutputStream()
        ) {
            var buffer = new byte[BUFFER_SIZE];
            int len;

            while ((len = fis.read(buffer)) > 0) {
                baos.write(buffer, 0, len);
            }

            return baos.toByteArray();
        } catch (IOException exception) {
            throw new NdwProcessingException("Unable to unzip file!", exception);
        }
    }

    @Override
    public Compression getType() {
        return Compression.LZ4;
    }

    /**
     * @deprecated
     */
    @Deprecated(since = "2.3.0")
    private static String removeLz4Extension(String fileName) {
        return fileName.replace(Compression.LZ4.getExtension(), "");
    }
}
