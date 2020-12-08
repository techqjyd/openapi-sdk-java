package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 审批节点操作请求
 *
 * @author Ke Zhan on 2020/11/19
 */
public class ApprovalNodeOperateRequest extends AbstractOpenapiJsonRequest<Void> {
    /**
     * 审批节点id
     */
    private String stepNodeId;
    /**
     * 操作人id (员工id)
     */
    private String operatorId;
    /**
     * 操作类型 1:通过 2:驳回
     */
    private Integer status;
    /**
     * 备注信息(最长300个字符)
     */
    private String remark;

    public ApprovalNodeOperateRequest(String accessToken) {
        super(accessToken);
    }

    public String getStepNodeId() {
        return stepNodeId;
    }

    public void setStepNodeId(String stepNodeId) {
        this.stepNodeId = stepNodeId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("stepNodeId", stepNodeId);
        map.put("operatorId", operatorId);
        map.put("status", status);
        map.put("remark", remark);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(stepNodeId)) {
            throw new ParamNotValidException("审批节点id为空");
        }
        if (XRXSStrUtils.isEmpty(operatorId)) {
            throw new ParamNotValidException("操作人id(员工id)为空");
        }
        if (status == null) {
            throw new ParamNotValidException("操作类型为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/node/operate";
    }
}
