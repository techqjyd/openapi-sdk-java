package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.apprisal.ApprisalKpiRoleModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

public class ApprisalKpiRoleListRequest extends AbstractOpenapiJsonRequest<List<ApprisalKpiRoleModel>> {
    public ApprisalKpiRoleListRequest(String accessToken) {
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
    public OpenapiResponse<List<ApprisalKpiRoleModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<ApprisalKpiRoleModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<ApprisalKpiRoleModel>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/apprisal/kpi/roleList";
    }
}
