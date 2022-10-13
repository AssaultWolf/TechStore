package com.example.sale.service;

import java.util.List;

import com.example.sale.entity.Brands;

public interface BrandService {
	
	public List<Brands> findAll();
	
	public Brands findById(Integer id);
}
