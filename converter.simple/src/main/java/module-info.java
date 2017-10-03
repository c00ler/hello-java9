module avenderov.test.converter.simple {
    requires avenderov.test.model;

    provides com.github.avenderov.converter.UserConverter
            with com.github.avenderov.converter.simple.ToStringUserConverter;
}
