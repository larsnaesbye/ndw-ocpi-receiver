package nu.ndw.ncis.core.file.compression;

import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.exception.NdwProcessingException;

import java.io.InputStream;

public interface FileDecompressor {

    /**
     * @deprecated
     */
    @Deprecated(since = "2.3.0")
    FileWrapper decompressFile(FileWrapper compressedFile) throws NdwProcessingException;

    InputStream decompressStream(InputStream compressedInputStream);

    byte[] decompressContent(byte[] compressedContent);

    Compression getType();

    default String getFileNameWithoutExtension(String fileName) {
        return fileName.replace(getType().getExtension(), "");
    }
}
