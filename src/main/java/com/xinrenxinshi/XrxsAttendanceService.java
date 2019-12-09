package com.xinrenxinshi;

import com.xinrenxinshi.domain.BatchClockModel;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.AttendanceBatchClockRequest;
import com.xinrenxinshi.request.AttendanceSaveClockRequest;

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
}
