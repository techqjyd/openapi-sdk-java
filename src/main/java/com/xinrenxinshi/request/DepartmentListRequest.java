package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.DepartmentModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 部门列表request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:21
 **/
public class DepartmentListRequest extends AbstractOpenapiJsonRequest<List<DepartmentModel>> {

    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 是否获取子部门,0-不包含、1-包含
     */
    private FetchChildEnum fetchChild;

    /**
     * 更新时间 用来增量更新的
     */
    private Integer modtime;
    private Integer status;

    public Integer getModtime() {
        return modtime;
    }

    public void setModtime(Integer modtime) {
        this.modtime = modtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

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
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<DepartmentModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        /*
         * 无需校验
         */
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/list";
    }

    @Override
    public TypeReference<OpenapiResponse<List<DepartmentModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<DepartmentModel>>>() {
        };
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
        if (modtime != null){
            map.put("modtime",modtime);
        }
        if (status != null){
            map.put("status",status);
        }
        return map;
    }
}
