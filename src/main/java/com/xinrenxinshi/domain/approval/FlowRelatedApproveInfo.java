package com.xinrenxinshi.domain.approval;

/**
 * 审批关联表单信息
 */
public class FlowRelatedApproveInfo {

    /** 审批ID */
    private String sid;

    /** 审批标题 - 示例：张三提交的审批公式 */
    private String title;

    /** 审批类型名称 */
    private String flowName;

    /** 审批编号 */
    private String flowNumber;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public String getFlowNumber() {
        return flowNumber;
    }

    public void setFlowNumber(String flowNumber) {
        this.flowNumber = flowNumber;
    }
}
