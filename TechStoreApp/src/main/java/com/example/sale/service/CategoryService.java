package com.example.sale.service;

import java.util.List;

import com.example.sale.entity.Categories;

public interface CategoryService {
	
	public List<Categories> findAll();
	
	public Categories findById(Integer id);
}
