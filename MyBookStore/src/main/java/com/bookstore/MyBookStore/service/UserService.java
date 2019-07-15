package com.bookstore.MyBookStore.service;

import java.util.Set;

import com.bookstore.MyBookStore.domain.User;
import com.bookstore.MyBookStore.domain.UserBilling;
import com.bookstore.MyBookStore.domain.UserPayment;
import com.bookstore.MyBookStore.domain.UserShipping;
import com.bookstore.MyBookStore.security.PasswordResetToken;
import com.bookstore.MyBookStore.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}
