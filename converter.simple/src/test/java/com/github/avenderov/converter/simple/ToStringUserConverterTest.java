package com.github.avenderov.converter.simple;

import com.github.avenderov.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToStringUserConverterTest {

    private final ToStringUserConverter underTest = ToStringUserConverter.provider();

    @Test
    void shouldUseToStringMethodToConvert() {
        final User user = new User("John", "Doe");

        assertEquals("User{firstName='John', lastName='Doe'}", underTest.convert(user));
    }

}
