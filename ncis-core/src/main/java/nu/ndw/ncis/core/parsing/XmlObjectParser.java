package nu.ndw.ncis.core.parsing;

import nu.ndw.ncis.core.exception.NdwException;
import nu.ndw.ncis.core.exception.NdwProcessingException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBIntrospector;
import java.io.StringReader;
import java.io.StringWriter;

@Deprecated
public class XmlObjectParser<T> implements StringToObjectParser<T> {
    private final JAXBContext jaxbContext;
    private final Class<T> typeParameterClass;

    public XmlObjectParser(Class<T> typeParameterClass) throws NdwException {
        this.typeParameterClass = typeParameterClass;
        try {
            jaxbContext = JAXBContext.newInstance(typeParameterClass);
        } catch (JAXBException e) {
            throw new NdwException("Exception during initialization of jaxb context", e);
        }
    }

    @Override
    public T parseStringToObject(String objectData) throws NdwProcessingException {
        try (StringReader stringReader = new StringReader(objectData)) {
            Object unmarshalledObject = jaxbContext.createUnmarshaller().unmarshal(stringReader);
            return (T) JAXBIntrospector.getValue(unmarshalledObject);
        } catch (JAXBException e) {
            throw new NdwProcessingException("Error occurred during unmarshalling of "
                    + typeParameterClass.getSimpleName(), e);
        }
    }

    @Override
    public String parseObjectToString(T tmpTablePublication) throws NdwProcessingException {
        StringWriter stringWriter = new StringWriter();
        try {
            jaxbContext.createMarshaller().marshal(tmpTablePublication, stringWriter);
            return stringWriter.toString();
        } catch (JAXBException e) {
            throw new NdwProcessingException("Error occurred during marshalling of "
                    + typeParameterClass.getSimpleName(), e);
        }
    }
}
