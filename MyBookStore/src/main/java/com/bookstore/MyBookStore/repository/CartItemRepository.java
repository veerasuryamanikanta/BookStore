package com.bookstore.MyBookStore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.MyBookStore.domain.CartItem;
import com.bookstore.MyBookStore.domain.Order;
import com.bookstore.MyBookStore.domain.ShoppingCart;


@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	List<CartItem> findByOrder(Order order);
}
