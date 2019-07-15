package com.bookstore.MyBookStore.service;

import com.bookstore.MyBookStore.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
