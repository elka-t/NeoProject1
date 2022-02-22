package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductsRepo extends JpaRepository<Products, Integer> {

}
