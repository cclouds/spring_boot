package com.cclouds.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:在Spring Boot中多环境配置文件名需要满足application-{profile}.properties的格式，其中{profile}对应你的环境标识，比如：
 * application-dev.properties：开发环境
 * application-test.properties：测试环境
 * application-prod.properties：生产环境
 * 需要在application.properties文件中通过spring.profiles.active属性来设置，其值对应{profile}值。
 * 如：spring.profiles.active=test就会加载application-test.properties配置文件内容
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