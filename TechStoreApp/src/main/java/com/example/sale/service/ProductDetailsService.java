package com.example.sale.service;

import java.util.List;

import com.example.sale.entity.Productdetails;
import com.example.sale.entity.Products;

public interface ProductDetailsService {
	public List<Productdetails> findByProductId(Products prod);
}
