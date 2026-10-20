package com.xinrenxinshi.response;

import java.util.List;

public class PayrollEmployeeAdjustmentFormResponse {

    /**
     * 员工ID - 必填
     */
    private String employeeId;

    /**
     * 调薪前基本工资 - 必填
     */
    private Double beforeBasePay;

    /**
     * 调薪后基本工资 -必填
     */
    private Double afterBasePay;

    /**
     * 聘用形式 0:正式, 10:实习, 11:劳务, 12:顾问, 13:返聘, 14:外包, 15:兼职, 16:灵活用工, 17:劳务派遣, 18:派遣, 19:见习, 20:临时工, 21:小时工
     */
    private Integer hireType;

    /**
     * 计薪方式 0-按月 1-按日 只有非正式类型才有效
     */
    private Integer payType;

    /**
     * 调薪原因
     */
    private String reason;

    /**
     * 调薪生效时间 yyyy-mm-dd 必填
     */
    private String happenDate;

    /**
     * 自定义基本工资
     */
    private List<CustomPayrollItemChangeDO> customBasePay;

    /**
     * 自定义岗位工资
     */
    private List<CustomPayrollItemChangeDO> noAttendancePay;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getBeforeBasePay() {
        return beforeBasePay;
    }

    public void setBeforeBasePay(Double beforeBasePay) {
        this.beforeBasePay = beforeBasePay;
    }

    public Double getAfterBasePay() {
        return afterBasePay;
    }

    public void setAfterBasePay(Double afterBasePay) {
        this.afterBasePay = afterBasePay;
    }

    public Integer getHireType() {
        return hireType;
    }

    public void setHireType(Integer hireType) {
        this.hireType = hireType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getHappenDate() {
        return happenDate;
    }

    public void setHappenDate(String happenDate) {
        this.happenDate = happenDate;
    }

    public List<CustomPayrollItemChangeDO> getCustomBasePay() {
        return customBasePay;
    }

    public void setCustomBasePay(List<CustomPayrollItemChangeDO> customBasePay) {
        this.customBasePay = customBasePay;
    }

    public List<CustomPayrollItemChangeDO> getNoAttendancePay() {
        return noAttendancePay;
    }

    public void setNoAttendancePay(List<CustomPayrollItemChangeDO> noAttendancePay) {
        this.noAttendancePay = noAttendancePay;
    }

    /**
     * 自定义工资项
     */
    public static class CustomPayrollItemChangeDO {
        /**
         * 自定义工资项ID -必填
         */
        private int id;

        /**
         * 自定义工资项名称
         */
        private String name;

        /**
         * 调薪前工资值 -必填
         */
        private Double beforePayValue;

        /**
         * 调薪后工资值 -必填
         */
        private Double afterPayValue;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getBeforePayValue() {
            return beforePayValue;
        }

        public void setBeforePayValue(Double beforePayValue) {
            this.beforePayValue = beforePayValue;
        }

        public Double getAfterPayValue() {
            return afterPayValue;
        }

        public void setAfterPayValue(Double afterPayValue) {
            this.afterPayValue = afterPayValue;
        }
    }
}