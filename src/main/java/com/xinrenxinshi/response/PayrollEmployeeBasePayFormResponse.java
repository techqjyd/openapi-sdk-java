package com.xinrenxinshi.response;

import java.util.List;

public class PayrollEmployeeBasePayFormResponse {
    /**
     * 员工ID - 必填
     */
    private String employeeId;

    /**
     * 基本薪资（非正式员工的定薪值） 聘用形式为非正式时 必填
     */
    private Double basePay;

    /**
     * 转正薪资（正式员工的转正后基本工资） 聘用形式为正式时 必填
     */
    private Double regularPay;

    /**
     * 试用期薪资（正式员工的试用期基本工资）聘用形式为正式时 必填
     */
    private Double probationaryPay;

    /**
     * 聘用形式 0:正式, 10:实习, 11:劳务, 12:顾问, 13:返聘, 14:外包, 15:兼职, 16:灵活用工, 17:劳务派遣, 18:派遣, 19:见习, 20:临时工, 21:小时工
     */
    private Integer hireType;

    /**
     * 计薪方式 0-按月 1-按日 只有非正式类型才有效 聘用形式为非正式时 必填
     */
    private Integer payType;

    /**
     * 自定义基本工资项（非正式员工 payType=1，即按日结算时 此工资项不可用）
     */
    private List<CustomPayrollItemDO> customBasePay;

    /**
     * 自定义岗位工资项目
     */
    private List<CustomPayrollItemDO> noAttendancePay;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    public Double getRegularPay() {
        return regularPay;
    }

    public void setRegularPay(Double regularPay) {
        this.regularPay = regularPay;
    }

    public Double getProbationaryPay() {
        return probationaryPay;
    }

    public void setProbationaryPay(Double probationaryPay) {
        this.probationaryPay = probationaryPay;
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

    public List<CustomPayrollItemDO> getCustomBasePay() {
        return customBasePay;
    }

    public void setCustomBasePay(List<CustomPayrollItemDO> customBasePay) {
        this.customBasePay = customBasePay;
    }

    public List<CustomPayrollItemDO> getNoAttendancePay() {
        return noAttendancePay;
    }

    public void setNoAttendancePay(List<CustomPayrollItemDO> noAttendancePay) {
        this.noAttendancePay = noAttendancePay;
    }

    /**
     * 自定义工资项
     */
    public static class CustomPayrollItemDO {
        /**
         * 自定义工资项ID - 必填
         */
        private int id;

        /**
         * 自定义工资项名称
         */
        private String name;

        /**
         * 自定义工资项值 （非正式使用） 聘用形式非正式时 必填
         */
        private Double basePay;

        /**
         * 自定义工资项试用期工资值 （正式使用） 聘用形式正式时 必填
         */
        private Double probationaryPay;

        /**
         * 自定义工资项转正工资值  （正式使用） 聘用形式正式时 必填
         */
        private Double regularPay;

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

        public Double getBasePay() {
            return basePay;
        }

        public void setBasePay(Double basePay) {
            this.basePay = basePay;
        }

        public Double getProbationaryPay() {
            return probationaryPay;
        }

        public void setProbationaryPay(Double probationaryPay) {
            this.probationaryPay = probationaryPay;
        }

        public Double getRegularPay() {
            return regularPay;
        }

        public void setRegularPay(Double regularPay) {
            this.regularPay = regularPay;
        }
    }
}