package com.example.sale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sale.entity.Roles;

@Repository
public interface RoleDao extends JpaRepository<Roles, Integer> {

}
