package com.xinrenxinshi.common;

/**
 * 社保减员月enum
 *
 * @author: liuchenhui
 * @create: 2019-11-12 10:55
 **/
public enum InsuranceSubEnum {
    /**
     * 当月
     */
    DURING_MONTH(0, "当月"),
    /**
     * 下月
     */
    NEXT_MONTH(1, "下月");
    private Integer insuranceSub;
    private String description;

    InsuranceSubEnum(Integer insuranceSub, String description) {
        this.insuranceSub = insuranceSub;
        this.description = description;
    }

    public Integer getInsuranceSub() {
        return insuranceSub;
    }

    public void setInsuranceSub(Integer insuranceSub) {
        this.insuranceSub = insuranceSub;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
