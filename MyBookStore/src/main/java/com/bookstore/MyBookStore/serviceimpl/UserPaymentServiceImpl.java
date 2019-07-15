package com.bookstore.MyBookStore.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.MyBookStore.domain.UserPayment;
import com.bookstore.MyBookStore.repository.UserPaymentRepository;
import com.bookstore.MyBookStore.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService{

	@Autowired
	private UserPaymentRepository userPaymentRepository;
		
	public UserPayment findById(Long id) {
		return userPaymentRepository.findOne(id);
	}
	
	public void removeById(Long id) {
		userPaymentRepository.delete(id);
	}
} 
