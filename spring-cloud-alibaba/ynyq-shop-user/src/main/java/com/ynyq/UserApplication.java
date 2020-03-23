package com.ynyq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq
 * @ClassName: UserApplication
 * @Author: maoguoqing
 * @Description: 启动类
 * @Date: 2020/3/19 13:21
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
