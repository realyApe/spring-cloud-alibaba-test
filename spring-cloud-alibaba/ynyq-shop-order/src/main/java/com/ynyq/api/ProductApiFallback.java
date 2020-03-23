package com.ynyq.api;

import com.ynyq.domain.Product;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.api
 * @ClassName: ProductApiFallback
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/20 0:48
 * @Version: 1.0
 */
@Component
public class ProductApiFallback implements  ProductApi{
    @Override
    public Product fingByPid(Integer pid) {
        Product product=new Product();
        product.setPid(-100);
        product.setPname("服务异常！");
        return product;
    }
}
