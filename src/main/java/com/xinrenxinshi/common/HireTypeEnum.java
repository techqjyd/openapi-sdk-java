package com.xinrenxinshi.common;

/**
 * 聘用类型
 *
 * @author: liuchenhui
 * @create: 2019-11-06 17:40
 **/
public enum HireTypeEnum {
    /**
     * 正式
     */
    OFFICIAL(0, "正式"),
    /**
     * 实习
     */
    PRACTICE(10, "实习"),
    /**
     * 劳务
     */
    LABOUR(11, "劳务"),
    /**
     * 顾问
     */
    COUNSELOR(12, "顾问"),
    /**
     * 返聘
     */
    REEMPLOY(13, "返聘"),
    /**
     * 外包
     */
    OUTSOURCING(14, "外包"),
    /**
     * 兼职
     */
    PARTTIME(15,"兼职"),
    /**
     * 灵活用工
     */
    LABOUR_TYPE_FLEXIBLE_STAFFING(16, "灵活用工"),
    /**
     * 劳务派遣
     */
    LABOUR_TYPE_LABOR_DISPATCH(17, "劳务派遣"),
    /**
     * 派遣
     */
    LABOUR_TYPE_DISPATCH(18, "派遣"),
    /**
     * 见习
     */
    LABOUR_TYPE_INTERNSHIP(19, "见习"),
    /**
     * 临时工
     */
    LABOUR_TYPE_TEMPORARY(20, "临时工"),
    /**
     * 小时工
     */
    LABOUR_TYPE_HOURLY_WORKER(21, "小时工");


    /**
     * 聘用类型
     */
    private Integer hireType;
    /**
     * 描述
     */
    private String description;

    HireTypeEnum(Integer hireType, String description) {
        this.hireType = hireType;
        this.description = description;
    }

    public Integer getHireType() {
        return hireType;
    }

    public void setHireType(Integer hireType) {
        this.hireType = hireType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
