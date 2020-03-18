package com.xinrenxinshi.domain.payroll;

/**
 * Created by zengqingmeng on 2018/7/18.
 */
public class PayrollAdjustField extends PayrollField {

    /**
     * 计税方式，0-税前发放，1-税后发放
     */
    private Integer taxMode;

    public Integer getTaxMode() {
        return taxMode;
    }

    public void setTaxMode(Integer taxMode) {
        this.taxMode = taxMode;
    }


    public PayrollAdjustField(String id, Integer lifeCycle, Integer taxMode, String name) {
        this.setId(id);
        this.setLifeCycle(lifeCycle);
        this.taxMode = taxMode;
        this.setName(name);
    }

    public PayrollAdjustField() {
    }
}
