package com.onlinebazar.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.onlinebazar.model.Product;


public interface ProductDao {

	boolean add(Product product);
	List<Product> getProductList();
	Product getProduct(int id);
	boolean update(Product product);
	boolean delete(Product product);
	
	List<Product> getActiveProductList();
	List<Product> getProductListByCategoryId(int category);
	List<Product> getLatestActiveProduct(int count);
	
}
