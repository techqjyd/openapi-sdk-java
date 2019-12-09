package com.xinrenxinshi.common;

/**
 * 公积金减员月enum
 *
 * @author: liuchenhui
 * @create: 2019-11-12 11:10
 **/
public enum HouseFundSubEnum {
    /**
     * 当月
     */
    DURING_MONTH(0, "当月"),
    /**
     * 下月
     */
    NEXT_MONTH(1, "下月");
    private Integer houseFundSub;
    private String description;

    HouseFundSubEnum(Integer houseFundSub, String description) {
        this.houseFundSub = houseFundSub;
        this.description = description;
    }

    public Integer getHouseFundSub() {
        return houseFundSub;
    }

    public void setHouseFundSub(Integer houseFundSub) {
        this.houseFundSub = houseFundSub;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
