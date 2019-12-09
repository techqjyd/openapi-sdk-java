package com.xinrenxinshi.domain.approval;

/**
 * 审批人信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:32
 **/
public class StepApproveInfo {
    /**
     * 审批ID
     */
    private Integer processId;
    /**
     * 节点ID
     */
    private String nodeId;
    /**
     * 审批人ID
     */
    private String approverId;
    /**
     * 审批人操作状态，0开始 1 通过 2驳回 3转发 4删除 8 审批未激活时的状态
     *
     * 特殊说明：审批人状态4表示删除，如下场景的审批人会有这个状态。
     *
     * 1、或签审批组，其中一个审批人审批通过，其他审批人状态就是4。
     *
     * 2、会签审批组，其中一个审批人驳回审批了，其他审批人状态就是4
     *
     * 3、有审批人的节点，如果是管理员处理了审批，审批人状态就是4
     */
    private Integer approveStatus;
    /**
     * 审批备注
     */
    private String remark;
    /**
     * 审批操作时间戳（精确到秒）
     */
    private Integer modtime;

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getApproverId() {
        return approverId;
    }

    public void setApproverId(String approverId) {
        this.approverId = approverId;
    }

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getModtime() {
        return modtime;
    }

    public void setModtime(Integer modtime) {
        this.modtime = modtime;
    }
}
