package com.xinrenxinshi;

import com.xinrenxinshi.domain.approval.FlowType;
import com.xinrenxinshi.domain.approval.ProcessFlowInfo;
import com.xinrenxinshi.domain.approval.ProcessStepAndCopyInfo;
import com.xinrenxinshi.domain.approval.param.FlowListParam;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.response.*;

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
     * 获取审批列表
     *
     * @param param 审批列表查询参数
     */
    public static ApprovalListResponse getFlowList(String access_token, FlowListParam param) throws ApiException {
        ApprovalListRequest request = new ApprovalListRequest(access_token);
        request.setPageNo(param.getPageNo());
        request.setPageSize(param.getPageSize());
        request.setFlowStatus(param.getFlowStatus());
        request.setFlowTypes(param.getFlowTypes());
        request.setDepartmentIds(param.getDepartmentIds());
        request.setAddtimeStart(param.getAddtimeStart());
        request.setAddtimeEnd(param.getAddtimeEnd());
        request.setLastModtimeStart(param.getLastModtimeStart());
        request.setLastModtimeEnd(param.getLastModtimeEnd());

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
     * 批量获取审批表单详情
     *
     * @param access_token 授权token
     * @param processIds   审批id列表
     */
    public static List<ProcessFlowInfo> batchGetFlowDetail(String access_token,
                                                           List<Integer> processIds) throws ApiException {
        ApprovalBatchDetialRequest request = new ApprovalBatchDetialRequest(access_token);
        request.setProcessIds(processIds);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        ApprovalBatchDetialResponse response = openapiClient.execute(request);
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
