package com.dikhit.shoeStore.model;

import java.util.HashSet; 
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "profilePictureURL")
	private String profilePictureURL;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user")
	private Set<Address> address = new HashSet<>(); 
	
	@JsonIgnore
	@OneToMany(mappedBy = "owner")
	private Set<Product> products = new HashSet<>();
	
}
