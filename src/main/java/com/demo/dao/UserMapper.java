package com.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.demo.pojo.User;

public interface UserMapper
{
	@Delete("delete from user where ID=#{id}")
	void delete(Integer id);

	@Select("select * from user")
	@Results({ @Result(property = "id", column = "ID"), @Result(property = "name", column = "name") })
	List<User> getAll();

	@Insert("insert into user(ID,name) values(#{id},#{name})")
	void insert(User user);

	@Select("select * from user where ID=#{id}")
	@Results({ @Result(property = "id", column = "ID"), @Result(property = "name", column = "name") })
	User selectById(Integer id);

	@Select("select * from user where name like '%${name}%'")
	User selectLikeName(@Param("name") String name);

	@Update("update user set name=#{name} where ID=#{id}")
	void update(User user);
}
