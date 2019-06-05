package com.deep.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deep.spring.jpa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
