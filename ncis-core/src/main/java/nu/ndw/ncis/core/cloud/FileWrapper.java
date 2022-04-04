package nu.ndw.ncis.core.cloud;

import lombok.Builder;
import lombok.Value;

@Builder(toBuilder = true)
@Value
public class FileWrapper {
    String fileName;
    byte[] content;
}
