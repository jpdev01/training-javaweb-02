package com.core.components.form.field;

public class TextFieldForm extends FieldForm{
    public TextFieldForm(String id, String label, Integer group)
    {
        super(id, label, group, FieldFormType.TEXT);
    }
    private String value;
}
