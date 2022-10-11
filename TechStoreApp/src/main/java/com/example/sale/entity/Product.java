package com.example.sale.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Currentprice")
	private Double currentPrice;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Createddate")
	private Date createdDate;
//	
//	@Column(name = "Categoryid")
//	private Integer categoryId; 
//	
//	@Column(name = "Brandid")
//	private Integer brandId; 
	
	@ManyToOne
	@JoinColumn(name = "BrandId")
	private Brand brand;
	
	@ManyToOne
	@JoinColumn(name = "CategoryId")
	private Category category;
	
	@JsonIgnore
	@OneToOne(mappedBy = "product")
	private ProductDetails productdetails;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	public List<ProductImage> productImages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	public List<ProductDiscount> productDiscounts;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL )
	public List<OrderDetail> orderDetails;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	public List<ProductRate> productRates;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	public List<ProductComment> productComments;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	public List<ProductWishList> productWishList;
		
}
