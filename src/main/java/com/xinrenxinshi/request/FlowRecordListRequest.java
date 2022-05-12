package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.FlowRecordResult;
import com.xinrenxinshi.domain.approval.ProcessStepAndCopyInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowRecordListRequest extends AbstractOpenapiJsonRequest<List<FlowRecordResult>> {
    /**
     * 操作人id
     */
    private String operatorId;

    /**
     * 审批id
     */
    private Long sid;

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public FlowRecordListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("sid", sid);
        map.put("operatorId", operatorId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<FlowRecordResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<FlowRecordResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<FlowRecordResult>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (sid == null) {
            throw new ParamNotValidException("审批id为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/step/details";
    }
}
