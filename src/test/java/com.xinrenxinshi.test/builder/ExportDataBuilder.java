package com.xinrenxinshi.test.builder;

import com.xinrenxinshi.common.DepartTypeEnum;
import com.xinrenxinshi.domain.CountryModel;
import com.xinrenxinshi.domain.DepartmentModel;
import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <导出数据构造类>.
 *
 * @author peng cheng
 * @date 2020/11/5
 * @since
 */
public class ExportDataBuilder {

    /**
     * 员工数据导出
     *
     * @param detailMap     员工map
     * @param countryMap    国家map
     * @param departmentMap 部门map
     * @return
     */
    public static List<LinkedHashMap<String, Object>> employeeExportData(Map<String, EmployeeDetail> detailMap, Map<Integer, CountryModel> countryMap, Map<String, DepartmentModel> departmentMap) {
        List<LinkedHashMap<String, Object>> data = new ArrayList<>();
        LinkedHashMap<String, Object> header = buildEmployeeHeader();
        data.add(header);
        for (EmployeeDetail employeeDetail : detailMap.values()) {
            LinkedHashMap<String, Object> body = new LinkedHashMap<>();
            Map<String, String> fields = employeeDetail.getFields();
            body.put("0", employeeDetail.getEmployeeId());
            body.put("1", employeeDetail.getName());
            body.put("2", employeeDetail.getMobile());
            body.put("3", fields.get("性别"));
            body.put("4", employeeDetail.getStatus() == 0 ? "在职" : "离职");
            body.put("5", fields.get("国家/地区"));
            String city = fields.get("所属国籍");
            if (XRXSStrUtils.isEmpty(city) || "0".equals(city)) {
                city = "";
            } else {
                CountryModel countryModel = countryMap.get(Integer.parseInt(city));
                if (countryModel != null) {
                    city = countryModel.getName();
                }
            }

            body.put("6", city);
            body.put("7", fields.get("银行卡号"));
            body.put("8", fields.get("开户行"));
            body.put("9", employeeDetail.getEntryDate());
            body.put("10", fields.get("工作邮箱"));
            body.put("11", fields.get("工号"));
            String reportToId = fields.get("汇报对象");
            String reporterName = "";
            EmployeeDetail detail = detailMap.get(reportToId);
            if (XRXSStrUtils.areNotEmpty(reportToId) && detail != null) {
                reporterName = detail.getName();
            }
            body.put("12", reportToId);
            body.put("13", reporterName);
            body.put("14", fields.get("直属下属数量"));
            body.put("15", fields.get("工作城市"));
            String department = fields.get("部门");
            String departmentCode = "";
            String departmentName = "";
            DepartmentModel departmentModel = departmentMap.get(department);
            if (XRXSStrUtils.areNotEmpty(department) && departmentModel != null) {
                departmentCode = departmentModel.getCode();
                departmentName = departmentModel.getName();
            }
            body.put("16", department);
            body.put("17", departmentCode);
            body.put("18", departmentName);
            body.put("19", fields.get("合同签署公司"));
            data.add(body);
        }
        return data;
    }


    /**
     * 部门数据导出
     *
     * @param employeeDetails 员工详情map
     * @param departmentList  部门列表
     * @return
     */
    public static List<LinkedHashMap<String, Object>> departmentExportData(Map<String, EmployeeDetail> employeeDetails, Map<String, DepartmentModel> departmentList) {
        List<LinkedHashMap<String, Object>> data = new ArrayList<>();
        LinkedHashMap<String, Object> header = buildDepartmentHeader();
        data.add(header);
        for (DepartmentModel value : departmentList.values()) {
            LinkedHashMap<String, Object> body = new LinkedHashMap<>();
            body.put("0", value.getDepartmentId());
            body.put("1", value.getName());
            body.put("2", value.getCode());
            String parentId = value.getParentId();
            String parentcode = "";
            if (XRXSStrUtils.areNotEmpty(parentId) || departmentList.get(parentId) != null) {
                parentcode = departmentList.get(parentId).getCode();
            }
            body.put("3", parentId);
            body.put("4", parentcode);
            DepartTypeEnum nameByType = DepartTypeEnum.getNameByType(value.getType());
            body.put("5", nameByType == null ? "" : nameByType.getDescription());
            String adminMobile = "";
            String adminName = "";
            String adminId = value.getAdminId();
            EmployeeDetail employeeDetail = employeeDetails.get(adminId);
            if (XRXSStrUtils.areNotEmpty(adminId) && employeeDetail != null) {
                adminMobile = employeeDetail.getMobile();
                adminName = employeeDetail.getName();
            }
            body.put("6", adminId);
            body.put("7", adminMobile);
            body.put("8", adminName);
            body.put("9", value.getCity());
            body.put("10", value.getRemark());
            data.add(body);
        }
        return data;
    }

    /**
     * 导出的部门表头
     *
     * @return
     */
    private static LinkedHashMap<String, Object> buildDepartmentHeader() {
        LinkedHashMap<String, Object> header = new LinkedHashMap<>();
        header.put("0", "部门ID");
        header.put("1", "部门名称");
        header.put("2", "部门编码");
        header.put("3", "上级部门ID");
        header.put("4", "上级部门编码");
        header.put("5", "部门类别");
        header.put("6", "部门负责人的员工ID");
        header.put("7", "部门负责人手机号");
        header.put("8", "部门负责人姓名");
        header.put("9", "部门城市");
        header.put("10", "部门说明书");
        return header;
    }


    /**
     * 导出的员工表头
     *
     * @return
     */
    private static LinkedHashMap<String, Object> buildEmployeeHeader() {
        LinkedHashMap<String, Object> header = new LinkedHashMap<>();
        header.put("0", "员工ID");
        header.put("1", "姓名");
        header.put("2", "手机号");
        header.put("3", "性别");
        header.put("4", "在职状态");
        header.put("5", "国家/地区");
        header.put("6", "所属国籍");
        header.put("7", "银行卡号");
        header.put("8", "开户行");
        header.put("9", "入职日期");
        header.put("10", "工作邮箱");
        header.put("11", "工号");
        header.put("12", "汇报对象ID");
        header.put("13", "汇报对象");
        header.put("14", "直属下属数量");
        header.put("15", "工作城市");
        header.put("16", "部门ID");
        header.put("17", "部门编码");
        header.put("18", "部门名称");
        header.put("19", "合同签署公司");
        return header;
    }

}
