/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sale.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "productimages")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Productimages implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "name")
	private String name;
	@JoinColumn(name = "productid", referencedColumnName = "id")
	@ManyToOne
	private Products productid;
//
//    public Productimages() {
//    }
//
//    public Productimages(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
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
//        hash += (name != null ? name.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Productimages)) {
//            return false;
//        }
//        Productimages other = (Productimages) object;
//        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Productimages[ name=" + name + " ]";
//    }
//    
}
