/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sale.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "currentprice")
    private Double currentprice;
    
    @Column(name = "createddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;

    
    @Column(name = "isdeleted")
    private boolean isdeleted;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productid")
    private Collection<Productwishlists> productwishlistsCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productid")
    private Collection<Productdiscounts> productdiscountsCollection;
    
    @JoinColumn(name = "brandid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Brands brandid;
    
    @JoinColumn(name = "categoryid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Categories categoryid;
    
    @OneToMany(mappedBy = "productid")
    private Collection<Productdetails> productdetailsCollection;
    
    @OneToMany(mappedBy = "productid")
    private Collection<Productimages> productimagesCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productid")
    private Collection<Productrates> productratesCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productid")
    private Collection<Orderdetails> orderdetailsCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productid")
    private Collection<Productcomments> productcommentsCollection;
//
//    public Products() {
//    }
//
//    public Products(Integer id) {
//        this.id = id;
//    }
//
//    public Products(Integer id, String name, boolean isdeleted) {
//        this.id = id;
//        this.name = name;
//        this.isdeleted = isdeleted;
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
//    public Double getCurrentprice() {
//        return currentprice;
//    }
//
//    public void setCurrentprice(Double currentprice) {
//        this.currentprice = currentprice;
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
//    public boolean getIsdeleted() {
//        return isdeleted;
//    }
//
//    public void setIsdeleted(boolean isdeleted) {
//        this.isdeleted = isdeleted;
//    }
//
//    @XmlTransient
//    public Collection<Productwishlists> getProductwishlistsCollection() {
//        return productwishlistsCollection;
//    }
//
//    public void setProductwishlistsCollection(Collection<Productwishlists> productwishlistsCollection) {
//        this.productwishlistsCollection = productwishlistsCollection;
//    }
//
//    @XmlTransient
//    public Collection<Productdiscounts> getProductdiscountsCollection() {
//        return productdiscountsCollection;
//    }
//
//    public void setProductdiscountsCollection(Collection<Productdiscounts> productdiscountsCollection) {
//        this.productdiscountsCollection = productdiscountsCollection;
//    }
//
//    public Brands getBrandid() {
//        return brandid;
//    }
//
//    public void setBrandid(Brands brandid) {
//        this.brandid = brandid;
//    }
//
//    public Categories getCategoryid() {
//        return categoryid;
//    }
//
//    public void setCategoryid(Categories categoryid) {
//        this.categoryid = categoryid;
//    }
//
//    @XmlTransient
//    public Collection<Productdetails> getProductdetailsCollection() {
//        return productdetailsCollection;
//    }
//
//    public void setProductdetailsCollection(Collection<Productdetails> productdetailsCollection) {
//        this.productdetailsCollection = productdetailsCollection;
//    }
//
//    @XmlTransient
//    public Collection<Productimages> getProductimagesCollection() {
//        return productimagesCollection;
//    }
//
//    public void setProductimagesCollection(Collection<Productimages> productimagesCollection) {
//        this.productimagesCollection = productimagesCollection;
//    }
//
//    @XmlTransient
//    public Collection<Productrates> getProductratesCollection() {
//        return productratesCollection;
//    }
//
//    public void setProductratesCollection(Collection<Productrates> productratesCollection) {
//        this.productratesCollection = productratesCollection;
//    }
//
//    @XmlTransient
//    public Collection<Orderdetails> getOrderdetailsCollection() {
//        return orderdetailsCollection;
//    }
//
//    public void setOrderdetailsCollection(Collection<Orderdetails> orderdetailsCollection) {
//        this.orderdetailsCollection = orderdetailsCollection;
//    }
//
//    @XmlTransient
//    public Collection<Productcomments> getProductcommentsCollection() {
//        return productcommentsCollection;
//    }
//
//    public void setProductcommentsCollection(Collection<Productcomments> productcommentsCollection) {
//        this.productcommentsCollection = productcommentsCollection;
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
//        if (!(object instanceof Products)) {
//            return false;
//        }
//        Products other = (Products) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Products[ id=" + id + " ]";
//    }
//    
}
