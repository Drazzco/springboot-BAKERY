package com.douglas.bakery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douglas.bakery.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
     
}
