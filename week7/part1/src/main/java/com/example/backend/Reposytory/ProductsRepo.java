package com.example.backend.Reposytory;

import com.example.backend.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductsRepo extends JpaRepository<Products, Integer> {

}
