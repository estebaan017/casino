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
public class MonederoDTO {
    
    int rut;
    int saldo;

    public MonederoDTO() {
    }

    public MonederoDTO(int rut, int saldo) {
        this.rut = rut;
        this.saldo = saldo;
    }

    public MonederoDTO(int rut) {
        this.rut = rut;
    }
    

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
            
    
    
}
