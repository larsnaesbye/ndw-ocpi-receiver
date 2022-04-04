package nu.ndw.ncis.core.parsing;

import nu.ndw.ncis.core.exception.NdwProcessingException;

@Deprecated
public interface StringToObjectParser<T> {
    T parseStringToObject(String objectData) throws NdwProcessingException;

    String parseObjectToString(T object) throws NdwProcessingException;
}
