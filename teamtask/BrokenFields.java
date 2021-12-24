package ru.coderiders.teamtask;

public class BrokenFields {

    private  String fieldName;
    private  String fieldValue;
    private  String violatedRule;


    public BrokenFields(String fieldName, String fieldValue, String violatedRule) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.violatedRule = violatedRule;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public String getViolatedRule() {
        return violatedRule;
    }

}
