package com.Libreria.productos.entities;
import java.util.Objects;
import jakarta.persistence.*;


@Entity
@Table(name = "productos")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombreProducto;

    @Column(nullable = false)
    private String descripcionProducto;

    @Column(nullable = false)
    private double precioProducto;

    @Column(nullable = false)
    private int cantidadProducto;

    @Column(nullable = false)
    private String proveedor;

    @Column(nullable = false)
    private String rubro;

    @Column(nullable = false)
    private String categoria;

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

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity product = (ProductEntity) o;
        return Double.compare(precioProducto, product.precioProducto) == 0
                && cantidadProducto == product.cantidadProducto
                && Objects.equals(id, product.id)
                && Objects.equals(nombreProducto, product.nombreProducto)
                && Objects.equals(descripcionProducto, product.descripcionProducto)
                && Objects.equals(proveedor, product.proveedor)
                && Objects.equals(rubro, product.rubro)
                && Objects.equals(categoria, product.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreProducto, descripcionProducto, precioProducto, cantidadProducto);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product: \n");
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









