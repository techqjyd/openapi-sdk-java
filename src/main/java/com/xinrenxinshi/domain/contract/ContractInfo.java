package com.xinrenxinshi.domain.contract;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhaopc
 * @Date 2025/6/14
 * @Version 1.0.0
 * @Description
 */
@Getter
@Setter
public class ContractInfo {

    /**
     * 合同id
     */
    private String contractDetailId;

    /**
     * 合同状态
     */
    private Integer contractStatus;

    /**
     * 合同名称
     */
    private String contractName;

    /**
     * 合同编号
     */
    private String contractNumber;

    /**
     * 合同关联主体id
     *
     */
    private String contractId;

    /**
     * 合同关联员工id
     */
    private String employeeId;

    /**
     * 合同类型id
     */
    private String contractTypeId;

    /**
     * 合同模板id
     */
    private String contractTemplateId;


    /**
     * 签约日期
     */
    private String signDate;

    /**
     * 合同开始时间
     */
    private String contractStartDate;

    /**
     * 合同结束时间
     */
    private String contractEndDate;


    /**
     * 合同发起时间
     */
    private String contractLaunchTime;


    /**
     * 合同签署完成时间
     */
    private String contractFinishTime;


    /**
     * 合同文件key
     */
    private String contractFile;


    /**
     * 合同出证报告文件key
     */
    private String contractCertifyReportFile;

    /**
     * 合同签署方
     *
     */
    private List<String> contractSigner;

}
