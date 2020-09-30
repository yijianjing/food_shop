package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.dao.UserAddressMapper;
import com.imooc.entity.UserAddress;
import com.imooc.service.UserAddressService;
import org.springframework.stereotype.Service;
/**
 * 用户地址表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements UserAddressService {

}