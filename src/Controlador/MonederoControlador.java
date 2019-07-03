/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.MenuDAO;
import DAO.MonederoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.MonederoDTO;

/**
 *
 * @author esteb
 */
public class MonederoControlador {
    
    /**
     * 
     * @param rut
     * @param saldo 
     */
    
    public void añadirsaldo(String rut, String  saldo){
        
       if(rut.equals("")||saldo.equals("")){
            
            JOptionPane.showMessageDialog(null, "no se permiten campos vacios");
        }
        else{
            
            try {
               
                int cod=Integer.parseInt(rut);
                int val=Integer.parseInt(saldo);
                
                MonederoDAO monederodao=new MonederoDAO();
                MonederoDTO monederodto=new  MonederoDTO(cod, val);
                monederodao.añadirsaldo(monederodto);
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros en los campos rut, saldo ");
            }
            
        } 
    }
    /**
     * 
     * @param id
     * @return Metodo que retorna un objeto de clase MonederoDTO
     */
    public MonederoDTO buscar(String id){
        MonederoDAO monederoDAO=new MonederoDAO();
        int cod=0;
        if(id.equals("")){
           
            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en codigo");
        }
        else{
           
            if(monederoDAO.mostrartodos().isEmpty()){
                
                JOptionPane.showMessageDialog(null, "no hay registros ");
                return null;
                
            }
            try {
                try {
                    
                
                cod= Integer.parseInt(id);
                
                MonederoDTO monederodto=new MonederoDTO(cod);
                
                return monederoDAO.buscaralumno(monederodto);
                
                } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No hay registros ");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "solo se permiten numeros en codigo");
            }
        
    }
        return null;
    }

        /**
         * 
         * @return Metodo que retorna un Arraylist
         */
    
    public ArrayList<MonederoDTO>mostartodos(){
        
        MonederoDAO monederodao=new MonederoDAO();
        monederodao.mostrartodos();
        return monederodao.mostrartodos();
    }
    
}
