package com.example.backend.Controller;


import com.example.backend.Exception.ResourceNotFoundException;
import com.example.backend.Model.Products;
import com.example.backend.Reposytory.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    @Autowired
    ProductsRepo productsRepo;


    @GetMapping
    public List<Products> getAllProducts(){

        return productsRepo.findAll();
    }

    //find product by id REST api
    @GetMapping("/{id}")
    public ResponseEntity<Products> getProduct(@PathVariable("id") int id){
        Products products = productsRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Found no product with id"+ id));
        return ResponseEntity.ok(products);
    }

    //build create product REST api
    @PostMapping("/add")
    public Products createProduct(@RequestBody Products product) {

        return productsRepo.save(product);
    }

    //build update product REST api
    @PutMapping("/{id}")
    public ResponseEntity<Products> updateProduct(@PathVariable("id") int id, @RequestBody Products productsDetail){
        Products updateProducts = productsRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Found no product with id"+ id));

        updateProducts.setProductName(productsDetail.getProductName());
        updateProducts.setPrice(productsDetail.getPrice());

        productsRepo.save(updateProducts);

        return ResponseEntity.ok(updateProducts);
    }


    //build delete product REST api
    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> deleteProduct(@PathVariable ("id") int id){
        Products products = productsRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("No such product by id"+id));

        productsRepo.delete(products);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
