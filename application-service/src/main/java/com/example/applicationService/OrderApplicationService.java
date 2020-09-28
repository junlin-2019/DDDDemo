package com.example.applicationService;

import com.example.check.OrderValidUtil;
import com.example.converter.OrderVoDtoConverter;
import com.example.dto.OrderDto;
import com.example.entity.OrderEntity;
import com.example.facade.order.OrderIface;
import com.example.factory.OrderEntityFactory;
import com.example.vo.order.OrderRequestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description: 订单applicationService
 * @Author: admin
 * @Date: 2020/9/24 16:11
 */
@Service
@Slf4j
public class OrderApplicationService implements OrderIface {

    @Override
    public void createOrder(OrderRequestVo orderRequestVo) {
        log.info("进入service -------------------------------");
        OrderValidUtil.checkCreateOrder(orderRequestVo);
        OrderDto orderDto = OrderVoDtoConverter.voToDto(orderRequestVo);
        OrderEntity orderEntity = OrderEntityFactory.createOrderEntity();
        orderEntity.create(orderDto);
    }
}
