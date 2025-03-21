package com.e_commerce.service;

import java.util.List;

import com.e_commerce.model.OrderRequest;
import com.e_commerce.model.ProductOrder;

public interface OrderService {

	public void saveOrder(Integer userId, OrderRequest orderRequest) throws Exception;

	public List<ProductOrder> getOrdersByUser(Integer userId);

	public ProductOrder updateOrderStatus(Integer id, String status);

	public List<ProductOrder> getAllOrders();
}
