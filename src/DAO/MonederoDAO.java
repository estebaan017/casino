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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.MonederoDTO;

/**
 *
 * @author esteb
 */
public class MonederoDAO {

    private static final String SQL_INSERT = "insert into monedero values(?,?)";
    private static final String SQL_READ = "select * from monedero where idMonedero=?";
    private static final String SQL_READALL = "select * from monedero";

    private static final Conexion conn = Conexion.saberestado();

    /**
     * Metodo que inserta datos dentro de la tabla Monedero que se encuentraen la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */
    public boolean añadirsaldo(MonederoDTO c) { 

        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_INSERT);
            ps.setInt(1, c.getRut());
            ps.setInt(2, c.getSaldo());
            

            if (ps.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "saldo añadido correctamente");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        JOptionPane.showMessageDialog(null, "no se ha podido añadir el saldo");
        return false;

    }
    /**
     * Metodo que busca datos dentro de la tabla Monedero que se encuentraen la base de datos
     * @param c
     * @return Metodo que retorna una clase MonederoDTO
     */

    public MonederoDTO buscaralumno(MonederoDTO c) {
        
        PreparedStatement ps;
        ResultSet res;
       MonederoDTO arrmdto=null;
      
        try {
            ps = conn.getConn().prepareStatement(SQL_READ);
            ps.setInt(1, c.getRut());
            res = ps.executeQuery();
            while (res.next()) {

               arrmdto=new MonederoDTO(res.getInt(1), res.getInt(2));

            }
            return arrmdto;

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }

        return null;

    }
    /**
     * Metodo que muestra todos los datos dentro de la tabla Monedero que se encuentraen la base de datos
     * @return Metodo que retorna un arraylist de tipo MonderoDTO
     */

    public ArrayList<MonederoDTO> mostrartodos() { 
        PreparedStatement ps;
            ResultSet res;
            ArrayList <MonederoDTO>arrm=new ArrayList();
        try {
            
            ps=conn.getConn().prepareStatement(SQL_READALL);
            res=ps.executeQuery();
            while (res.next()){
                
                arrm.add(new MonederoDTO(res.getInt(1), res.getInt(2)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error vuelva a intentar");
        }finally{
            conn.cerrarconexion();
            
        }
        return arrm;
    }
}
