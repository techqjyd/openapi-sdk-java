package com.xinrenxinshi.domain.apprisal;

public class ApprisalKpiTargetEntryFieldModel {
    private String fieldId;
    private String fieldName;
    private String fieldValue;
    private Integer fieldType;
    private Integer decimalDigit;
    private String unitDesc;

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public Integer getDecimalDigit() {
        return decimalDigit;
    }

    public void setDecimalDigit(Integer decimalDigit) {
        this.decimalDigit = decimalDigit;
    }

    public String getUnitDesc() {
        return unitDesc;
    }

    public void setUnitDesc(String unitDesc) {
        this.unitDesc = unitDesc;
    }
}
