package com.douglas.bakery.shared;

import com.douglas.bakery.model.Product;

public record ResponseRecord(Product product, String message) {
    
}
