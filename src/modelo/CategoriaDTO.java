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
public class CategoriaDTO {
    
    
   private int id;
    private String tipodeproducto;
    private int idmenu;
    private int idpromocion;

    public CategoriaDTO() {
    }

    public CategoriaDTO(int id, String tipodeproducto) {
        this.id = id;
        this.tipodeproducto = tipodeproducto;
    }
    

    public CategoriaDTO(int id) {
        this.id = id;
    }
    

    public CategoriaDTO(int id, String tipodeproducto, int idmenu, int idpromocion) {
        this.id = id;
        this.tipodeproducto = tipodeproducto;
        this.idmenu = idmenu;
        this.idpromocion = idpromocion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipodeproducto() {
        return tipodeproducto;
    }

    public void setTipodeproducto(String tipodeproducto) {
        this.tipodeproducto = tipodeproducto;
    }

    public int getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(int idmenu) {
        this.idmenu = idmenu;
    }

    public int getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(int idpromocion) {
        this.idpromocion = idpromocion;
    }

    
}