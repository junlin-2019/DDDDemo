package com.example.factory;

import com.example.entity.OrderEntity;
import com.example.repositoryIface.OrderRepositoryIface;
import com.example.utils.AppContextUtil;

/**
 * @Description: 创建orderEntity工厂
 * @Author: admin
 * @Date: 2020/9/24 18:30
 */
public class OrderEntityFactory {

    public static OrderEntity createOrderEntity(){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderRepositoryIface((OrderRepositoryIface) AppContextUtil.getBean("orderRepository"));
        return orderEntity;
    }
}
