package nu.ndw.ncis.core.file.compression;

import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

@Component
public class FileDecompressorGzip implements FileDecompressor {
    private static final int BUFFER_SIZE = 1024;

    /**
     * @deprecated
     */
    @Deprecated(since = "2.3.0")
    public FileWrapper decompressFile(FileWrapper compressedFile) throws NdwProcessingException {
        try {
            return FileWrapper.builder()
                    .fileName(removeGzipExtension(compressedFile.getFileName()))
                    .content(decompressContent(compressedFile.getContent()))
                    .build();
        } catch (NdwProcessingException e) {
            throw new NdwProcessingException("Unable to unzip file \"" + compressedFile.getFileName() + "\".", e);
        }
    }

    public InputStream decompressStream(InputStream compressedInputStream) {
        try {
            return new GZIPInputStream(compressedInputStream);
        } catch (IOException exception) {
            throw new NdwProcessingException("Unable to unzip file.", exception);
        }
    }

    public byte[] decompressContent(byte[] compressedContent) {
        try (var bais = new ByteArrayInputStream(compressedContent);
             var gis = new GZIPInputStream(bais);
             var baos = new ByteArrayOutputStream()
        ) {
            var buffer = new byte[BUFFER_SIZE];
            int len;

            while ((len = gis.read(buffer)) > 0) {
                baos.write(buffer, 0, len);
            }

            return baos.toByteArray();
        } catch (IOException exception) {
            throw new NdwProcessingException("Unable to unzip file!", exception);
        }
    }

    @Override
    public Compression getType() {
        return Compression.GZIP;
    }

    /**
     * @deprecated
     */
    @Deprecated(since = "2.3.0")
    private static String removeGzipExtension(String fileName) {
        return fileName.replace(Compression.GZIP.getExtension(), "");
    }
}
