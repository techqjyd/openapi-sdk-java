package com.xinrenxinshi.response;

import lombok.Builder;

/**
 * @author by peilizhi
 * @date 2021/4/27 09:46
 * 报表类型的分页对象，
 * 适用于列表中表头无法一一列举
 */
@Builder
public class ReportPageResult<T> {
    /**
     * 总记录数
     */
    private Long totalPageSize = 0L;

    /**
     * 当前页
     */
    private Integer pageNo = 0;

    /**
     * 每页显示条数
     */
    private Integer pageSize = 100;

    /**
     * 返回结果
     */
    private T result;

    /**
     * 是否有下一页 true-有，false-没有
     */
    private boolean hasMore;

    public Long getTotalPageSize() {
        return totalPageSize;
    }

    public void setTotalPageSize(Long totalPageSize) {
        this.totalPageSize = totalPageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public ReportPageResult(Long totalPageSize, int pageNo, int pageSize, T result, boolean hasMore) {
        this.totalPageSize = totalPageSize;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.result = result;
        this.hasMore = hasMore;
    }
}
