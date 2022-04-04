package nu.ndw.ncis.core.file.compression;

public enum Compression {
    GZIP(".gz"),
    LZ4(".lz4");

    private final String extension;

    Compression(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public static Compression getByFileName(String fileName) {
        return fileName.endsWith(LZ4.getExtension()) ? LZ4 : GZIP;
    }
}
