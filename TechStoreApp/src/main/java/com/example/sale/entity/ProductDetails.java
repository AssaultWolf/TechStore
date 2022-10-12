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
@Table(name = "productdetails")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Productdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "key01")
    private String key01;
    @Column(name = "key02")
    private String key02;
    @Column(name = "key03")
    private String key03;
    @Column(name = "key04")
    private String key04;
    @Column(name = "key05")
    private String key05;
    @Column(name = "key06")
    private String key06;
    @Column(name = "key07")
    private String key07;
    @Column(name = "key08")
    private String key08;
    @Column(name = "key09")
    private String key09;
    @Column(name = "key10")
    private String key10;
    @JoinColumn(name = "productid", referencedColumnName = "id")
    @ManyToOne
    private Products productid;
//
//    public Productdetails() {
//    }
//
//    public Productdetails(Integer id) {
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
//    public String getKey01() {
//        return key01;
//    }
//
//    public void setKey01(String key01) {
//        this.key01 = key01;
//    }
//
//    public String getKey02() {
//        return key02;
//    }
//
//    public void setKey02(String key02) {
//        this.key02 = key02;
//    }
//
//    public String getKey03() {
//        return key03;
//    }
//
//    public void setKey03(String key03) {
//        this.key03 = key03;
//    }
//
//    public String getKey04() {
//        return key04;
//    }
//
//    public void setKey04(String key04) {
//        this.key04 = key04;
//    }
//
//    public String getKey05() {
//        return key05;
//    }
//
//    public void setKey05(String key05) {
//        this.key05 = key05;
//    }
//
//    public String getKey06() {
//        return key06;
//    }
//
//    public void setKey06(String key06) {
//        this.key06 = key06;
//    }
//
//    public String getKey07() {
//        return key07;
//    }
//
//    public void setKey07(String key07) {
//        this.key07 = key07;
//    }
//
//    public String getKey08() {
//        return key08;
//    }
//
//    public void setKey08(String key08) {
//        this.key08 = key08;
//    }
//
//    public String getKey09() {
//        return key09;
//    }
//
//    public void setKey09(String key09) {
//        this.key09 = key09;
//    }
//
//    public String getKey10() {
//        return key10;
//    }
//
//    public void setKey10(String key10) {
//        this.key10 = key10;
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
//        if (!(object instanceof Productdetails)) {
//            return false;
//        }
//        Productdetails other = (Productdetails) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Productdetails[ id=" + id + " ]";
//    }
//    
}
