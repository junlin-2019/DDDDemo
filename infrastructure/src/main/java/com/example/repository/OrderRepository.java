package com.example.repository;

import com.example.dao.OrderDetailMapper;
import com.example.dao.OrderMapper;
import com.example.entity.OrderDetailEntity;
import com.example.entity.OrderEntity;
import com.example.po.OrderDetailPo;
import com.example.po.OrderPo;
import com.example.repositoryIface.OrderRepositoryIface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Description: 订单仓储层
 * @Author: admin
 * @Date: 2020/9/24 16:55
 */
@Component("orderRepository")
@Slf4j
public class OrderRepository  implements OrderRepositoryIface {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public void rebuildOrder(OrderEntity orderEntity) {

    }

    @Override
    @Transactional
    public void addOrder(OrderEntity orderEntity) {
        OrderPo orderPo = new OrderPo();
        orderPo.setOrderId(orderEntity.getOrderId());
        orderPo.setPurchaser(orderEntity.getPurchaser());
        orderPo.setConsigneeAddr(orderEntity.getConsigneeInfo().getConsigneeAddr());
        orderPo.setConsigneeName(orderEntity.getConsigneeInfo().getConsigneeName());
        orderPo.setConsigneePhone(orderEntity.getConsigneeInfo().getConsigneePhone());
        List<OrderDetailPo> list = new ArrayList<>();
        for (OrderDetailEntity orderDetailEntity : orderEntity.getGoodsList()) {
            OrderDetailPo orderDetailPo = new OrderDetailPo();
            BeanUtils.copyProperties(orderDetailEntity,orderDetailPo);
            orderDetailPo.setOrderDetailId(UUID.randomUUID().toString());
            orderDetailPo.setOrderId(orderEntity.getOrderId());
            list.add(orderDetailPo);
        }
        orderMapper.add(orderPo);
        orderDetailMapper.batchAdd(list);
    }

    @Override
    public void updateOrder(OrderEntity orderEntity) {

    }
}
