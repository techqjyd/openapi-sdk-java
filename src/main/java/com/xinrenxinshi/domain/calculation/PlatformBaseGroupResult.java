package com.xinrenxinshi.domain.calculation;

/**
 * 基础分组结果
 */
public class PlatformBaseGroupResult {

    /**
     * 分组ID
     */
    private Integer groupId;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 分组类型 @see PlatformGroupTypeEnum
     */
    private Integer type;

    /**
     * 公司方案名称
     */
    private String companyPlanName;

    /**
     * 获取分组ID
     * @return 分组ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置分组ID
     * @param groupId 分组ID
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取分组名称
     * @return 分组名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置分组名称
     * @param groupName 分组名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取分组类型
     * @return 分组类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置分组类型
     * @param type 分组类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取公司方案名称
     * @return 公司方案名称
     */
    public String getCompanyPlanName() {
        return companyPlanName;
    }

    /**
     * 设置公司方案名称
     * @param companyPlanName 公司方案名称
     */
    public void setCompanyPlanName(String companyPlanName) {
        this.companyPlanName = companyPlanName;
    }
}