package com.todoHexagonal.hexagonalRepaso.usecases;

import com.todoHexagonal.hexagonalRepaso.domain.model.Product;

public interface IFindProductInteractor {

    //CONTRATO DE LA LOGICA DEL NEGOCIO RECORDAR DEVOLVER NUESTRO MODELO
    Product findProductById(Long id);
}
