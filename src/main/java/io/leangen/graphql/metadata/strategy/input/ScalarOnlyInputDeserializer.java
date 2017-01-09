package io.leangen.graphql.metadata.strategy.input;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Type;

public class ScalarOnlyInputDeserializer implements InputDeserializer {

    @Override
    public <T> T deserialize(Object graphQlInput, Type sourceType, AnnotatedType type) {
        if (graphQlInput.getClass() == type.getType()) {
            return (T) graphQlInput;
        }
        throw new IllegalArgumentException("Deserialization failed");
    }

    @Override
    public <T> T deserializeString(String json, AnnotatedType type) {
        if (type.getType() == String.class) {
            return (T) json;
        }
        throw new IllegalArgumentException("Deserialization failed");
    }
}
