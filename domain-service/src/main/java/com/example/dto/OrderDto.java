package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @Description: orderDto
 * @Author: admin
 * @Date: 2020/9/24 18:12
 */
@Setter
@Getter
@ToString
public class OrderDto {

    private String purchaser;

    private String consigneeName;

    private String consigneePhone;

    private String consigneeAddr;

    private List<OrderDetailDto> goodsList;
}
