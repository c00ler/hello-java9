package com.github.avenderov.converter.json;

import com.github.avenderov.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonUserConverterTest {

    private final JsonUserConverter underTest = new JsonUserConverter();

    @Test
    void shouldConvertToJson() {
        final User user = new User("John", "Doe");

        assertEquals("{\"first_name\":\"John\",\"last_name\":\"Doe\"}", underTest.convert(user));
    }

    @Test
    void shouldNotIncludeNull() {
        final User user = new User("John", null);

        assertEquals("{\"first_name\":\"John\"}", underTest.convert(user));
    }

}
