package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Orderstatuses;

@Repository
public interface OrderStatusDao extends JpaRepository<Orderstatuses, Integer> {

}
