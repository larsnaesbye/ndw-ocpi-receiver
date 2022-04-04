package nu.ndw.ncis.core.parsing;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@XmlRootElement(name = "book")
class Book implements Serializable {
    String title;
    Instant publicationTime = Instant.parse("1980-04-09T10:15:30.00Z");

    Book(String title) {
        this.title = title;
    }
}
