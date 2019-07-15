package com.bookstore.MyBookStore.service;

import com.bookstore.MyBookStore.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
