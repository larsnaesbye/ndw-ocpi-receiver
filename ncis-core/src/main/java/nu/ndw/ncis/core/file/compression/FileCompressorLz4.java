package nu.ndw.ncis.core.file.compression;

import net.jpountz.lz4.LZ4FrameOutputStream;
import nu.ndw.ncis.core.exception.NdwProcessingException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileCompressorLz4 implements FileCompressor {

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
            return new LZ4FrameOutputStream(uncompressedOutputStream);
        } catch (IOException exception) {
            throw new NdwProcessingException("Exception when compressing file content", exception);
        }
    }

    @Override
    public byte[] compressContent(byte[] content) {
        try (var os = new ByteArrayOutputStream();
             var gs = new LZ4FrameOutputStream(os)) {
            gs.write(content);
            gs.flush();
            gs.close();
            return os.toByteArray();
        } catch (IOException e) {
            throw new NdwProcessingException("Exception when compressing file content", e);
        }
    }

    @Override
    public Compression getType() {
        return Compression.LZ4;
    }
}
