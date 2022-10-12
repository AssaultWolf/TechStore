package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Productcomments;

@Repository
public interface ProductCommentDao extends JpaRepository<Productcomments, Integer>{

}
