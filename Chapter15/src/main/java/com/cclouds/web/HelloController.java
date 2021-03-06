package com.cclouds.web;

import org.springframework.web.bind.annotation.*;

/**
 * Description:Spring Boot实现AOP
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
