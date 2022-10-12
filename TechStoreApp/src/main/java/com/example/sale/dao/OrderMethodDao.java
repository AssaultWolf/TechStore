package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Ordermethods;

@Repository
public interface OrderMethodDao extends JpaRepository<Ordermethods, Integer>{

}
