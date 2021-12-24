package com.example.ProductManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
//@Table(name = "Product")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "branch")
	private String branch;
	
	@Column(name = "madein")
	private String madein;
	
	@Column(name = "price")
	private float price;
	
	public Product() {
		
	}
	
	
}
