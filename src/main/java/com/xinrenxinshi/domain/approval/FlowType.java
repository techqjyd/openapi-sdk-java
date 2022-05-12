package com.xinrenxinshi.domain.approval;

/**
 * 审批类型数据
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:14
 **/
public class FlowType {
    /**
     * 审批类型id
     */
    private Integer flowTypeId;
    /**
     * 审批类型名称
     */
    private String name;

    private Integer settingId;

    private Integer status;

    public Integer getFlowTypeId() {
        return flowTypeId;
    }

    public void setFlowTypeId(Integer flowTypeId) {
        this.flowTypeId = flowTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
