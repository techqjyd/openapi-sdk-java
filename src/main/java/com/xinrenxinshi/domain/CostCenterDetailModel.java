package com.xinrenxinshi.domain;

import java.util.List;
import java.util.Map;

public class CostCenterDetailModel {
    private String costId;
    private String parentId;
    private String name;
    private String code;
    private String expenseType;
    private String expenseCode;
    private String costRemark;
    private Map<String,Object> customFields;

    private List<CostBudgetControlYearModel> budgetYearModels;

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

    public String getCostId() {
        return costId;
    }

    public void setCostId(String costId) {
        this.costId = costId;
    }

    public Map<String, Object> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, Object> customFields) {
        this.customFields = customFields;
    }
}
