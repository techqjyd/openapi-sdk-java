package com.xinrenxinshi.domain.statistic;

import lombok.Data;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : SaleOrderPaymentDO
 * @date : 2024/7/24 14:10
 */
@Data
public class SaleOrderPaymentDO {

    /**
     * 销售订单回款id 系统自动生成
     */
    private Long saleOrderPaymentId;

    /**
     * 回款时间 日期格式: yyyy-MM-dd
     */
    private String paymentTime;

    /**
     * 回款金额
     */
    private Double paymentAmount;


    /**
     * arr个人部分
     */
    private Double arrAmountPerson;

    /**
     * arr部门部分
     */
    private Double arrAmountDep;

}
