package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.recruit.RecruitmentStandardInfoDO;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zhaopc
 * @Date 2025/8/11
 * @Version 1.0.0
 * @Description
 */
@Setter
@Getter
public class RecruitmentJobAddOrUpdateRequest extends AbstractOpenapiJsonRequest<String> {

    /**
     * 职位id
     */
    private String jobId;
    /**
     * 职位名称
     */
    private String name;
    /**
     * 职位状态
     * 0 进行中 1 已关闭
     */
    private Integer hireStatus;
    /**
     * 招聘类型
     * 0-全职、1-兼职、2-实习
     */
    private Integer hireType;//招聘类型
    /**
     * 职位亮点
     */
    private String feature;
    /**
     * 部门编码
     */
    private String department;//部门
    /**
     * 薪资范围
     * 0:3000及以内
     * 1:3000~5000
     * 2:5000~10000
     * 3:10000~15000
     * 4:15000~30000
     * 5:30000以上
     * 6:面议
     */
    private Integer salaryRange;
    /**
     * 工作年限
     * 0:一年以下
     * 1:1-3年
     * 2:3-5年
     * 3:5-10年
     * 4:10年以上
     * 5:无经验
     * 6:经验不限
     */
    private Integer workAge;
    /**
     * 学历
     * 1:初中
     * 2:高中
     * 3:中专
     * 4:大专
     * 5:本科
     * 6:硕士
     * 7:博士
     * 8:不限
     * 9:小学
     * 10:中职
     * 11:中技
     */
    private Integer eduGrade;
    /**
     * 招聘人数
     */
    private Integer hireNum;//招聘人数
    /**
     * 职位描述
     */
    private String jobDesc;//职位描述
    /**
     * 工作城市 城市名
     */
    private String workCity;
    /**
     * 工作详细地址
     */
    private String workAddress;
    /**
     * 备注
     */
    private String remark;
    /**
     * 开始时间 yyyy-MM-dd
     */
    private String startTime;
    /**
     * 结束时间 yyyy-MM-dd
     */
    private String endTime;
    /**
     * 紧急程度 0：非紧急,；1：紧急
     */
    private Integer star;
    /**
     * 职位负责人的手机号
     */
    private List<String> jobOwnerIds;
    /**
     * 职位别名
     */
    private List<String> keyword;
    /**
     * 所属流程 不填写 默认 系统的 默认招聘流程
     */
    private String customProcess;

    public RecruitmentJobAddOrUpdateRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("jobId", jobId);
        map.put("name", name);
        map.put("hireStatus", hireStatus);
        map.put("hireType", hireType);
        map.put("feature", feature);
        map.put("department", department);
        map.put("salaryRange", salaryRange);
        map.put("workAge", workAge);
        map.put("eduGrade", eduGrade);
        map.put("hireNum", hireNum);
        map.put("jobDesc", jobDesc);
        map.put("workCity", workCity);
        map.put("workAddress", workAddress);
        map.put("remark", remark);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        map.put("star", star);
        map.put("jobOwnerIds", jobOwnerIds);
        map.put("keyword", keyword);
        map.put("customProcess", customProcess);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("职位名称不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/recruitment/job/addOrUpdate";
    }
}
