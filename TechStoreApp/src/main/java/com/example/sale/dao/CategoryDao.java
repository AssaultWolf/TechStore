package com.example.sale.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Categories;

@Repository
public interface CategoryDao extends JpaRepository<Categories, Integer>{
	
	
	@Query("SELECT c FROM Categories c ORDER BY c.name")
	public Page<Categories> findAllCategory(Pageable pageable);
}
