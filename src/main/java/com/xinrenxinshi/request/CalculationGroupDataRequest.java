package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.GroupDataInfo;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取分组数据请求
 */
public class CalculationGroupDataRequest extends AbstractOpenapiJsonRequest<GroupDataInfo> {

    private Integer groupId;
    private Integer yearmo;
    private Integer page;
    private Integer pageSize;
    private Integer isArchive;

    /**
     * 构造函数
     * @param accessToken 访问令牌
     */
    public CalculationGroupDataRequest(String accessToken) {
        super(accessToken);
    }

    /**
     * 获取分组ID
     * @return 分组ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置分组ID
     * @param groupId 分组ID
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取年月（如202501）
     * @return 年月
     */
    public Integer getYearmo() {
        return yearmo;
    }

    /**
     * 设置年月（如202501）
     * @param yearmo 年月
     */
    public void setYearmo(Integer yearmo) {
        this.yearmo = yearmo;
    }

    /**
     * 获取页码
     * @return 页码
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 设置页码
     * @param page 页码
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获取分页大小
     * @return 分页大小
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置分页大小
     * @param pageSize 分页大小
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取是否归档标识
     * @return 归档标识(0未归档，1已归档)
     */
    public Integer getIsArchive() {
        return isArchive;
    }

    /**
     * 设置是否归档标识
     * @param isArchive 归档标识(0未归档，1已归档)
     */
    public void setIsArchive(Integer isArchive) {
        this.isArchive = isArchive;
    }

    /**
     * 业务参数映射
     * @return 参数Map
     */
    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(5);
        map.put("groupId", groupId);
        map.put("yearmo", yearmo);
        map.put("page", page);
        map.put("pageSize", pageSize);
        map.put("isArchive", isArchive);
        return map;
    }

    /**
     * 请求方法类型
     * @return POST
     */
    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    /**
     * 响应类占位
     * @return OpenapiResponse
     */
    @Override
    public OpenapiResponse<GroupDataInfo> getResponseClass() {
        return new OpenapiResponse<>();
    }

    /**
     * 响应泛型类型
     * @return TypeReference
     */
    @Override
    public TypeReference<OpenapiResponse<GroupDataInfo>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<GroupDataInfo>>(){};
    }

    /**
     * 参数校验
     * @throws ParamNotValidException 参数不合法
     */
    @Override
    public void check() throws ParamNotValidException {
        if (groupId == null || !XRXSStrUtils.isNumeric(groupId)) {
            throw new ParamNotValidException("分组id为空");
        }
        if (yearmo == null || !XRXSStrUtils.isNumeric(yearmo)) {
            throw new ParamNotValidException("年月为空");
        }
        if (page == null || !XRXSStrUtils.isNumeric(page) || page < 1) {
            throw new ParamNotValidException("页码至少为1");
        }
        if (pageSize == null || !XRXSStrUtils.isNumeric(pageSize) || pageSize < 1 || pageSize > 100) {
            throw new ParamNotValidException("分页大小范围1-100");
        }
        if (isArchive == null || (isArchive != 0 && isArchive != 1)) {
            throw new ParamNotValidException("isArchive仅支持0/1");
        }
    }

    /**
     * 业务URL
     * @return 路由
     */
    @Override
    public String getBizUrl() {
        return "/v5/calculation/group/data";
    }
}