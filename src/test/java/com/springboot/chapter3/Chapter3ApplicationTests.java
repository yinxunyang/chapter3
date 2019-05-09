package com.springboot.chapter3;

import com.springboot.chapter3.pojo.User;
import com.springboot.chapter3.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter3ApplicationTests {
@Autowired
private UserService userService;
	@Test
	public void contextLoads() {
		User user = new User();
		userService.printUser(user);
	}

}
