/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.MenuDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.MenuDTO;

/**
 *
 * @author esteb
 */
public class MenuControlador {
    
    /**
     * 
     * @param id
     * @param descripcion
     * @param valor 
     */
    
    public void añadir(String id, String descripcion, String valor){
        
        if(id.equals("")||descripcion.equals("")||valor.equals("")){
            
            JOptionPane.showMessageDialog(null, "no se permiten campos vacios");
        }
        else{
            
            try {
               
                int cod=Integer.parseInt(id);
                int val=Integer.parseInt(valor);
                
                MenuDAO mnudao=new MenuDAO();
                MenuDTO mnudto=new  MenuDTO(cod, descripcion, val);
                mnudao.añadirmenu(mnudto);
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros en los campos id, valor ");
            }
            
        }
    }
    /**
     * 
     * @param id 
     */
    public void eliminar(String id){
        
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"no se permiten campos vacios en id");
        }
        else{
            try {
                int cod=Integer.parseInt(id);
                
                MenuDAO mnudao=new MenuDAO();
                MenuDTO mnudto=new  MenuDTO(cod);
                mnudao.eliminarmenu(mnudto);
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros  en id");
            }
        }
    }
    
    /**
     * 
     * @param id
     * @param descripcion
     * @param valor 
     */
    public void modificar(String id ,String descripcion, String valor){
        if(id.equals("")||descripcion.equals("")||valor.equals("")){
                                
            JOptionPane.showMessageDialog(null, "no se permiten campos vacios");
        }
        else{
            
            try {
               
                int cod=Integer.parseInt(id);
                int val=Integer.parseInt(valor);
                
                MenuDAO mnudao=new MenuDAO();
                MenuDTO mnudto=new  MenuDTO(cod, descripcion, val);
                mnudao.modificarmenu(mnudto);
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros en los campos id, valor ");
            }
            
        }
        
    }
    /**
     * 
     * @param id
     * @return Metodo que retorna un objeto de tipo MenuDTO
     */
    public MenuDTO buscar(String id){
        
        MenuDAO mnudao=new MenuDAO();
        int cod=0;
        if(id.equals("")){
           
            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en codigo");
        }
        else{
           
            if(mnudao.mostartodos().isEmpty()){
                
                JOptionPane.showMessageDialog(null, "no hay registros ");
                return null;
                
            }
            try {
                cod= Integer.parseInt(id);
                
                MenuDTO mnudto=new MenuDTO(cod);
                
                return mnudao.buscarmenu(mnudto);
                
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "solo se permiten numeros en codigo");
            }
        }
       return null; 
        
        
    }
    /**
     * 
     * @return Metodo que retorna un arraylist
     */
    public  ArrayList<MenuDTO>mostrartodos(){
       
        MenuDAO mnudao=new MenuDAO();
        
        mnudao.mostartodos();
        
        return mnudao.mostartodos();
    }
}
