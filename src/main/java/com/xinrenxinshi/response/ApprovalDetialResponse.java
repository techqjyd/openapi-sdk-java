package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.approval.ProcessFlowInfo;

/**
 * 审批表单详情response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 15:55
 **/
public class ApprovalDetialResponse extends OpenapiResponse {
    /**
     * 数据
     */
    private ProcessFlowInfo data;

    public ProcessFlowInfo getData() {
        return data;
    }

    public void setData(ProcessFlowInfo data) {
        this.data = data;
    }
}
