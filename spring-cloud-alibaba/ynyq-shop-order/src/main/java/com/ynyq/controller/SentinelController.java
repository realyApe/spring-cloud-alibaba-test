package com.ynyq.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.controller
 * @ClassName: SentinelController
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 19:32
 * @Version: 1.0
 */
@RestController
public class SentinelController {
    @GetMapping("/sentinel/msg1")
    public String meg1(){
        return "msg1";
    }

    @GetMapping("/sentinel/msg2")
    public String meg2(){
        return "msg2";
    }
}
