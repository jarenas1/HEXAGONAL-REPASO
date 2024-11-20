package com.todoHexagonal.hexagonalRepaso.infrastructure.database.h2;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Table(name = "products")
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;
    @NotNull
    @Min(value = 0, message = "price must be positive")
    private BigDecimal price;   //Se usa bigDecimal para ser mas exactos con precios
    @NotNull
    private String currency;

    public @NotNull String getCurrency() {
        return currency;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public @NotNull @Min(value = 0, message = "price must be positive") BigDecimal getPrice() {
        return price;
    }
}
