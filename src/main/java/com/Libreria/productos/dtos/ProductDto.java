package com.Libreria.productos.dtos;

//La clase Dto es objeto para transferir datos entre capas

public class ProductDto {
    private Integer id_producto;
    private String nombre_producto;
    private String descripcion_producto;
    private Double precio_producto;
    private Integer cantidad_producto;
    private String proveedor;
    private String rubro;
    private String categoria;


    //getter
    public Integer getId_producto(){
        return id_producto;
    }

    public String getNombre_producto(){
        return nombre_producto;
    }

    public String getDescripcion_producto(){
        return descripcion_producto;
    }

    public Double getPrecio_producto(){
        return precio_producto;
    }

    public Integer getCantidad_producto(){
        return cantidad_producto;
    }

    public String getProveedor(){
        return proveedor;
    }

    public String getRubro(){
        return rubro;
    }

    public String getCategoria(){
        return categoria;
    }


    //setter
    public void setId_producto(Integer id_producto){
        this.id_producto = id_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public void setCantidad_producto(Integer cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}