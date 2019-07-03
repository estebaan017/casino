/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author esteb
 */
public class ProductoDTO {
    
    int id;
    String descripcion;
    String fechaproducto;
    int stock;
    int precio;
    String nombre;
    String fechacaducidad;
    String fechaelaboracion;
    String nombrecategoria;

    public ProductoDTO() {
    }

    public ProductoDTO(int id) {
        this.id = id;
    }

    public ProductoDTO(int id, String descripcion, String fechaproducto, int stock, int precio, String nombre, String fechacaducidad, String fechaelaboracion, String nombrecategoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaproducto = fechaproducto;
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
        this.fechacaducidad = fechacaducidad;
        this.fechaelaboracion = fechaelaboracion;
        this.nombrecategoria = nombrecategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaproducto() {
        return fechaproducto;
    }

    public void setFechaproducto(String fechaproducto) {
        this.fechaproducto = fechaproducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public String getFechaelaboracion() {
        return fechaelaboracion;
    }

    public void setFechaelaboracion(String fechaelaboracion) {
        this.fechaelaboracion = fechaelaboracion;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    
   

    
    
    
    
    
}
