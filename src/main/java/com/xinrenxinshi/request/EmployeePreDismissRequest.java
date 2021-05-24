package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.PreDismissEmployee;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

/**
 * @author by peilizhi
 * @date 2021/5/19 14:36
 */
public class EmployeePreDismissRequest extends AbstractOpenapiJsonRequest<List<PreDismissEmployee>> {


    public EmployeePreDismissRequest(String accessToken) {
        super(accessToken);
    }

    /**
     * 各业务参数
     */
    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    /**
     * 获取请求方法
     */
    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    /**
     * 获取返回参数的class
     */
    @Override
    public OpenapiResponse<List<PreDismissEmployee>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    /**
     * 获取返回参数类型
     *
     * @return 这个必须重写，
     */
    @Override
    public TypeReference<OpenapiResponse<List<PreDismissEmployee>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<PreDismissEmployee>>>() {
        };
    }

    /**
     * 参数前置检查
     */
    @Override
    public void check() throws ParamNotValidException {

    }

    /**
     * 获取业务url
     */
    @Override
    public String getBizUrl() {
        return "/v5/employee/predismiss/list";
    }
}
