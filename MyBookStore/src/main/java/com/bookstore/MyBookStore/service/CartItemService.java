package com.bookstore.MyBookStore.service;

import java.util.List;

import com.bookstore.MyBookStore.domain.Book;
import com.bookstore.MyBookStore.domain.CartItem;
import com.bookstore.MyBookStore.domain.Order;
import com.bookstore.MyBookStore.domain.ShoppingCart;
import com.bookstore.MyBookStore.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
