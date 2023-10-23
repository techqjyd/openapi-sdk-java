package com.xinrenxinshi.domain.approval;

import com.xinrenxinshi.domain.approval.FlowFileInfo;

import java.util.List;

/**
 * 审批分组详情数据
 *
 * @author: liuchenhui
 * @create: 2019-11-11 15:58
 **/
public class ProcessFormDetailInfo {
    /**
     * 标签名
     */
    private String labName;
    /**
     * 标签值
     */
    private String value;

    /**
     * 标签id
     */
    private String valueId;
    /**
     * 数值类型标签调整前的值
     */
    private String oldValue;
    /**
     * 字段类型
     */
    private Integer type;
    /**
     * 数值类型的单位
     */
    private String unit;
    /**
     * 文件信息
     */
    private List<FlowFileInfo> files;
    /**
     * 时间区间开始时间标签名
     */
    private String startLabName;
    /**
     * 时间区间开始时间的标签值
     */
    private String startValue;
    /**
     * 时间区间结束时间标签名
     */
    private String endLabName;
    /**
     * 时间区间结束时间的标签值
     */
    private String endValue;
    /**
     * 时间区间申请时长的标签名
     */
    private String longLabName;
    /**
     * 时间区间申请时长的标签值
     */
    private String longValue;
    /**
     * 双时间区间开始休息的标签名
     */
    private String relaxStartLabName;
    /**
     * 双时间区间开始休息的标签值
     */
    private String relaxStartValue;
    /**
     * 双时间区间结束休息的标签名
     */
    private String relaxEndLabName;
    /**
     * 双时间区间结束休息的标签值
     */
    private String relaxEndValue;
    /**
     * 文本列表类型返回
     */
    private List<String> textListValue;

    /**
     * 多分组字段
     */
    private List<ProcessFormGroupInfo> processFormGroupInfos;

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<FlowFileInfo> getFiles() {
        return files;
    }

    public void setFiles(List<FlowFileInfo> files) {
        this.files = files;
    }

    public String getStartLabName() {
        return startLabName;
    }

    public void setStartLabName(String startLabName) {
        this.startLabName = startLabName;
    }

    public String getStartValue() {
        return startValue;
    }

    public void setStartValue(String startValue) {
        this.startValue = startValue;
    }

    public String getEndLabName() {
        return endLabName;
    }

    public void setEndLabName(String endLabName) {
        this.endLabName = endLabName;
    }

    public String getEndValue() {
        return endValue;
    }

    public void setEndValue(String endValue) {
        this.endValue = endValue;
    }

    public String getLongLabName() {
        return longLabName;
    }

    public void setLongLabName(String longLabName) {
        this.longLabName = longLabName;
    }

    public String getLongValue() {
        return longValue;
    }

    public void setLongValue(String longValue) {
        this.longValue = longValue;
    }

    public String getRelaxStartLabName() {
        return relaxStartLabName;
    }

    public void setRelaxStartLabName(String relaxStartLabName) {
        this.relaxStartLabName = relaxStartLabName;
    }

    public String getRelaxStartValue() {
        return relaxStartValue;
    }

    public void setRelaxStartValue(String relaxStartValue) {
        this.relaxStartValue = relaxStartValue;
    }

    public String getRelaxEndLabName() {
        return relaxEndLabName;
    }

    public void setRelaxEndLabName(String relaxEndLabName) {
        this.relaxEndLabName = relaxEndLabName;
    }

    public String getRelaxEndValue() {
        return relaxEndValue;
    }

    public void setRelaxEndValue(String relaxEndValue) {
        this.relaxEndValue = relaxEndValue;
    }

    public List<String> getTextListValue() {
        return textListValue;
    }

    public void setTextListValue(List<String> textListValue) {
        this.textListValue = textListValue;
    }

    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public List<ProcessFormGroupInfo> getProcessFormGroupInfos() {
        return processFormGroupInfos;
    }

    public void setProcessFormGroupInfos(List<ProcessFormGroupInfo> processFormGroupInfos) {
        this.processFormGroupInfos = processFormGroupInfos;
    }
}
