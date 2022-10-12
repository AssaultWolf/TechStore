package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Productdetails;

@Repository
public interface ProductDetailsDao extends JpaRepository<Productdetails, Integer> {

}
