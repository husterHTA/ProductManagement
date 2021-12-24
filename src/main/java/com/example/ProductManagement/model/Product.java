package com.example.ProductManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//Tạo 1 polo để kết nối với database
@Entity		//
@Table(name = "Product")	//Nếu không có thì tên class đồng nghĩa với tên bảng trong database
@Data		//bao gồm các tính năng của @ToString, @EqualsAndHashCode , @Getter / @Setter và @RequiredArgsConstructor
public class Product {
	
	@Id		//set primary-key trong db
	@GeneratedValue(strategy = GenerationType.AUTO)		//set auto crement trong db
	@Column(name = "id")		//set column
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
