package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	int value() default 0;
	String value2() default " ";
}
