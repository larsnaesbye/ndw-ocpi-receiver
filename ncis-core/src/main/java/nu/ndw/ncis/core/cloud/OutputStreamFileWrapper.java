package nu.ndw.ncis.core.cloud;

import lombok.Builder;
import lombok.Value;

import java.io.OutputStream;

@Value
@Builder(toBuilder = true)
public class OutputStreamFileWrapper implements StreamableFileWrapper {
    String fileName;
    OutputStream outputStream;
}
