package com.example.dao;

import com.example.po.OrderDetailPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Author: admin
 * @Date: 2020/9/27 17:11
 */
public interface OrderDetailMapper {

    void batchAdd(@Param("list") List<OrderDetailPo> list);
}
