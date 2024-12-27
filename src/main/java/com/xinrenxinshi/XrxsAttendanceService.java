package com.xinrenxinshi;

import com.xinrenxinshi.domain.AttendanceRecord;
import com.xinrenxinshi.domain.AttendanceReportData;
import com.xinrenxinshi.domain.BatchClockModel;
import com.xinrenxinshi.domain.attendance.*;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.response.AttendanceLeaveOutResponse;
import com.xinrenxinshi.response.AttendanceStatisticsResponse;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.response.ReportPageResult;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.List;

/**
 * 考勤相关service
 *
 * @author: liuchenhui
 * @create: 2019-11-14 14:48
 **/
public abstract class XrxsAttendanceService {

    /**
     * 上传员工打卡记录
     *
     * @param access_token 授权token
     * @param employeeId   员工id
     * @param mobile       员工手机号
     * @param clockTime    打卡时间戳
     * @param longitude    经度
     * @param latitude     维度
     * @param remark       备注
     */
    public static OpenapiResponse<Object> clock(String access_token,
                                String employeeId,
                                String mobile,
                                Integer clockTime,
                                Double longitude,
                                Double latitude,
                                String remark) throws ApiException {
        AttendanceClockRequest request = new AttendanceClockRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setMobile(mobile);
        request.setClockTime(clockTime);
        request.setLatitude(latitude);
        request.setLongitude(longitude);
        request.setRemark(remark);
        return clock(request);
    }

    /**
     * 上传员工打卡记录
     */
    public static OpenapiResponse<Object> clock(AttendanceClockRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 批量打卡
     *
     * @param access_token 授权token
     * @param clockData    批量打卡数据
     */
    public static OpenapiResponse<Object> batchClock(String access_token,
                                     List<BatchClockModel> clockData) throws ApiException {
        AttendanceBatchClockRequest request = new AttendanceBatchClockRequest(access_token);
        request.setClockData(clockData);
        return batchClock(request);
    }

    /**
     * 批量打卡
     */
    public static OpenapiResponse<Object> batchClock(AttendanceBatchClockRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 考勤打卡原始记录
     *
     * @param employeeIds 员工id列表，不传默认查当前时间段全公司员工
     * @param startTime   打卡记录查询开始时间戳(精确到秒)
     * @param endTime     打卡记录查询结束时间戳(精确到秒)
     * @param PageNo      查询页码，默认从0开始，翻页+1
     * @param pageSize    每页数据条数，每页数量不超过100条，默认100条
     */
    public static OpenapiResponse<PageResult<AttendanceRecord>> clockRecords(String access_token,
                                                            List<String> employeeIds,
                                                            Long startTime,
                                                            Long endTime,
                                                            Integer PageNo,
                                                            Integer pageSize) throws ApiException {
        AttendanceClockRecordsRequest request = new AttendanceClockRecordsRequest(access_token);
        request.setEmployeeIds(employeeIds);
        request.setStartTime(startTime);
        request.setEndTime(endTime);
        request.setPageNo(PageNo);
        request.setPageSize(pageSize);
        return clockRecords(request);
    }

    /**
     * 考勤打卡原始记录
     */
    public static OpenapiResponse<PageResult<AttendanceRecord>> clockRecords(AttendanceClockRecordsRequest request) throws ApiException {
        OpenapiResponse<PageResult<AttendanceRecord>> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 考勤排班信息
     *
     * @param access_token 授权token
     * @param employeeIds  多个员工ID
     * @param date         排班日期，格式：yyyy-MM-dd
     */
    public static OpenapiResponse<AttendanceScheduleInfo> scheduling(String access_token,
                                                    List<String> employeeIds,
                                                    String date) throws ApiException {
        AttendanceSchedulingRequest request = new AttendanceSchedulingRequest(access_token);
        request.setEmployeeIds(employeeIds);
        request.setDate(date);
        return scheduling(request);
    }

    /**
     * 考勤排班信息
     */
    public static OpenapiResponse<AttendanceScheduleInfo> scheduling(AttendanceSchedulingRequest request) throws ApiException {
        OpenapiResponse<AttendanceScheduleInfo> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 出差打卡信息
     *
     * @param access_token 授权token
     * @param employeeId   员工ID
     * @param startDate    出差开始日期，日期格式：yyyy-MM-dd
     * @param startTime    出差开始时间，AM：上半天、PM：下半天
     * @param endDate      出差结束日期，日期格式：yyyy-MM-dd
     * @param endTime      出差结束时间，AM：上半天、PM：下半天
     */
    public static OpenapiResponse<String> travel(String access_token,
                                String employeeId,
                                String startDate,
                                String startTime,
                                String endDate,
                                String endTime) throws ApiException {
        AttendanceTravelRequest request = new AttendanceTravelRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setStartDate(startDate);
        request.setStartTime(startTime);
        request.setEndDate(endDate);
        request.setEndTime(endTime);
        return travel(request);
    }

    /**
     * 出差打卡信息
     */
    public static OpenapiResponse<String> travel(AttendanceTravelRequest request) throws ApiException {
        OpenapiResponse<String> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 出差打卡信息(可按小时)
     */
    public static OpenapiResponse<String> travelV2(AttendanceTravelV2Request request) throws ApiException {
        OpenapiResponse<String> execute = RequestTemplate.execute(request);
        return execute;
    }



    /**
     * 销出差接口
     *
     * @param employeeId 员工id
     * @param startDate  销出差开始日期，日期格式：yyyy-MM-dd
     * @param startTime  销出差开始时间，AM：上半天、PM：下半天
     * @param endDate    销出差结束日期，日期格式：yyyy-MM-dd
     * @param endTime    销出差结束时间，AM：上半天、PM：下半天
     */
    public static OpenapiResponse<Object> cancelTravel(String access_token,
                                       String employeeId,
                                       String startDate,
                                       String startTime,
                                       String endDate,
                                       String endTime) throws ApiException {
        AttendanceCancelTravelRequest request = new AttendanceCancelTravelRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setStartDate(startDate);
        request.setStartTime(startTime);
        request.setEndDate(endDate);
        request.setEndTime(endTime);
        return cancelTravel(request);
    }

    /**
     * 销出差接口
     */
    public static OpenapiResponse<Object> cancelTravel(AttendanceCancelTravelRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 销出差接口
     */
    public static OpenapiResponse<Object> cancelTravelV2(AttendanceCancelTravelV2Request request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 销出差接口
     */
    public static OpenapiResponse<Object> cancelTravelV3(AttendanceCancelTravelV3Request request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * @description 考勤已归档报表
      * @param access_token
     * @param archiveDate 归档时间
     * @param reportType 报表类型
     * @param pageNo 当前页码
     * @param pageSize 每页项目数
     * @return OpenapiResponse<ReportPageResult<AttendanceReportData>> 分页结果
     * @author  peilizhi
     */
    public static OpenapiResponse<ReportPageResult<AttendanceReportData>> queryReportDetail(String access_token,
                                                                                            String archiveDate,
                                                                                            Integer reportType,
                                                                                            Integer pageNo,
                                                                                            Integer pageSize)throws ApiException{

        AttendanceReportSearchRequest request = new AttendanceReportSearchRequest(access_token);
        request.setArchiveDate(archiveDate);
        request.setReportType(reportType);
        request.setPageNo(pageNo);
        request.setPageSize(pageSize);
        return queryReportDetail(request);
    }

    /**
     * 获取考勤已归档报表
     * @param request 封装的请求
     * @return 分页展示已归档报表结果
     * @throws ApiException
     */
    public static OpenapiResponse<ReportPageResult<AttendanceReportData>> queryReportDetail(AttendanceReportSearchRequest request) throws ApiException{
        OpenapiResponse<ReportPageResult<AttendanceReportData>> execute=RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取员工的考勤统计数据
     * @param request 封装的请求
     * @throws ApiException
     */
    public static OpenapiResponse<AttendanceStatisticsResponse> getAttendanceStatic(AttendanceStatisticsRequest request) throws ApiException{
        OpenapiResponse<AttendanceStatisticsResponse> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 外出申请状态同步
     */
    public static OpenapiResponse<AttendanceLeaveOutResponse> leaveOut(AttendanceLeaveOutRequest request) throws ApiException {
        OpenapiResponse<AttendanceLeaveOutResponse> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 外出申请状态同步
     */
    public static OpenapiResponse<Object> cancelLeaveout(AttendanceCancelLeaveOutRequest request) throws ApiException {
        OpenapiResponse<Object> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取公司所有打卡方案
     */
    public static OpenapiResponse<List<AttendanceSimplePlanInfo>> getAttendanceClockPlanList(AttendanceClockPlanListRequest request) throws ApiException {
        OpenapiResponse<List<AttendanceSimplePlanInfo>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 根据方案id获取打卡方案
     */
    public static OpenapiResponse<AttendanceClockPlanDeteilInfo> getAttendanceClockPlanDetailByPlan(AttendanceClockPlanDetailByPlanRequest request) throws ApiException {
        OpenapiResponse<AttendanceClockPlanDeteilInfo> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 根据员工id获取打卡方案
     */
    public static OpenapiResponse<AttendanceClockPlanDeteilInfo> getAttendanceClockPlanDetailByEmployee(AttendanceClockPlanDetailByEmployeeRequest request) throws ApiException {
        OpenapiResponse<AttendanceClockPlanDeteilInfo> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取员工考勤状态
     */
    public static OpenapiResponse<List<AttendanceStatusRangeResult>> getEmployeeStatus(AttendanceStatusRequest request) throws ApiException {
        OpenapiResponse<List<AttendanceStatusRangeResult>> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 获取员工考勤状态
     */
    public static OpenapiResponse<AttSimpleShiftResult> getEmpSimpleShift(AttendanceSimpleShiftRequest request) throws ApiException {
        OpenapiResponse<AttSimpleShiftResult> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 同步加班记录
     */
    public static OpenapiResponse<String> syncOvertimeRecord(AttendanceOvertimeRecordRequest request) throws ApiException {
        OpenapiResponse<String> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取考勤日报表
     */
    public static OpenapiResponse<PageResult<AttendanceDailyReportResult>> getDailyReport(AttendanceDailyReportRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }
}
