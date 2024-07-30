package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendanceDailyReportResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : AttendanceDailyReportRequest
 * @date : 2024/7/23 14:24
 */
@Getter
@Setter
public class AttendanceDailyReportRequest extends AbstractOpenapiJsonRequest<PageResult<AttendanceDailyReportResult>> {

    /**
     * date的格式为yyyyMMdd
     */
    private String date;

    /**
     * 起始页 从0开始
     */
    private Integer pageNo;

    /**
     * 每页数量 最大1000
     */
    private Integer pageSize;

    /**
     * 查询员工数量，单次数量限制
     */
    public static final Integer LIMIT_NUMBER_PAGES = 1000;

    public AttendanceDailyReportRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("date", date);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<AttendanceDailyReportResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<AttendanceDailyReportResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<AttendanceDailyReportResult>>>() {
    };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (pageNo == null) {
            throw new ParamNotValidException("起始页码为空");
        }
        if (pageSize == null || pageSize > LIMIT_NUMBER_PAGES) {
            throw new ParamNotValidException("查询员工数量为空或者数量超过1000");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/report/daily";
    }
}
