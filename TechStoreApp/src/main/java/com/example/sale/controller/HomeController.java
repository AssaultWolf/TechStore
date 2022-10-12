package com.example.sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sale.dto.ProductDto;
import com.example.sale.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	ProductService pSer; 
	
	@GetMapping("/index")
	public String getHomePage(Model model) {
		
		Page<ProductDto> lstProductDto = pSer.findAllProduct(PageRequest.of(0, 8));
		
		model.addAttribute("lstProductDto", lstProductDto);
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
