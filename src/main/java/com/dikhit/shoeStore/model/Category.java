package com.dikhit.shoeStore.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Category {
	
	@Id
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "descrption")
	private String description;
	
	@OneToMany(mappedBy = "category")
	private Set<Product> products = new HashSet<>();
}
