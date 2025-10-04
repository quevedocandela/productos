package com.Libreria.productos.services;

//Logica del negocio + converciones

import com.Libreria.productos.dtos.ProductDto;
import com.Libreria.productos.entities.ProductEntity;
import com.Libreria.productos.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    // La C es de Create
    public ProductEntity createProductEntity(ProductDto productDto) {
        ProductEntity productEntity = getProductEntity(productDto);
        return productRepository.save(productEntity);
    }

    private static ProductEntity getProductEntity(ProductDto productDto) {
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

    // La R es para leer READ

    public List<ProductDto> getAllProductEntity(){
        return productRepository.findAll()
                .stream() //transforma una lista en un flujo y permite hacer cosas de un item a la vez
                .map(this::toResponse) // mapea cada uno de los productos con el metodo Response
                .toList(); // lo transforma en una lista
    }

    public Optional<ProductDto> getProductResponseById(Integer id){
        return productRepository.findById(id).map(this::toResponse); //lo que hace este metodo es encontrar por ID lo de la lista
    }

    private ProductDto toResponse(ProductEntity p ){
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

    //La U es para actualizar UPDATE

    ProductEntity.setNombreProducto(ProductDto.getNombreProducto());
    ProductEntity.setDescripcionProducto(ProductDto.getDescripcionProducto());
    ProductEntity.setPrecioProducto(ProductDto.getPrecioProducto());
    ProductEntity.setCantidadProducto(ProductDto.getCaantidadProducto());
    ProductEntity.setProveedor(ProductDto.getProveedor());
    ProductEntity.setRubro(ProductDto.getRubro());
    ProductEntity.setCategoria(ProductDto.getCategoria());

    return productRepository.save(ProductEntity);


    //La D es para borrar DELETE
    public void deleteProductEntity(Integer id){
        productRepository.deleteById(id);
    }
}
