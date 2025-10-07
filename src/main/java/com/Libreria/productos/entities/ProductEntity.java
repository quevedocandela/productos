package com.Libreria.productos.entities;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "productos")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombreProducto;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private double precioProducto;

    @Column(nullable = false)
    private int cantidadProducto;

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity product = (ProductEntity) o;
        return Double.compare(precioProducto, product.precioProducto) == 0
                && cantidadProducto == product.cantidadProducto
                && Objects.equals(id, product.id)
                && Objects.equals(nombreProducto, product.nombreProducto)
                && Objects.equals(descripcion, product.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreProducto, descripcion, precioProducto, cantidadProducto);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product: \n");
        sb.append("id: ").append(id).append('\n');
        sb.append("nombreProducto: ").append(nombreProducto).append('\n');
        sb.append("descripcion: ").append(descripcion).append('\n');
        sb.append("precioProducto: ").append(precioProducto).append('\n');
        sb.append("cantidadProducto: ").append(cantidadProducto).append('\n');
        return sb.toString();
    }
}








}
