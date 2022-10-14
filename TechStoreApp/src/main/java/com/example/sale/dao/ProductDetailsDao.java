package com.example.sale.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Productdetails;
import com.example.sale.entity.Products;

@Repository
public interface ProductDetailsDao extends JpaRepository<Productdetails, Integer> {

	List<Productdetails> findByProductid(Products productid);
}
