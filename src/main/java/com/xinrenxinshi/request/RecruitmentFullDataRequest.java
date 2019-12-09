package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.RecruitmentFullDataResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 招聘全数据request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:51
 **/
public class RecruitmentFullDataRequest extends AbstractOpenapiRequest<RecruitmentFullDataResponse> {
    /**
     * 页数,默认从0开始，翻页+1
     */
    private Integer pageNo = 0;
    /**
     * 每页条数，1～100之间。默认每页50条
     */
    private Integer pageSize = 50;
    /**
     * 简历投递开始时间,时间格式yyyy-MM-dd
     */
    private String startTime;
    /**
     * 简历投递结束时间,时间格式yyyy-MM-dd
     */
    private String endTime;

    public RecruitmentFullDataRequest(String accessToken) {
        super(accessToken);
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<RecruitmentFullDataResponse> getResponseClass() {
        return RecruitmentFullDataResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(startTime)) {
            throw new ParamNotValidException("简历投递开始时间为空");
        }
        if (XRXSStrUtils.isEmpty(endTime)) {
            throw new ParamNotValidException("简历投递结束时间为空");
        }
        if (pageSize > 100) {
            throw new ParamNotValidException("每页条数在1~100之间");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v4/recruitment/report";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        if (pageNo != null) {
            map.put("pageNo", pageNo);
        }
        if (pageSize != null) {
            map.put("pageSize", pageSize);
        }
        return map;
    }
}
