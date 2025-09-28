package com.xinrenxinshi.domain.attendance;

import lombok.Data;

/**
 * @Author zhaopc
 * @Date 2025/9/23
 * @Version 1.0.0
 * @Description
 */
@Data
public class AttendanceHolidayBalanceDetailResult {
    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 假期方案id
     */
    private String holidayPlanId;

    /**
     * 假期方案名称
     */
    private String planName;

    /**
     * 假期类型
     */
    private String holidayType;

    /**
     * 假期类型名称
     */
    private String holidayTypeName;

    /**
     * 员工姓名
     */
    private String employeeName;


    /**
     * 当前可请总假期
     */
    private String availableLeaveDays;

    /**
     * 当前可请司龄假期
     */
    private String availableLeaveCompanyAgeDays;

    /**
     * 当前可请工龄假期
     */
    private String availableLeaveWorkAgeDays;

    /**
     * 当前可请调整折算
     */
    private String availableLeaveAdjustGiveDays;

    /**
     * 当前可请调整不折算
     */
    private String availableLeaveAdjustDays;

    /**
     * 上年剩余总假期
     */
    private String surplusAnnualLeave;

    /**
     * 上年剩余司龄假期
     */
    private String lastYearSurplusCompanyAgeDays;

    /**
     * 上年剩余工龄假期
     */
    private String lastYearSurplusWorkAgeDays;

    /**
     * 上年剩余调整折算
     */
    private String lastYearSurplusAdjustGiveDays;

    /**
     * 上年剩余调整不折算
     */
    private String lastYearSurplusAdjustDays;

    /**
     * 剩余工龄假期有效期
     * yyyy-MM-dd
     */
    private String surplusWorkExpireDate;

    /**
     * 剩余司龄假期有效期
     * yyyy-MM-dd
     */
    private String surplusCoExpireDate;

    /**
     * 今年总假期
     */
    private String annualLeaveDays;

    /**
     * 今年司龄假期
     */
    private String companyAgeDays;

    /**
     * 今年工龄假期
     */
    private String workAgeDays;

    /**
     * 今年调整折算
     */
    private String adjustGiveAnnual;

    /**
     * 今年调整不折算
     */
    private String adjustDays;

    /**
     * 今年假期有效期
     * yyyy-MM-dd
     */
    private String expireDate;

    /**
     * 总假期
     */
    private String totalLeaveDays;

    /**
     * 总司龄假期
     */
    private String totalCompanyAgeDays;

    /**
     * 总工龄假期
     */
    private String totalWorkAgeDays;

    /**
     * 已用天数
     */
    private String usedDays;

    /**
     * 已过期天数
     */
    private String annualExpireDay;
    /**
     * 剩余无效天数(已用+已过期)
     */
    private String surplusInvalid;
}
