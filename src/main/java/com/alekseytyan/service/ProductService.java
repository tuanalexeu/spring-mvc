package com.alekseytyan.service;


import com.alekseytyan.domain.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);
}
