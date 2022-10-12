package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Categories;

@Repository
public interface CategoryDao extends JpaRepository<Categories, Integer>{

}
