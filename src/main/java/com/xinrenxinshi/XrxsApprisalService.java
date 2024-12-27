package com.xinrenxinshi;

import com.xinrenxinshi.domain.apprisal.ApprisalKpiRoleEmpPageResult;
import com.xinrenxinshi.domain.apprisal.ApprisalKpiRoleModel;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.List;

public abstract class XrxsApprisalService {

    /**
     * 获取kpi角色列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<ApprisalKpiRoleModel>> getKpiRoleList(ApprisalKpiRoleListRequest request) throws ApiException {
        OpenapiResponse<List<ApprisalKpiRoleModel>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取kpi角色员工列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<ApprisalKpiRoleEmpPageResult> getKpiRoleEmpList(ApprisalKpiRoleEmpListRequest request) throws ApiException {
        OpenapiResponse<ApprisalKpiRoleEmpPageResult> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 同步kpi角色员工
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Object> saveKpiRoleEmpList(ApprisalkpiSaveRoleEmpRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 删除kpi角色员工
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Object> deleteKpiRoleEmpList(ApprisalKpidelRoleEmpRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * kpi完成值录入
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Object> handAccessCompleteValue(ApprisalKpiAccessCompleteValueRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }
}
