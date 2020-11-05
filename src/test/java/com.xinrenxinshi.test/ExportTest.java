package com.xinrenxinshi.test;

import com.xinrenxinshi.XrxsCommonService;
import com.xinrenxinshi.XrxsDepartmentService;
import com.xinrenxinshi.common.EmpStatusEnum;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.domain.CountryModel;
import com.xinrenxinshi.domain.DepartmentModel;
import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.EmployeeDetailInfoListRequest;
import com.xinrenxinshi.response.EmployeeDetailInfoListResponse;
import com.xinrenxinshi.response.OpenapiTokenResponse;
import com.xinrenxinshi.test.builder.ExportDataBuilder;
import com.xinrenxinshi.util.ExportUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <数据导出>.
 *
 * @author peng cheng
 * @date 2020/11/4
 * @since
 */
public class ExportTest {


    @Test
    public void export() throws ApiException {
        //公司的appKey
        String appKey = "";
        //公司的密钥 appSecret
        String appSecret = "";
        //文件导出路径 eg /Users/xxx/Desktop/
        String path = "";
        XrxsOpenapiClient.init(appKey, appSecret);
        OpenapiTokenResponse token = XrxsCommonService.getAccessToken();
        String access_token = token.getAccess_token();
        Map<Integer, CountryModel> countryMap = getCountryMap(access_token);
        Map<String, EmployeeDetail> detailMap = getEmployeeData(access_token);
        Map<String, DepartmentModel> departmentMap = getDepartmentList(access_token);
        //员工信息导出
        List<LinkedHashMap<String, Object>> employeeExportData = ExportDataBuilder.employeeExportData(detailMap, countryMap, departmentMap);
        ExportUtil.exportCSV(employeeExportData, path, "员工信息.csv");
        //部门信息导出
        List<LinkedHashMap<String, Object>> departmentExportata = ExportDataBuilder.departmentExportData(detailMap, departmentMap);
        ExportUtil.exportCSV(departmentExportata, path, "组织架构.csv");
    }


    /**
     * 获取所有员工信息
     *
     * @throws ApiException
     */
    private static Map<String, EmployeeDetail> getEmployeeData(String token) throws ApiException {
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        EmployeeDetailInfoListRequest request = new EmployeeDetailInfoListRequest(token);
        request.setDepartmentId("");
        request.setFetchChild(FetchChildEnum.DOES_NOT_CONTAIN_SUB_DEPARTMENTS);
        request.setSize(100);
        request.setStatus(EmpStatusEnum.ON_JOB);
        int offset = 0;
        boolean hasMore = true;
        List<EmployeeDetail> list = new ArrayList<>();
        while (hasMore) {
            request.setOffset(offset);
            EmployeeDetailInfoListResponse response = instance.execute(request);
            if (response == null || response.getErrcode() != 0) {
                break;
            }
            hasMore = response.isHasMore();
            list.addAll(response.getUserlist());
            offset++;
        }
        return list.stream().collect(Collectors.toMap(EmployeeDetail::getEmployeeId, Function.identity()));
    }

    /**
     * 获取 部门map
     *
     * @param token
     * @return
     * @throws ApiException
     */
    private static Map<String, DepartmentModel> getDepartmentList(String token) throws ApiException {
        List<DepartmentModel> departmentList = XrxsDepartmentService.getDepartmentList(token, "", FetchChildEnum.CONTAINS_DEPARTMENT);
        return departmentList.stream().collect(Collectors.toMap(DepartmentModel::getDepartmentId, Function.identity()));
    }

    /**
     * 获取 国籍列表
     *
     * @param token
     * @return
     * @throws ApiException
     */
    private static Map<Integer, CountryModel> getCountryMap(String token) throws ApiException {
        List<CountryModel> countryList = XrxsCommonService.getCountryList(token);
        return countryList.stream().collect(Collectors.toMap(CountryModel::getId, Function.identity()));
    }


}
