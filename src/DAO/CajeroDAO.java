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
import modelo.CajeroDTO;

/**
 *
 * @author esteb
 */
public class CajeroDAO {

    
    private static final String SQL_READ = "select rut,clave from cajero where rut=?";  //variable que tiene la consulta correspondiente que se hara hacia la base de datos 
    

    private static final Conexion conn = Conexion.saberestado();    
    /**
     * Metodo utilizado para obtener informacion de una tabla de la base de datos  
     * @param c
     * @return Retorna un objeto de tipo CajeroDTO 
     */

    public CajeroDTO validar(CajeroDTO c) { /*Metodo  que retorna  un objeto de tipo CajeroDTO que permite buscar datos dentro de la tabla cajero en la base de datos */

        PreparedStatement  ps;
        ResultSet res;  
        CajeroDTO caDTO=null;   
        try {
            ps=conn.getConn().prepareStatement(SQL_READ);  
            ps.setString(1, c.getRut());
            res=ps.executeQuery();  
            
            while(res.next()){  
                
                caDTO=new CajeroDTO(res.getString(1), res.getString(2));    
            }
            return caDTO;   
            
        } catch (SQLException ex) { 
            Logger.getLogger(CajeroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

}
