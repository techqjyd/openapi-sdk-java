package com.xinrenxinshi.domain;

/**
 * 成本中心返回Model
 *
 * @author weitianyi
 * 2017-04-27 15:56:35
 */
public class CostCenterModel {

    /**
     * 成本中心id
     */
    private String costId;

    /**
     * 父成本中心id ，没有父，为0
     */
    private String parentId;

    /**
     * 成本中心名称
     */
    private String costCenterName;

    /**
     * 成本中心编码
     */
    private String costCenterCode;


    public CostCenterModel() {
    }

    public CostCenterModel(String costId, String parentId, String name, String code, short isDel) {
        this.costId = costId;
        this.parentId = parentId;
        this.costCenterName = name;
        this.costCenterCode = code;
    }

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

    public String getCostCenterName() {
        return costCenterName;
    }

    public void setCostCenterName(String costCenterName) {
        this.costCenterName = costCenterName;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }
}
