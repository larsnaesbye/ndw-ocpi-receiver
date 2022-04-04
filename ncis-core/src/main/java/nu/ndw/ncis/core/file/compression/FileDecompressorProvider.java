package nu.ndw.ncis.core.file.compression;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@RequiredArgsConstructor
public class FileDecompressorProvider {

    @Resource(name = "fileDecompressorGzip")
    private final FileDecompressor fileDecompressorGzip;
    @Resource(name = "fileDecompressorLz4")
    private final FileDecompressor fileDecompressorLz4;

    public FileDecompressor getFileDecompressor(String fileName) {
        return Compression.getByFileName(fileName) == Compression.GZIP
                ? fileDecompressorGzip : fileDecompressorLz4;
    }
}
