package com.bookstore.MyBookStore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.MyBookStore.domain.BookToCartItem;
import com.bookstore.MyBookStore.domain.CartItem;



@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
