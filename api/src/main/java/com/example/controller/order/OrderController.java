package com.example.controller.order;

import com.example.facade.order.OrderIface;
import com.example.vo.BaseResponse;
import com.example.vo.ResponseUtil;
import com.example.vo.order.OrderRequestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 订单接口
 * @Author: admin
 * @Date: 2020/9/24 15:37
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderIface orderIface;

    @PostMapping("/create")
    public BaseResponse createOrder(@RequestBody  OrderRequestVo orderRequestVo){
        log.info("进入service");
        orderIface.createOrder(orderRequestVo);
        return ResponseUtil.success();
    }


}
