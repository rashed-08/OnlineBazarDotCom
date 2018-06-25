package com.onlinebazar.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onlinebazar.dao.ProductDao;

public class ProductTest {
	private static AnnotationConfigApplicationContext context;

	private static ProductDao productDao;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.onlinebazar");
		context.refresh();
		productDao = (ProductDao) context.getBean("productDao");
	}
	
	@Test
	public void showAllList() {
		assertEquals("Getting list...", 1, productDao.getProductListByCategoryId(3).size());
	}

}
