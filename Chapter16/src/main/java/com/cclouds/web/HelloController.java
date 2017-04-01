package com.cclouds.web;

import org.springframework.web.bind.annotation.*;

/**
 * Description:Spring Boot使用log4j实现http请求日志入mongodb
 *
 * @author cclouds
 * @Date Create on 2017/4/01
 * @since version1.0
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

}
