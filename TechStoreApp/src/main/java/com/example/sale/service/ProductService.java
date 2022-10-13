package com.example.sale.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.sale.dto.ProductDto;
import com.example.sale.entity.Products;

public interface ProductService {
	public Page<ProductDto> findAllProduct(Pageable pageable);

	public ProductDto findProductDtoById(Integer id);

	public Products findById(Integer id);
	
	public Products save(Products product);
	
	public void delete(Products product);
	
}
