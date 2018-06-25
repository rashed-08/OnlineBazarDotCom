package com.onlinebazar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlinebazar.dao.CategoryDao;
import com.onlinebazar.dao.ProductDao;
import com.onlinebazar.exception.ProductNotFoundException;
import com.onlinebazar.model.Category;
import com.onlinebazar.model.Product;

/*
 * 	This is basic controller where application will start on.
 * 	
 * 	author: Romantic Coder
 * */

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private ProductDao productDao;

	@RequestMapping(value = { "/", "/index", "/home" })
	public String showHome(Model model) {
		logger.info("Logger message, comes from INFO");
		logger.debug("Logger message, comes from DEBUG");
		model.addAttribute("categories", categoryDao.list());
		model.addAttribute("userClickHome", true);
		model.addAttribute("title", "Home");
		return "main";
	}

	@RequestMapping("/about")
	public String showAbout(Model model) {
		model.addAttribute("userClickAbout", true);
		model.addAttribute("title", "About us");
		return "main";
	}

	@RequestMapping("/contact")
	public String showContact(Model model) {
		model.addAttribute("userClickContact", true);
		model.addAttribute("title", "Contact us");
		return "main";
	}

	@RequestMapping("/all/product")
	public String showAllProduct(Model model) {
		model.addAttribute("categories", categoryDao.list());
		model.addAttribute("userClickAllProduct", true);
		model.addAttribute("title", "All Products");
		return "main";
	}

	// Show single category type like mobile category, laptop category, television
	// category

	@RequestMapping("/show/category/{id}/product")
	public String showAllProduct(@PathVariable int id, Model model)  {
		Category category = null;

		// fetching the data...
		category = categoryDao.get(id);

		// passing the list of category type data
		model.addAttribute("categories", categoryDao.list());

		// passing single data of category type
		model.addAttribute("category", category);

		// passing the title for page...
		model.addAttribute("title", category.getName());

		model.addAttribute("userClickSingleCategory", true);

		return "main";
	}

	// Show the single product details...
	@RequestMapping("/show/{id}/product")
	public String showSingleProduct(@PathVariable int id, Model model) throws ProductNotFoundException {
		Product product = productDao.getProduct(id);
		
		if (product == null) throw new ProductNotFoundException();

		// count every single visit
		product.setView(product.getView() + 1);
		productDao.update(product);

		model.addAttribute("title", product.getName());
		model.addAttribute("product", product);

		model.addAttribute("userClickSingleProduct", true);
		return "main";
	}
}
