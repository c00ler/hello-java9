package com.github.avenderov.main;

import com.github.avenderov.converter.UserConverter;
import com.github.avenderov.model.User;

import static java.lang.System.out;

public class Launcher {

    public static void main(String[] args) {
        out.println("Running...");

        final User user = new User("John", "Doe");

        UserConverter.converters().stream().forEach(p -> {
            out.println(String.format("Converting using %s: %s", p.type().getName(), p.get().convert(user)));
        });

        out.println("Done.");
    }

}
