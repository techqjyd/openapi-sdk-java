package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.Page;
import com.xinrenxinshi.domain.approval.ProcessBasicInfo;

/**
 * 审批列表response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:50
 **/
public class ApprovalListResponse extends OpenapiResponse {
    /**
     * 审批数据
     */
    private Page<ProcessBasicInfo> data;

    public Page<ProcessBasicInfo> getData() {
        return data;
    }

    public void setData(Page<ProcessBasicInfo> data) {
        this.data = data;
    }
}
