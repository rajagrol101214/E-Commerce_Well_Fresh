package com.e_commerce.service;

import java.util.List;

import com.e_commerce.model.Cart;

public interface CartService {
	
	public Cart saveCart(Integer productId, Integer userId);
	
	public List<Cart> getCartsByUser(Integer userId);
}
