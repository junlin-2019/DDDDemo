package com.example.vo.order;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Description: 订单请求vo
 * @Author: admin
 * @Date: 2020/9/24 15:34
 */
@Setter
@Getter
public class OrderRequestVo {

    private String purchaser;

    private String consigneeName;

    private String consigneePhone;

    private String consigneeAddr;

    private List<OrderDetailVo> goodsList;
}
