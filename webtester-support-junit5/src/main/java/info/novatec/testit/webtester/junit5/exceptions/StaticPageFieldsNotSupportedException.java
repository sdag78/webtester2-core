package info.novatec.testit.webtester.junit5.exceptions;

import java.lang.reflect.Field;

import info.novatec.testit.webtester.junit5.extensions.pages.Initialized;


/**
 * This exception is thrown in case a static field was wrongfully annotated with the {@link Initialized} annotation.
 *
 * @since 2.1
 */
public class StaticPageFieldsNotSupportedException extends RuntimeException {
    public StaticPageFieldsNotSupportedException(Field field) {
        super("@" + Initialized.class.getSimpleName() + " page fields must not be static: " + field);
    }
}