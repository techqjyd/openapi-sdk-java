package com.xinrenxinshi.domain.payroll;

import java.util.List;

/**
 * Created by zengqingmeng on 2018/7/18.
 */
public class PayrollOtherField extends PayrollField {

    public PayrollOtherField(String id, Integer lifeCycle, String name) {
        this.setId(id);
        this.setLifeCycle(lifeCycle);
        this.setName(name);
    }

    public PayrollOtherField(String id, Integer lifeCycle, String name, Integer type, List<String> dataSource) {
        this.setId(id);
        this.setLifeCycle(lifeCycle);
        this.setName(name);
        this.type = type;
        this.dataSource = dataSource;
    }

    /**
     * 字段类型，枚举：EPayrollCustomFieldType
     */
    private Integer type;

    /**
     * 选项类字段的数据源
     */
    private List<String> dataSource;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<String> getDataSource() {
        return dataSource;
    }

    public void setDataSource(List<String> dataSource) {
        this.dataSource = dataSource;
    }

    public PayrollOtherField() {
    }
}
