package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.ProcessBasicInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalListResponse;
import com.xinrenxinshi.response.PageResult;
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
public class ApprovalListRequest extends AbstractOpenapiJsonRequest<PageResult<ProcessBasicInfo>> {

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
    private List<Integer> flowStatus;
    /**
     * 审批类型，多个逗号分隔
     */
    private List<Integer> flowTypes;

    /** 所属人ID 数组 */
    private List<String> ownerIds;
    /**
     * 部门id，多个逗号分隔
     */
    private List<String> departmentIds;

    /**
     * 以审批添加时间纬度查询的开始时间，时间戳精确到秒
     */
    private Integer addtimeStart;
    /**
     * 以审批添加时间纬度查询的结束时间，时间戳精确到秒
     */
    private Integer addtimeEnd;
    /**
     * 以审批修改时间纬度查询的开始时间，时间戳精确到秒
     */
    private Integer lastModtimeStart;
    /**
     * 以审批修改时间纬度查询的结束时间，时间戳精确到秒
     */
    private Integer lastModtimeEnd;

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

    public List<Integer> getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(List<Integer> flowStatus) {
        this.flowStatus = flowStatus;
    }

    public List<Integer> getFlowTypes() {
        return flowTypes;
    }

    public void setFlowTypes(List<Integer> flowTypes) {
        this.flowTypes = flowTypes;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public Integer getAddtimeStart() {
        return addtimeStart;
    }

    public void setAddtimeStart(Integer addtimeStart) {
        this.addtimeStart = addtimeStart;
    }

    public Integer getAddtimeEnd() {
        return addtimeEnd;
    }

    public void setAddtimeEnd(Integer addtimeEnd) {
        this.addtimeEnd = addtimeEnd;
    }

    public Integer getLastModtimeStart() {
        return lastModtimeStart;
    }

    public void setLastModtimeStart(Integer lastModtimeStart) {
        this.lastModtimeStart = lastModtimeStart;
    }

    public Integer getLastModtimeEnd() {
        return lastModtimeEnd;
    }

    public void setLastModtimeEnd(Integer lastModtimeEnd) {
        this.lastModtimeEnd = lastModtimeEnd;
    }

    public List<String> getOwnerIds() {
        return ownerIds;
    }

    public void setOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<ProcessBasicInfo>> getResponseClass() {
        return new OpenapiResponse<>();
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
            map.put("flowStatus", flowStatus);
        }
        if (!XRXSListUtils.isEmpty(flowTypes)) {
            map.put("flowTypes", flowTypes);
        }
        if (!XRXSListUtils.isEmpty(departmentIds)) {
            map.put("departmentIds", departmentIds);
        }
        if (!XRXSListUtils.isEmpty(ownerIds)) {
            map.put("ownerIds", ownerIds);
        }
        if (null != addtimeStart) {
            map.put("addtimeStart", addtimeStart);
        }
        if (null != addtimeEnd) {
            map.put("addtimeEnd", addtimeEnd);
        }
        if (null != lastModtimeStart) {
            map.put("lastModtimeStart", lastModtimeStart);
        }
        if (null != lastModtimeEnd) {
            map.put("lastModtimeEnd", lastModtimeEnd);
        }
        return map;
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<ProcessBasicInfo>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<ProcessBasicInfo>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/list";
    }
}
