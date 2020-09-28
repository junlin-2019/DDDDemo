package com.example.converter;

import com.example.dto.OrderDetailDto;
import com.example.dto.OrderDto;
import com.example.vo.order.OrderDetailVo;
import com.example.vo.order.OrderRequestVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: admin
 * @Date: 2020/9/27 16:25
 */
public class OrderVoDtoConverter {

    public static OrderDto voToDto(OrderRequestVo orderRequestVo){
        OrderDto orderDto = new OrderDto();
        orderDto.setConsigneeAddr(orderRequestVo.getConsigneeAddr());
        orderDto.setConsigneeName(orderRequestVo.getConsigneeName());
        orderDto.setConsigneePhone(orderRequestVo.getConsigneePhone());
        orderDto.setPurchaser(orderRequestVo.getPurchaser());
        List<OrderDetailDto> list = new ArrayList<>();
        for (OrderDetailVo orderDetailVo : orderRequestVo.getGoodsList()) {
            OrderDetailDto orderDetailDto = new OrderDetailDto();
            orderDetailDto.setGoodsId(orderDetailVo.getGoodsId());
            orderDetailDto.setGoodsName(orderDetailVo.getGoodsName());
            orderDetailDto.setNumber(orderDetailVo.getNumber());
            list.add(orderDetailDto);
        }
        orderDto.setGoodsList(list);
        return orderDto;
    }
}
