package com.example.ProductManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductManagement.model.Product;

//để nói với Spring Data JPA về loại dữ liệu(Product)và ID(Long)để làm việc
public interface ProductRepository extends JpaRepository<Product, Long> {

}
