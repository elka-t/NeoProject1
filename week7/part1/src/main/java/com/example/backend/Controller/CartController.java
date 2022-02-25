package com.example.backend.Controller;

import com.example.backend.Exception.ResourceNotFoundException;
import com.example.backend.Model.Cart;
import com.example.backend.Model.Products;
import com.example.backend.Reposytory.CartRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartRepo cartRepo;

    @GetMapping(value = "/all")

    public List<Cart> getAllInCart(){
        return cartRepo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCardById(@PathVariable("id") int id){
        Cart cart = cartRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Found no product with id"+ id));
        return ResponseEntity.ok(cart);
    }
}
