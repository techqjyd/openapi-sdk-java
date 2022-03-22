package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.calculation.PlatformFieldDockingResult;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * @author fj
 * @version 1.0
 * @date 2021/12/7 3:23 下午
 * @desc
 */
public class CalculationCompanyGroupResponse extends OpenapiResponse {

    /**
     * 组id
     */
    private Integer groupId;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 分组类型(导入明细、结果汇总等)
     * @See EPlatformGroupType
     */
    private Integer type;

    /**
     * 接收类型   0增量 1全量
     */
    private Integer dockingType;

    /**
     * 组内字段
     */
    private List<PlatformFieldDockingResult> fields;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<PlatformFieldDockingResult> getFields() {
        return fields;
    }

    public void setFields(List<PlatformFieldDockingResult> fields) {
        this.fields = fields;
    }

    public Integer getDockingType() {
        return dockingType;
    }

    public void setDockingType(Integer dockingType) {
        this.dockingType = dockingType;
    }
}
