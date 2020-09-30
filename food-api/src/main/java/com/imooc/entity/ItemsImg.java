package com.imooc.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 商品图片 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class ItemsImg implements Serializable {
    /** 图片主键 */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    /** 商品外键id 商品外键id */
    private String itemId;
    /** 图片地址 图片地址 */
    private String url;
    /** 顺序 图片顺序，从小到大 */
    private Integer sort;
    /** 是否主图 是否主图，1：是，0：否 */
    private Integer isMain;
    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
    /** 更新时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;


}