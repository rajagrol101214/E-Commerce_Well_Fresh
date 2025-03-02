package com.e_commerce.service;

import java.util.List;

import com.e_commerce.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAllProducts();

	public Boolean deleteProduct(Integer id);
}
