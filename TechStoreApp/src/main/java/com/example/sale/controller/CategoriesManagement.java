package com.example.sale.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sale.entity.Categories;
import com.example.sale.service.CategoryService;

@Controller
public class CategoriesManagement {

	@Autowired
	CategoryService cSer;

	Boolean checkTab = false;
	
	Categories cEntity = new Categories();

	@GetMapping("admin/categories")
	public String categoriesMng(Model model, @RequestParam("pageCount") Optional<Integer> p,
			HttpServletRequest request) {

		if (checkTab) {
			model.addAttribute("isCatDetails", "tab2");
		} else {
			model.addAttribute("isCatDetails", "tab1");

			model.addAttribute("modelCategory", cEntity);
		}

		if (!request.getRequestURL().toString().contains("details")) {
			checkTab = false;

		}

		if (p.orElse(0) == -1) {
			p = Optional.of(0);
			return "redirect:/admin/categories";
		}

		Pageable pageable = PageRequest.of(p.orElse(0), 5);
		Page<Categories> lstCategoryEntity = cSer.findAllCategory(pageable);
		if (p.orElse(0) == lstCategoryEntity.getTotalPages()) {
			p = Optional.of(lstCategoryEntity.getTotalPages() - 1);

			return "redirect:/admin/categories?pageCount=" + p.get();
		}

		model.addAttribute("lstCategoryEntity", lstCategoryEntity);
		return "admin/category/categoryManagement";
	}

	@GetMapping("/admin/category/details/{id}")
	public String categoryDetailsMng(Model model, @PathVariable("id") Integer id, HttpServletRequest request) {
		model.addAttribute("isEdit", true);
		checkTab = true;
		
		model.addAttribute("isCatDetails", "tab2");
		
		cEntity = cSer.findById(id);
		model.addAttribute("modelCategory", cEntity);

		model.addAttribute("isDelete", cEntity.getIsdeleted());

		// return "admin/product/productManagement";
		return "forward:/admin/categories";
	}
	
}
