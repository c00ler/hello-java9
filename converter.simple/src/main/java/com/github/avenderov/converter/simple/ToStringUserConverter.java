package com.github.avenderov.converter.simple;

import com.github.avenderov.converter.UserConverter;
import com.github.avenderov.model.User;

public final class ToStringUserConverter implements UserConverter {

    private ToStringUserConverter() {
    }

    @Override
    public String convert(final User user) {
        return user == null ? null : user.toString();
    }

    /**
     * Implementation is created using factory method.
     *
     * @return a new instance of {@link ToStringUserConverter}
     */
    public static ToStringUserConverter provider() {
        return new ToStringUserConverter();
    }

}
