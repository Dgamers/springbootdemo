package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserMapper;
import com.demo.pojo.User;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserMapper userMapper;

	@Override
	public void delete(Integer id)
	{
		userMapper.delete(id);
	}

	@Override
	public List<User> getAll()
	{
		List<User> list = userMapper.getAll();
		if (list.size() != 0)
		{
			return list;
		}
		return null;
	}

	@Override
	public void insert(User user)
	{
		userMapper.insert(user);

	}

	@Override
	public User selectById(Integer id)
	{
		return userMapper.selectById(id);
	}

	@Override
	public User selectLikeName(String name)
	{
		return userMapper.selectLikeName(name);
	}

	@Override
	public void update(User user)
	{
		userMapper.update(user);

	}

}
