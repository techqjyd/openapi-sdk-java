package com.xinrenxinshi.domain.payroll;

import java.util.Map;

/**
 * 员工工资数据 Created by luoka on 2018/7/18.
 */
public class EmployeePayroll {

    /**
     * 员工ID
     */
    private String employeeId;

    /**
     * 奖金项,key为字段ID,value为具体数值
     */
    private Map<String, String> bonus;

    /**
     * 调整项,key为字段ID,value为具体数值
     */
    private Map<String, String> adjust;

    /**
     * 成本项,key为字段ID,value为具体数值
     */
    private Map<String, String> cost;

    /**
     * 数值项,key为字段ID,value为具体数值
     */
    private Map<String, String> other;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Map<String, String> getBonus() {
        return bonus;
    }

    public void setBonus(Map<String, String> bonus) {
        this.bonus = bonus;
    }

    public Map<String, String> getAdjust() {
        return adjust;
    }

    public void setAdjust(Map<String, String> adjust) {
        this.adjust = adjust;
    }

    public Map<String, String> getCost() {
        return cost;
    }

    public void setCost(Map<String, String> cost) {
        this.cost = cost;
    }

    public Map<String, String> getOther() {
        return other;
    }

    public void setOther(Map<String, String> other) {
        this.other = other;
    }

}
