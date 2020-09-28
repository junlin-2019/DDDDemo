package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: orderDetail
 * @Author: admin
 * @Date: 2020/9/24 18:12
 */
@Setter
@Getter
public class OrderDetailDto {

    private String goodsId;

    private String goodsName;

    private long number;


}
