package com.xinrenxinshi;

import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.CalculationCompanyGroupRequest;
import com.xinrenxinshi.request.CalculationSyncGroupRequest;
import com.xinrenxinshi.response.CalculationCompanyGroupResponse;
import com.xinrenxinshi.response.CalculationSyncGroupDataResponse;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author fj
 * @version 1.0
 * @date 2021/12/7 3:19 下午
 * @desc 计算平台
 */
public abstract class XrxsCalculationService {


    /**
     * 获取公司所有的 字段组 （包含字段）
     * @param access_token
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<CalculationCompanyGroupResponse>> getAllCompanyGroup(String access_token) throws ApiException {
        CalculationCompanyGroupRequest request = new CalculationCompanyGroupRequest(access_token);
        OpenapiResponse<List<CalculationCompanyGroupResponse>> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 同步字段数据
     * @param access_token
     * @param groupId
     * @param yearmo
     * @param data
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<CalculationSyncGroupDataResponse> syncGroupData(String access_token, Integer groupId, Integer yearmo, LinkedList<LinkedHashMap<String, String>> data) throws ApiException {
        CalculationSyncGroupRequest request = new CalculationSyncGroupRequest(access_token);
        request.setGroupId(groupId);
        request.setYearmo(yearmo);
        request.setData(data);
        OpenapiResponse<CalculationSyncGroupDataResponse> execute = RequestTemplate.execute(request);
        return execute;
    }
}
