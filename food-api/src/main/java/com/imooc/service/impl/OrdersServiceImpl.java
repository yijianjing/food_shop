package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.dao.OrdersMapper;
import com.imooc.entity.Orders;
import com.imooc.service.OrdersService;
import org.springframework.stereotype.Service;
/**
 * 订单表;
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}