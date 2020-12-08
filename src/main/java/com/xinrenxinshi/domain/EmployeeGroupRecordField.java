package com.xinrenxinshi.domain;


/**
 * 当前描述：
 *
 * @author: jiazijie
 * @since: 2020/9/28 下午5:44
 */
public class EmployeeGroupRecordField {
    /**
     * 字段id - uuid
     */
    private String fieldId;

    /**
     * 页面显示 field 名字 - 新/续签
     */
    private String fieldIdName;

    /**
     * 字段值 - 0
     */
    private String fieldValue;

    /**
     * 页面显示 字段值 对应 名字 - 新签
     */
    private String fieldValueName;

    public EmployeeGroupRecordField() {
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldIdName() {
        return fieldIdName;
    }

    public void setFieldIdName(String fieldIdName) {
        this.fieldIdName = fieldIdName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getFieldValueName() {
        return fieldValueName;
    }

    public void setFieldValueName(String fieldValueName) {
        this.fieldValueName = fieldValueName;
    }
}