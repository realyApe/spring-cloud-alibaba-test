package com.ynyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq
 * @ClassName: OrderApplication
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:51
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }

//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
