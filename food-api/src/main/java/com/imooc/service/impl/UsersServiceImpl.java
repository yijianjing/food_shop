package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.dao.UsersMapper;
import com.imooc.entity.Users;
import com.imooc.service.UsersService;
import org.springframework.stereotype.Service;
/**
 * 用户表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}