package com.xinrenxinshi.domain.approval;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author 刘晨辉
 * @date 2025/3/31 下午7:45
 */
public class FlowFieldForOpenapiModel implements Serializable {
    /**
     * 字段ID
     */
    private String fieldId;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 字段显示名字
     */
    private String labelName;

    /**
     * 字段类型
     */
    private Integer fieldType;

    /**
     * 文件附件
     */
    private List<Map<String, String>> files;

    /**
     * 字段值
     */
    private String fieldValue;

    /**
     * 字段值ID
     */
    private String fieldValueId;

    /**
     * 字段值数据源
     */
    private String datasource;

    /**
     * 日期开始值
     */
    private String startValue;

    /**
     * 日期结束值
     */
    private String endValue;

    /**
     * 日期天数
     */
    private String longValue;

    /**
     * 是否必填
     */
    private int require;

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

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public List<Map<String, String>> getFiles() {
        return files;
    }

    public void setFiles(List<Map<String, String>> files) {
        this.files = files;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getFieldValueId() {
        return fieldValueId;
    }

    public void setFieldValueId(String fieldValueId) {
        this.fieldValueId = fieldValueId;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getStartValue() {
        return startValue;
    }

    public void setStartValue(String startValue) {
        this.startValue = startValue;
    }

    public String getEndValue() {
        return endValue;
    }

    public void setEndValue(String endValue) {
        this.endValue = endValue;
    }

    public String getLongValue() {
        return longValue;
    }

    public void setLongValue(String longValue) {
        this.longValue = longValue;
    }

    public int getRequire() {
        return require;
    }

    public void setRequire(int require) {
        this.require = require;
    }
}
