/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.PromocionesDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.PromocionesDTO;

/**
 *
 * @author esteb
 */
public class PromocionesControlador {
    
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
                
                PromocionesDAO promodao=new PromocionesDAO();
                PromocionesDTO promodto=new  PromocionesDTO(cod, descripcion, val);
                promodao.añadirpromocion(promodto);
                
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
                
                PromocionesDAO promodao=new PromocionesDAO();
                PromocionesDTO promodto=new  PromocionesDTO(cod);
                promodao.eliminarpromocion(promodto);
                
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
                
                PromocionesDAO promodao=new PromocionesDAO();
                PromocionesDTO promodto=new  PromocionesDTO(cod, descripcion, val);
                promodao.modificarpeomocion(promodto);
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros en los campos id, valor ");
            }
            
        }
        
    }
    /**
     * 
     * @param id
     * @return Metodo que retorna un objeto de tipo PromocionesDTO
     */
    public PromocionesDTO buscar(String id){
        
        PromocionesDAO promodao=new PromocionesDAO();
        int cod=0;
        if(id.equals("")){
           
            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en codigo");
        }
        else{
           
            if(promodao.mostartodos().isEmpty()){
                
                JOptionPane.showMessageDialog(null, "no hay registros ");
                return null;
                
            }
            try {
                cod= Integer.parseInt(id);
                
                PromocionesDTO promodto=new PromocionesDTO(cod);
                
                return promodao.buscarpromocion(promodto);
                
                
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
    public  ArrayList<PromocionesDTO>mostrartodos(){
       
        PromocionesDAO promodao=new PromocionesDAO();
        
        promodao.mostartodos();
        
        return promodao.mostartodos();
    }
}
