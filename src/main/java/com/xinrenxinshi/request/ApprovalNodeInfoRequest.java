package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.ApprovalNodeInfoResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 审批节点信息request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:21
 **/
public class ApprovalNodeInfoRequest extends AbstractOpenapiRequest<ApprovalNodeInfoResponse> {

    /**
     * 审批id
     */
    private Integer processId;

    public ApprovalNodeInfoRequest(String accessToken) {
        super(accessToken);
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<ApprovalNodeInfoResponse> getResponseClass() {
        return ApprovalNodeInfoResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (processId == null) {
            throw new ParamNotValidException("审批id为空");
        }
    }

    @Override
    public Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("processId", processId);
        return map;
    }

    @Override
    public String getBizUrl() {
        return "/v4/flow/node/list";
    }
}
