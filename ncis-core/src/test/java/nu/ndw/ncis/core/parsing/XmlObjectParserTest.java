package nu.ndw.ncis.core.parsing;

import nu.ndw.ncis.core.exception.NdwProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.xml.bind.UnmarshalException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class XmlObjectParserTest {
    private XmlObjectParser<Book> carParser;

    @BeforeEach
    void setUp() throws Exception {
        carParser = new XmlObjectParser<>(Book.class);
    }

    @Test
    void testObjectToString() throws Exception {
        Book bookObj = new Book("Game Of Thrones");
        String expectedXml = "<book><publicationTime/><title>Game Of Thrones</title></book>";

        String gottonBookXml = carParser.parseObjectToString(bookObj);

        assertThat(gottonBookXml).contains(expectedXml);
    }

    @Test
    void testStringToObject() throws Exception {
        String bookXml = "<book><title>Game Of Thrones</title></book>";
        Book expectedBook = new Book("Game Of Thrones");

        Book gottenBookObj = carParser.parseStringToObject(bookXml);

        assertThat(gottenBookObj.title).isEqualTo(expectedBook.title);
    }

    @Test
    void testParseDataShouldThrowExceptionGivenFaultyTestFile() {
        String xml = "not XML";

        Throwable throwable = catchThrowable(() -> carParser.parseStringToObject(xml));

        assertThat(throwable)
                .isInstanceOf(NdwProcessingException.class)
                .hasMessage("Error occurred during unmarshalling of Book")
                .hasCauseInstanceOf(UnmarshalException.class);
    }
}
