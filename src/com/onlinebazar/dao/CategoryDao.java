package com.onlinebazar.dao;

import java.util.List;

import com.onlinebazar.model.Category;

public interface CategoryDao {

	List<Category> list();

	Category get(String id);

	boolean add(Category category);

	boolean update(Category category);

	boolean delete(Category category);

}
