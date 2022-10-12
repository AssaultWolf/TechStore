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
@Table(name = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private Integer status;
    @Column(name = "createddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createddate;
    
    
    @Column(name = "isdeleted")
    private boolean isdeleted;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<Productwishlists> productwishlistsCollection;
    @OneToMany(mappedBy = "username")
    private Collection<Users> usersCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<Productrates> productratesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<Orders> ordersCollection;
    @JoinColumn(name = "roleid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Roles roleid;
    @OneToMany(mappedBy = "topicusername")
    private Collection<Productcomments> productcommentsCollection;

//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
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
//    public Collection<Users> getUsersCollection() {
//        return usersCollection;
//    }
//
//    public void setUsersCollection(Collection<Users> usersCollection) {
//        this.usersCollection = usersCollection;
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
//    public Collection<Orders> getOrdersCollection() {
//        return ordersCollection;
//    }
//
//    public void setOrdersCollection(Collection<Orders> ordersCollection) {
//        this.ordersCollection = ordersCollection;
//    }
//
//    public Roles getRoleid() {
//        return roleid;
//    }
//
//    public void setRoleid(Roles roleid) {
//        this.roleid = roleid;
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
//        hash += (username != null ? username.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Accounts)) {
//            return false;
//        }
//        Accounts other = (Accounts) object;
//        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Accounts[ username=" + username + " ]";
//    }
//    
}
