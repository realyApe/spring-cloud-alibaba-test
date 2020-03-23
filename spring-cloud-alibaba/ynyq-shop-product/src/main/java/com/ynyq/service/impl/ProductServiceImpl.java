package com.ynyq.service.impl;

import com.ynyq.dao.ProductDao;
import com.ynyq.domain.Product;
import com.ynyq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.service.impl
 * @ClassName: ProductServiceImpl
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:45
 * @Version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public Product fingByPid(Integer pid) {
        return productDao.findById(pid).get();
    }
}
