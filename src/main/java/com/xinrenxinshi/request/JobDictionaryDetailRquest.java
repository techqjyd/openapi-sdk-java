package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.JobDictionaryModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <一句话描述>.
 *
 * @author peng cheng
 * @date 2020/12/28
 * @since
 */
public class JobDictionaryDetailRquest extends AbstractOpenapiJsonRequest<List<JobDictionaryModel>> {

    /**
     * 岗位id，不传或者传空时，默认返回公司所有的岗位信息
     */
    private String jobId;

    /**
     * 部门id，不传或者传空时，默认返回公司所有的岗位信息
     */
    private String departmentId;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobDictionaryDetailRquest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("jobId", jobId);
        map.put("departmentId", departmentId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<JobDictionaryModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<JobDictionaryModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<JobDictionaryModel>>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/department/jobdictionary/detaillist";
    }
}
