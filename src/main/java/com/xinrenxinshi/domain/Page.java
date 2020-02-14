package com.xinrenxinshi.domain;

import java.util.List;

/**
 * 分页参数
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:51
 **/
public class Page<T> {
    /**
     * 当前页
     */
    private Integer pageNo;
    /**
     * 每条显示条数
     */
    private Integer pageSize;
    /**
     * true表示还有分页列表可以查询，false表示分页已到最后一页
     */
    private boolean hasMore;
    /**
     * 数据列表
     */
    private List<T> result;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
