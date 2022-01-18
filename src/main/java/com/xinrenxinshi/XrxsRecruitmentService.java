package com.xinrenxinshi;

import com.xinrenxinshi.domain.Page;
import com.xinrenxinshi.domain.recruit.RecruitReportInfo;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeParamModel;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.RecruitmentFullDataRequest;
import com.xinrenxinshi.request.RecruitmentSyncResumeRequest;
import com.xinrenxinshi.util.RequestTemplate;

/**
 * 招聘相关service
 *
 * @author: liuchenhui
 * @create: 2019-11-14 14:47
 **/

public abstract class XrxsRecruitmentService {
    /**
     * 获取招聘全数据报表
     *
     * @param access_token 授权token
     * @param pageNo       页数
     * @param pageSize     每页条数
     * @param startTime    简历投递开始时间
     * @param endTime      简历投递结束时间
     */
    public static OpenapiResponse<Page<RecruitReportInfo>> getFullReport(String access_token,
                                                        Integer pageNo,
                                                        Integer pageSize,
                                                        String startTime,
                                                        String endTime) throws ApiException {
        RecruitmentFullDataRequest request = new RecruitmentFullDataRequest(access_token);
        request.setPageNo(pageNo);
        request.setPageSize(pageSize);
        request.setStartTime(startTime);
        request.setEndTime(endTime);
        return getFullReport(request);
    }

    /**
     * 获取招聘全数据报表
     */
    public static OpenapiResponse<Page<RecruitReportInfo>> getFullReport(RecruitmentFullDataRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 简历上传
     */
    public static OpenapiResponse<String> syncRecruitmentResume(RecruitmentSyncResumeRequest request) throws ApiException{
        return RequestTemplate.execute(request);
    }

}
