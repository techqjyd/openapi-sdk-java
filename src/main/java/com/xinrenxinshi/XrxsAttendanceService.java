package com.xinrenxinshi;

import com.xinrenxinshi.domain.BatchClockModel;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.*;

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
     * @param clockTime    打卡时间戳
     * @param longitude    经度
     * @param latitude     维度
     */
    public static boolean saveClock(String access_token,
                                    String employeeId,
                                    Integer clockTime,
                                    Double longitude,
                                    Double latitude) throws ApiException {
        AttendanceSaveClockRequest request = new AttendanceSaveClockRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setClockTime(clockTime);
        request.setLatitude(latitude);
        request.setLongitude(longitude);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 批量打卡
     *
     * @param access_token 授权token
     * @param clockData    批量打卡数据
     */
    public static boolean batchClock(String access_token,
                                     List<BatchClockModel> clockData) throws ApiException {
        AttendanceBatchClockRequest request = new AttendanceBatchClockRequest(access_token);
        request.setClockData(clockData);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 手机号打卡
     *
     * @param access_token 授权token
     * @param mobile       员工手机号
     * @param clockTime    打卡时间戳
     * @return
     * @throws ApiException
     */
    public static boolean clockByMobile(String access_token,
                                        String mobile,
                                        Integer clockTime) throws ApiException {
        AttendanceClockByMobileRequest request = new AttendanceClockByMobileRequest(access_token);
        request.setMobile(mobile);
        request.setClockTime(clockTime);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }


    /**
     * 考勤排班信息
     *
     * @param access_token 授权token
     * @param employeeIds  多个员工ID
     * @param date         排班日期，格式：yyyy-MM-dd
     * @return
     * @throws ApiException
     */
    public static boolean scheduling(String access_token,
                                     String employeeIds,
                                     String date) throws ApiException {
        AttendanceSchedulingRequest request = new AttendanceSchedulingRequest(access_token);
        request.setEmployeeIds(employeeIds);
        request.setDate(date);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
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
     * @return
     * @throws ApiException
     */
    public static boolean travel(String access_token,
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
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

}
