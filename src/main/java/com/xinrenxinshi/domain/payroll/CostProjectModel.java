package com.xinrenxinshi.domain.payroll;

import java.io.Serializable;
import java.util.List;

/**
 * 项目模型
 *
 * @author panhuiwen
 */
public class CostProjectModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String projectId;
    private String name;
    private Integer icon;
    private Double totalHour;
    private Double totalConfirmHour;
    private Double totalUnConfirmHour;
    private List<Object> projectManagers;
    private String projectManagerStr;
    private String fillEmployees;
    private String confirmEmployees;
    private String fillEmployeeStr;
    private String confirmEmployeeStr;
    private String costCenter;
    private Integer status;
    private List<Object> objects;
    private List<CostProjectAffairModel> projectAffairs;
    private Integer affairsIsRequired;
    private Integer employeeNumber;
    private String companyId;
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

    public Double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(Double totalHour) {
        this.totalHour = totalHour;
    }

    public Double getTotalConfirmHour() {
        return totalConfirmHour;
    }

    public void setTotalConfirmHour(Double totalConfirmHour) {
        this.totalConfirmHour = totalConfirmHour;
    }

    public Double getTotalUnConfirmHour() {
        return totalUnConfirmHour;
    }

    public void setTotalUnConfirmHour(Double totalUnConfirmHour) {
        this.totalUnConfirmHour = totalUnConfirmHour;
    }

    public List<Object> getProjectManagers() {
        return projectManagers;
    }

    public void setProjectManagers(List<Object> projectManagers) {
        this.projectManagers = projectManagers;
    }

    public String getProjectManagerStr() {
        return projectManagerStr;
    }

    public void setProjectManagerStr(String projectManagerStr) {
        this.projectManagerStr = projectManagerStr;
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

    public String getFillEmployeeStr() {
        return fillEmployeeStr;
    }

    public void setFillEmployeeStr(String fillEmployeeStr) {
        this.fillEmployeeStr = fillEmployeeStr;
    }

    public String getConfirmEmployeeStr() {
        return confirmEmployeeStr;
    }

    public void setConfirmEmployeeStr(String confirmEmployeeStr) {
        this.confirmEmployeeStr = confirmEmployeeStr;
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

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    public List<CostProjectAffairModel> getProjectAffairs() {
        return projectAffairs;
    }

    public void setProjectAffairs(List<CostProjectAffairModel> projectAffairs) {
        this.projectAffairs = projectAffairs;
    }

    public Integer getAffairsIsRequired() {
        return affairsIsRequired;
    }

    public void setAffairsIsRequired(Integer affairsIsRequired) {
        this.affairsIsRequired = affairsIsRequired;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getCellColorType() {
        return cellColorType;
    }

    public void setCellColorType(Integer cellColorType) {
        this.cellColorType = cellColorType;
    }
}
