package com.cclouds.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Description:Spring Boot集成MongoDB
 *
 *
 * @author cclouds
 * @Date Create on 2017/3/30
 * @since version1.0
 */
public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);

}
