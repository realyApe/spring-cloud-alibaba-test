package com.ynyq.service;

import com.ynyq.domain.Product;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.service
 * @ClassName: ProductService
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:45
 * @Version: 1.0
 */
public interface ProductService {
   Product fingByPid(Integer pid);
}
