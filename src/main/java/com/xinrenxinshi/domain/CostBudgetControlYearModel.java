package com.xinrenxinshi.domain;

import java.util.List;

public class CostBudgetControlYearModel {
    private Integer year;
    private List<CostBudgetItemModel> itemModels;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<CostBudgetItemModel> getItemModels() {
        return itemModels;
    }

    public void setItemModels(List<CostBudgetItemModel> itemModels) {
        this.itemModels = itemModels;
    }
}
