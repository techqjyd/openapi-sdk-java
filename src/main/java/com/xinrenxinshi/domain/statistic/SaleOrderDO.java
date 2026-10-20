package com.xinrenxinshi.domain.statistic;

import lombok.Data;

import java.util.List;


/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : SaleOrderDO
 * @date : 2024/7/24 11:33
 */
@Data
public class SaleOrderDO {

    /**
     * 销售订单ID,自增主键Id，
     * 新增订单时不需要传递，
     * 如果之前已传递订单，只需补充回款明细，则需要传递
     */
    private Long saleOrderId;

    /**
     * 客户订单id
     */
    private String orderId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 所属行业
     */
    private String customerIndustry;


    /**
     * 首次接触线索日期，精确到天
     */
    private String clueTime;


    /**
     * 订单时间,取首次回款时间 日期格式校验不通过, 日期格式: yyyy-MM-dd
     */
    private String orderTime;

    /**
     * 订单金额
     */
    private Double orderAmount;

    /**
     * 负责销售姓名
     */
    private String saleEmployeeName;

    /**
     * 负责销售手机号
     */
    private String saleEmployeeMobile;

    /**
     * 回款明细
     */
    private List<SaleOrderPaymentDO> saleOrderPaymentList;


}
