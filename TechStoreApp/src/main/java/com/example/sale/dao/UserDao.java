package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Users;

@Repository
public interface UserDao extends JpaRepository<Users, Integer> {

}
