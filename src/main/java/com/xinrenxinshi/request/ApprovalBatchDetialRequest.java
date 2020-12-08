//package com.xinrenxinshi.request;
//
//import com.xinrenxinshi.common.MethodEnum;
//import com.xinrenxinshi.exception.ParamNotValidException;
//import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
//import com.xinrenxinshi.response.ApprovalBatchDetialResponse;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
///**
// * 审批表单详情request
// *
// * @author: liuchenhui
// * @create: 2019-11-11 15:55
// **/
//public class ApprovalBatchDetialRequest extends AbstractOpenapiRequest<ApprovalBatchDetialResponse> {
//    /**
//     * 审批id
//     */
//    private List<Integer> processIds;
//
//    public ApprovalBatchDetialRequest(String accessToken) {
//        super(accessToken);
//    }
//
//    public List<Integer> getProcessIds() {
//        return processIds;
//    }
//
//    public void setProcessIds(List<Integer> processIds) {
//        this.processIds = processIds;
//    }
//
//    @Override
//    public MethodEnum getMethod() {
//        return MethodEnum.METHOD_GET;
//    }
//
//    @Override
//    public Class<ApprovalBatchDetialResponse> getResponseClass() {
//        return ApprovalBatchDetialResponse.class;
//    }
//
//    @Override
//    public void check() throws ParamNotValidException {
//        if (null == processIds || processIds.isEmpty()) {
//            throw new ParamNotValidException("审批ID列表不能为空");
//        }
//    }
//
//    @Override
//    protected Map<String, Object> getParamMap0() {
//        String strProcessIds = processIds.stream()
//                .filter(Objects::nonNull)
//                .map(String::valueOf)
//                .collect(Collectors.joining(","));
//        Map<String, Object> map = new HashMap<>(4);
//        map.put("processIds", strProcessIds);
//        return map;
//    }
//
//    @Override
//    public String getBizUrl() {
//        return "/v4/flow/batchDetail";
//    }
//}
