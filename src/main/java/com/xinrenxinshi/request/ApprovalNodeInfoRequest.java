package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.ProcessStepAndCopyInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalNodeInfoResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 审批节点信息request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:21
 **/
public class ApprovalNodeInfoRequest extends AbstractOpenapiJsonRequest<ProcessStepAndCopyInfo> {

    /**
     * 审批id
     */
    private Long sid;

    public ApprovalNodeInfoRequest(String accessToken) {
        super(accessToken);
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<ProcessStepAndCopyInfo> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (sid == null) {
            throw new ParamNotValidException("审批id为空");
        }
    }

    @Override
    public Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("sid", sid);
        return map;
    }

    @Override
    public TypeReference<OpenapiResponse<ProcessStepAndCopyInfo>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<ProcessStepAndCopyInfo>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/node/list";
    }
}
