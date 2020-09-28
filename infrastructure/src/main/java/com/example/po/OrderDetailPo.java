package com.example.po;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description: 订单明细Po
 * @Author: admin
 * @Date: 2020/9/24 17:26
 */
@Data
public class OrderDetailPo {

    private String orderDetailId;

    private String goodsId;

    private String goodsName;

    private long number;

    private String orderId;
}
