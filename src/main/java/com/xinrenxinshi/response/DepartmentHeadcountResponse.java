package com.xinrenxinshi.response;

/**
 * @author itar.deng
 * @version 1.0
 * @date 2025/4/24 14:02
 * @jdk 1.8
 * @description 部门编制模型
 **/
public class DepartmentHeadcountResponse {
    /**
     * 部门id
     */
    private String departmentId;
    /**
     * 部门总编制
     */
    private Integer totalHeadcount;
    /**
     * 占编人数
     */
    private Integer actualOccupyHeadcount;
    /**
     * 剩余编制
     */
    private Integer remainHeadcount;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getTotalHeadcount() {
        return totalHeadcount;
    }

    public void setTotalHeadcount(Integer totalHeadcount) {
        this.totalHeadcount = totalHeadcount;
    }

    public Integer getActualOccupyHeadcount() {
        return actualOccupyHeadcount;
    }

    public void setActualOccupyHeadcount(Integer actualOccupyHeadcount) {
        this.actualOccupyHeadcount = actualOccupyHeadcount;
    }

    public Integer getRemainHeadcount() {
        return remainHeadcount;
    }

    public void setRemainHeadcount(Integer remainHeadcount) {
        this.remainHeadcount = remainHeadcount;
    }
}
