package com.bookstore.MyBookStore.service;

import com.bookstore.MyBookStore.domain.ShoppingCart;

public interface ShoppingCartService {
	ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);
	
	void clearShoppingCart(ShoppingCart shoppingCart);
}
