package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}