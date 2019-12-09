package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.payroll.PayrollAdjustField;
import com.xinrenxinshi.domain.payroll.PayrollBonusField;
import com.xinrenxinshi.domain.payroll.PayrollCostField;
import com.xinrenxinshi.domain.payroll.PayrollOtherField;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 工资配置Response
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:40
 **/
public class PayrollSettingResponse extends OpenapiResponse {
    /**
     * 调整项列表
     */
    private List<PayrollAdjustField> adjust;
    /**
     * 奖金项列表
     */
    private List<PayrollBonusField> bonus;
    /**
     * 成本项列表
     */
    private List<PayrollCostField> cost;
    /**
     * 其他数值项列(仅数值项)
     */
    private List<PayrollOtherField> other;

    public List<PayrollAdjustField> getAdjust() {
        return adjust;
    }

    public void setAdjust(List<PayrollAdjustField> adjust) {
        this.adjust = adjust;
    }

    public List<PayrollBonusField> getBonus() {
        return bonus;
    }

    public void setBonus(List<PayrollBonusField> bonus) {
        this.bonus = bonus;
    }

    public List<PayrollCostField> getCost() {
        return cost;
    }

    public void setCost(List<PayrollCostField> cost) {
        this.cost = cost;
    }

    public List<PayrollOtherField> getOther() {
        return other;
    }

    public void setOther(List<PayrollOtherField> other) {
        this.other = other;
    }
}
