package nu.ndw.ncis.core.file.compression;

import nu.ndw.ncis.core.exception.NdwProcessingException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class FileCompressorGzip implements FileCompressor {

    /**
     * @deprecated
     */
    @Deprecated(since = "2.3.0")
    @Override
    public byte[] compressFile(byte[] bytes) throws NdwProcessingException {
        return compressContent(bytes);
    }

    @Override
    public OutputStream compressStream(OutputStream uncompressedOutputStream) {
        try {
            return new GZIPOutputStream(uncompressedOutputStream);
        } catch (IOException exception) {
            throw new NdwProcessingException("Exception when compressing file content", exception);
        }
    }

    @Override
    public byte[] compressContent(byte[] content) {
        try (var os = new ByteArrayOutputStream();
             var gs = new GZIPOutputStream(os)) {
            gs.write(content);
            gs.finish();
            return os.toByteArray();
        } catch (IOException e) {
            throw new NdwProcessingException("Exception when compressing file content", e);
        }
    }

    @Override
    public Compression getType() {
        return Compression.GZIP;
    }
}
