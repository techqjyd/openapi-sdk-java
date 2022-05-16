package com.xinrenxinshi.domain.approval;

import java.util.List;
import java.util.Map;

public class FlowSettingFieldModel {
    private String fieldId;//字段id
    private String groupId;//字段分组id
    private Integer type;//字段类型
    private String fieldValue;//字段值
    private String fieldValueId;//字段值
    private String labelName;//字段名
    private String labelNameEng;//字段名英文
    private Integer require;//是否必填，0-否，1是
    private Integer groupType;//分组类型，0-普通分组，1-明细分组
    private Integer dateType;//日期类型，0-按小时，1-按天
    private String fieldName;//字段本身的属性名
    private List<Object> fieldList;//单选/多选里的选项内容列表,对象里只有id和name两个属性
    private String unit;//数字字段类型的单位
    private String fieldOldValueId;//旧字段id值
    private String fieldOldValue;//旧字段值
    private List<ExpressionResult> expression;//公式字段公式内容
    private AmountWordResult amountWord;//大写金额内容
    private List<FlowRelatedApproveResult> relatedApprove;//审批关联审批单
    private String startLabelName;//时间类型的开始时间的名字
    private String endLabelName;//时间类型的结束时间的名字
    private String longLabelName;//开始时间到结束时间的天数的名字
    private String startLabelNameEng;//时间类型的开始时间的名字英文
    private String endLabelNameEng;//时间类型的结束时间的名字英文
    private String longLabelNameEng;//开始时间到结束时间的天数的名字英文
    private String relaxStartLabelName;//休息开始时间－加班审批特有
    private String relaxEndLabelName;//休息结束时间－加班审批特有
    private String relaxStartLabelNameEng;//休息开始时间－加班审批特有 英文
    private String relaxEndLabelNameEng;//休息结束时间－加班审批特有  英文
    private String startValue;//开始时间的值
    private String endValue;//结束时间的值
    private String relaxStartValue;//休息开始时间的值
    private String relaxEndValue;//休息结束时间的值
    private String longValue;//开始时间与结束时间之前的天数
    private List<Map<String,String>> files;//附件
    private Integer isCondition;//是否可以作为分支条件，0否1是
    private Integer isNewAndOldValue;//是否区分新旧值，0否1是
    private Integer isHide;//是否隐藏字段，0否1是
    private Integer isJson;//fieldlist里的是否是json对象，0否1是
    private Integer componentType;//自选组件类型
    private Integer ruleLevel;//读写级别，1-隐藏，2-只读，3-可编辑


    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLabelNameEng() {
        return labelNameEng;
    }

    public void setLabelNameEng(String labelNameEng) {
        this.labelNameEng = labelNameEng;
    }

    public Integer getRequire() {
        return require;
    }

    public void setRequire(Integer require) {
        this.require = require;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Integer getDateType() {
        return dateType;
    }

    public void setDateType(Integer dateType) {
        this.dateType = dateType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public List<Object> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Object> fieldList) {
        this.fieldList = fieldList;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFieldOldValueId() {
        return fieldOldValueId;
    }

    public void setFieldOldValueId(String fieldOldValueId) {
        this.fieldOldValueId = fieldOldValueId;
    }

    public String getFieldOldValue() {
        return fieldOldValue;
    }

    public void setFieldOldValue(String fieldOldValue) {
        this.fieldOldValue = fieldOldValue;
    }

    public List<ExpressionResult> getExpression() {
        return expression;
    }

    public void setExpression(List<ExpressionResult> expression) {
        this.expression = expression;
    }

    public AmountWordResult getAmountWord() {
        return amountWord;
    }

    public void setAmountWord(AmountWordResult amountWord) {
        this.amountWord = amountWord;
    }

    public List<FlowRelatedApproveResult> getRelatedApprove() {
        return relatedApprove;
    }

    public void setRelatedApprove(List<FlowRelatedApproveResult> relatedApprove) {
        this.relatedApprove = relatedApprove;
    }

    public String getStartLabelName() {
        return startLabelName;
    }

    public void setStartLabelName(String startLabelName) {
        this.startLabelName = startLabelName;
    }

    public String getEndLabelName() {
        return endLabelName;
    }

    public void setEndLabelName(String endLabelName) {
        this.endLabelName = endLabelName;
    }

    public String getLongLabelName() {
        return longLabelName;
    }

    public void setLongLabelName(String longLabelName) {
        this.longLabelName = longLabelName;
    }

    public String getStartLabelNameEng() {
        return startLabelNameEng;
    }

    public void setStartLabelNameEng(String startLabelNameEng) {
        this.startLabelNameEng = startLabelNameEng;
    }

    public String getEndLabelNameEng() {
        return endLabelNameEng;
    }

    public void setEndLabelNameEng(String endLabelNameEng) {
        this.endLabelNameEng = endLabelNameEng;
    }

    public String getLongLabelNameEng() {
        return longLabelNameEng;
    }

    public void setLongLabelNameEng(String longLabelNameEng) {
        this.longLabelNameEng = longLabelNameEng;
    }

    public String getRelaxStartLabelName() {
        return relaxStartLabelName;
    }

    public void setRelaxStartLabelName(String relaxStartLabelName) {
        this.relaxStartLabelName = relaxStartLabelName;
    }

    public String getRelaxEndLabelName() {
        return relaxEndLabelName;
    }

    public void setRelaxEndLabelName(String relaxEndLabelName) {
        this.relaxEndLabelName = relaxEndLabelName;
    }

    public String getRelaxStartLabelNameEng() {
        return relaxStartLabelNameEng;
    }

    public void setRelaxStartLabelNameEng(String relaxStartLabelNameEng) {
        this.relaxStartLabelNameEng = relaxStartLabelNameEng;
    }

    public String getRelaxEndLabelNameEng() {
        return relaxEndLabelNameEng;
    }

    public void setRelaxEndLabelNameEng(String relaxEndLabelNameEng) {
        this.relaxEndLabelNameEng = relaxEndLabelNameEng;
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

    public String getRelaxStartValue() {
        return relaxStartValue;
    }

    public void setRelaxStartValue(String relaxStartValue) {
        this.relaxStartValue = relaxStartValue;
    }

    public String getRelaxEndValue() {
        return relaxEndValue;
    }

    public void setRelaxEndValue(String relaxEndValue) {
        this.relaxEndValue = relaxEndValue;
    }

    public String getLongValue() {
        return longValue;
    }

    public void setLongValue(String longValue) {
        this.longValue = longValue;
    }

    public List<Map<String, String>> getFiles() {
        return files;
    }

    public void setFiles(List<Map<String, String>> files) {
        this.files = files;
    }

    public Integer getIsCondition() {
        return isCondition;
    }

    public void setIsCondition(Integer isCondition) {
        this.isCondition = isCondition;
    }

    public Integer getIsNewAndOldValue() {
        return isNewAndOldValue;
    }

    public void setIsNewAndOldValue(Integer isNewAndOldValue) {
        this.isNewAndOldValue = isNewAndOldValue;
    }

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    public Integer getIsJson() {
        return isJson;
    }

    public void setIsJson(Integer isJson) {
        this.isJson = isJson;
    }

    public Integer getComponentType() {
        return componentType;
    }

    public void setComponentType(Integer componentType) {
        this.componentType = componentType;
    }

    public Integer getRuleLevel() {
        return ruleLevel;
    }

    public void setRuleLevel(Integer ruleLevel) {
        this.ruleLevel = ruleLevel;
    }

    public String getFieldValueId() {
        return fieldValueId;
    }

    public void setFieldValueId(String fieldValueId) {
        this.fieldValueId = fieldValueId;
    }
}
