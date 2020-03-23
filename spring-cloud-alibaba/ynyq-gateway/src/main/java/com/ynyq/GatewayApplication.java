package com.ynyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com
 * @ClassName: GatewayApplication
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/20 1:27
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }
}
