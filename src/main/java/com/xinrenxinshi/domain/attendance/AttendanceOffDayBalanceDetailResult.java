package com.xinrenxinshi.domain.attendance;

import lombok.Data;

import java.util.List;

/**
 * @Author zhaopc
 * @Date 2025/9/23
 * @Version 1.0.0
 * @Description
 */
@Data
public class AttendanceOffDayBalanceDetailResult {

    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 当前可请总调休天数
     */
    private String offDay;

    /**
     * 当前可请调休假期明细
     */
    private List<AttendanceOffDayDetail> offDayDetails;

}
