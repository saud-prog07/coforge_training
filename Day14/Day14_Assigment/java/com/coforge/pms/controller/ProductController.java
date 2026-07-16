package com.coforge.pms.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;
@Controller
public class ProductController {

	@Autowired // Annoation based used to do field injection
	private ProductService service;

	@RequestMapping("home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ABCTechnologiesHome");// the extension is added at dis
		return mv;// it acts as disptcher forward
	}

	@RequestMapping(method = RequestMethod.POST, value = "product", params = "Add")
	public ModelAndView addProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView();
		

		String result = "";

		boolean status = service.addProduct(product);

		if (status) {
			result = "SUCCESS: product object saved";
		} else {
			result = "FAILED : product object not saved";
		}
		mv.setViewName("ABCTechnologiesHome");
		mv.addObject("result", result);
		
		return mv;

	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "product", params = "Update")
	public ModelAndView updateProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ABCTechnologiesHome");

		String result = "";

		boolean status = service.updateProduct(product);

		if (status) {
			result = "SUCCESS: product object updated";
		} else {
			result = "FAILED : product object not saved";
		}
		
		mv.addObject("result", result);
		
		return mv;

	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "product", params = "Delete")
	public ModelAndView deleteproduct(@RequestParam int ProductId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ABCTechnologiesHome");

		String result = "";

		boolean status = service.deleteProduct(ProductId);

		if (status) {
			result = "SUCCESS: product object deleted";
		} else {
			result = "FAILED : product object not deleted";
		}
		
		mv.addObject("result", result);
		
		return mv;

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "product", params = "Find")
	public ModelAndView findproduct(@RequestParam int ProductId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ABCTechnologiesHome");

		String result = "";

		Product product = service.findProduct(ProductId);

		if (product!= null) {
			result = product.toString();
		} else {
			result = "FAILED : product object not found";
		}
		
		mv.addObject("result", result);
		
		return mv;

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "product", params = "FindAll")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ABCTechnologiesHome");

		String result = "";

		Map<Integer,Product> product = service.findAll();

		if (product!= null) {
			result = product.toString();
		} else {
			result = "FAILED : product object not found";
		}
		
		mv.addObject("result", product);
		
		return mv;

	}
}
