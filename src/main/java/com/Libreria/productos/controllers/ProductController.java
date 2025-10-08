package com.Libreria.productos.controllers;

import com.Libreria.productos.dtos.ProductDto;
import com.Libreria.productos.entities.ProductEntity;
import com.Libreria.productos.services.ProductService;
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
    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto){
        ProductEntity created = productService.createProductEntity(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping
    public List<ProductDto> getAllProductEntity(){
        return productService.getAllProductEntity();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Integer id){
        return productService.getProductResponseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/update")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDto product){
        ProductDto update = productService.updateProductDto(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }


}
