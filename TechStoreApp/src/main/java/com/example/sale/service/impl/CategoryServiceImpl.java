package com.example.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.sale.dao.CategoryDao;
import com.example.sale.entity.Categories;
import com.example.sale.service.CategoryService;

@Service 
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryDao cDao;
	
	@Override
	public List<Categories> findAll() {
		// TODO Auto-generated method stub
		return cDao.findAll();
	}

	@Override
	public Categories findById(Integer id) {
		// TODO Auto-generated method stub
		return cDao.findById(id).get();
	}

	@Override
	public Page<Categories> findAllCategory(Pageable pageable) {
		// TODO Auto-generated method stub
		return cDao.findAllCategory(pageable);
	}
	
}
