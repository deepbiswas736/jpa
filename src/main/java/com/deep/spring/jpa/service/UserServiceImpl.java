package com.deep.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.spring.jpa.model.User;
import com.deep.spring.jpa.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User save(User user) {

		return userRepository.save(user);
	}

	@Override
	public void delete(User user) {

		userRepository.delete(user);
	}

	@Override
	public User findById(String id) {

		return userRepository.getOne(Long.parseLong(id));
	}

}
