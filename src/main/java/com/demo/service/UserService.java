package com.demo.service;

import java.util.List;

import com.demo.pojo.User;

public interface UserService
{
	void delete(Integer id);

	List<User> getAll();

	void insert(User user);

	User selectById(Integer id);

	User selectLikeName(String name);

	void update(User user);

}
