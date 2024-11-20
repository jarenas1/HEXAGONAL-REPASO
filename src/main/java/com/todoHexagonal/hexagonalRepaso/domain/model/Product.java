package com.todoHexagonal.hexagonalRepaso.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class Product {
    //Debemos crear el modelo, en base a la logica del negocio, teniendo en cuenta que esta no debe saber ni de base de datos ni controladores
    //por ende esta debe contener solo clases que tengan que ver con el negocio, TAMBIEN HACEMOS VALIDACIONES DE NEGOCIO

    private Long id;

    private String name;

    private String description;
    @NotNull
    @Min(value = 0, message = "price must be positive")
    private BigDecimal price;   //Se usa bigDecimal para ser mas exactos con precios
    @NotNull
    private String currency;
}
