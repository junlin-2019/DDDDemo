package com.example;

import com.example.converter.OrderConverter;
import com.example.dto.OrderDto;
import com.example.vo.order.OrderDetailVo;
import com.example.vo.order.OrderRequestVo;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Author: admin
 * @Date: 2020/9/28 10:07
 */
@SpringBootTest
public class ApplicationTest {

    @Test
    public void test01(){
        OrderRequestVo orderRequestVo = new OrderRequestVo();
        orderRequestVo.setConsigneeAddr("北京");
        orderRequestVo.setConsigneePhone("123123123");
        OrderDetailVo orderDetailVo = new OrderDetailVo();
        orderDetailVo.setGoodsName("面包");
        orderDetailVo.setGoodsId("asd");
        orderDetailVo.setNumber(12);
        orderRequestVo.setGoodsList(Lists.newArrayList(orderDetailVo));
        OrderDto orderDto = OrderConverter.INSTANCE.VoToDto(orderRequestVo);
        System.out.println(orderDto.getConsigneeAddr());
        System.out.println(orderDto.getGoodsList().get(0));
        orderDetailVo.setGoodsName("牛掰");
        System.out.println(orderDto.getGoodsList().get(0));
    }

}
