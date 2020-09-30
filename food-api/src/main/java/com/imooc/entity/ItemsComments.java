package com.imooc.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 商品评价表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class ItemsComments implements Serializable {
    /** id主键 */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    /** 用户id 用户名须脱敏 */
    private String userId;
    /** 商品id */
    private String itemId;
    /** 商品名称 */
    private String itemName;
    /** 商品规格id 可为空 */
    private String itemSpecId;
    /** 规格名称 可为空 */
    private String sepcName;
    /** 评价等级 1：好评 2：中评 3：差评 */
    private Integer commentLevel;
    /** 评价内容 */
    private String content;
    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
    /** 更新时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;


}