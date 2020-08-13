package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.attendance.AttendanceScheduleInfo;
import com.xinrenxinshi.openapi.OpenapiResponse;

/**
 * 考勤排班列表response
 *
 * @author: jiazijie
 * @create: 2019-11-12 11:45
 **/
public class AttendanceScheduleInfoResponse extends OpenapiResponse {

    /**
     * 数据集
     */
    private AttendanceScheduleInfo data;

    public AttendanceScheduleInfo getData() {
        return data;
    }

    public void setData(AttendanceScheduleInfo data) {
        this.data = data;
    }
}
