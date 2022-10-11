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


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductDiscounts")
public class ProductDiscount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Discount")
	private Integer discount;
	
//	@Column(name = "Productid")
//	private Integer productId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Createddate")
	private Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Enddate")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name = "ProductId")
	private Product product;
	
}
