package com.example.examvalidation.Reposite;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examvalidation.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
