package com.xinrenxinshi.domain.approval;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘晨辉
 * @date 2025/3/31 下午7:45
 */
public class FlowGroupForOpenapiModel implements Serializable {
    /**
     * 流程分组id
     */
    private String groupId;

    /**
     * 流程分组名称
     */
    private String groupName;

    /**
     * 流程分组类型
     */
    private Integer groupType;

    /**
     * 流程分组字段
     */
    private List<FlowFieldForOpenapiModel> fields = new ArrayList<>();

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

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public List<FlowFieldForOpenapiModel> getFields() {
        return fields;
    }

    public void setFields(List<FlowFieldForOpenapiModel> fields) {
        this.fields = fields;
    }
}
