package com.example.converter;

import com.example.dto.OrderDto;
import com.example.vo.order.OrderRequestVo;
import org.mapstruct.BeanMapping;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.core.annotation.Order;

@Mapper
public interface OrderConverter {

    OrderConverter INSTANCE = Mappers.getMapper(OrderConverter.class);
    OrderDto VoToDto(OrderRequestVo orderRequestVo);
}
