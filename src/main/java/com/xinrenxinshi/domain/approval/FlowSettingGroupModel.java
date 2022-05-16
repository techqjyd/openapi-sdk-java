package com.xinrenxinshi.domain.approval;


import java.util.List;

public class FlowSettingGroupModel {
    /**
     * 分组id
     */
    private String groupId;
    /**
     * 分组名称
     */
    private String groupName;
    /**
     * 分组名称英文
     */
    private String groupNameEng;
    /**
     * 分组类型，0-普通分组，1-明细分组
     */
    private Integer groupType;
    /**
     * 顺序
     */
    private Integer position;
    /**
     * 是否隐藏，0-否，1是
     */
    private Integer isHide;
    /**
     * 是否是固定字段，0-否，1是
     */
    private Integer isFixed;

    private Integer isStart = 0;
    private Integer isEnd = 0;
    private Integer index = 0;

    private List<FlowSettingFieldModel> fields;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupNameEng() {
        return groupNameEng;
    }

    public void setGroupNameEng(String groupNameEng) {
        this.groupNameEng = groupNameEng;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    public Integer getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(Integer isFixed) {
        this.isFixed = isFixed;
    }

    public List<FlowSettingFieldModel> getFields() {
        return fields;
    }

    public void setFields(List<FlowSettingFieldModel> fields) {
        this.fields = fields;
    }

    public Integer getIsStart() {
        return isStart;
    }

    public void setIsStart(Integer isStart) {
        this.isStart = isStart;
    }

    public Integer getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
