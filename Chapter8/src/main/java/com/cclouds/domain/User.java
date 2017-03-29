package com.cclouds.domain;

/**
 * Description:
 *
 * @author cclouds
 * @Date Create on 2017/3/29
 * @since version1.0
 */
public class User {

    private Long id;
    private Integer age;
    private String name;


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

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(Long id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
