/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.AdminDTO;

/**
 *
 * @author esteb
 */
public class AdminDao {
    
    
  private static final String SQL_READ = "select rut,clave from administrador where rut=?";
    

 private static final Conexion conn = Conexion.saberestado();   
 /**
  * Metodo utilizado para obtener datos de una tabla dentro de la base de datos
  * @param c
  * @return Metodo que retorna un objeto de clase AdminDTO 
  */
public AdminDTO validarusuario(AdminDTO c){/*Metodo  que retorna  un objeto de tipo AdminDTO que permite buscar datos dentro de la tabla administrador en la base de datos */ 
            
        ResultSet res;  
        AdminDTO usDTO=null; 
        
        try {
            PreparedStatement ps;
            ps=conn.getConn().prepareStatement(SQL_READ);   
            ps.setString(1, c.getRut());
             res=ps.executeQuery(); 
            while(res.next()){  
            
                usDTO=new AdminDTO(res.getString(1), res.getString(2)); 
                
            
            }
                return usDTO; 
            
           
        } catch (SQLException ex) { 
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
}    
    
}
