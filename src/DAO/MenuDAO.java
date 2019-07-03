/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.MenuDTO;

/**
 *
 * @author esteb
 */
public class MenuDAO {

    private static final String SQL_INSERT = "insert into menu values(?,?,?)";
    private static final String SQL_DELETE = "delete from menu where idMenu=?";
    private static final String SQL_UPDATE = "update menu set descripcion=?, valor=? where idMenu=?";
    private static final String SQL_READ = "select * from menu where idMenu=?";
    private static final String SQL_READALL = "select * from menu";

    private static final Conexion conn = Conexion.saberestado();
    
    /**
     *  Metodo que inserta datos dentro de la tabla Menu que se encuentraen la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */

    public boolean añadirmenu(MenuDTO c) {  

        try {

            try {

                PreparedStatement ps;
                ps = conn.getConn().prepareStatement(SQL_INSERT);
                ps.setInt(1, c.getId());
                ps.setString(2, c.getDescripcion());
                ps.setInt(3, c.getValor());

                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "menu añadido correctamente");
                    return true;
                }
            } catch (MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "codigo ya existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        JOptionPane.showMessageDialog(null, "error al registrar");
        return false;
    }
    /**
     * /* Metodo que elimina los datos dentro de la tabla Menu que se encuentraen la base de datos 
     * @param c
     * @return Metodo que retorna un boolean
     */

    public boolean eliminarmenu(MenuDTO c) {

        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Menu Eliminado");
                return true;
            }

            return false;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "error al eliminar");
        return false;
    }
    /**
     * Metodo que modifica los datos dentro de la tabla Menu que se encuentraen la base de datos 
     * @param c
     * @return Metodo que retorna un boolean
     */

    public boolean modificarmenu(MenuDTO c) {

        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getDescripcion());
            ps.setInt(2, c.getValor());
            ps.setInt(3, c.getId());
            
            if (ps.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Menu modificado correctamente");
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }

        JOptionPane.showMessageDialog(null, "error al modificar");
        return false;
    }
    
    /**
     * Metodo que busca  datos dentro de la tabla Menu que se encuentraen la base de datos
     * @param c
     * @return Metodo que retorna una clase MenuDTO
     */
    public MenuDTO buscarmenu(MenuDTO c) {  

    PreparedStatement ps;
        ResultSet res;
        MenuDTO menudto = null;
        try {

            ps = conn.getConn().prepareStatement(SQL_READ);
            ps.setInt(1, c.getId());
            res = ps.executeQuery();

            while (res.next()) {
                menudto = new MenuDTO(res.getInt(1), res.getString(2), res.getInt(3));

            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        return menudto;

    }
    /**
     * Metodo que muestra los datos dentro de la tabla Menu que se encuentraen la base de datos
     * @return Metodo que retorna un arraylist de tipo MenuDTO
     */
    public ArrayList<MenuDTO> mostartodos() { 
        
        ArrayList<MenuDTO> arrmnu = new ArrayList<>();
        ResultSet res;
        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_READALL);
            res = ps.executeQuery();

            while (res.next()) {

                arrmnu.add(new MenuDTO(res.getInt(1), res.getString(2), res.getInt(3)));

            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        return arrmnu;
    }

}
