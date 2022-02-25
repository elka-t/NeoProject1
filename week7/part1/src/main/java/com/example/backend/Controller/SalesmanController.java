package com.example.backend.Controller;


import com.example.backend.Exception.ResourceNotFoundException;
import com.example.backend.Model.Products;
import com.example.backend.Model.Salesmen;
import com.example.backend.Reposytory.SalesmanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salesman")
public class SalesmanController {

    @Autowired
    SalesmanRepo salesmanRepo;

    @GetMapping(value = "/all")
    public List<Salesmen> getAllSalesmen(){

        return salesmanRepo.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Salesmen> getName(@PathVariable("id") int id){
        Salesmen salesmen = salesmanRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Found no product with id"+ id));
        return ResponseEntity.ok(salesmen);
    }

}
