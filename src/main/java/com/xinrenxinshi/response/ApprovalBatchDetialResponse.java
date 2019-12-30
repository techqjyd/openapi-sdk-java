package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.approval.ProcessFlowInfo;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 审批表单详情response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 15:55
 **/
public class ApprovalBatchDetialResponse extends OpenapiResponse {
    /**
     * 数据
     */
    private List<ProcessFlowInfo> data;

    public List<ProcessFlowInfo> getData() {
        return data;
    }

    public void setData(List<ProcessFlowInfo> data) {
        this.data = data;
    }
}
