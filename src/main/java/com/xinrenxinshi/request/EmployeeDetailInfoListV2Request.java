package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.EmpStatusEnum;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.CursorPageResult;

import java.util.HashMap;
import java.util.Map;

import static com.xinrenxinshi.common.Constants.CURSOR_LIMIT_NUMBER_PAGES;

/**
 * 员工详情列表（翻页标记方式）request
 * <p>
 * 与旧版接口（{@link EmployeeDetailInfoListRequest}，页码翻页）的查询条件、字段结构完全一致，
 * 差异只有翻页方式：入参用 {@code lastId} 标记翻页位置（代替 pageNo），出参多 {@code hasMore} / {@code nextId}。
 * 每一页的响应速度稳定，适合「定时全量拉取做核对」这类大数据量拉取场景。
 *
 * @author: xrxs
 * @create: 2026-10-15
 **/
public class EmployeeDetailInfoListV2Request extends AbstractOpenapiJsonRequest<CursorPageResult<EmployeeDetail>> {

    /**
     * 部门ID，不为空时获取指定部门下的员工，为空时默认获取公司全部的员工
     */
    private String departmentId;
    /**
     * 是否包含子部门员工,0不包含,1包含
     */
    private FetchChildEnum fetchChild;
    /**
     * 员工状态，默认为0。0:在职员工、1:离职员工、2:待入职、8:删除
     */
    private EmpStatusEnum status;
    /**
     * 单页数量，1~500
     */
    private Integer size;
    /**
     * 翻页标记：上一页返回的 nextId。不传（null）= 从第一页开始
     */
    private Integer lastId;

    public EmployeeDetailInfoListV2Request(String accessToken) {
        super(accessToken);
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public FetchChildEnum getFetchChild() {
        return fetchChild;
    }

    public void setFetchChild(FetchChildEnum fetchChild) {
        this.fetchChild = fetchChild;
    }

    public EmpStatusEnum getStatus() {
        return status;
    }

    public void setStatus(EmpStatusEnum status) {
        this.status = status;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getLastId() {
        return lastId;
    }

    public void setLastId(Integer lastId) {
        this.lastId = lastId;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<CursorPageResult<EmployeeDetail>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<CursorPageResult<EmployeeDetail>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<CursorPageResult<EmployeeDetail>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (size == null || size <= 0 || size > CURSOR_LIMIT_NUMBER_PAGES) {
            throw new ParamNotValidException("单页数量 size 为空或者不合法（要求 0 < size <= 500）");
        }
        if (fetchChild == null) {
            throw new ParamNotValidException("是否包含子部门为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/list/new";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        if (departmentId != null) {
            map.put("departmentId", departmentId);
        }
        map.put("fetchChild", fetchChild.getFetchChild());
        if (status != null) {
            map.put("status", status.getStatus());
        }
        map.put("size", size);
        if (lastId != null) {
            map.put("lastId", lastId);
        }
        return map;
    }
}
