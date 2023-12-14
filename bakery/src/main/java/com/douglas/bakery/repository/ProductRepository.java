package com.douglas.bakery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.bakery.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
     
}
