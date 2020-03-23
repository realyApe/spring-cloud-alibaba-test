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
 * @ClassName: Order
 * @Author: maoguoqing
 * @Description: 订单
 * @Date: 2020/3/19 12:59
 * @Version: 1.0
 */
@Entity(name="shop_order")
@Data
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long oid;
    private Integer uid;
    private String name;  //用户名
    private Integer pid;
    private String pname;  //商品名称
    private String pprice; //价格
    private Integer number; //购买数量
}
