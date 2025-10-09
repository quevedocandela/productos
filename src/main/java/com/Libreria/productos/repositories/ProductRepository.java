package com.Libreria.productos.repositories;

import com.Libreria.productos.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Acceso directo a la BD (CRUD)
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
