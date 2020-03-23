package com.ynyq.api;

import com.ynyq.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.api
 * @ClassName: ProductApi
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 18:21
 * @Version: 1.0
 */
@FeignClient(value="service-shop-product",fallback=ProductApiFallback.class)
public interface ProductApi {
    @GetMapping("/product/{pid}")
    Product fingByPid(@PathVariable("pid") Integer pid);
}
