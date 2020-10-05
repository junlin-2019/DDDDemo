package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: orderDetail
 * @Author: admin
 * @Date: 2020/9/24 18:12
 */
@Setter
@Getter
@ToString
public class OrderDetailDto {

    private String goodsId;

    private String goodsName;

    private long number;


}
