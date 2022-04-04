package nu.ndw.ncis.core.parsing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import nu.ndw.ncis.core.exception.NdwProcessingException;

@Deprecated
public class JsonObjectParser<T> implements StringToObjectParser<T> {

    private final ObjectMapper objectMapper;
    private final Class<T> typeParameterClass;

    public JsonObjectParser(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
        this.objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Override
    public T parseStringToObject(String string) {
        try {
            return objectMapper.readValue(string, typeParameterClass);
        } catch (JsonProcessingException e) {
            throw new NdwProcessingException("Error occurred during unmarshalling of "
                    + typeParameterClass.getSimpleName(), e);
        }
    }

    @Override
    public String parseObjectToString(T object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new NdwProcessingException("Error occurred during marshalling of " +
                    typeParameterClass.getSimpleName(), e);
        }
    }
}

