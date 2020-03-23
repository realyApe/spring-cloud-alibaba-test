package com.ynyq.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.domain
 * @ClassName: shop_user
 * @Author: maoguoqing
 * @Description: 用户
 * @Date: 2020/3/19 12:43
 * @Version: 1.0
 */
@Entity(name="shop_user")
@Data
@ToString
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer uid;
    private String username;
    private String password;
    private String telephone;

}
