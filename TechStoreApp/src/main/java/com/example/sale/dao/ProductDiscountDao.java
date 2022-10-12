package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Productdiscounts;

@Repository
public interface ProductDiscountDao extends JpaRepository<Productdiscounts, Integer>{

}
