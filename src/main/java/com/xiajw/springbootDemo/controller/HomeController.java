package com.xiajw.springbootDemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiajw.springbootDemo.pojo.User;
import com.xiajw.springbootDemo.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(HttpServletRequest request) {
		List<User> list = userService.getAllUser();
		request.setAttribute("userList", list);
		return "home";
	}
}
