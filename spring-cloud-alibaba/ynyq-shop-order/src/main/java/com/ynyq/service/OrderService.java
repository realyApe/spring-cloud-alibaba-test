package com.ynyq.service;


import com.ynyq.domain.Order;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.service
 * @ClassName: OrderService
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:52
 * @Version: 1.0
 */
public interface OrderService {

    void creatOrder(Order order);
}
