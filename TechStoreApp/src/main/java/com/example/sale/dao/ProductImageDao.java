package com.example.sale.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Productimages;
import com.example.sale.entity.Products;

@Repository
public interface ProductImageDao extends JpaRepository<Productimages, Integer>{

	public List<Productimages> findByProductid(Products productid);
	
}
