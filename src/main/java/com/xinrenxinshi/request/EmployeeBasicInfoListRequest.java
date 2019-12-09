package com.xinrenxinshi.request;

import com.xinrenxinshi.common.EmpStatusEnum;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.EmployeeBasicInfoListResponse;
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
@SuppressWarnings("all")
public class EmployeeBasicInfoListRequest extends AbstractOpenapiRequest<EmployeeBasicInfoListResponse> {

    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 起始页码，默认从0开始，翻页+1
     */
    private Integer offset;
    /**
     * 查询员工数量，单次数量限制100
     */
    private Integer size;
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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<EmployeeBasicInfoListResponse> getResponseClass() {
        return EmployeeBasicInfoListResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(departmentId)) {
            throw new ParamNotValidException("部门ID为空");
        }
        if (offset == null) {
            throw new ParamNotValidException("起始页码为空");
        }
        if (size == null || size > LIMIT_NUMBER_PAGES) {
            throw new ParamNotValidException("查询员工数量为空或者数量超过100");
        }
        if (fetchChild == null) {
            throw new ParamNotValidException("是否包含子部门为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/employee/employeeSimpleList";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("departmentId", departmentId);
        map.put("offset", offset);
        map.put("size", size);
        map.put("fetchChild", fetchChild.getFetchChild());
        if (status != null) {
            map.put("status", status.getStatus());
        }
        return map;
    }
}
