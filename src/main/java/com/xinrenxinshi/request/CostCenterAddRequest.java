package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.CostBudgetControlYearModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CostCenterAddRequest extends AbstractOpenapiJsonRequest<String> {
    public CostCenterAddRequest(String accessToken) {
        super(accessToken);
    }

    private String parentId;
    private String name;
    private String code;
    private String expenseType;
    private String expenseCode;
    private String costRemark;
    private List<CostBudgetControlYearModel> budgetYearModels;
    /**
     * 成本中心自定义字段，key 为字段名称，value 为字段值；
     * 多选类型（fieldType=8）传 JSON 数组字符串，如 ["A","B"]
     */
    private Map<String,String> customFields;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getExpenseCode() {
        return expenseCode;
    }

    public void setExpenseCode(String expenseCode) {
        this.expenseCode = expenseCode;
    }

    public String getCostRemark() {
        return costRemark;
    }

    public void setCostRemark(String costRemark) {
        this.costRemark = costRemark;
    }

    public List<CostBudgetControlYearModel> getBudgetYearModels() {
        return budgetYearModels;
    }

    public void setBudgetYearModels(List<CostBudgetControlYearModel> budgetYearModels) {
        this.budgetYearModels = budgetYearModels;
    }

    public Map<String,String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String,String> customFields) {
        this.customFields = customFields;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("parentId", parentId);
        map.put("name", name);
        map.put("code", code);
        map.put("costRemark", costRemark);
        map.put("expenseType", expenseType);
        map.put("expenseCode", expenseCode);
        map.put("budgetYearModels",budgetYearModels);
        if (customFields != null && !customFields.isEmpty()) {
            map.put("customFields", customFields);
        }
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(parentId)) {
            throw new ParamNotValidException("parentId为空");
        }
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("name为空");
        }
        if (XRXSStrUtils.isEmpty(code)) {
            throw new ParamNotValidException("code为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/costcenter/add";
    }
}
