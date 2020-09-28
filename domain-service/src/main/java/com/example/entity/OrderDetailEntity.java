package com.example.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 订单明细Entity
 * @Author: admin
 * @Date: 2020/9/24 17:18
 */
@Getter
@Setter
public class OrderDetailEntity {

    private String goodsId;

    private String goodsName;

    private long number;

}
