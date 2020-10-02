package com.imooc.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class ItemsSpec implements Serializable {

    private String id;
    /** 商品外键id */
    private String itemId;
    /** 规格名称 */
    private String name;
    /** 库存 */
    private Integer stock;
    /** 折扣力度 */
    private BigDecimal discounts;
    /** 优惠价 */
    private Integer priceDiscount;
    /** 原价 */
    private Integer priceNormal;
    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
    /** 更新时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;


}