package com.bookstore.MyBookStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.MyBookStore.domain.User;


public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}
