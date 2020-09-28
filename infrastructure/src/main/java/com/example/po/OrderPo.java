package com.example.po;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description: 订单持久化对象
 * @Author: admin
 * @Date: 2020/9/24 17:24
 */
@Data
public class OrderPo {
    private String orderId;

    private String purchaser;

    private String consigneeName;

    private String consigneePhone;

    private String consigneeAddr;
}
