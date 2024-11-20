package com.todoHexagonal.hexagonalRepaso.infrastructure.database.h2;

import com.todoHexagonal.hexagonalRepaso.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//IMPLEMENTAMOS EL JPA CON LA ENTIDAD CREDA EN ESTA CAPA
public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {

    //METODO
    Optional<ProductEntity> findProductById(Long id);
}
