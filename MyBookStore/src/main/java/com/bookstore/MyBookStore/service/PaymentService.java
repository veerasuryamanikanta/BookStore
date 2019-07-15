package com.bookstore.MyBookStore.service;

import com.bookstore.MyBookStore.domain.Payment;
import com.bookstore.MyBookStore.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
