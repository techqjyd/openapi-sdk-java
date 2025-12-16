package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.DismissHandoverDetailInfo;
import com.xinrenxinshi.domain.approval.ProcessStepAndCopyInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 离职交接详情
 */
public class HandoverDetailRequest extends AbstractOpenapiJsonRequest<DismissHandoverDetailInfo> {

    /**
     * 审批id
     */
    private Integer id;

    public HandoverDetailRequest(String accessToken) {
        super(accessToken);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<DismissHandoverDetailInfo> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (id == null) {
            throw new ParamNotValidException("审批id为空");
        }
    }

    @Override
    public Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("id", id);
        return map;
    }

    @Override
    public TypeReference<OpenapiResponse<DismissHandoverDetailInfo>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<DismissHandoverDetailInfo>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/handover/detail";
    }
}
