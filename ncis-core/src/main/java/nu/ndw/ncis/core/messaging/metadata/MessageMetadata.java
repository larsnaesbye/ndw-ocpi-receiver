package nu.ndw.ncis.core.messaging.metadata;

import lombok.Value;

import java.time.Instant;

@Value
public class MessageMetadata {
    public static final String HEADER_FIRST_SEEN = "x-first-seen";

    String correlationId;
    Instant firstSeen;
}
