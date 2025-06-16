package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.CostBudgetControlYearModel;
import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.domain.contract.ContractInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.XRXSStrUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xinrenxinshi.common.Constants.LIMIT_NUMBER_PAGES;

/**
 * 获取公司电子合同详情列表
 */
@Setter
@Getter
public class ContractDetailListRequest extends AbstractOpenapiJsonRequest<PageResult<ContractInfo>> {

    /**
     * 起始页
     */
    private Integer pageNo = 0;
    /**
     * 分页数量
     */
    private Integer pageSize = 100;

    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 合同名称
     */
    private String contractName;

    /**
     * 合同编号
     */
    private String contractNumber;

    /**
     * 合同类型id
     */
    private String contractTypeId;

    /**
     * 合同状态
     */
    private Integer contractStatus;

    /**
     * 更新时间 精确到秒
     */
    private Integer startTime;

    /**
     * 更新时间 精确到秒
     */
    private Integer endTime;

    public ContractDetailListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        map.put("employeeId", employeeId);
        map.put("contractName", contractName);
        map.put("contractNumber", contractNumber);
        map.put("contractTypeId", contractTypeId);
        map.put("contractStatus",contractStatus);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<ContractInfo>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<ContractInfo>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<ContractInfo>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (pageNo == null) {
            throw new ParamNotValidException("起始页码为空");
        }
        if (pageSize == null || pageSize > LIMIT_NUMBER_PAGES) {
            throw new ParamNotValidException("查询数量超过100");
        }

    }

    @Override
    public String getBizUrl() {
        return "/v5/contract/detail/list";
    }
}
