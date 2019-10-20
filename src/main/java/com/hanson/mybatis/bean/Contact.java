package com.hanson.mybatis.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hanson
 * @since 2019-10-18
 */
@Data
@ApiModel(value="Contact对象", description="")
@EqualsAndHashCode(callSuper=true)
public class Contact extends Model<Contact> implements Serializable{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "对应业务主键id")
    private Long masterId;
    @Excel(name = "姓名")
    @ApiModelProperty(value = "姓名")
    private String name;
    @Excel(name = "姓名")
    @ApiModelProperty(value = "部门")
    private Long department;
    @Excel(name = "职位")
    @ApiModelProperty(value = "职位")
    private String job;
    @Excel(name = "电话号码")
    @ApiModelProperty(value = "电话号码")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String mail;

    @ApiModelProperty(value = "省")
    private Integer province;

    @ApiModelProperty(value = "市")
    private Integer city;

    @ApiModelProperty(value = "区")
    private Integer district;

    @ApiModelProperty(value = "县")
    private Integer county;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "归属业务 0分公司 1零售商 2门店 3仓库")
    private Integer dataType;

    @ApiModelProperty(value = "是否启用 0否 1是 ")
    private Integer enableFlag;

    @ApiModelProperty(value = "是否默认 0否 1是 ")
    private Integer defaultFlag;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建人ID")
    private Long createBy;

    @ApiModelProperty(value = "更新人ID")
    private Long updateBy;

    @ApiModelProperty(value = "是否已删除 0否(未删除) 1是(已删除)")
    private Integer deleteFlag;

    @ApiModelProperty(value = "系统预留字段")
    private String systemCode;

    @ApiModelProperty(value = "语言类型")
    private Integer langType;

    @ApiModelProperty(value = "关联员工ID")
    private Long employeeId;

    public Long getId() {
        return id;
    }

    public Contact() {
    }

    public Contact(Long masterId,String name,String phone , String job, Long department) {
        this.name = name;
        this.department = department;
        this.job = job;
        this.phone = phone;
        this.masterId=masterId;
    }
}
