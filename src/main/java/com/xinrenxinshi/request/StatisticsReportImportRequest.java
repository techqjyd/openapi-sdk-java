package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.statistic.StatReportUploadResultDO;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSListUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zhaopc
 * @Date 2024/12/11
 * @Version 1.0.0
 * @Description
 */
public class StatisticsReportImportRequest extends AbstractOpenapiJsonRequest<StatReportUploadResultDO> {

    /**
     *  导入类型
     * 目前只支持 1-员工 和 2-部门
     */
    private Integer batchType;

    /**
     * 上传类型，如果导入了相同归档月的数据，默认覆盖。
     * 0 覆盖
     * 1 合并
     */
    private Integer isMerge = 0;

    /**
     * 导入月份 yyyyMM
     */
    private String yearmo;
    /**
     * 员工组织取值月份 yyyyMM
     */
    private String bindYearmo;

    /**
     * 导入的数据，最多一次导入1000条
     * key为字段fieldName，value为字段值。
     */
    private List<LinkedHashMap<String,String>> data;

    public Integer getBatchType() {
        return batchType;
    }

    public void setBatchType(Integer batchType) {
        this.batchType = batchType;
    }

    public Integer getIsMerge() {
        return isMerge;
    }

    public void setIsMerge(Integer isMerge) {
        this.isMerge = isMerge;
    }

    public String getYearmo() {
        return yearmo;
    }

    public void setYearmo(String yearmo) {
        this.yearmo = yearmo;
    }

    public String getBindYearmo() {
        return bindYearmo;
    }

    public void setBindYearmo(String bindYearmo) {
        this.bindYearmo = bindYearmo;
    }

    public List<LinkedHashMap<String, String>> getData() {
        return data;
    }

    public void setData(List<LinkedHashMap<String, String>> data) {
        this.data = data;
    }

    public StatisticsReportImportRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> dataMap = new LinkedHashMap<>();
        dataMap.put("batchType", batchType);
        dataMap.put("isMerge", isMerge);
        dataMap.put("yearmo", yearmo);
        dataMap.put("bindYearmo", bindYearmo);
        dataMap.put("data", data);
        return dataMap;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<StatReportUploadResultDO> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<StatReportUploadResultDO>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<StatReportUploadResultDO>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (batchType == null){
            throw new ParamNotValidException("batchType is null");
        }
        if (XRXSStrUtils.isEmpty(yearmo)){
            throw new ParamNotValidException("batchType is null");
        }
        if (XRXSStrUtils.isEmpty(bindYearmo)){
            throw new ParamNotValidException("batchType is null");
        }
        if (XRXSListUtils.isEmpty(data)){
            throw new ParamNotValidException("data is null");
        }
        if (data.size() > 1000){
            throw new ParamNotValidException("导入数据数量不能大于1000");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/statistic/report/data/import";
    }
}
