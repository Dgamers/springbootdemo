package com.demo.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.dao.UserMapper2;
import com.demo.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demotest2 {
	@Autowired
	private UserMapper2 userMapper2;

	@Test
	public void delete() {
		userMapper2.delete(7);

	}

	@Test
	public void getall() {
		List<User> list = userMapper2.getAll();
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void insert() {
		{
			User user = new User();
			user.setName("Jame");
			userMapper2.insert(user);
		}
	}

	@Test
	public void selectById() {
		User user = userMapper2.selectById(1);
		System.out.println(user);
	}

	@Test
	public void selectLikeName() {
		User user = userMapper2.selectLikeName("Aa");
		System.out.println(user);
	}

	@Test
	public void update() {
		User user = userMapper2.selectById(2);
		user.setName("0000");
		userMapper2.update(user);
	}
}
