package com.xinrenxinshi.domain.apprisal;

import java.util.List;

public class ApprisalKpiRoleEmpPageResult {

    /**
     * 当前页
     */
    private int pageNum;

    /**
     * 一页大小,最大500,默认
     */
    private int pageSize;

    /**
     * 总条数
     */
    private int totalCount;

    /**
     * 总页数
     */
    private int totalPages;

    /**
     * 当前页数据
     */
    private List<ApprisalKpiRoleEmployeeModel> data;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<ApprisalKpiRoleEmployeeModel> getData() {
        return data;
    }

    public void setData(List<ApprisalKpiRoleEmployeeModel> data) {
        this.data = data;
    }
}
