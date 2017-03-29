package com.cclouds;

import com.cclouds.service.TestProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Description:Spring Boot自定义属性和配置文件
 *
 * @author cclouds
 * @Date Create on 2017/3/29
 * @since version1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	private static final Log log = LogFactory.getLog(ApplicationTests.class);

	@Autowired
	private TestProperties testProperties;


	@Test
	public void test1() throws Exception {
		log.info(testProperties.getName());
		log.info(testProperties.getTitle());
		log.info(testProperties.getDesc());
		log.info("随机数测试输出：");
		log.info("随机字符串 : " + testProperties.getValue());
		log.info("随机int : " + testProperties.getNumber());
		log.info("随机long : " + testProperties.getBignumber());
		log.info("随机10以下 : " + testProperties.getTest1());

	}

}
