package com.xinrenxinshi.domain;


import java.util.List;
import java.util.Map;

/**
 * <分组字段信息>.
 *
 * @author peng cheng
 * @date 2020/9/27
 */
public class EmployeeGroupField {

    /**
     * 字段id
     */
    private String fieldId;

    /**
     * 选项数据列表，map的key为添加或更新时入参的选项取值，map的value为对应的页面展示值
     */
    private List<Map<String, String>> datasource;

    /**
     * 字段页面展示文案
     */
    private String labelName;

    /**
     * 增加 时候是否必须 0-False-非必传， 1-True-必传
     */
    private Boolean required;

    public EmployeeGroupField() {
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public List<Map<String, String>> getDatasource() {
        return datasource;
    }

    public void setDatasource(List<Map<String, String>> datasource) {
        this.datasource = datasource;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
