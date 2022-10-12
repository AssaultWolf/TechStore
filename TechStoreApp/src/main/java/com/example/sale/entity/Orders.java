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
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private Integer id;

	@Column(name = "createdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdate;

	@Column(name = "notes")
	private String notes;

	@Column(name = "address")
	private String address;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "orderid")
	private Collection<Orderdetails> orderdetailsCollection;
	@JoinColumn(name = "username", referencedColumnName = "username")
	@ManyToOne(optional = false)
	private Accounts username;
	@JoinColumn(name = "ordermethodid", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Ordermethods ordermethodid;
	@JoinColumn(name = "orderstatusid", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Orderstatuses orderstatusid;
//
//    public Orders() {
//    }
//
//    public Orders(Integer id) {
//        this.id = id;
//    }
//
//    public Orders(Integer id, Date createdate, String address) {
//        this.id = id;
//        this.createdate = createdate;
//        this.address = address;
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
//    public Date getCreatedate() {
//        return createdate;
//    }
//
//    public void setCreatedate(Date createdate) {
//        this.createdate = createdate;
//    }
//
//    public String getNotes() {
//        return notes;
//    }
//
//    public void setNotes(String notes) {
//        this.notes = notes;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
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
//    public Accounts getUsername() {
//        return username;
//    }
//
//    public void setUsername(Accounts username) {
//        this.username = username;
//    }
//
//    public Ordermethods getOrdermethodid() {
//        return ordermethodid;
//    }
//
//    public void setOrdermethodid(Ordermethods ordermethodid) {
//        this.ordermethodid = ordermethodid;
//    }
//
//    public Orderstatuses getOrderstatusid() {
//        return orderstatusid;
//    }
//
//    public void setOrderstatusid(Orderstatuses orderstatusid) {
//        this.orderstatusid = orderstatusid;
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
//        if (!(object instanceof Orders)) {
//            return false;
//        }
//        Orders other = (Orders) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Orders[ id=" + id + " ]";
//    }
//    
}
