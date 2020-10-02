package com.imooc.entity;

import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 商品分类 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class Category implements Serializable {

    private Integer id;
    /** 分类名称 */
    private String name;
    /** 分类类型 */
    private Integer type;
    /** 父id */
    private Integer fatherId;
    /** 图标 */
    private String logo;
    /** 口号 */
    private String slogan;
    /** 分类图 */
    private String catImage;
    /** 背景颜色 */
    private String bgColor;


}