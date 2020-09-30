package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.dao.OrderItemsMapper;
import com.imooc.entity.OrderItems;
import com.imooc.service.OrderItemsService;
import org.springframework.stereotype.Service;
/**
 * 订单商品关联表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Service
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems> implements OrderItemsService {

}