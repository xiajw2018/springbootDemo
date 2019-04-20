package com.xiajw.springbootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiajw.springbootDemo.dao.UserDao;
import com.xiajw.springbootDemo.pojo.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getAllUser(){
		return userDao.queryUserList();
	}
}
