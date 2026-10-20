package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.Page;
import com.xinrenxinshi.domain.recruit.RecruitReportInfo;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeInfo;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeQueryField;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSListUtils;
import com.xinrenxinshi.util.XRXSStrUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 招聘简历搜索请求
 */
@Setter
@Getter
public class RecruitmentResumeSearchRequest extends AbstractOpenapiJsonRequest<Page<RecruitmentResumeInfo>> {
    /**
     * 页数,默认从0开始，翻页+1
     */
    private Integer pageNo = 0;
    /**
     * 每页条数，1～100之间。默认每页100条
     */
    private Integer pageSize = 1000;
    /**
     * 搜索关键字
     */
    private String keyword;

    /**
     * 搜索字段
     */
    private List<RecruitmentResumeQueryField> queryField;


    public RecruitmentResumeSearchRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Page<RecruitmentResumeInfo>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Page<RecruitmentResumeInfo>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Page<RecruitmentResumeInfo>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(keyword) && XRXSListUtils.isEmpty(queryField)) {
            throw new ParamNotValidException("搜索关键字和过滤字段不能都为空");
        }
        if (pageSize > 100) {
            throw new ParamNotValidException("每页条数在1~100之间");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/recruitment/resume/search";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("keyword", keyword);
        if (pageNo != null) {
            map.put("pageNo", pageNo);
        }
        if (pageSize != null) {
            map.put("pageSize", pageSize);
        }
        if (XRXSListUtils.isNotEmpty(queryField)) {
            map.put("queryField", queryField);
        }
        return map;
    }
}
