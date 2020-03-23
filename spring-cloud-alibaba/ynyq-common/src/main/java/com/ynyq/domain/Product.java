package com.ynyq.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.domain
 * @ClassName: Product
 * @Author: maoguoqing
 * @Description: 商品
 * @Date: 2020/3/19 12:54
 * @Version: 1.0
 */
@Entity(name="shop_product")
@Data
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer pid;
    private String pname;
    private String pprice;
    private Integer stock; //库存
}
