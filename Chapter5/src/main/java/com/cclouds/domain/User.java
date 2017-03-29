package com.cclouds.domain;



/**
 * Description:Spring_Boot中使用Swagger2构建API
 *
 * @author cclouds
 * @Date Create on 2017/3/29
 * @since version1.0
 */
public class User {

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
