package com.xinrenxinshi.domain;

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
}
