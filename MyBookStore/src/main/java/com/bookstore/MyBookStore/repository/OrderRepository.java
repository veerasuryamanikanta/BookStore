package com.bookstore.MyBookStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.MyBookStore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
