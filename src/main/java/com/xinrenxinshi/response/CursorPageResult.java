package com.xinrenxinshi.response;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工列表（翻页标记方式）结果，对应服务端 {@code EmployeeCursorPageResult}。
 * <p>
 * 翻页方式：请求通过 {@code lastId} 标记上一页读到的位置，返回 {@code hasMore} / {@code nextId}
 * 用于继续翻页；不支持跳页，也不返回总页数。
 *
 * @param <T> 员工基础信息（EmployeeSimple）或员工详情（EmployeeDetail）
 */
public class CursorPageResult<T> {

    /**
     * 每页条数（本次请求的 size）
     */
    private int pageSize = -1;

    /**
     * 是否还有下一页 true-有，false-没有。
     * 服务端通过「多取 1 条」判定，结果准确无偏差。
     * 结束条件二选一即可（都安全）：hasMore == false 或 result 为空。
     */
    private boolean hasMore;

    /**
     * 翻页标记：其值为本次返回的最后一条员工记录的 id，
     * 下一页请求把它作为 lastId 传入即可。
     * 当 result 为空时，本字段原样返回请求中传入的 lastId（不推进），不会死循环、不会重复。
     */
    private Integer nextId;

    /**
     * 返回结果
     */
    private List<T> result = new ArrayList<>();

    public CursorPageResult() {
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
