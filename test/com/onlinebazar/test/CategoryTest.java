package com.onlinebazar.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onlinebazar.dao.CategoryDao;
import com.onlinebazar.model.Category;

public class CategoryTest {

	private static AnnotationConfigApplicationContext context;

	// @Autowired
	private static CategoryDao categoryDao;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.onlinebazar");
		context.refresh();
		categoryDao = (CategoryDao) context.getBean("categoryDao");
	}

	/*
	 * @Test public void add() { category = new Category();
	 * category.setName("Laptop"); category.
	 * setDescription("Laptop is most popular electronic device in present time. You can carry it anywhere you want."
	 * ); category.setImageUrl("CAT_2"); category.setActive(true);
	 * 
	 * assertEquals("Add category into category table", true,
	 * categoryDao.add(category));
	 * 
	 * 
	 * category = new Category(); category.setName("Laptop"); category.
	 * setDescription("Laptop is a most popular electronics device in present time. Because you can carry it where you want to go."
	 * ); category.setImageUrl("cat_2"); category.setActive(true);
	 * 
	 * categoryDao.add(category);
	 * 
	 * category=new Category(); category.setName("Mobile"); category.
	 * setDescription("Mobile Also most popular electronics device at present time."
	 * ); category.setImageUrl("cat_3"); category.setActive(true);
	 * 
	 * categoryDao.add(category);
	 * 
	 * }
	 */

/*	@Test
	public void categoryAdd() {
		category = new Category();
		category.setName("Test");
		category.setDescription("Test description");
		category.setImageUrl("cat_2");
		category.setActive(true);

		assertEquals("Adding a product", true, categoryDao.add(category));
	}

	@Test
	public void showList() {
		assertEquals("Getting list from category list", 3, categoryDao.list().size());
	}*/

/*	@Test
	public void getSingleCategory() {
		category = categoryDao.get(2);
		assertEquals("Fetching single data", "Laptop", category.getName());
	}
*/
/*	@Test
	public void updateCategory() {
		category=categoryDao.get(2);
		category.setImageUrl("Test.jpg");
		assertEquals("Update a category", true, categoryDao.update(category));
	}*/

/*	@Test
	public void deleteCategory() {
		category=categoryDao.get(2);
		assertEquals("Deleting the category", true, categoryDao.delete(category));
	}
*/
}
