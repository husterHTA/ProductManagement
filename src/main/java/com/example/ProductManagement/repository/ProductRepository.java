package com.example.ProductManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductManagement.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
