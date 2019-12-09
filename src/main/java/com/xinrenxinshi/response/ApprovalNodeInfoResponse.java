package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.approval.ProcessStepAndCopyInfo;

/**
 * 审批节点信息response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:21
 **/
public class ApprovalNodeInfoResponse extends OpenapiResponse {
    /**
     * 数据
     */
    private ProcessStepAndCopyInfo data;

    public ProcessStepAndCopyInfo getData() {
        return data;
    }

    public void setData(ProcessStepAndCopyInfo data) {
        this.data = data;
    }
}
