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
@Table(name = "productcomments")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Productcomments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "commentcontent")
    private String commentcontent;
    @JoinColumn(name = "topicusername", referencedColumnName = "username")
    @ManyToOne
    private Accounts topicusername;
    @JoinColumn(name = "productid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products productid;
//
//    public Productcomments() {
//    }
//
//    public Productcomments(Integer id) {
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
//    public String getCommentcontent() {
//        return commentcontent;
//    }
//
//    public void setCommentcontent(String commentcontent) {
//        this.commentcontent = commentcontent;
//    }
//
//    public Accounts getTopicusername() {
//        return topicusername;
//    }
//
//    public void setTopicusername(Accounts topicusername) {
//        this.topicusername = topicusername;
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
//        if (!(object instanceof Productcomments)) {
//            return false;
//        }
//        Productcomments other = (Productcomments) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.mycompany.mavenproject1.pojos.Productcomments[ id=" + id + " ]";
//    }
    
}
