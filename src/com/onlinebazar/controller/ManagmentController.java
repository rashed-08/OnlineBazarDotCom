package com.onlinebazar.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.onlinebazar.dao.CategoryDao;
import com.onlinebazar.dao.ProductDao;
import com.onlinebazar.model.Category;
import com.onlinebazar.model.Product;

@Controller
@RequestMapping("/manage")
public class ManagmentController {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ProductDao productDao;
	
	private static Logger logger = LoggerFactory.getLogger(ManagmentController.class);

	@RequestMapping(value="/product", method=RequestMethod.GET)
	public String manageProduct(Model model, @RequestParam(name="operation", required=false) String operation) {
		model.addAttribute("userClickManageProduct", true);
		model.addAttribute("title", "Manage Product");
		model.addAttribute(new Product());
		
		Product newProduct=new Product();
		newProduct.setSupplierId(1);
		newProduct.setActive(true);
		model.addAttribute("product", newProduct);
		
		if (operation != null) {
			if (operation.equals("product")) {
				model.addAttribute("message", "Product Submited Successfully");
			}
		}
		
		return "main";
	}
	
	@RequestMapping(value="product", method=RequestMethod.POST)
	public String submitProduct(@ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "/manage/product";
		}
		
		productDao.add(product);
		
		logger.info(product.toString());
		
		return "redirect:/manage/product?operation=product";
	}
	
	@ModelAttribute("categories")
	public List<Category> getList(){
		return categoryDao.list();
	}
	
}
