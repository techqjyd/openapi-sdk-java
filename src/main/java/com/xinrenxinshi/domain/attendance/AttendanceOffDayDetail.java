package com.xinrenxinshi.domain.attendance;

import lombok.Data;

/**
 * @Author zhaopc
 * @Date 2025/9/23
 * @Version 1.0.0
 * @Description
 */
@Data
public class AttendanceOffDayDetail {

    /**
     * 可用调休天数
     */
    private String offDays;
    /**
     * 调休过期时间
     */
    private String expireDate;
}
