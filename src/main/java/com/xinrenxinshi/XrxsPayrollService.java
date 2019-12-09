package com.xinrenxinshi;

import com.xinrenxinshi.domain.payroll.EmployeePayroll;
import com.xinrenxinshi.domain.report.PayrollReportArchiveBase;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.PayrollChangeHistoryRequest;
import com.xinrenxinshi.request.PayrollReportArchiveDetailRequest;
import com.xinrenxinshi.request.PayrollReportArchivesRequest;
import com.xinrenxinshi.request.PayrollSettingRequest;
import com.xinrenxinshi.request.PayrollUpdateRequest;
import com.xinrenxinshi.response.PayrollChangeHistoryResponse;
import com.xinrenxinshi.response.PayrollReportArchiveDetailResponse;
import com.xinrenxinshi.response.PayrollReportArchivesResponse;
import com.xinrenxinshi.response.PayrollSettingResponse;

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
    public static List<PayrollReportArchiveBase> getReportArchives(String access_token,
                                                                   String yearmo) throws ApiException {
        PayrollReportArchivesRequest request = new PayrollReportArchivesRequest(access_token);
        request.setYearmo(yearmo);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        PayrollReportArchivesResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getArchiveReportList();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
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
    public static PayrollChangeHistoryResponse getChangeHistory(String access_token,
                                                                Integer pageNo,
                                                                Integer pageSize,
                                                                String beginTime,
                                                                String endTime) throws ApiException {
        PayrollChangeHistoryRequest request = new PayrollChangeHistoryRequest(access_token);
        request.setPageNo(pageNo);
        request.setPageSize(pageSize);
        request.setBeginTime(beginTime);
        request.setEndTime(endTime);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        PayrollChangeHistoryResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取工资报表详情
     *
     * @param access_token 授权token
     * @param reportId     查询的报表id
     * @param subReportId  查询的子报表id
     */
    public static PayrollReportArchiveDetailResponse getReportArchiveDetail(String access_token,
                                                                            String reportId,
                                                                            String subReportId) throws ApiException {
        PayrollReportArchiveDetailRequest request = new PayrollReportArchiveDetailRequest(access_token);
        request.setReportId(reportId);
        request.setSubReportId(subReportId);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        PayrollReportArchiveDetailResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取公司工资配置项
     *
     * @param access_token 授权token
     */
    public static PayrollSettingResponse getSetting(String access_token) throws ApiException {
        PayrollSettingRequest request = new PayrollSettingRequest(access_token);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        PayrollSettingResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 更新员工工资项
     *
     * @param access_token     授权token
     * @param employeePayrolls 批量更新员工的工资设置的参数
     */
    public static boolean updateEmpPayrollSetting(String access_token,
                                                  List<EmployeePayroll> employeePayrolls) throws ApiException {
        PayrollUpdateRequest request = new PayrollUpdateRequest(access_token);
        request.setEmployeePayrolls(employeePayrolls);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }
}
