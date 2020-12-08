package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.AttendanceRecord;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 考勤打卡原始记录
 *
 * @author Ke Zhan on 2020/11/19
 */
public class AttendanceClockRecordsRequest extends AbstractOpenapiJsonRequest<PageResult<AttendanceRecord>> {

    /**
     * 员工id列表，不传默认查当前时间段全公司员工
     */
    private List<String> employeeIds;
    /**
     * 打卡记录查询开始时间戳(精确到秒)
     */
    private Long startTime;
    /**
     * 打卡记录查询结束时间戳(精确到秒)
     */
    private Long endTime;
    /**
     * 查询页码，默认从0开始，翻页+1
     */
    private Integer pageNo;
    /**
     * 每页数据条数，每页数量不超过100条，默认100条
     */
    private Integer pageSize;

    public AttendanceClockRecordsRequest(String accessToken) {
        super(accessToken);
    }

    public List<String> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<String> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
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

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeIds", employeeIds);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<AttendanceRecord>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (startTime == null) {
            throw new ParamNotValidException("开始时间为空");
        }
        if (endTime == null) {
            throw new ParamNotValidException("结束时间为空");
        }
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<AttendanceRecord>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<AttendanceRecord>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/clockrecords";
    }
}
