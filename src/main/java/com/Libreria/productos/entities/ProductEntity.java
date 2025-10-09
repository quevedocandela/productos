package com.Libreria.productos.entities;

//La clase entities representa la tabla en la BD

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Objects;

@Entity
@Table(name = "productos")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombreProducto", nullable = false)
    private String nombreProducto;

    @Column(name = "descripcionProducto", nullable = false)
    private String descripcionProducto;

    @Column(name = "precioProducto", nullable = false)
    private Float precioProducto;

    @Column(name = "cantidadProducto", nullable = false)
    private Integer cantidadProducto;

    @Column(name = "proveedor", nullable = false)
    private String proveedor;

    @Column(name = "rubro", nullable = false)
    private String rubro;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    //Getters y Setters

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getDescripcionProducto(){
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Float getPrecioProducto(){
        return precioProducto;
    }

    public void setPrecioProducto(Float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getCantidadProducto(){
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getProveedor(){
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getRubro(){
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity productEntity = (ProductEntity) o;
        return Objects.equals(id, productEntity.id) &&
                Objects.equals(nombreProducto, productEntity.nombreProducto) &&
                Objects.equals(descripcionProducto, productEntity.descripcionProducto) &&
                Objects.equals(precioProducto, productEntity.precioProducto) &&
                Objects.equals(cantidadProducto, productEntity.cantidadProducto) &&
                Objects.equals(proveedor, productEntity.proveedor) &&
                Objects.equals(rubro, productEntity.rubro) &&
                Objects.equals(categoria, productEntity.categoria);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, nombreProducto, descripcionProducto, precioProducto,
                cantidadProducto, proveedor, rubro, categoria);
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("ProductEntity: \n");
        sb.append("id: ").append(id).append('\n');
        sb.append("nombreProducto: ").append(nombreProducto).append('\n');
        sb.append("descripcionProducto: ").append(descripcionProducto).append('\n');
        sb.append("precioProducto: ").append(precioProducto).append('\n');
        sb.append("cantidadProducto: ").append(cantidadProducto).append('\n');
        sb.append("proveedor: ").append(proveedor).append('\n');
        sb.append("rubro: ").append(rubro).append('\n');
        sb.append("categoria: ").append(categoria).append('\n');
        return sb.toString();
    }




}
