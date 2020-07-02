package com.xinrenxinshi.domain.approval.param;

import java.util.List;

/**
 * @author wangyuan
 * @date 2020/7/2 上午10:12
 */
public class FlowListParam {

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
}
