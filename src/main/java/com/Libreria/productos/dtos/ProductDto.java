package com.Libreria.productos.dtos;

//La clase Dto es objeto para transferir datos entre capas

public class ProductDto {
    private Integer id;
    private String nombreProducto;
    private String descripcionProducto;
    private Double precioProducto;
    private Integer cantidadProducto;
    private String proveedor;
    private String rubro;
    private String categoria;


    //getter
    public Integer getId(){
        return id;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public String getDescripcionProducto(){
        return descripcionProducto;
    }

    public Double getPrecioProducto(){
        return precioProducto;
    }

    public Integer getCantidadProducto(){
        return cantidadProducto;
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
    public void setId(Integer id){
        this.id = id;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
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