package com.example.sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sale.dao.ProductDao;

@Controller
public class HomeController {

	@Autowired
	ProductDao pDao;
	
	@GetMapping("/index")
	public String getHomePage(Model model) {
		
		pDao.findAllProduct().forEach(p -> {
			System.out.println(p.getProductName() + " " + p.getOneImage() + " " + p.getCategoryName() + " " + p.getDiscountPercent());
		});
		System.out.println(pDao.findAll().size() > 0 ? "OK" : "NOT");
		return "layout/homePage";
				
	}
	
	
	@GetMapping("/LoginSignUp")
	public String loginSignUp(){
		return "layout/Login_SignUp";
	}
	
	@GetMapping("/products")
	public String productlist() {
		return "product/productPage";
	}
	
	@GetMapping("/product-details")
	public String productDetails(){
		return "product/productDetails";
	}
	
	@GetMapping("/checkOut")
	public String checkOut() {
		return "checkout/checkOutCart";
	}
	
//	@GetMapping("/blank")
//	public String blank() {
//		return "layout/blank";
//	}
}
