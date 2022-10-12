/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sale.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author paras
 */
@Entity
@Table(name = "productrates")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Productrates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "rating")
    
    private Integer rating;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Accounts username;
    
    @JoinColumn(name = "productid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products productid;
//
//    public Productrates() {
//    }
//
//    public Productrates(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getRating() {
//        return rating;
//    }
//
//    public void setRating(Integer rating) {
//        this.rating = rating;
//    }
//
//    public Accounts getUsername() {
//        return username;
//    }
//
//    public void setUsername(Accounts username) {
//        this.username = username;
//    }
//
//    public Products getProductid() {
//        return productid;
//    }
//
//    public void setProductid(Products productid) {
//        this.productid = productid;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Productrates)) {
//            return false;
//        }
//        Productrates other = (Productrates) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Productrates[ id=" + id + " ]";
//    }
    
}
