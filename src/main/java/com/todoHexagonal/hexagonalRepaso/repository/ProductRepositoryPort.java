package com.todoHexagonal.hexagonalRepaso.repository;

import com.todoHexagonal.hexagonalRepaso.domain.model.Product;

public interface ProductRepositoryPort {
    Product findProductById(Long id);
}
