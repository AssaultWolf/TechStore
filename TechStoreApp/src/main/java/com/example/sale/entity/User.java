package com.example.sale.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Fullname")
	private String fullname;

	@Column(name = "Phone")
	private String phone;

	@Column(name = "Email")
	private String email;

	@Column(name = "Address")
	private String address;

	@Column(name = "Images")
	private String images;

	@Column(name = "Username")
	private String username;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	private Account account;

	@JsonIgnore
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public List<ProductWishList> productWishList;

}
