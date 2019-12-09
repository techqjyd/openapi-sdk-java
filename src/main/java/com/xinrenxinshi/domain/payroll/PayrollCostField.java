package com.xinrenxinshi.domain.payroll;

/**
 * Created by zengqingmeng on 2018/7/18.
 */
public class PayrollCostField extends PayrollField {

    public PayrollCostField(String id, Integer lifeCycle, String name) {
        this.setId(id);
        this.setLifeCycle(lifeCycle);
        this.setName(name);
    }

    public PayrollCostField() {
    }
}
