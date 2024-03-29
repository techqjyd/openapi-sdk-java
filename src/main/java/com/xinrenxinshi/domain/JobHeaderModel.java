package com.xinrenxinshi.domain;

import java.util.List;

/**
 * 岗位信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 11:49
 **/
public class JobHeaderModel {
    /**
     * 岗位ID
     */
    private String jobId;
    /**
     * 岗位名称
     */
    private String jobName;

    private String enName;

    /**
     * 岗位编码
     */
    private String jobCode;

    private Integer addtime;
    private Integer modtime;

    /**
     * 适用部门
     */
    private List<String> departmentIds;

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getModtime() {
        return modtime;
    }

    public void setModtime(Integer modtime) {
        this.modtime = modtime;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }
}
