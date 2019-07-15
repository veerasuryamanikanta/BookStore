package com.bookstore.MyBookStore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.MyBookStore.domain.ShoppingCart;


public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
