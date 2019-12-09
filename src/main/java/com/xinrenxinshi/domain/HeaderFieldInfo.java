package com.xinrenxinshi.domain;

/**
 * <报表头>.
 *
 * @author peng cheng
 * @date 2019/10/17
 * @since
 */
public class HeaderFieldInfo {

    /**
     * 字段key
     */
    private String field;

    /**
     * 字段名称
     */
    private String fieldName;

    public HeaderFieldInfo() {
    }

    public HeaderFieldInfo(String field, String fieldName) {
        this.field = field;
        this.fieldName = fieldName;
    }


    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

}
