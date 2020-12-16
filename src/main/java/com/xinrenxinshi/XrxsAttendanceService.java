package com.xinrenxinshi;

import com.xinrenxinshi.domain.AttendanceRecord;
import com.xinrenxinshi.domain.BatchClockModel;
import com.xinrenxinshi.domain.attendance.AttendanceScheduleInfo;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.response.PageResult;
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
    public static OpenapiResponse<Void> clock(String access_token,
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
    public static OpenapiResponse<Void> clock(AttendanceClockRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 批量打卡
     *
     * @param access_token 授权token
     * @param clockData    批量打卡数据
     */
    public static OpenapiResponse<Void> batchClock(String access_token,
                                     List<BatchClockModel> clockData) throws ApiException {
        AttendanceBatchClockRequest request = new AttendanceBatchClockRequest(access_token);
        request.setClockData(clockData);
        return batchClock(request);
    }

    /**
     * 批量打卡
     */
    public static OpenapiResponse<Void> batchClock(AttendanceBatchClockRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
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
     * 销出差接口
     *
     * @param employeeId 员工id
     * @param startDate  销出差开始日期，日期格式：yyyy-MM-dd
     * @param startTime  销出差开始时间，AM：上半天、PM：下半天
     * @param endDate    销出差结束日期，日期格式：yyyy-MM-dd
     * @param endTime    销出差结束时间，AM：上半天、PM：下半天
     */
    public static OpenapiResponse<Void> cancelTravel(String access_token,
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
    public static OpenapiResponse<Void> cancelTravel(AttendanceCancelTravelRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }
}