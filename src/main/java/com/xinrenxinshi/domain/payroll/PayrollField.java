package com.xinrenxinshi.domain.payroll;

/**
 * Created by zengqingmeng on 2018/7/18.
 */
public class PayrollField {

    /**
     * 字段ID
     */
    private String id;

    /**
     * 发放周期，0-次月延用，1-次月清零
     */
    private Integer lifeCycle;

    /**
     * 字段名称
     */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PayrollField(String id, Integer lifeCycle, Integer taxMode, String name) {
        this.id = id;
        this.lifeCycle = lifeCycle;
        this.name = name;
    }

    public PayrollField() {
    }
}
