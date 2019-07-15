package com.bookstore.MyBookStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.MyBookStore.domain.UserPayment;


public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
