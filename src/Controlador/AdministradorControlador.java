/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.AdminDao;
import javax.swing.JOptionPane;
import modelo.AdminDTO;

/**
 *
 * @author esteb
 */

public class AdministradorControlador {
    
    /**
     * 
     * @param rut
     * @param clave
     * @return Metodo que retorna un boolean
     */
    public boolean validar(String rut, String clave){
        
        if(rut.equals("")||clave.equals("")){
            
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
        }
        else{
            try {
                
            
            AdminDao usdao=new AdminDao();
            AdminDTO usdto=new AdminDTO(rut, clave);
            
            usdao.validarusuario(usdto);
            
            if(usdao.validarusuario(usdto).getRut().equals(rut)&&usdao.validarusuario(usdto).getClave().equals(clave)){
                
                JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                return true;
                
                
            }
            
        } catch (NullPointerException ex) {
          return false;
        }
        }
       return false;
        
    }
    
}
