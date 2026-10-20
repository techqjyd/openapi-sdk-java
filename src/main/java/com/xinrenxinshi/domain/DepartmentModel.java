package com.xinrenxinshi.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 部门信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:24
 **/
@Setter
@Getter
public class DepartmentModel {
    /**
     * 管理员ID
     */
    private String adminId;
    /**
     * 所属城市
     */
    private String city;
    /**
     * 部门编码
     */
    private String code;
    /**
     * 部门ID
     */
    private String departmentId;

    private String hrbpId;

    private Integer regularHeaderCount;
    private Integer nonRegularHeaderCount;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 英文名称
     */
    private String enName;

    /**
     * 上级部门ID
     */
    private String parentId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 部门类型,0表示部门,1表示事业部,2表示事业群,3表示组,4表示中心,5表示子公司
     */
    private Integer type;

    /**
     * 添加时间
     */
    private Integer addtime;

    /**
     * 更新时间
     */
    private Integer modtime;

    private Integer isVirtual;

    private Integer status;

    private Integer order;

    private Integer level;

    private Map<String,String> fields;

}
