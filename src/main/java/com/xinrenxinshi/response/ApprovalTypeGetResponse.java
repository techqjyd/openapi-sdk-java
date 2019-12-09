package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.approval.FlowType;

import java.util.List;

/**
 * 公司审批类型返回值
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:14
 **/
public class ApprovalTypeGetResponse extends OpenapiResponse {
    /**
     * 流程数据
     */
    private List<FlowType> data;

    public List<FlowType> getData() {
        return data;
    }

    public void setData(List<FlowType> data) {
        this.data = data;
    }
}
