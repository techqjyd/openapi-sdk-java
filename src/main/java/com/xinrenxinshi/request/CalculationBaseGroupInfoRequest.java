package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.calculation.PlatformBaseGroupResult;

import java.util.List;
import java.util.Map;

/**
 * 获取基础分组信息请求
 */
public class CalculationBaseGroupInfoRequest extends AbstractOpenapiJsonRequest<List<PlatformBaseGroupResult>> {

    /**
     * 构造函数
     * @param accessToken 访问令牌
     */
    public CalculationBaseGroupInfoRequest(String accessToken) {
        super(accessToken);
    }

    /**
     * 业务参数映射
     * @return 参数Map
     */
    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    /**
     * 请求方法类型
     * @return POST
     */
    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    /**
     * 响应类占位
     * @return OpenapiResponse
     */
    @Override
    public OpenapiResponse<List<PlatformBaseGroupResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    /**
     * 响应泛型类型
     * @return TypeReference
     */
    @Override
    public TypeReference<OpenapiResponse<List<PlatformBaseGroupResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<PlatformBaseGroupResult>>>(){};
    }

    /**
     * 参数校验
     * @throws ParamNotValidException 参数不合法
     */
    @Override
    public void check() throws ParamNotValidException {
        // 无业务参数
    }

    /**
     * 业务URL
     * @return 路由
     */
    @Override
    public String getBizUrl() {
        return "/v5/calculation/getBaseGroupInfo";
    }
}