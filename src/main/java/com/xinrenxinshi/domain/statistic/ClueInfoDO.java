package com.xinrenxinshi.domain.statistic;

import lombok.Data;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : ClueInfoDO
 * @date : 2024/7/24 11:31
 */
@Data
public class ClueInfoDO {

    /**
     * 系统线索id，自增，添加时不需要传递
     */
    private Long clueInfoId;

    /**
     * 客户线索id
     */
    private String clueId;

    /**
     * 线索名称
     */
    private String clueName;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系电话
     */
    private String contactMobile;

    /**
     * 来源渠道
     */
    private String sourceFrom;

    /**
     * 首次接触线索时间  日期格式: yyyy-MM-dd
     */
    private String clueTime;

    /**
     * 负责销售姓名
     */
    private String saleEmployeeName;

    /**
     * 负责销售手机号
     */
    private String saleEmployeeMobile;

}
