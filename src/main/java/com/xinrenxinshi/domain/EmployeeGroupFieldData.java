package com.xinrenxinshi.domain;

import java.util.List;

/**
 * <员工分组信息>.
 *
 * @author peng cheng
 * @date 2020/9/27
 * @since
 */
public class EmployeeGroupFieldData {

    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 首次记录ID
     */
    private String firstRecordId;
    /**
     * 主记录ID
     */
    private String mainRecordId;

    /**
     * 字段信息
     */
    private List<EmployeeGroupFieldDetail> recordDataList;

    public EmployeeGroupFieldData() {
    }

    public EmployeeGroupFieldData(String employeeId, String firstRecordId, String mainRecordId, List<EmployeeGroupFieldDetail> recordDataList) {
        this.employeeId = employeeId;
        this.firstRecordId = firstRecordId;
        this.mainRecordId = mainRecordId;
        this.recordDataList = recordDataList;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstRecordId() {
        return firstRecordId;
    }

    public void setFirstRecordId(String firstRecordId) {
        this.firstRecordId = firstRecordId;
    }

    public String getMainRecordId() {
        return mainRecordId;
    }

    public void setMainRecordId(String mainRecordId) {
        this.mainRecordId = mainRecordId;
    }

    public List<EmployeeGroupFieldDetail> getRecordDataList() {
        return recordDataList;
    }

    public void setRecordDataList(List<EmployeeGroupFieldDetail> recordDataList) {
        this.recordDataList = recordDataList;
    }
}
