package com.xinrenxinshi.domain.calculation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlatformFieldDockingResult implements Serializable {
    private static final long serialVersionUID = -6326036138062480279L;

    /**
     * 字段id
     */
    private String fieldId;

    /**
     * 字段所属分组id
     */
    private Integer groupId;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 字段类型(数值类、单行文本、多行本文等)
     * @See EPayrollCustomFieldType
     */
    private Integer type;

    /**
     * 最大长度
     */
    private Integer maxLength;

    /**
     * 小数位数
     */
    private Integer decimalPlace;

    /**
     * 提示
     */
    private String placeholder;

    /**
     * 是否系统关联字段
     */
    private Integer isSystemField;




    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getDecimalPlace() {
        return decimalPlace;
    }

    public void setDecimalPlace(Integer decimalPlace) {
        this.decimalPlace = decimalPlace;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public Integer getIsSystemField() {
        return isSystemField;
    }

    public void setIsSystemField(Integer isSystemField) {
        this.isSystemField = isSystemField;
    }
}
