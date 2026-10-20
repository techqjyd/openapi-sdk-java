package com.xinrenxinshi.response;

/**
 * <审批发起接口响应结果>.
 *
 * @author peng cheng
 * @date 2021/9/1
 * @since
 */
public class ApprovalApplyResponse {

    /**
     * 审批id
     */
    private Long sid;

    private String approveId;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getApproveId() {
        return approveId;
    }

    public void setApproveId(String approveId) {
        this.approveId = approveId;
    }
}
