package com.example.sale.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Accounts")
public class Account implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Username")
	private String username;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Status")
	private Integer status;
	
	@Column(name = "Roleid")
	private Integer roleId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Createddate")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name = "RoleId")
	private Role role;
	
	@OneToOne(mappedBy = "account")
	private User user;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)	
	private List<Order> orders;
}
