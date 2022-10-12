package com.example.sale.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.sale.dto.ProductDto;

public interface ProductService {
	public Page<ProductDto> findAllProduct(Pageable pageable);
}
