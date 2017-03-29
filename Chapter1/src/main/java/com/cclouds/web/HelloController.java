package com.cclouds.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:Spring Boot基本项目架构
 *
 * @author cclouds
 * @Date Create on 2017/3/29
 * @since version1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}