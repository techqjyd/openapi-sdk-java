package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalApplyResponse;
import com.xinrenxinshi.util.XRXSStrUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 外勤打卡审批参数
 */
@Setter
@Getter
public class FlowFieldCheckInApprovalRequest extends AbstractOpenapiJsonRequest<ApprovalApplyResponse> {

    /** (必传)员工ID */
    private String employeeId;

    /** (必传)打卡时间 例如：1769946728 */
    private Integer clockTime;

    /** (必传)外勤打卡类型：0.全天、1.上半天、2.下半天、3.无天单位 */
    private Integer outsideSignType;

    /** (必传)打卡：审批类型 5.外出、10.外勤、16.出差、36.居家办公 */
    private Integer clockSettingType;

    /** (必传)打卡：经度 */
    private Double longitude;

    /** (必传)打卡：纬度 */
    private Double latitude;

    /** (必传)打卡：地点 */
    private String place;

    /** 打卡：偏移量 不存在.默认0 */
    private String accuracy;

    /** 申请原因 */
    private String reason;


    public FlowFieldCheckInApprovalRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("employeeId", employeeId);
        map.put("clockTime", clockTime);
        map.put("outsideSignType", outsideSignType);
        map.put("clockSettingType", clockSettingType);
        map.put("longitude", longitude);
        map.put("latitude", latitude);
        map.put("place", place);
        map.put("accuracy", accuracy);
        map.put("reason", reason);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<ApprovalApplyResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<ApprovalApplyResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<ApprovalApplyResponse>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工ID不能为空");
        }
        if (clockTime == null) {
            throw new ParamNotValidException("clockTime不能为空");
        }
        if (outsideSignType == null) {
            throw new ParamNotValidException("外勤打卡类型不能为空");
        }
        if (clockSettingType ==  null) {
            throw new ParamNotValidException("打卡：审批类型不能为空");
        }
        if (longitude == null) {
            throw new ParamNotValidException("打卡：经度不能为空");
        }
        if (latitude == null) {
            throw new ParamNotValidException("打卡：纬度不能为空");
        }
        if (XRXSStrUtils.isEmpty(place)) {
            throw new ParamNotValidException("打卡：地点不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/apply/fieldwork/checkin";
    }
}
