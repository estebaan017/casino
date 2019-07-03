/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class AdminDTO {
String rut;
String nombre;
String clave;

    public AdminDTO() {
    }

    public AdminDTO(String rut, String nombre, String clave) {
        this.rut = rut;
        this.nombre = nombre;
        this.clave = clave;
    }

    public AdminDTO(String rut, String clave) {
        this.rut = rut;
        this.clave = clave;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }



}