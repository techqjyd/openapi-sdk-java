package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.ApprovalDetialResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 审批表单详情request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 15:55
 **/
public class ApprovalDetialRequest extends AbstractOpenapiRequest<ApprovalDetialResponse> {
    /**
     * 审批id
     */
    private Integer processId;

    public ApprovalDetialRequest(String accessToken) {
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
    public Class<ApprovalDetialResponse> getResponseClass() {
        return ApprovalDetialResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (processId == null) {
            throw new ParamNotValidException("审批ID为空");
        }
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("processId", processId);
        return map;
    }

    @Override
    public String getBizUrl() {
        return "/v4/flow/detail";
    }
}
