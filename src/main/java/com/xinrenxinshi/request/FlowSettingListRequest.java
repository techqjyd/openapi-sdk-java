package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.FlowSettingListResult;

import java.util.List;
import java.util.Map;

public class FlowSettingListRequest extends AbstractOpenapiJsonRequest<List<FlowSettingListResult>> {

    public FlowSettingListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<FlowSettingListResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<FlowSettingListResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<FlowSettingListResult>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/setting/list";
    }
}
