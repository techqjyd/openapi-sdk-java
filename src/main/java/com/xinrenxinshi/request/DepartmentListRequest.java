package com.xinrenxinshi.request;

import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.DepartmentListResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门列表request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:21
 **/
public class DepartmentListRequest extends AbstractOpenapiRequest<DepartmentListResponse> {

    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 是否获取子部门,0-不包含、1-包含
     */
    private FetchChildEnum fetchChild;

    public DepartmentListRequest(String accessToken) {
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

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<DepartmentListResponse> getResponseClass() {
        return DepartmentListResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无需校验
         */
    }

    @Override
    public String getBizUrl() {
        return "/v3/department/list";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        if (!XRXSStrUtils.isEmpty(departmentId)) {
            map.put("departmentId", departmentId);
        }
        if (fetchChild != null) {
            map.put("fetchChild", fetchChild.getFetchChild());
        }
        return map;
    }
}
