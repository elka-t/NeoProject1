package com.example.backend.Reposytory;

import com.example.backend.Model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customers, Integer> {
}
