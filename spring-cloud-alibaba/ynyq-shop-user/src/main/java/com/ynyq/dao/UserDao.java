package com.ynyq.dao;

import com.ynyq.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ProjectName: spring-cloud-alibaba
 * @Package: com.ynyq.dao
 * @ClassName: UserDao
 * @Author: maoguoqing
 * @Description: ${description}
 * @Date: 2020/3/19 13:39
 * @Version: 1.0
 */

public interface UserDao extends JpaRepository<User,Integer> {

}
