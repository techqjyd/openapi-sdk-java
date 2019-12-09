package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.DepartmentJobGetResponse;

import java.util.Map;

/**
 * 岗位信息获取request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 11:48
 **/
public class DepartmentJobGetRequest extends AbstractOpenapiRequest<DepartmentJobGetResponse> {

    public DepartmentJobGetRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<DepartmentJobGetResponse> getResponseClass() {
        return DepartmentJobGetResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无需参数检查
         */
    }

    @Override
    public String getBizUrl() {
        return "/v3/department/getJobHeaders";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }
}
