package com.todoHexagonal.hexagonalRepaso.usecases;

import com.todoHexagonal.hexagonalRepaso.domain.model.Product;
import com.todoHexagonal.hexagonalRepaso.domain.repository.ProductRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;

public class FindProductInteractor implements  IFindProductInteractor{

    @Autowired
    private ProductRepositoryPort productRepositoryPort;

    @Override
    public Product findProductById(Long id) {
        return productRepositoryPort.findProductById(id);
    }
}
