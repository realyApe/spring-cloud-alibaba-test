package com.ynyq.dao;

import com.ynyq.domain.Product;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.dao
 * @ClassName: ProductDao
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:47
 * @Version: 1.0
 */
public interface ProductDao extends JpaRepository<Product,Integer> {
}
