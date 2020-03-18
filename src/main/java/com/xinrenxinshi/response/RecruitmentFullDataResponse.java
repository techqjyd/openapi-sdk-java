package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.Page;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.recruit.RecruitReportInfo;

/**
 * 招聘全数据response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:52
 **/
public class RecruitmentFullDataResponse extends OpenapiResponse {
    /**
     * 数据集
     */
    private Page<RecruitReportInfo> data;

    public Page<RecruitReportInfo> getData() {
        return data;
    }

    public void setData(Page<RecruitReportInfo> data) {
        this.data = data;
    }
}
