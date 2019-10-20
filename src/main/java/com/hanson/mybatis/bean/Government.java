package com.hanson.mybatis.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 政企客户主表
 * </p>
 *
 * @author hanson
 * @since 2019-10-18
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ExcelTarget("government")
@ApiModel(value="Government对象", description="政企客户主表")
public class Government extends Model<Government> implements Serializable{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "行记录ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "主id，不同版本的数据，此id相同")
    private Long branchId;

    @ApiModelProperty(value = "主ID")
    private Long masterId;
    @Excel(name = "政企客户编码",width = 25,needMerge = true)
    @ApiModelProperty(value = "政企客户编码")
    private String statecosClientCode;
    @Excel(name = "政企客户名称")
    @ApiModelProperty(value = "政企客户名称")
    private String statecosClientName;
    @Excel(name = "政企客户简称",width = 25,needMerge = true)
    @ApiModelProperty(value = "客户简称/政企客户简称")
    private String clientAbbervia;
    @Excel(name = "政企客户集团简称",width = 25,needMerge = true)
    @ApiModelProperty(value = "政企客户集团简称")
    private String clientGroupAbbervia;
    @Excel(name = "所属分公司",width = 25,needMerge = true)
    @ApiModelProperty(value = "所属分公司/所属代理(ID)")
    private Long subordinateAgent;
    @Excel(name = "上级公司",width = 25,needMerge = true)
    @ApiModelProperty(value = "上级公司")
    private String superiorCompany;
    @Excel(name = "所属销售区域ID",width = 25,needMerge = true)
    @ApiModelProperty(value = "所属销售区域ID")
    private Long salesAreaId;
    @Excel(name = "结算货币",width = 25,needMerge = true)
    @ApiModelProperty(value = "结算货币(默认RMB)")
    private byte transactionCurrency;
    @Excel(name = "订单支付方式",width = 25,needMerge = true)
    @ApiModelProperty(value = "订单支付方式 0:下单即支付 1：完成即支付")
    private byte payment;
    @Excel(name = "客户状态",width = 25,needMerge = true)
    @ApiModelProperty(value = "客户状态 0:草稿 1:待启用 2:已启用 3:变更中 4:待停用 5:已停用")
    private byte clientState;
    @ApiModelProperty(value = "审批流程ID")
    private Long approveId;
    @Excel(name = "电话",width = 25,needMerge = true)
    @ApiModelProperty(value = "电话")
    private String tel;
    @Excel(name = "传真",width = 25,needMerge = true)
    @ApiModelProperty(value = "传真")
    private String fax;
    @Excel(name = "省",width = 25,needMerge = true)
    @ApiModelProperty(value = "省")
    private String customerProvince;
    @Excel(name = "市",width = 25,needMerge = true)
    @ApiModelProperty(value = "市")
    private String customerCity;
    @Excel(name = "区",width = 25,needMerge = true)
    @ApiModelProperty(value = "区")
    private String customerArea;
    @Excel(name = "详细地址",width = 25,needMerge = true)
    @ApiModelProperty(value = "详细地址")
    private String detailedAddress;
    @Excel(name = "网址",width = 25,needMerge = true)
    @ApiModelProperty(value = "网址")
    private String website;
    @Excel(name = "邮箱",width = 25,needMerge = true)
    @ApiModelProperty(value = "邮箱")
    private String mailbox;
    @Excel(name = "备注",width = 25,needMerge = true)
    @ApiModelProperty(value = "备注")
    private String remarks;
    @Excel(name = "停用原因",width = 25,needMerge = true)
    @ApiModelProperty(value = "停用原因")
    private String disableCause;
    @Excel(name = "补充说明",width = 25,needMerge = true)
    @ApiModelProperty(value = "补充说明")
    private String tips;

    @ApiModelProperty(value = "版本号")
    private Long version;
    @Excel(name = "创建时间",width = 25,needMerge = true)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @Excel(name = "创建人ID",width = 25,needMerge = true)
    @ApiModelProperty(value = "创建人ID")
    private Long createBy;

    @ApiModelProperty(value = "更新人ID")
    private Long updateBy;
    @Excel(name = "是否已删除",width = 25,needMerge = true)
    @TableLogic  //逻辑删除   查询时会自动带上   WHERE deleteFlag=0
    @ApiModelProperty(value = "是否已删除 0：否 1：是")
    private byte deleteFlag;
    @Excel(name = "政企客户类型",width = 25,needMerge = true)
    @ApiModelProperty(value = "政企客户类型")
    @TableField("customer_Type")
    private String customerType;
    @Excel(name = "所属销售区域名称",width = 25,needMerge = true)
    @ApiModelProperty(value = "所属销售区域名称")
    private String salesAreaName;
    @Excel(name = "所属分公司",width = 25,needMerge = true)
    @ApiModelProperty(value = "所属分公司/所属代理(名称)")
    private String subordinateName;
    @Excel(name = "行业类型",width = 25,needMerge = true)
    @ApiModelProperty(value = "行业类型")
    @TableField("trade_Type")
    private String tradeType;
    @Excel(name = "客户阶段",width = 25,needMerge = true)
    @ApiModelProperty(value = "客户阶段")
    @TableField("client_Stage")
    private String clientStage;
    @Excel(name = "所属运营商",width = 25,needMerge = true)
    @ApiModelProperty(value = "所属运营商")
    private String operator;

    @Excel(name = "渠道属性",width = 25,needMerge = true)
    @ApiModelProperty(value = "渠道属性")
    private String channelProperty;
    /**
     * 政企客户联系人
     */
    @ExcelCollection(name = "政企客户联系人")
    @TableField(exist = false)
    private List<Contact> contacts;

    public Government() {
    }

    public Government(Long branchId, Long masterId, String statecosClientCode, String statecosClientName, String clientAbbervia, String clientGroupAbbervia, Long subordinateAgent, String superiorCompany, Long salesAreaId, byte transactionCurrency, byte payment, byte clientState, Long approveId, String tel, String fax, String customerProvince, String customerCity, String customerArea, String detailedAddress, String website, String mailbox, String remarks, String disableCause, String tips, Long version, Date createTime, Date updateTime, Long createBy, Long updateBy, byte deleteFlag) {
        this.branchId = branchId;
        this.masterId = masterId;
        this.statecosClientCode = statecosClientCode;
        this.statecosClientName = statecosClientName;
        this.clientAbbervia = clientAbbervia;
        this.clientGroupAbbervia = clientGroupAbbervia;
        this.subordinateAgent = subordinateAgent;
        this.superiorCompany = superiorCompany;
        this.salesAreaId = salesAreaId;
        this.transactionCurrency = transactionCurrency;
        this.payment = payment;
        this.clientState = clientState;
        this.approveId = approveId;
        this.tel = tel;
        this.fax = fax;
        this.customerProvince = customerProvince;
        this.customerCity = customerCity;
        this.customerArea = customerArea;
        this.detailedAddress = detailedAddress;
        this.website = website;
        this.mailbox = mailbox;
        this.remarks = remarks;
        this.disableCause = disableCause;
        this.tips = tips;
        this.version = version;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.deleteFlag = deleteFlag;
        this.customerType = customerType;
        this.salesAreaName = salesAreaName;
        this.subordinateName = subordinateName;
        this.tradeType = tradeType;
        this.clientStage = clientStage;
        this.operator = operator;
        this.channelProperty = channelProperty;
    }
}
