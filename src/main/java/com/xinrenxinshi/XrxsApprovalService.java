package com.xinrenxinshi;

import com.xinrenxinshi.domain.approval.FlowType;
import com.xinrenxinshi.domain.approval.ProcessBasicInfo;
import com.xinrenxinshi.domain.approval.ProcessFlowInfo;
import com.xinrenxinshi.domain.approval.ProcessStepAndCopyInfo;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.List;

/**
 * 审批相关service
 *
 * @author: liuchenhui
 * @create: 2019-11-14 14:46
 **/
public abstract class XrxsApprovalService {

    /**
     * 获取审批列表
     *
     * @param access_token  授权token
     * @param pageNo        列表起始页
     * @param pageSize      每页条数
     * @param flowStatus    审批状态list
     * @param flowTypes     审批类型list
     * @param departmentIds 部门ids
     */
    public static OpenapiResponse<PageResult<ProcessBasicInfo>> getFlowList(String access_token,
                                                           Integer pageNo,
                                                           Integer pageSize,
                                                           List<Integer> flowStatus,
                                                           List<Integer> flowTypes,
                                                           List<String> departmentIds) throws ApiException {
        ApprovalListRequest request = new ApprovalListRequest(access_token);
        request.setPageNo(pageNo);
        request.setPageSize(pageSize);
        request.setFlowStatus(flowStatus);
        request.setFlowTypes(flowTypes);
        request.setDepartmentIds(departmentIds);
        return getFlowList(request);
    }

    /**
     * 获取审批列表
     */
    public static OpenapiResponse<PageResult<ProcessBasicInfo>> getFlowList(ApprovalListRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }



    /**
     * 获取审批表单详情
     *
     * @param access_token 授权token
     * @param sid    审批id
     */
    public static OpenapiResponse<ProcessFlowInfo> getFlowDetail(String access_token,
                                                Long sid) throws ApiException {
        ApprovalDetailRequest request = new ApprovalDetailRequest(access_token);
        request.setSid(sid);
        return getFlowDetail(request);
    }

    /**
     * 获取审批表单详情
     */
    public static OpenapiResponse<ProcessFlowInfo> getFlowDetail(ApprovalDetailRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }


    /**
     * 获取审批类型
     *
     * @param access_token 授权token
     */
    public static OpenapiResponse<List<FlowType>> getFLowTypes(String access_token) throws ApiException {
        ApprovalTypeGetRequest request = new ApprovalTypeGetRequest(access_token);
        return getFLowTypes(request);
    }

    /**
     * 获取审批类型
     */
    public static OpenapiResponse<List<FlowType>> getFLowTypes(ApprovalTypeGetRequest request) throws ApiException {
        OpenapiResponse<List<FlowType>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取审批节点信息
     *
     * @param access_token 授权token
     * @param sid    审批id
     */
    public static OpenapiResponse<ProcessStepAndCopyInfo> getNodeInfo(String access_token,
                                                     Long sid) throws ApiException {
        ApprovalNodeInfoRequest request = new ApprovalNodeInfoRequest(access_token);
        request.setSid(sid);
        return getNodeInfo(request);
    }

    /**
     * 获取审批节点信息
     */
    public static OpenapiResponse<ProcessStepAndCopyInfo> getNodeInfo(ApprovalNodeInfoRequest request) throws ApiException {
        OpenapiResponse<ProcessStepAndCopyInfo> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 审批节点操作
     *
     * @param stepNodeId 审批节点id
     * @param operatorId 操作人id (员工id)
     * @param status     操作类型 1:通过 2:驳回
     * @param remark     备注信息(最长300个字符)
     */
    public static OpenapiResponse<Void> workflowNodeOperate(String access_token,
                                              String stepNodeId,
                                              String operatorId,
                                              Integer status,
                                              String remark) throws ApiException {
        ApprovalNodeOperateRequest request = new ApprovalNodeOperateRequest(access_token);
        request.setStepNodeId(stepNodeId);
        request.setOperatorId(operatorId);
        request.setStatus(status);
        request.setRemark(remark);
        return workflowNodeOperate(request);
    }

    /**
     * 审批节点操作
     */
    public static OpenapiResponse<Void>  workflowNodeOperate(ApprovalNodeOperateRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }


}
