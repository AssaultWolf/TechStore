package com.example.sale.controller;


import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.sale.dto.ProductDto;
import com.example.sale.entity.Productimages;
import com.example.sale.entity.Products;
import com.example.sale.service.BrandService;
import com.example.sale.service.CategoryService;
import com.example.sale.service.ProductImageService;
import com.example.sale.service.ProductService;
import com.example.sale.service.UploadService;

@Controller
public class ProductManagement {

	@Autowired
	ProductService pSer;
	
	@Autowired
	BrandService bSer;
	
	@Autowired
	CategoryService cSer;
	
	@Autowired
	ProductImageService piSer;
	
	@Autowired
	UploadService uploadService;
	
	Boolean checkTab = false;
	
	ProductDto pDto = new ProductDto();

	@GetMapping("/admin/product")
	public String productMng(Model model, @RequestParam("pageCount") Optional<Integer> p, HttpServletRequest request) {
		model.addAttribute("modelProduct", pDto);
		
		if (checkTab) {
			model.addAttribute("isHomeProduct", "tab2");
		} else {
			model.addAttribute("isHomeProduct", "tab1");
			pDto = new ProductDto();
			model.addAttribute("modelProduct", pDto);
		}
		
		if(!request.getRequestURL().toString().contains("details")) {
			checkTab = false;
			
		}

		if (p.orElse(0) == -1) {
			p = Optional.of(0);
			return "redirect:/admin/product";
		}

		Pageable pageable = PageRequest.of(p.orElse(0), 5);
		Page<ProductDto> lstProductDto = pSer.findAllProduct(pageable);

		if (p.orElse(0) == lstProductDto.getTotalPages()) {
			p = Optional.of(lstProductDto.getTotalPages() - 1);
			return "redirect:/admin/product?pageCount=" + p.get();
		}
		
		model.addAttribute("lstProductDto", lstProductDto);
		return "admin/product/productManagement";
	}

	@GetMapping("/admin/product/details/{id}")
	public String productDetailsMng(Model model, @PathVariable("id") Integer id,  HttpServletRequest request) {

		checkTab = true;
		model.addAttribute("isHomeProduct", "tab2");
		pDto = pSer.findProductDtoById(id);
		model.addAttribute("modelProduct", pDto);
		
		List<Productimages> lstImages = piSer.findByProductid(pSer.findById(id));
		model.addAttribute("lstImages", lstImages);
		
//		return "admin/product/productManagement";
		return "forward:/admin/product";
	}
	
	@PostMapping("/admin/product/details/insert")
	public String producInsert(
			@RequestParam("prodName") String prodName,
			@RequestParam("prodPrice") Double prodPrice,
			@RequestParam("prodBrand") Integer prodBrand,
			@RequestParam("prodCat") Integer prodCat,
			@RequestParam("inputPhoto") MultipartFile uploadPhoto
			) 
	{
		
		Products prod = new Products();
		prod.setName(prodName);
		prod.setCurrentprice(prodPrice);
		prod.setBrandid(bSer.findById(prodBrand));
		prod.setCategoryid(cSer.findById(prodCat));
		Products p = pSer.save(prod);
		
		
		String path = "src\\main\\resources\\static\\upload\\product";
		uploadService.save(uploadPhoto, path, p);
		
		
		
		
		
		
		return "redirect:/admin/product";
	}
	
	
}
