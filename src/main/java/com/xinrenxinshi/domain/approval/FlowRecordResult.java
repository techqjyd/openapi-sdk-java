package com.xinrenxinshi.domain.approval;

import java.util.List;

/**
 * 审批记录返回结果
 *
 * @author hzz
 * @date 2022/5/6
 * @since
 */
public class FlowRecordResult {
    /**
     * 时间
     */
    private String time;

    /**
     * 抄送人抄送时间
     */
    private String copyTime;

    /**
     * 结点类型(1开始 2结束 3审批人 4审批组)
     */
    private Integer stepType;

    /**
     * 结点状态（0审批中 1通过 2驳回 3转发 6撤销 8等待 10角色空终止 11角色人过多终止）
     */
    private Integer stepStatus;

    /**
     * 会签 或签
     */
    private Integer passType;

    /**
     * 发起人名字
     */
    private String ownerName;

    /**
     * 代替发起人名字
     */
    private String replaceName;

    /**
     * 管理员名字（只有管理员操作了结点才会有）
     */
    private String accountName;

    /**
     * 离职确认时间（管理员）
     */
    private String confirmDate;

    /**
     * 审批人信息
     */
    private List<FlowApproveResultModel> approveResults;

    /**
     * 抄送人信息
     */
    private List<FlowCopyResultModel> copyResults;

    /**
     * 审批评论
     */
    private List<FlowCommentModel> comments;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCopyTime() {
        return copyTime;
    }

    public void setCopyTime(String copyTime) {
        this.copyTime = copyTime;
    }

    public Integer getStepType() {
        return stepType;
    }

    public void setStepType(Integer stepType) {
        this.stepType = stepType;
    }

    public Integer getStepStatus() {
        return stepStatus;
    }

    public void setStepStatus(Integer stepStatus) {
        this.stepStatus = stepStatus;
    }

    public Integer getPassType() {
        return passType;
    }

    public void setPassType(Integer passType) {
        this.passType = passType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getReplaceName() {
        return replaceName;
    }

    public void setReplaceName(String replaceName) {
        this.replaceName = replaceName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
    }

    public List<FlowApproveResultModel> getApproveResults() {
        return approveResults;
    }

    public void setApproveResults(List<FlowApproveResultModel> approveResults) {
        this.approveResults = approveResults;
    }

    public List<FlowCopyResultModel> getCopyResults() {
        return copyResults;
    }

    public void setCopyResults(List<FlowCopyResultModel> copyResults) {
        this.copyResults = copyResults;
    }

    public List<FlowCommentModel> getComments() {
        return comments;
    }

    public void setComments(List<FlowCommentModel> comments) {
        this.comments = comments;
    }
}
