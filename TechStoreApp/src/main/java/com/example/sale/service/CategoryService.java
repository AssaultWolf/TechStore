package com.example.sale.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.sale.entity.Categories;

public interface CategoryService {
	
	public List<Categories> findAll();
	
	public Categories findById(Integer id);
	
	public Page<Categories> findAllCategory(Pageable pageable);
}
