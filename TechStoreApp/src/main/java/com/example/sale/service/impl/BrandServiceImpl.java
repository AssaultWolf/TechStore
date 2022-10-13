package com.example.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sale.dao.BrandDao;
import com.example.sale.entity.Brands;
import com.example.sale.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	BrandDao bDao;
	
	@Override
	public List<Brands> findAll() {
		// TODO Auto-generated method stub
		return bDao.findAll();
	}

	@Override
	public Brands findById(Integer id) {
		// TODO Auto-generated method stub
		return bDao.findById(id).get();
	}

}
