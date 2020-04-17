package com.xinrenxinshi.common;

/**
 * 跳转页面类型enum
 *
 *
 * 1：审批列表 2：工资条列表 3：考勤列表 4：招聘列表 5：内容推荐 6：公告列表 7：我的团队 8：申请首页 9：发起人的审批详情页面 10：审批人或抄送人的审批详情页面
 *
 * @author: liuchenhui
 * @create: 2019-11-07 10:45
 **/
public enum RedirectUrlTypeEnum {
    /**
     * 首页
     */
    HOME_PAGE(0, "首页"),
    /**
     * 审批列表
     */
    APPROVAL_LIST(1, "审批列表"),
    /**
     * 工资条列表
     */
    SALARY_LIST(2, "工资条列表"),
    /**
     * 考勤列表
     */
    ATTENDANCE_LIST(3, "考勤列表"),
    /**
     * 招聘列表
     */
    RECRUITMENT_LIST(4, "招聘列表"),
    /**
     * 内容推荐
     */
    CONTENT_RECOMMENDATION(5, "内容推荐"),
    /**
     * 公告列表
     */
    ANNOUNCEMENT_LIST(6, "公告列表"),
    /**
     * 我的团队
     */
    MY_TEAM(7, "我的团队"),
    /**
     * 申请首页
     */
    TO_APPLY_FOR_HOME_PAGE(8, "申请首页"),
    /**
     * 发起人的审批详情页面
     */
    EXAMINATION_APPROVAL_FOR_DETAILS(9, "发起人的审批详情页面"),
    /**
     * 审批人或抄送人的审批详情页面
     */
    FOR_EXAMINATION_APPROVAL_APPROVER_DETAILS(10, "审批人或抄送人的审批详情页面"),

    /**
     * 请假申请
     */
    LEAVE_APPLY(11, "请假申请");


    /**
     * 跳转页面类型
     */
    private Integer redirectUrlType;
    /**
     * 描述
     */
    private String description;

    RedirectUrlTypeEnum(Integer redirectUrlType, String description) {
        this.redirectUrlType = redirectUrlType;
        this.description = description;
    }

    public Integer getRedirectUrlType() {
        return redirectUrlType;
    }

    public void setRedirectUrlType(Integer redirectUrlType) {
        this.redirectUrlType = redirectUrlType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
