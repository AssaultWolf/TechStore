package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Productwishlists;

@Repository
public interface ProductWishListDao extends JpaRepository<Productwishlists, Integer>{

}
