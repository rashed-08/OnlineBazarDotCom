package com.onlinebazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlinebazar.dao.ProductDao;
import com.onlinebazar.model.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/all/product")
	@ResponseBody
	public List<Product> allProduct() {
		return productDao.getActiveProductList();
	}

	@RequestMapping("/category/{id}/product")
	@ResponseBody
	public List<Product> singleCategory(@PathVariable int id) {
		System.out.println("I come from JsonDataController and id is: "+id);
		return productDao.getProductListByCategoryId(id);
	}
}
