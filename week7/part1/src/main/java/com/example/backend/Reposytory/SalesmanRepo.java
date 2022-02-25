package com.example.backend.Reposytory;

import com.example.backend.Model.Salesmen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesmanRepo extends JpaRepository<Salesmen, Integer> {
}
