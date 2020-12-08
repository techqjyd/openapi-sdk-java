package com.xinrenxinshi.response;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ke Zhan on 2020/11/15
 */
public class PageResult<T> {

    /**
     * 总页数
     */
    private Long totalPageSize = 0L;

    /**
     * 当前页
     */
    private int pageNo = 1;

    /**
     * 每页显示条数
     */
    private int pageSize = -1;

    /**
     * 返回结果
     */
    private List<T> result = new ArrayList<>();

    /**
     * 是否有下一页 true-有，false-没有
     */
    private boolean hasMore;

    public PageResult() {
    }

    public PageResult(Long totalPageSize, int pageNo, int pageSize, List<T> result, boolean hasMore) {
        this.totalPageSize = totalPageSize;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.result = result;
        this.hasMore = hasMore;
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

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public Long getTotalPageSize() {
        return totalPageSize;
    }

    public void setTotalPageSize(Long totalPageSize) {
        this.totalPageSize = totalPageSize;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }
}
