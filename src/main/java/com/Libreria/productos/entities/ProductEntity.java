package com.Libreria.productos.entities;
//representa a las tablas de la base de datos
public class ProductEntity {
    private long id_producto;
    private String nombre_producto;
    private String descripcion_producto;
    private double precio_producto;
    private int cantidad_producto;

    //constructor vacio
    public ProductEntity(){}

    //constructor completo
    public ProductEntity(long Id_producto, String nombre_producto, String descripcion_producto, double precio_producto,int cantidad_producto){
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.precio_producto = precio_producto;
        this.cantidad_producto = cantidad_producto;
    }

    //getters
    public long getId_producto() {
        return id_producto;
    }

    public String getNombre_producto(){
        return nombre_producto;
    }

    public String getDescripcion_producto(){
        return descripcion_producto;
    }

    public double getPrecio_producto(){
        return precio_producto;
    }

    public int getCantidad_producto(){
        return cantidad_producto;
    }

    //setters
    public void setId_producto(long id_producto){
        this.id_producto = id_producto;
    }

    public void setNombre_producto(String nombre_producto){
        this.nombre_producto = nombre_producto;
    }

    public void setDescripcion_producto(String descripcion_producto){
        this.descripcion_producto = descripcion_producto;
    }

    public void setPrecio_producto(double precio_producto){
        this.precio_producto = precio_producto;
    }

    public void setCantidad_producto(int cantidad_producto){
        this.cantidad_producto = cantidad_producto;
    }
}
