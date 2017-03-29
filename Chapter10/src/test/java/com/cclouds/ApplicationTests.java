package com.cclouds;

import com.cclouds.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:Spring Boot集成Redis
 *
 * @author cclouds
 * @Date Create on 2017/3/29
 * @since version1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<String, User> redisTemplate;

	@Test
	public void test() throws Exception {

		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));

		// 保存对象
		User user = new User("剑圣", 222);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		user = new User("白虎", 333);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		user = new User("小鱼人", 444);
		redisTemplate.opsForValue().set(user.getUsername(), user);

		Assert.assertEquals(222, redisTemplate.opsForValue().get("剑圣").getAge().longValue());
		Assert.assertEquals(333, redisTemplate.opsForValue().get("白虎").getAge().longValue());
		Assert.assertEquals(444, redisTemplate.opsForValue().get("小鱼人").getAge().longValue());

	}

}
