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
public class MenuDTO {
    
    private int id;
    private String descripcion;
    private int valor;

    public MenuDTO() {
    }

    public MenuDTO(int id, String descripcion, int valor) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public MenuDTO(int id) {
        this.id = id;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
