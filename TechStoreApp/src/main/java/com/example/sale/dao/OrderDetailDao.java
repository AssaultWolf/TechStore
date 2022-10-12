package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Orderdetails;

@Repository
public interface OrderDetailDao extends JpaRepository<Orderdetails, Integer>{

}
