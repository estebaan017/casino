/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.AdminDao;
import DAO.CajeroDAO;
import javax.swing.JOptionPane;
import modelo.AdminDTO;
import modelo.CajeroDTO;

/**
 *
 * @author esteb
 */
public class CajeroControlador {

    /**
     * 
     * @param rut
     * @param clave
     * @return Metodo que retorna un boolean
     */
    public boolean validarc(String rut, String clave) {

        if(rut.equals("")||clave.equals("")){
            
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
        }
        else{
            try {
                
            
            CajeroDAO cadao=new CajeroDAO();
            CajeroDTO cadto=new CajeroDTO(rut, clave);
            
            cadao.validar(cadto);
            
            if(cadao.validar(cadto).getRut().equals(rut)&&cadao.validar(cadto).getClave().equals(clave)){
                
                JOptionPane.showMessageDialog(null, "Bienvenido cajero");
                return true;
                
                
            }
            else{
            JOptionPane.showMessageDialog(null, "usuario y/o contraseña incorrectos");
            }
        } catch (NullPointerException ex) {
          return false;
        }
        }
       return false;
    }

}
