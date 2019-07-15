package com.bookstore.MyBookStore.service;

import com.bookstore.MyBookStore.domain.ShippingAddress;
import com.bookstore.MyBookStore.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
