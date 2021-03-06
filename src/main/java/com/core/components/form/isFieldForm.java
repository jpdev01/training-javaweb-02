package com.core.components.form;

import com.core.components.form.field.FieldFormType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface isFieldForm {
    boolean isVisible();
    String label();
    int group();
    FieldFormType type() default FieldFormType.TEXT;
}
