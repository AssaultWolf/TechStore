package com.example.sale.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductDetails")
public class ProductDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Productid")
	private Integer productId;
	
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
	
	@OneToOne
	@JoinColumn(name = "productdetails")
	private Product product;
}
