package com.Libreria.productos.services;

import com.Libreria.productos.dtos.ProductDto;
import com.Libreria.productos.dtos.ProductResponseDto;
import com.Libreria.productos.entities.ProductEntity;
import com.Libreria.productos.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // La C de CREAR
    public ProductEntity createProduct(ProductDto productDto) throws  IllegalArgumentException {
        ProductEntity productEntity = new ProductEntity();

        productEntity.setNombreProducto(productDto.getNombreProducto());
        productEntity.setDescripcionProducto(productDto.getDescripcionProducto());
        productEntity.setPrecioProducto(productDto.getPrecioProducto());
        productEntity.setCantidadProducto(productDto.getCantidadProducto());
        productEntity.setProveedor(productDto.getProveedor());
        productEntity.setRubro(productDto.getRubro());
        productEntity.setCategoria(productDto.getCategoria());

        return productRepository.save(productEntity);
    }

    // La R de LEER
    @Transactional(readOnly = true)
    public List<ProductResponseDto> getAllProducts(){
        return productRepository.findAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<ProductResponseDto> getProductResponseById(Integer id){
        return productRepository.findById(id).map(this::toResponse);
    }

    private ProductResponseDto toResponse(ProductEntity p){
        return new ProductResponseDto(
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

    // La U es para ACTUALIZAR
    public ProductEntity updateProduct(ProductDto productDto) throws IllegalArgumentException, EntityNotFoundException{
        if (productDto.getId() == null) {
            throw new IllegalArgumentException("El ID no debe ser nulo.");
        }

        ProductEntity product = productRepository.findById(productDto.getId())
                .orElseThrow(()-> new EntityNotFoundException("Producto con ID: " + productDto.getId() + "no encontrado."));

        product.setNombreProducto(productDto.getNombreProducto());
        product.setDescripcionProducto(productDto.getDescripcionProducto());
        product.setPrecioProducto(productDto.getPrecioProducto());
        product.setCantidadProducto(productDto.getCantidadProducto());
        product.setProveedor(productDto.getProveedor());
        product.setRubro(productDto.getRubro());
        product.setCategoria(productDto.getCategoria());

        return productRepository.save(product);
    }

    // La D es para BORRAR
    public void deleteProduct(Integer id) throws IllegalArgumentException, EntityNotFoundException {
        if (id == null){
            throw new IllegalArgumentException("El ID del producto no debe ser nulo.");
        }

        if (!productRepository.existsById(id)){
            throw new EntityNotFoundException("Producto con ID: " + id + "no encontrado.");
        }

        productRepository.deleteById(id);
    }
}