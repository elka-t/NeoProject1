package com.example.backend.Controller;

import com.example.backend.Exception.ResourceNotFoundException;
import com.example.backend.Model.Customers;
import com.example.backend.Model.Products;
import com.example.backend.Reposytory.CustomerRepo;
import com.example.backend.Reposytory.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;


    @GetMapping(value = "/all")
    public List<Customers> getAllCustomers(){

        return customerRepo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable("id") int id){
        Customers customers = customerRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Found no product with id"+ id));
        return ResponseEntity.ok(customers);
    }
}
