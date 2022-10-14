package com.example.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sale.dao.ProductDetailsDao;
import com.example.sale.entity.Productdetails;
import com.example.sale.entity.Products;
import com.example.sale.service.ProductDetailsService;

@Service 
public class ProductDetailsServiceImpl implements ProductDetailsService{

	@Autowired
	ProductDetailsDao pdeDao;
	
	@Override
	public List<Productdetails> findByProductId(Products prod) {
		// TODO Auto-generated method stub
		return pdeDao.findByProductid(prod);
	}
	
}
