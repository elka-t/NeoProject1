package com.example.demo.Controller;


import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepo userRepo;


    // retrieve all data about users
    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    //find user by their id
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){
        User user = userRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Found no user with id"+ id));
        return ResponseEntity.ok(user);
    }

    //build adding user REST api
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {

        return userRepo.save(user);
    }

    //build change users data
    @PutMapping("/{id}")
    public ResponseEntity<User> updateProduct(@PathVariable("id") int id, @RequestBody User usersDetail){
        User updateUsers = userRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Found no user with id"+ id));

        updateUsers.setFirst_name(usersDetail.getFirst_name());
        updateUsers.setLast_name(usersDetail.getLast_name());
        updateUsers.setEmail(usersDetail.getEmail());

        userRepo.save(updateUsers);

        return ResponseEntity.ok(updateUsers);
    }

    //build delete user REST api
    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> deleteUser(@PathVariable ("id") int id){
        User user = userRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("No such user by id"+id));

        userRepo.delete(user);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
