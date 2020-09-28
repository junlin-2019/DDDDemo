package com.example.repositoryIface;

import com.example.entity.OrderEntity;

/**
 * @Description: 订单持久化接口
 * @Author: admin
 * @Date: 2020/9/24 16:39
 */
public interface OrderRepositoryIface {

    void rebuildOrder(OrderEntity orderEntity);

    void addOrder(OrderEntity orderEntity);
    void updateOrder(OrderEntity orderEntity);
}
