package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Brands;

@Repository
public interface BrandDao extends JpaRepository<Brands, Integer>{

}
