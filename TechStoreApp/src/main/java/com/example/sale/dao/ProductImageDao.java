package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Productimages;

@Repository
public interface ProductImageDao extends JpaRepository<Productimages, Integer>{

}
