package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.ApprovalListResponse;
import com.xinrenxinshi.util.XRXSListUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 公司审批列表request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:49
 **/
public class ApprovalListRequest extends AbstractOpenapiRequest<ApprovalListResponse> {

    /**
     * 列表第几页,从0开始
     */
    private Integer pageNo;
    /**
     * 每页条数，1～100之间
     */
    private Integer pageSize;
    /**
     * 审批状态，多个逗号分隔
     */
    private List<String> flowStatus;
    /**
     * 审批类型，多个逗号分隔
     */
    private List<String> flowTypes;
    /**
     * 部门id，多个逗号分隔
     */
    private List<String> departmentIds;

    public ApprovalListRequest(String accessToken) {
        super(accessToken);
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(List<String> flowStatus) {
        this.flowStatus = flowStatus;
    }

    public List<String> getFlowTypes() {
        return flowTypes;
    }

    public void setFlowTypes(List<String> flowTypes) {
        this.flowTypes = flowTypes;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<ApprovalListResponse> getResponseClass() {
        return ApprovalListResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (pageNo == null) {
            throw new ParamNotValidException("审批列表起始页码为空");
        }
        if (pageSize == null || pageSize > 100) {
            throw new ParamNotValidException("每页条数为1~100之间");
        }
    }

    @Override
    public Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        if (!XRXSListUtils.isEmpty(flowStatus)) {
            map.put("flowStatus", String.join(",", flowStatus));
        }
        if (!XRXSListUtils.isEmpty(flowTypes)) {
            map.put("flowTypes", String.join(",", flowTypes));
        }
        if (!XRXSListUtils.isEmpty(departmentIds)) {
            map.put("departmentIds", String.join(",", departmentIds));
        }
        return map;
    }

    @Override
    public String getBizUrl() {
        return "/v4/flow/list";
    }
}
