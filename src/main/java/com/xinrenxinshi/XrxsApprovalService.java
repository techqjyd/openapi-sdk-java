package com.xinrenxinshi;

import com.xinrenxinshi.domain.approval.FlowType;
import com.xinrenxinshi.domain.approval.ProcessFlowInfo;
import com.xinrenxinshi.domain.approval.ProcessStepAndCopyInfo;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.ApprovalDetialRequest;
import com.xinrenxinshi.request.ApprovalListRequest;
import com.xinrenxinshi.request.ApprovalNodeInfoRequest;
import com.xinrenxinshi.request.ApprovalTypeGetRequest;
import com.xinrenxinshi.response.ApprovalDetialResponse;
import com.xinrenxinshi.response.ApprovalListResponse;
import com.xinrenxinshi.response.ApprovalNodeInfoResponse;
import com.xinrenxinshi.response.ApprovalTypeGetResponse;

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
    public static ApprovalListResponse getFlowList(String access_token,
                                                   Integer pageNo,
                                                   Integer pageSize,
                                                   List<String> flowStatus,
                                                   List<String> flowTypes,
                                                   List<String> departmentIds) throws ApiException {
        ApprovalListRequest request = new ApprovalListRequest(access_token);
        request.setPageNo(pageNo);
        request.setPageSize(pageSize);
        request.setFlowStatus(flowStatus);
        request.setFlowTypes(flowTypes);
        request.setDepartmentIds(departmentIds);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        ApprovalListResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取审批表单详情
     *
     * @param access_token 授权token
     * @param processId    审批id
     */
    public static ProcessFlowInfo getFlowDetail(String access_token,
                                                Integer processId) throws ApiException {
        ApprovalDetialRequest request = new ApprovalDetialRequest(access_token);
        request.setProcessId(processId);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        ApprovalDetialResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getData();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取审批类型
     *
     * @param access_token 授权token
     */
    public static List<FlowType> getFLowTypes(String access_token) throws ApiException {
        ApprovalTypeGetRequest request = new ApprovalTypeGetRequest(access_token);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        ApprovalTypeGetResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getData();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取审批节点信息
     *
     * @param access_token 授权token
     * @param processId    审批id
     */
    public static ProcessStepAndCopyInfo getNodeInfo(String access_token,
                                                     Integer processId) throws ApiException {
        ApprovalNodeInfoRequest request = new ApprovalNodeInfoRequest(access_token);
        request.setProcessId(processId);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        ApprovalNodeInfoResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getData();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }
}
