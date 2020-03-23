package com.ynyq.controller;

import com.alibaba.fastjson.JSON;
import com.ynyq.api.ProductApi;
import com.ynyq.domain.Order;
import com.ynyq.domain.Product;
import com.ynyq.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.controller
 * @ClassName: OrderController
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:52
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService;

//    @Autowired
//    RestTemplate restTemplate;
    @Autowired
    ProductApi productApi;


    @GetMapping("/order/{pid}")
    public Order creatOrder(@PathVariable("pid") Integer pid){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("收到pid为:{}的商品下单请求，查询商品信息");
//        Product product= restTemplate.getForObject("http://localhost:8081/product/"+pid, Product.class);
        Product product= productApi.fingByPid(pid);
        log.info("查询到商品信息：{}", JSON.toJSONString(product));

        if (product.getPid()==-100){
            Order order=new Order();
            order.setPname("下单失败");
            return order;
        }

        //下单
        Order order =new Order();
        BeanUtils.copyProperties(product,order);
        order.setUid(1);
        order.setName("测试111");
        order.setNumber(1);
        orderService.creatOrder(order);
        log.info("创建订单成功");
        return order;
    }
}
