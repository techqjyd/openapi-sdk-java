package com.xinrenxinshi;

import com.xinrenxinshi.domain.payroll.EmployeePayroll;
import com.xinrenxinshi.domain.payroll.PayrollChangeHistoryInfoModel;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.response.*;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.List;

/**
 * 工资相关service
 *
 * @author: liuchenhui
 * @create: 2019-11-14 14:45
 **/
public abstract class XrxsPayrollService {

    /**
     * 获取工资报表
     *
     * @param access_token 授权token
     * @param yearmo       工资报表月份
     */
    public static OpenapiResponse<PayrollReportArchivesResponse> getReportArchives(String access_token,
                                                                   String yearmo) throws ApiException {
        PayrollReportArchivesRequest request = new PayrollReportArchivesRequest(access_token);
        request.setYearmo(yearmo);
        return getReportArchives(request);
    }

    /**
     * 获取工资报表
     */
    public static OpenapiResponse<PayrollReportArchivesResponse> getReportArchives(PayrollReportArchivesRequest request) throws ApiException {
        OpenapiResponse<PayrollReportArchivesResponse> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 获取工资报表详情
     *
     * @param access_token 授权token
     * @param reportId     查询的报表id
     * @param subReportId  查询的子报表id
     */
    public static OpenapiResponse<PayrollReportArchiveDetailResponse> getReportArchiveDetail(String access_token,
                                                                            String reportId,
                                                                            String subReportId) throws ApiException {
        PayrollReportArchiveDetailRequest request = new PayrollReportArchiveDetailRequest(access_token);
        request.setReportId(reportId);
        request.setSubReportId(subReportId);
        return getReportArchiveDetail(request);
    }

    /**
     * 获取工资报表详情v2
     *
     * @param access_token 授权token
     * @param reportId     查询的报表id
     * @param subReportId  查询的子报表id
     */
    public static OpenapiResponse<PayrollReportArchiveDetailResponse> getReportArchiveDetailV2(String access_token,
                                                                                             String reportId,
                                                                                             String subReportId) throws ApiException {
        PayrollReportArchiveDetailV2Request request = new PayrollReportArchiveDetailV2Request(access_token);
        request.setReportId(reportId);
        request.setSubReportId(subReportId);
        return getReportArchiveDetailV2(request);
    }

    /**
     * 获取工资报表详情
     */
    public static OpenapiResponse<PayrollReportArchiveDetailResponse> getReportArchiveDetail(PayrollReportArchiveDetailRequest request) throws ApiException {
        OpenapiResponse<PayrollReportArchiveDetailResponse> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取工资报表详情v2
     */
    public static OpenapiResponse<PayrollReportArchiveDetailResponse> getReportArchiveDetailV2(PayrollReportArchiveDetailV2Request request) throws ApiException {
        OpenapiResponse<PayrollReportArchiveDetailResponse> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取公司工资配置项
     *
     * @param access_token 授权token
     */
    public static OpenapiResponse<PayrollSettingResponse> getSetting(String access_token) throws ApiException {
        PayrollSettingRequest request = new PayrollSettingRequest(access_token);
        return getSetting(request);
    }

    /**
     * 获取公司工资配置项
     */
    public static OpenapiResponse<PayrollSettingResponse> getSetting(PayrollSettingRequest request) throws ApiException {
        OpenapiResponse<PayrollSettingResponse> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 更新员工工资项
     *
     * @param access_token     授权token
     * @param employeePayrolls 批量更新员工的工资设置的参数
     */
    public static OpenapiResponse<Object> updateEmpPayrollSetting(String access_token,
                                                  List<EmployeePayroll> employeePayrolls) throws ApiException {
        PayrollUpdateRequest request = new PayrollUpdateRequest(access_token);
        request.setEmployeePayrolls(employeePayrolls);
        return updateEmpPayrollSetting(request);
    }

    /**
     * 更新员工工资项
     */
    public static OpenapiResponse<Object> updateEmpPayrollSetting(PayrollUpdateRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 更新员工工资项(异常不阻塞)
     */
    public static OpenapiResponse<Object> updateEmpPayrollSettingIgnoreAbnormal(PayrollUpdateIgnoreAbnormalRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 获取公司的调薪记录
     *
     * @param access_token 授权token
     * @param pageNo       页数
     * @param pageSize     每页条数
     * @param beginTime    开始时间
     * @param endTime      结束时间
     */
    public static OpenapiResponse<PageResult<PayrollChangeHistoryInfoModel>> getChangeHistory(String access_token,
                                                                             Integer pageNo,
                                                                             Integer pageSize,
                                                                             String beginTime,
                                                                             String endTime) throws ApiException {
        PayrollChangeHistoryRequest request = new PayrollChangeHistoryRequest(access_token);
        request.setPageNo(pageNo);
        request.setPageSize(pageSize);
        request.setBeginTime(beginTime);
        request.setEndTime(endTime);
        return getChangeHistory(request);
    }

    /**
     * 获取公司的调薪记录
     */
    public static OpenapiResponse<PageResult<PayrollChangeHistoryInfoModel>> getChangeHistory(PayrollChangeHistoryRequest request) throws ApiException {
        OpenapiResponse<PageResult<PayrollChangeHistoryInfoModel>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取预定薪表单
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<PayrollEmployeePreBasePayFormResponse> getPreBaseForm(PayrollPreBaseFormRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 提交预定薪表单
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Object> submitPreBaseForm(PayrollPreBaseFormSubmitRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 获取定薪表单
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<PayrollEmployeeBasePayFormResponse> getBaseForm(PayrollBaseFormRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 提交定薪表单
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Object> submitBaseForm(PayrollBaseFormSubmitRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 获取调薪表单
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<PayrollEmployeeAdjustmentFormResponse> getAdjustForm(PayrollAdjustFormRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 提交调薪表单
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Object> submitAdjustForm(PayrollAdjustFormSubmitRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }
}
