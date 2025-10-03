package com.Libreria.productos.repositories;

import com.Libreria.productos.entities.ProductEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    /*@EntityGraph(attributePaths = {"category"})
    @Query("select p from Product p")
    List<Product> findAllWithRefs();

    @EntityGraph(attributePaths = {"category"})
    Optional<Product> findById(Integer id);*/
}
