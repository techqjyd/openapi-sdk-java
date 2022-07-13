package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeGroupInfoResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

/**
 * 查询所有分组信息
 *
 * @author hzz on 2022/05/12
 */
public class EmployeeGroupInfoRequest extends AbstractOpenapiJsonRequest<List<EmployeeGroupInfoResult>> {

    public EmployeeGroupInfoRequest(String accessToken) {
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
    public OpenapiResponse<List<EmployeeGroupInfoResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<EmployeeGroupInfoResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<EmployeeGroupInfoResult>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/group/info";
    }
}
