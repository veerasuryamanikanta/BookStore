package com.bookstore.MyBookStore.service;

import com.bookstore.MyBookStore.domain.BillingAddress;
import com.bookstore.MyBookStore.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
