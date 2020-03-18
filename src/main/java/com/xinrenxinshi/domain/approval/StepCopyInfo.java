package com.xinrenxinshi.domain.approval;

/**
 * 抄送人信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:29
 **/
public class StepCopyInfo {

    /**
     * 审批id
     */
    private Integer processId;
    /**
     * 节点id
     */
    private String nodeId;
    /**
     * 抄送人id
     */
    private String notifierId;
    /**
     * 状态 0：未读 1：已读
     */
    private Integer isRead;
    /**
     * 操作时间
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

    public String getNotifierId() {
        return notifierId;
    }

    public void setNotifierId(String notifierId) {
        this.notifierId = notifierId;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getModtime() {
        return modtime;
    }

    public void setModtime(Integer modtime) {
        this.modtime = modtime;
    }
}
