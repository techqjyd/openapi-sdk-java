package com.xinrenxinshi;

import com.xinrenxinshi.domain.contract.ContractInfo;
import com.xinrenxinshi.domain.contract.ContractTypeInfo;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.ContractDetailListRequest;
import com.xinrenxinshi.request.ContractTypeRequest;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.List;

/**
 * @Author zhaopc
 * @Date 2025/6/14
 * @Version 1.0.0
 * @Description
 */
public abstract class XrxsContractService {

    /**
     * 获取合同类型列表
     */
    public static OpenapiResponse<List<ContractTypeInfo>> getContractType(ContractTypeRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 获取电子合同列表
     */
    public static OpenapiResponse<PageResult<ContractInfo>> getContractDetailList(ContractDetailListRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

}
