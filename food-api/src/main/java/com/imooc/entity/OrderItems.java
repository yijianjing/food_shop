package com.imooc.entity;

import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 订单商品关联表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class OrderItems implements Serializable {
    /** 主键id */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    /** 归属订单id */
    private String orderId;
    /** 商品id */
    private String itemId;
    /** 商品图片 */
    private String itemImg;
    /** 商品名称 */
    private String itemName;
    /** 规格id */
    private String itemSpecId;
    /** 规格名称 */
    private String itemSpecName;
    /** 成交价格 */
    private Integer price;
    /** 购买数量 */
    private Integer buyCounts;


}