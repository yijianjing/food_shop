package com.imooc.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class Items implements Serializable {

    private String id;
    /** 商品名称 商品名称 */
    private String itemName;
    /** 分类外键id 分类id */
    private Integer catId;
    /** 一级分类外键id */
    private Integer rootCatId;
    /** 累计销售 累计销售 */
    private Integer sellCounts;
    /** 上下架状态 上下架状态,1:上架 2:下架 */
    private Integer onOffStatus;
    /** 商品内容 商品内容 */
    private String content;
    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
    /** 更新时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;


}