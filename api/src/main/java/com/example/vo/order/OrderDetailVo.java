package com.example.vo.order;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 订单明细vo
 * @Author: admin
 * @Date: 2020/9/24 17:15
 */
@Setter
@Getter
public class OrderDetailVo {

    private String goodsId;

    private String goodsName;

    private long number;
}
