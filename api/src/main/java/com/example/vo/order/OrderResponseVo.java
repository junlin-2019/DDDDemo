package com.example.vo.order;

import lombok.Data;

import java.util.List;

/**
 * @Description: 订单相应vo
 * @Author: admin
 * @Date: 2020/9/24 15:36
 */
@Data
public class OrderResponseVo {

    private String orderId;

    private String purchaser;

    private String purchaserPhone;

    private String purchaserAddr;

    private List<OrderDetailVo> goodsList;

}
