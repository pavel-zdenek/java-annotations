package tech.zdenek.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.CLASS;

// copy of android.support.annotation.NonNull

@Retention(CLASS)
@Target({METHOD, PARAMETER, FIELD})
public @interface NonNull {
}
