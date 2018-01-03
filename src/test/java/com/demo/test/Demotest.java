package com.demo.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.pojo.User;
import com.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demotest
{

	@Autowired
	private UserService userService;

	@Test
	public void delete()
	{
		userService.delete(5);
	}

	@Test
	public void getall()
	{
		List<User> list = userService.getAll();
		for (User user : list)
		{
			System.out.println(user);
		}
	}

	@Test
	public void insert()
	{
		User user = new User();
		user.setName("1234");
		userService.insert(user);
	}

	@Test
	public void selectLikeName()
	{
		String name = "Aa";
		User user = userService.selectLikeName(name);
		System.out.println(user);
	}

	@Test
	public void update()
	{
		User user = userService.selectById(1);
		user.setName("DA5");
		userService.update(user);
	}
}
