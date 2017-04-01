package com.cclouds;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:Spring Boot使用log4j实现http请求日志写入mongodb
 *
 * @author cclouds
 * @Date Create on 2017/4/01
 * @since version1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {

	@Before
	public void setUp() throws Exception {


	}

	@Test
	public void getHello() throws Exception {

	}

}
