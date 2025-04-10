package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;

/**
 * @author 刘晨辉
 * @date 2025/4/10 下午2:58
 */
public class FlowSettingListResult {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 审批名称
     */
    private String flowName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

}
