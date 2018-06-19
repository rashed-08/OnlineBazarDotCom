package com.onlinebazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlinebazar.dao.CategoryDao;
import com.onlinebazar.model.Category;

/*
 * 	This is basic controller where application will start on.
 * 	
 * 	author: Romantic Coder
 * */

@Controller
public class HomeController {
	
	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping(value = { "/", "/index", "/home" })
	public String showHome(Model model) {
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
		model.addAttribute("userClickAllProduct", true);
		model.addAttribute("title", "All Products");
		return "main";
	}

	@RequestMapping("/show/category/{id}/product")
	public String showAllProduct(@PathVariable String id, Model model) {
		Category category = null;
		
		//fetching the data...
		category = categoryDao.get(id);
		
		//passing the list of category type data
		model.addAttribute("categories", categoryDao.list());
		
		//passing single data of category type
		model.addAttribute("category", category);
		
		//passing the title for page...
		model.addAttribute("title", category.getName());
		
		model.addAttribute("userClickSingleProduct", true);

		return "main";
	}
}
