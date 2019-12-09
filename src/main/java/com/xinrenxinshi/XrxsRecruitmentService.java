package com.xinrenxinshi;

import com.xinrenxinshi.domain.Page;
import com.xinrenxinshi.domain.recruit.RecruitReportInfo;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.RecruitmentFullDataRequest;
import com.xinrenxinshi.response.RecruitmentFullDataResponse;

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
    public static Page<RecruitReportInfo> getFullReport(String access_token,
                                                        Integer pageNo,
                                                        Integer pageSize,
                                                        String startTime,
                                                        String endTime) throws ApiException {
        RecruitmentFullDataRequest request = new RecruitmentFullDataRequest(access_token);
        request.setPageNo(pageNo);
        request.setPageSize(pageSize);
        request.setStartTime(startTime);
        request.setEndTime(endTime);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        RecruitmentFullDataResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getData();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }
}
