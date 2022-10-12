package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Productrates;

@Repository
public interface ProductRateDao extends JpaRepository<Productrates, Integer>{
	
}
