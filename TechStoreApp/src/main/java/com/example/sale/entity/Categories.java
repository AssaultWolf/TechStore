/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sale.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author paras
 */
@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;



    @Column(name = "name")
    private String name;
    @Column(name = "isdeleted")
    private Boolean isdeleted;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryid")
    private Collection<Products> productsCollection;
//
//    public Categories() {
//    }
//
//    public Categories(Integer id) {
//        this.id = id;
//    }
//
//    public Categories(Integer id, String name) {
//        this.id = id;
//        this.name = name;
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
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Boolean getIsdeleted() {
//        return isdeleted;
//    }
//
//    public void setIsdeleted(Boolean isdeleted) {
//        this.isdeleted = isdeleted;
//    }
//
//    @XmlTransient
//    public Collection<Products> getProductsCollection() {
//        return productsCollection;
//    }
//
//    public void setProductsCollection(Collection<Products> productsCollection) {
//        this.productsCollection = productsCollection;
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
//        if (!(object instanceof Categories)) {
//            return false;
//        }
//        Categories other = (Categories) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Categories[ id=" + id + " ]";
//    }
    
}
