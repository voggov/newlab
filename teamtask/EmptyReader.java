package ru.coderiders.teamtask;

import java.lang.reflect.Field;

public class EmptyReader {

    public BrokenFields validate(Object obj, Field field) {
        if (String.class.isAssignableFrom(field.getType())) {
            try {
                String fieldValue = (String) field.get(obj);
                if (fieldValue != null && fieldValue.isEmpty()) {
                    return new BrokenFields(field.getName(), fieldValue, "Is Empty");
                }
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }
        return null;

    }
}
