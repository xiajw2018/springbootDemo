package com.xiajw.springbootDemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiajw.springbootDemo.pojo.User;

@Mapper
public interface UserDao {

	List<User> queryUserList();
}
