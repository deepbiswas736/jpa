package com.deep.spring.jpa.service;

import com.deep.spring.jpa.model.User;

public interface UserService {
	
	public User save(User user);

	public void delete(User user);

	public User findById(String id);
}
