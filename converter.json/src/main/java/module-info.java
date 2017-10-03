module avenderov.test.converter.json {
    requires avenderov.test.model;

    requires com.fasterxml.jackson.databind;
    requires jackson.annotations;
    requires com.fasterxml.jackson.core;

    provides com.github.avenderov.converter.UserConverter
            with com.github.avenderov.converter.json.JsonUserConverter;
}
