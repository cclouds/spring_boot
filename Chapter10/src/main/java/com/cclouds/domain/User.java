package com.cclouds.domain;

import java.io.Serializable;

/**
 * Description:Spring Boot集成Redis
 *
 * @author cclouds
 * @Date Create on 2017/3/29
 * @since version1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private String username;
    private Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
