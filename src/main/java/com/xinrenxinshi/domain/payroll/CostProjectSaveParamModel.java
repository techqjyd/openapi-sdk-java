package com.xinrenxinshi.domain.payroll;

import java.io.Serializable;
import java.util.List;

/**
 * 项目保存/修改 - 请求参数模型
 *
 * @author panhuiwen
 */
public class CostProjectSaveParamModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String projectId;
    private String name;
    private Integer icon;
    private List<ObjectScopes> projectManagers;
    private String fillEmployees;
    private String confirmEmployees;
    private String costCenter;
    private Integer status;
    private List<SettingFilterObjectDO> objects;
    private List<CostProjectAffairSaveParamModel> projectAffairs;
    private Integer affairsIsRequired;
    private Integer cellColorType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public List<ObjectScopes> getProjectManagers() {
        return projectManagers;
    }

    public void setProjectManagers(List<ObjectScopes> projectManagers) {
        this.projectManagers = projectManagers;
    }

    public String getFillEmployees() {
        return fillEmployees;
    }

    public void setFillEmployees(String fillEmployees) {
        this.fillEmployees = fillEmployees;
    }

    public String getConfirmEmployees() {
        return confirmEmployees;
    }

    public void setConfirmEmployees(String confirmEmployees) {
        this.confirmEmployees = confirmEmployees;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SettingFilterObjectDO> getObjects() {
        return objects;
    }

    public void setObjects(List<SettingFilterObjectDO> objects) {
        this.objects = objects;
    }

    public List<CostProjectAffairSaveParamModel> getProjectAffairs() {
        return projectAffairs;
    }

    public void setProjectAffairs(List<CostProjectAffairSaveParamModel> projectAffairs) {
        this.projectAffairs = projectAffairs;
    }

    public Integer getAffairsIsRequired() {
        return affairsIsRequired;
    }

    public void setAffairsIsRequired(Integer affairsIsRequired) {
        this.affairsIsRequired = affairsIsRequired;
    }

    public Integer getCellColorType() {
        return cellColorType;
    }

    public void setCellColorType(Integer cellColorType) {
        this.cellColorType = cellColorType;
    }
}
