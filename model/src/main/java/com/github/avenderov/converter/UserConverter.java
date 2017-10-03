package com.github.avenderov.converter;

import com.github.avenderov.model.User;

import java.util.ServiceLoader;

public interface UserConverter {

    String convert(User user);

    static ServiceLoader<UserConverter> converters() {
        return ServiceLoader.load(UserConverter.class);
    }

}
