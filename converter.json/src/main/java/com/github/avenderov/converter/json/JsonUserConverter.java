package com.github.avenderov.converter.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.github.avenderov.converter.UserConverter;
import com.github.avenderov.model.User;

import java.io.UncheckedIOException;

public final class JsonUserConverter implements UserConverter {

    private final ObjectMapper mapper;

    public JsonUserConverter() {
        mapper =
                new ObjectMapper()
                        .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                        .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                        .enable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    @Override
    public String convert(final User user) {
        try {
            return user == null ? null : mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new UncheckedIOException(e);
        }
    }

}
