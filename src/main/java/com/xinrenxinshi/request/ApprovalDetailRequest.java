package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.ProcessFlowInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalDetialResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 审批表单详情request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 15:55
 **/
public class ApprovalDetailRequest extends AbstractOpenapiJsonRequest<ProcessFlowInfo> {
    /**
     * 审批sid
     */
    private Long sid;

    public ApprovalDetailRequest(String accessToken) {
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
    public OpenapiResponse<ProcessFlowInfo> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (sid == null) {
            throw new ParamNotValidException("审批ID为空");
        }
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("sid", sid);
        return map;
    }

    @Override
    public TypeReference<OpenapiResponse<ProcessFlowInfo>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<ProcessFlowInfo>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/detail";
    }
}
