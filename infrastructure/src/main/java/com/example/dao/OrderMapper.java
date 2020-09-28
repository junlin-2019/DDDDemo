package com.example.dao;

import com.example.po.OrderPo;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 订单mapper
 * @Author: admin
 * @Date: 2020/9/24 17:28
 */
public interface OrderMapper {

    void add(@Param("orderPo") OrderPo orderPo);
}
