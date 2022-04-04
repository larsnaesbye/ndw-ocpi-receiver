package nu.ndw.ncis.core.cloud;

import lombok.Builder;
import lombok.Value;

import java.io.InputStream;

@Value
@Builder(toBuilder = true)
public class InputStreamFileWrapper implements StreamableFileWrapper {
    String fileName;
    InputStream inputStream;
}
