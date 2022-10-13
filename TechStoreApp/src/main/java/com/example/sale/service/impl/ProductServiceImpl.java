package com.example.sale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.sale.dao.ProductDao;
import com.example.sale.dto.ProductDto;
import com.example.sale.entity.Products;
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

	@Override
	public ProductDto findProductDtoById(Integer id) {
		// TODO Auto-generated method stub
		return pDao.findProductDtoById(id);
	}

	@Override
	public Products findById(Integer id) {
		// TODO Auto-generated method stub
		return pDao.findById(id).get();
	}

	@Override
	public Products save(Products product) {
		// TODO Auto-generated method stub
		return pDao.save(product);
	}

	@Override
	public void delete(Products product) {
		// TODO Auto-generated method stub
		pDao.deleteById(product.getId());
	}

}
