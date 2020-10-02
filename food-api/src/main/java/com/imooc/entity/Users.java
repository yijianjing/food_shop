package com.imooc.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 用户表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class Users implements Serializable {

    private String id;
    /** 用户名 用户名 */
    private String username;
    /** 密码 密码 */
    private String password;
    /** 昵称 昵称 */
    private String nickname;
    /** 真实姓名 */
    private String realname;
    /** 头像 */
    private String face;
    /** 手机号 手机号 */
    private String mobile;
    /** 邮箱地址 邮箱地址 */
    private String email;
    /** 性别 性别 1:男  0:女  2:保密 */
    private Integer sex;
    /** 生日 生日 */
    private Date birthday;
    /** 创建时间 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
    /** 更新时间 更新时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;


}