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
@Table(name = "ProductComments")
public class ProductComment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Topicusername")
	private String topicUsername;
	
	@Column(name = "Commentcontent")
	private String commentContent;
	
	@Column(name = "Productid")
	private Integer productId;
	
	@ManyToOne
	@JoinColumn(name = "TopicUsername")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "ProductId")
	private Product product;
	
}
