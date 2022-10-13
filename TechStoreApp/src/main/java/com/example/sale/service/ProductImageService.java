package com.example.sale.service;

import java.util.List;

import com.example.sale.entity.Productimages;
import com.example.sale.entity.Products;

public interface ProductImageService {
	public List<Productimages> findByProductid(Products productid);
}
