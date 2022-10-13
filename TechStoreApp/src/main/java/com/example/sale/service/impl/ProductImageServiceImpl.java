package com.example.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sale.dao.ProductImageDao;
import com.example.sale.entity.Productimages;
import com.example.sale.entity.Products;
import com.example.sale.service.ProductImageService;

@Service 
public class ProductImageServiceImpl implements ProductImageService{
	
	@Autowired
	ProductImageDao piDAO;
	
	@Override
	public List<Productimages> findByProductid(Products productid) {
		// TODO Auto-generated method stub
		return piDAO.findByProductid(productid);
	}

}
