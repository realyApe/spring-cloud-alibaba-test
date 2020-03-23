package com.ynyq.controller;

import com.alibaba.fastjson.JSON;
import com.ynyq.domain.Product;
import com.ynyq.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.controller
 * @ClassName: ProductController
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:44
 * @Version: 1.0
 */
@RestController
@Slf4j
public class ProductController {

    @Autowired
    ProductService productService;

    @Value("${server.port}")
    String port;

    @GetMapping("/product/{pid}")
    public Product fingByPid(@PathVariable("pid") Integer pid){
        log.info("端口号：{}，开始商品信息查询，商品pid为:{}",port,pid);
        Product product=productService.fingByPid(pid);
        log.info("商品信息查询成功，内容为:{}", JSON.toJSONString(product));

        return product;
    }
}
