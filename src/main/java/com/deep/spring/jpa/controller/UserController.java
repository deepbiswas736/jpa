package com.deep.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deep.spring.jpa.model.User;
import com.deep.spring.jpa.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/{id}", produces = "application/json", method = RequestMethod.GET)
	public User getUser(@PathVariable("id") String id) {
		return userService.findById(id);
	}
	
	@RequestMapping(produces = "application/json", method = RequestMethod.POST)
	public User saveUser(User user) {
		return userService.save(user);
	}
}
