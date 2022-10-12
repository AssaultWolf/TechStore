/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sale.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author paras
 */
@Entity
@Table(name = "productdiscounts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Productdiscounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    @Column(name = "id")
    private Integer id;
   
    
    @Column(name = "discount")
    private int discount;
   
    
    @Column(name = "createddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;
   
    
    @Column(name = "enddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @JoinColumn(name = "productid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products productid;
//
//    public Productdiscounts() {
//    }
//
//    public Productdiscounts(Integer id) {
//        this.id = id;
//    }
//
//    public Productdiscounts(Integer id, int discount, Date createddate, Date enddate) {
//        this.id = id;
//        this.discount = discount;
//        this.createddate = createddate;
//        this.enddate = enddate;
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
//    public int getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(int discount) {
//        this.discount = discount;
//    }
//
//    public Date getCreateddate() {
//        return createddate;
//    }
//
//    public void setCreateddate(Date createddate) {
//        this.createddate = createddate;
//    }
//
//    public Date getEnddate() {
//        return enddate;
//    }
//
//    public void setEnddate(Date enddate) {
//        this.enddate = enddate;
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
//        if (!(object instanceof Productdiscounts)) {
//            return false;
//        }
//        Productdiscounts other = (Productdiscounts) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Productdiscounts[ id=" + id + " ]";
//    }
    
}
