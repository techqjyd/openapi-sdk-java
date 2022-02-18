package com.xinrenxinshi.common;

public enum EmployeeStatusEnum {
    STATUS_ON(0, "在职"),
    STATUS_OFF(1, "离职"),
    STATUS_PENDING(2, "待入职"),
    STATUS_DELETION(8, "删除");

    private Integer value;
    private String desc;

    public static EmployeeStatusEnum findByValue(Integer value) {
        if (value == null) {
            return null;
        }
        switch (value) {
            case 2:
                return STATUS_PENDING;
            case 0:
                return STATUS_ON;
            case 1:
                return STATUS_OFF;
            case 8:
                return STATUS_DELETION;
            default:
                return null;
        }
    }

    EmployeeStatusEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}