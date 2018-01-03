package com.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.pojo.User;

public interface UserMapper2 {

	void delete(Integer id);

	List<User> getAll();

	void insert(User user);

	User selectById(Integer id);

	User selectLikeName(@Param("name") String name);

	void update(User user);
}
