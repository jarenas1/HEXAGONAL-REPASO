package com.todoHexagonal.hexagonalRepaso.infrastructure.database.h2;

import com.todoHexagonal.hexagonalRepaso.domain.model.Product;
import com.todoHexagonal.hexagonalRepaso.domain.repository.ProductRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

//Implementamos el puerto creado anteriormente
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    @Autowired
    private  ProductJpaRepository productJpaRepository;
    @Override
    public Product findProductById(Long id) {
        Optional<ProductEntity> productEntity = productJpaRepository.findProductById(id);

        // Usamos el mapper para transformar de productEntity a product
        Product product = ProductMapper.fromProductEntityToProduct(productEntity.get());
        return product;
    }
}
