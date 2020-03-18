package com.xinrenxinshi.domain.payroll;

/**
 * Created by zengqingmeng on 2018/7/18.
 */
public class PayrollOtherField extends PayrollField {

    public PayrollOtherField(String id, Integer lifeCycle, String name) {
        this.setId(id);
        this.setLifeCycle(lifeCycle);
        this.setName(name);
    }

    public PayrollOtherField() {
    }
}
