package com.bookstore.MyBookStore.service;

import com.bookstore.MyBookStore.domain.BillingAddress;
import com.bookstore.MyBookStore.domain.Order;
import com.bookstore.MyBookStore.domain.Payment;
import com.bookstore.MyBookStore.domain.ShippingAddress;
import com.bookstore.MyBookStore.domain.ShoppingCart;
import com.bookstore.MyBookStore.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
