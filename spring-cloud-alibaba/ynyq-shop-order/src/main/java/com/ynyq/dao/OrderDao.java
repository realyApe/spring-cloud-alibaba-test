package com.ynyq.dao;

import com.ynyq.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.dao
 * @ClassName: OrderDao
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:53
 * @Version: 1.0
 */
public interface OrderDao extends JpaRepository<Order,Long> {
}
