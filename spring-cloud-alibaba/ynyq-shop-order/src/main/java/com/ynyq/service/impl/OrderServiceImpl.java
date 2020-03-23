package com.ynyq.service.impl;

import com.ynyq.dao.OrderDao;
import com.ynyq.domain.Order;
import com.ynyq.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.service.impl
 * @ClassName: OrderServiceImpl
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:53
 * @Version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;

    @Override
    public void creatOrder(Order order) {
        orderDao.save(order);
    }
}
