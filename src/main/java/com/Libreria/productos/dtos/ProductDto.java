package com.Libreria.productos.dtos;

public class ProductDto {
    private Integer id;
    private String nombreProducto;
    private String descripcionProducto;
    private Double precioProducto;
    private Integer cantidadProducto;
    private String proveedor;
    private String rubro;
    private String categoria;

    public ProductDto(){
    }

    public ProductDto(Integer id, String nombreProducto, String descripcionProducto, Double precioProducto, Integer cantidadProducto, String proveedor, String rubro, String categoria){
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.proveedor = proveedor;
        this.rubro = rubro;
        this.categoria = categoria;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto(){
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto){
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioProducto(){
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto){
        this.precioProducto = precioProducto;
    }

    public Integer getCantidadProducto(){
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto){
        this.cantidadProducto = cantidadProducto;
    }

    public String getProveedor(){
        return proveedor;
    }

    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    }

    public String getRubro(){
        return rubro;
    }

    public void setRubro(String rubro){
        this.rubro = rubro;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
}