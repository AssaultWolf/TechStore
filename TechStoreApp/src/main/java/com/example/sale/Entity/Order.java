package com.example.sale.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "Orders")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Createddate")
	private Date createdDate;
	
	@Column(name = "Notes")
	private String notes;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Username")
	private String userName;
	
	@Column(name = "Orderstatusid")
	private Integer orderStatusId;
	
	@Column(name = "Ordermethodid")
	private Integer orderMethodId;
	
	@ManyToOne
	@JoinColumn(name = "OrderStatusId")
	private OrderStatus orderStatus;
	
	@ManyToOne
	@JoinColumn(name = "OrderMethodId")
	private OrderStatus orderMethod;
	
	@ManyToOne
	@JoinColumn(name = "username")
	private Account account;
	
	@JsonIgnore
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	public List<OrderDetail> orderDetails;
}
