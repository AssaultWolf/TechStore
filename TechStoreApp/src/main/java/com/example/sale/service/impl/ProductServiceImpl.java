package com.example.sale.service.impl;


import java.text.ParseException;
import java.util.Date;

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
	public Products save(Products product) throws ParseException {
		// TODO Auto-generated method stub
		 
		Date militime = new Date(System.currentTimeMillis());
		product.setCreateddate(militime);
		return pDao.save(product);
	}

	@Override
	public void delete(Products product) {
		// TODO Auto-generated method stub
		pDao.deleteById(product.getId());
	}

	@Override
	public void updateAciveFlagFalse(Integer id) {
		// TODO Auto-generated method stub
		Products p = pDao.findById(id).get();
		p.setIsdeleted(false);
		pDao.save(p);
	}

	@Override
	public void updateAciveFlagTrue(Integer id) {
		// TODO Auto-generated method stub
		Products p = pDao.findById(id).get();
		p.setIsdeleted(true);
		pDao.save(p);
	}

}
