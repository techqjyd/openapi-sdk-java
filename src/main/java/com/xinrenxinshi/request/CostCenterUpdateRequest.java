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

public class CostCenterUpdateRequest extends AbstractOpenapiJsonRequest<Object> {
    public CostCenterUpdateRequest(String accessToken) {
        super(accessToken);
    }

    private String costId;
    private String parentId;
    private String name;
    private String code;
    private String expenseType;
    private String expenseCode;
    private String costRemark;
    private List<CostBudgetControlYearModel> budgetYearModels;
    /**
     * 成本中心自定义字段，key 为字段名称，value 为字段值；
     * 多选类型（fieldType=8）传 JSON 数组字符串，如 ["A","B"]；传空串表示清空该字段
     */
    private Map<String,String> customFields;

    public String getCostId() {
        return costId;
    }

    public void setCostId(String costId) {
        this.costId = costId;
    }

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
        map.put("costId",costId);
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
    public OpenapiResponse<Object> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(costId)) {
            throw new ParamNotValidException("costId为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/costcenter/update";
    }
}
