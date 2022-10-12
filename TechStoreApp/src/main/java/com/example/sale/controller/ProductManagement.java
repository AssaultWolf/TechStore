package com.example.sale.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sale.dto.ProductDto;
import com.example.sale.service.ProductService;

@Controller
public class ProductManagement {

	@Autowired
	ProductService pSer;

	@GetMapping("/admin/product")
	public String productMng(Model model, @RequestParam("pageCount") Optional<Integer> p) {
		if (p.get() == -1) {
			p = Optional.of(0);
		}


		Pageable pageable = PageRequest.of(p.orElse(0), 5);
		Page<ProductDto> lstProductDto = pSer.findAllProduct(pageable);
		
		if(lstProductDto.getTotalPages() == p.get() + 1)
		{
			p = Optional.of(lstProductDto.getTotalPages() -1);
		}
		
		model.addAttribute("lstProductDto", lstProductDto);
		return "admin/product/productManagement.html";
	}
}
