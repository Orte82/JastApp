package com.orte.boostbrain.reflection;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.CONSTRUCTOR, ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.METHOD,ElementType.PACKAGE})
public @interface RabbitAnnotation {
}
