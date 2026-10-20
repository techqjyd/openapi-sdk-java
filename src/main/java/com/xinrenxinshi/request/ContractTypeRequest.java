package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.contract.ContractTypeInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

/**
 * 合同类型请求
 */
public class ContractTypeRequest extends AbstractOpenapiJsonRequest<List<ContractTypeInfo>> {

    public ContractTypeRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<ContractTypeInfo>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无需参数检查
         */
    }

    @Override
    public String getBizUrl() {
        return "/v5/contract/type/list";
    }

    @Override
    public TypeReference<OpenapiResponse<List<ContractTypeInfo>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<ContractTypeInfo>>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }
}
