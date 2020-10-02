package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.entity.OrderStatus;
import com.imooc.entity.Orders;
import com.imooc.entity.bo.SubmitOrderBO;
import com.imooc.entity.vo.OrderVO;

/**
 * 订单表;
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
public interface OrdersService extends IService<Orders> {
    /**
     * 用于创建订单相关信息
     * @param submitOrderBO
     */
    public OrderVO createOrder(SubmitOrderBO submitOrderBO);

    /**
     * 修改订单状态
     * @param orderId
     * @param orderStatus
     */
    public void updateOrderStatus(String orderId, Integer orderStatus);

    /**
     * 查询订单状态
     * @param orderId
     * @return
     */
    public OrderStatus queryOrderStatusInfo(String orderId);

    /**
     * 关闭超时未支付订单
     */
    public void closeOrder();
}