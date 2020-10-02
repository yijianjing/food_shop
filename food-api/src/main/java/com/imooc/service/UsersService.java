package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.entity.Users;
import com.imooc.entity.bo.UserBO;

/**
 * 用户表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
public interface UsersService extends IService<Users> {
    /**
     * 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);

    /**
     * 判断用户名是否存在
     */
    public Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    public Users queryUserForLogin(String username, String password);
}