package com.Libreria.productos.controllers;

//Maneja la interaccion con el usuario

import com.Libreria.productos.dtos.ProductDto;
import com.Libreria.productos.dtos.ProductResponseDto;
import com.Libreria.productos.entities.ProductEntity;
import com.Libreria.productos.services.ProductService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    // La C par crear
    @PostMapping("/crear")
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto) {
        ProductEntity created = productService.createProduct(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    // La R es parA Leer
    @GetMapping
    public List<ProductResponseDto> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDto> getProductById(@PathVariable Integer id) {
        return productService.getProductResponseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //La U es para actualizar
    @PatchMapping("/actualizar")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDto product) {
        ProductEntity updated = productService.updateProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(updated);
    }

    // La D es para borrar
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

}