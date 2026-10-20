package com.xinrenxinshi;

import com.xinrenxinshi.domain.Page;
import com.xinrenxinshi.domain.recruit.RecruitReportInfo;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeStandardFieldInfo;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeUploadParam;
import com.xinrenxinshi.domain.recruit.TalentBankInfo;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeInfo;
import com.xinrenxinshi.domain.recruit.RecruitmentStandardInfoDO;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.RecruitmentFullDataRequest;
import com.xinrenxinshi.request.RecruitmentResumeSyncToTalentRequest;
import com.xinrenxinshi.request.RecruitmentSyncResumeRequest;
import com.xinrenxinshi.request.RecruitmentTalentBankListRequest;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.List;

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

    /**
     * 搜索简历
     */
    public static OpenapiResponse<Page<RecruitmentResumeInfo>> searchResume(RecruitmentResumeSearchRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 简历查询
     */
    public static OpenapiResponse<RecruitmentStandardInfoDO> resumeDetail(RecruitmentStandardResumeRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }


    /**
     * 添加或更新职位
     */
    public static OpenapiResponse<String> addOrUpdateJob(RecruitmentJobAddOrUpdateRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }




    /**
     * 获取人才库列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<TalentBankInfo>> getTalentBankList(RecruitmentTalentBankListRequest request) throws ApiException{
        return RequestTemplate.execute(request);
    }

    /**
     * 获取人才库列表
     * @param access_token
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<TalentBankInfo>> getTalentBankList(String access_token) throws ApiException{
        RecruitmentTalentBankListRequest request = new RecruitmentTalentBankListRequest(access_token);
        return RequestTemplate.execute(request);
    }

    /**
     * 同步简历到人才库
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<String> resumeSyncToTalent(RecruitmentResumeSyncToTalentRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 同步简历到人才库
     * @param access_token
     * @param uploadParam
     * @param standardResume
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<String> resumeSyncToTalent(String access_token, RecruitmentResumeUploadParam uploadParam, RecruitmentResumeStandardFieldInfo standardResume) throws ApiException {
        RecruitmentResumeSyncToTalentRequest request = new RecruitmentResumeSyncToTalentRequest(access_token);
        request.setUploadParam(uploadParam);
        request.setStandardResume(standardResume);
        return resumeSyncToTalent(request);
    }

}
