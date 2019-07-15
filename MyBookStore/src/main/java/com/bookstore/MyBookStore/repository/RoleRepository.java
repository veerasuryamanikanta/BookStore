package com.bookstore.MyBookStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.MyBookStore.security.Role;


public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
