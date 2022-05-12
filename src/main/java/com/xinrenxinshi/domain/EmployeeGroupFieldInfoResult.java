package com.xinrenxinshi.domain;

import java.util.List;
import java.util.Map;

/**
 * 分组字段信息返回对象
 *
 * @author hzz on 2022/05/07
 */
public class EmployeeGroupFieldInfoResult {
    /**
     * 字段名
     */
    private String fieldId;
    /**
     * 字段名称
     */
    private String labelName;

    /**
     * 选项数据
     */
    private List<Map<String, String>> dataSource;
    /**
     * 是否必填
     */
    private Integer required;
    /**
     * 最大长度
     */
    private Integer maxLength;
    /**
     * 是否只读
     */
    private Integer readonly;
    /**
     * 是否是固定字段
     */
    private Integer isFixed;

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public List<Map<String, String>> getDataSource() {
        return dataSource;
    }

    public void setDataSource(List<Map<String, String>> dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getReadonly() {
        return readonly;
    }

    public void setReadonly(Integer readonly) {
        this.readonly = readonly;
    }

    public Integer getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(Integer isFixed) {
        this.isFixed = isFixed;
    }
}
