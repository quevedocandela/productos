package com.Libreria.productos.services;

import com.Libreria.productos.dtos.ProductDto;
import com.Libreria.productos.entities.ProductEntity;
import com.Libreria.productos.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    // The C (create) in CRUD
    public ProductEntity createProductEntity(ProductDto productDto) {
        ProductEntity productEntity = getProduct(productDto);
        return productRepository.save(productEntity);
    }

    private static ProductEntity getProduct(ProductDto productDto) {
        ProductEntity productEntity = new ProductEntity();

        productEntity.setNombreProducto(productDto.getNombreProducto());
        productEntity.setDescripcionProducto(productDto.getDescripcionProducto());
        productEntity.setPrecioProducto(productDto.getPrecioProducto());
        productEntity.setCantidadProducto(productDto.getCantidadProducto());
        productEntity.setProveedor(productDto.getProveedor());
        productEntity.setRubro(productDto.getRubro());
        productEntity.setCategoria(productDto.getCategoria());

        return productEntity;
    }

    // The R (read) in CRUD
    @Transactional(readOnly = true)
    public List<ProductDto> getAllProductEntity(){
        return productRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    @Transactional(readOnly = true)
    public Optional<ProductDto> getProductResponseById(Integer id){
        return productRepository.findById(id).map(this::toResponse);
    }

    private ProductDto toResponse(ProductEntity p){
        return new ProductDto(
                p.getId(),
                p.getNombreProducto(),
                p.getDescripcionProducto(),
                p.getPrecioProducto(),
                p.getCantidadProducto(),
                p.getProveedor(),
                p.getRubro(),
                p.getCategoria()
        );
    }

    // The U (update) in CRUD
    @Transactional
    public ProductEntity update(ProductDto productDto){
        if (productDto.getId() == null) {
            throw new IllegalArgumentException("El ID del producto no puede ser nulo");
        }

        ProductEntity productEntity = productRepository.findById(productDto.getId())
                .orElseThrow(() -> new EntityNotFoundException("Producto no encontrado con ID: " + productDto.getId()));

        productEntity.setNombreProducto(productDto.getNombreProducto());
        productEntity.setDescripcionProducto(productDto.getDescripcionProducto());
        productEntity.setPrecioProducto(productDto.getPrecioProducto());
        productEntity.setCantidadProducto(productDto.getCantidadProducto());
        productEntity.setProveedor(productDto.getProveedor());
        productEntity.setRubro(productDto.getRubro());
        productEntity.setCategoria(productDto.getCategoria());

        return productRepository.save(productEntity);
    }

    // The D (delete) in CRUD
    public void deleteProductEntity(Integer id){
        if (id == null) {
            throw new IllegalArgumentException("El ID del producto no puede ser nulo");
        }

        if(!productRepository.existsById(id)){
            throw new EntityNotFoundException("Producto no encontrado con ID: " + id);
        }

        productRepository.deleteById(id);
    }
}