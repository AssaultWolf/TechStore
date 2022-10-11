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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductRates")
public class ProductRate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Rating")
	private Integer rating;
	
	@Column(name = "Productid") 
	private Integer productId;
	
	@Column(name = "Username")
	private String username;
	
	@ManyToOne
	@JoinColumn(name = "ProductId")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "username")
	private Account account;
}