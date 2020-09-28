package com.example.entity;

import com.example.dto.OrderDetailDto;
import com.example.dto.OrderDto;
import com.example.repositoryIface.OrderRepositoryIface;
import com.example.valueObject.ConsigneeInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Description: 订单聚合根
 * @Author: admin
 * @Date: 2020/9/24 16:38
 */
@Setter
@Getter
public class OrderEntity {

    private String orderId;

    private String purchaser;

    private ConsigneeInfo consigneeInfo;

    private List<OrderDetailEntity> goodsList;

    @Getter(AccessLevel.NONE)
    private OrderRepositoryIface orderRepositoryIface;

    private String generateId(){
        return UUID.randomUUID().toString();
    }


    public void rebuild(){
        orderRepositoryIface.rebuildOrder(this);
    }
    public void create(OrderDto orderDto){
        //执行创建逻辑
        setOrderId(generateId());
        setPurchaser(orderDto.getPurchaser());
        setConsigneeInfo(new ConsigneeInfo(orderDto.getConsigneeName(),orderDto.getConsigneePhone(),orderDto.getConsigneeAddr()));
        List<OrderDetailEntity> list = new ArrayList<>();
        for (OrderDetailDto orderDetailDto : orderDto.getGoodsList()) {
            OrderDetailEntity orderDetailEntity = new OrderDetailEntity();
            BeanUtils.copyProperties(orderDetailDto,orderDetailEntity);
            list.add(orderDetailEntity);
        }
        setGoodsList(list);
        orderRepositoryIface.addOrder(this);
    }
    public void update(){
        this.rebuild();
        //执行更新操作

        //执行保存操作
        orderRepositoryIface.updateOrder(this);
    }

}
