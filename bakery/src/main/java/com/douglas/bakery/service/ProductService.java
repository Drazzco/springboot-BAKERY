package com.douglas.bakery.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.bakery.model.Product;
import com.douglas.bakery.model.exception.ResponseException;
import com.douglas.bakery.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll()
    {
        List<Product> products = repository.findAll();
        if(products.isEmpty())
        {
            throw new ResponseException("No products found");
        }
        else
        {
            return products;
        }
    }

    public Optional<Product> findById(Long id)
    {
        return repository.findById(id);
    }

    @Transactional
    public Product add(Product product)
    {
        return repository.save(product);
    }

    @Transactional
    public Product update(Product product)
    {
        Objects.requireNonNull(product.getId());
        return repository.save(product);
    }

    @Transactional
    public void delete(Long id)
    {
        repository.deleteById(id);
    }
}
