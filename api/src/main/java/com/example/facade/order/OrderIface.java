package com.example.facade.order;

import com.example.vo.order.OrderRequestVo;

/**
 * @Description: 订单facade
 * @Author: admin
 * @Date: 2020/9/24 16:09
 */
public interface OrderIface {
    void createOrder(OrderRequestVo orderRequestVo);
}
