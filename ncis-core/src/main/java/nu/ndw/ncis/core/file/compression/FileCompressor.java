package nu.ndw.ncis.core.file.compression;

import nu.ndw.ncis.core.exception.NdwProcessingException;

import java.io.OutputStream;

public interface FileCompressor {

    /**
     * @deprecated
     */
    @Deprecated(since = "2.3.0")
    byte[] compressFile(byte[] bytes) throws NdwProcessingException;

    OutputStream compressStream(OutputStream uncompressedOutputStream);

    byte[] compressContent(byte[] content);

    Compression getType();

    default String getFileNameWithExtension(String fileName) {
        return fileName.endsWith(getType().getExtension())
                ? fileName : fileName.concat(getType().getExtension());
    }
}
