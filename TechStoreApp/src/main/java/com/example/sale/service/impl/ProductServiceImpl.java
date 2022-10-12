package com.example.sale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.sale.dao.ProductDao;
import com.example.sale.dto.ProductDto;
import com.example.sale.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao pDao;

	@Override
	public Page<ProductDto> findAllProduct(Pageable pageable) {
		// TODO Auto-generated method stub
		return pDao.findAllProduct(pageable);
	}

}
