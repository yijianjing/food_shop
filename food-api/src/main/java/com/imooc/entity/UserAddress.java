package com.imooc.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 用户地址表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class UserAddress implements Serializable {
    /** 地址主键id */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    /** 关联用户id */
    private String userId;
    /** 收件人姓名 */
    private String receiver;
    /** 收件人手机号 */
    private String mobile;
    /** 省份 */
    private String province;
    /** 城市 */
    private String city;
    /** 区县 */
    private String district;
    /** 详细地址 */
    private String detail;
    /** 扩展字段 */
    private String extand;
    /** 是否默认地址 */
    private Integer isDefault;
    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
    /** 更新时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;


}