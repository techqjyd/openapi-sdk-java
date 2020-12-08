package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.EmpStatusEnum;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeSimple;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

import static com.xinrenxinshi.common.Constants.LIMIT_NUMBER_PAGES;

/**
 * 员工基础列表信息request
 *
 * @author: liuchenhui
 * @create: 2019-11-12 14:42
 **/
public class EmployeeBasicInfoListRequest extends AbstractOpenapiJsonRequest<PageResult<EmployeeSimple>> {

    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 起始页码，默认从0开始，翻页+1
     */
    private Integer pageNo;
    /**
     * 查询员工数量，单次数量限制100
     */
    private Integer pageSize;
    /**
     * 是否包含子部门员工,0不包含,1包含
     */
    private FetchChildEnum fetchChild;
    /**
     * 员工状态，默认为0。0:在职员工、1:离职员工
     */
    private EmpStatusEnum status;

    public EmployeeBasicInfoListRequest(String accessToken) {
        super(accessToken);
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
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

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<EmployeeSimple>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<EmployeeSimple>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<EmployeeSimple>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (pageNo == null) {
            throw new ParamNotValidException("起始页码为空");
        }
        if (pageSize == null || pageSize > LIMIT_NUMBER_PAGES) {
            throw new ParamNotValidException("查询员工数量为空或者数量超过100");
        }
        if (fetchChild == null) {
            throw new ParamNotValidException("是否包含子部门为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/simplelist";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        map.put("fetchChild", fetchChild.getFetchChild());
        if (status != null) {
            map.put("status", status.getStatus());
        }
        if (!XRXSStrUtils.isEmpty(departmentId)) {
            map.put("departmentId", departmentId);
        }
        return map;
    }
}
