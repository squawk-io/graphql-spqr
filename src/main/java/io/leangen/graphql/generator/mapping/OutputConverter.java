package io.leangen.graphql.generator.mapping;

import java.lang.reflect.AnnotatedType;

import io.leangen.graphql.metadata.strategy.input.InputDeserializer;
import io.leangen.graphql.query.ExecutionContext;

/**
 * @author Bojan Tomic (kaqqao)
 */
public interface OutputConverter<T, S> {

    S convertOutput(T original, AnnotatedType type, InputDeserializer inputDeserializer, ExecutionContext executionContext);
    boolean supports(AnnotatedType type);
}
