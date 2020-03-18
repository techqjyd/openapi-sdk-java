package com.xinrenxinshi.domain.approval;

import java.util.List;

/**
 * 审批节点信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:35
 **/
public class StepNodeInfo {
    /**
     * 审批id
     */
    private Integer processId;
    /**
     * 节点id
     */
    private String nodeId;
    /**
     * 审批人类型，0：员工 1：管理员 3:系统
     */
    private Integer stepType;
    /**
     * 操作人类型，0：员工 1：管理员 3:系统
     */
    private Integer operatorType;
    /**
     * 节点状态 0：审批中 1：通过 2：驳回 3：转发 4：离职删除 5:跳过 6:撤销 8: 等待 9 ：废弃 10：审批人不存在
     */
    private Integer status;
    /**
     * 节点类型，0审批节点，1开始节点，2结束节点
     */
    private Integer nodeType;
    /**
     * 审批节点类型，false：单个审批，true：审批组
     */
    private boolean group;
    /**
     * 审批组类型，1、会签（节点需所有审批人同意）；2、或签（节点只需一个审批人同意）
     */
    private Integer groupType;
    /**
     * 节点创建时间戳（精确到秒）
     */
    private Integer addtime;
    /**
     * 审批人列表
     */
    private List<StepApproveInfo> approveInfos;
    /**
     * 抄送人列表
     */
    private List<StepCopyInfo> copyInfos;

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

    public Integer getStepType() {
        return stepType;
    }

    public void setStepType(Integer stepType) {
        this.stepType = stepType;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public List<StepApproveInfo> getApproveInfos() {
        return approveInfos;
    }

    public void setApproveInfos(List<StepApproveInfo> approveInfos) {
        this.approveInfos = approveInfos;
    }

    public List<StepCopyInfo> getCopyInfos() {
        return copyInfos;
    }

    public void setCopyInfos(List<StepCopyInfo> copyInfos) {
        this.copyInfos = copyInfos;
    }
}
