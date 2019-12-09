package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.JobHeaderModel;

import java.util.List;

/**
 * 获取岗位信息response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 11:49
 **/
public class DepartmentJobGetResponse extends OpenapiResponse {
    /**
     * 岗位列表
     */
    private List<JobHeaderModel> jobHeaders;

    public List<JobHeaderModel> getJobHeaders() {
        return jobHeaders;
    }

    public void setJobHeaders(List<JobHeaderModel> jobHeaders) {
        this.jobHeaders = jobHeaders;
    }
}
