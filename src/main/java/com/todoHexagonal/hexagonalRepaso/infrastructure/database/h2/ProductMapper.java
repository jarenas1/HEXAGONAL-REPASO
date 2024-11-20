package com.todoHexagonal.hexagonalRepaso.infrastructure.database.h2;

import com.todoHexagonal.hexagonalRepaso.domain.model.Product;

public class ProductMapper {
    public static Product fromProductEntityToProduct(ProductEntity productEntity) {
        return new Product(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getPrice(),
                productEntity.getCurrency()
        );
    }
}
