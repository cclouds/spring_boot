package com.cclouds.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author cclouds
 * @Date Create on 2017/3/29
 * @since version1.0
 */

@Component
public class TestProperties {


    @Value("${com.cclouds.name}")
    private String name;
    @Value("${com.cclouds.title}")
    private String title;
    @Value("${com.cclouds.desc}")
    private String desc;


    @Value("${com.cclouds.value}")
    private String value;
    @Value("${com.cclouds.number}")
    private Integer number;
    @Value("${com.cclouds.bignumber}")
    private Long bignumber;
    @Value("${com.cclouds.test1}")
    private Integer test1;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

}
