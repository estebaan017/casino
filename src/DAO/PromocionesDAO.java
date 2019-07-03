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
import modelo.PromocionesDTO;

/**
 *
 * @author esteb
 */
public class PromocionesDAO {
    
    private static final String SQL_INSERT = "insert into promociones values(?,?,?)";
    private static final String SQL_DELETE = "delete from promociones where idPromociones=?";
    private static final String SQL_UPDATE = "update promociones set descripcion=?, valor=? where idPromociones=?";
    private static final String SQL_READ = "select * from promociones where idPromociones=?";
    private static final String SQL_READALL = "select * from promociones";

    private static final Conexion conn = Conexion.saberestado();
    
    /**
     * Metodo que inserta datos dentro de la tabla Promociones que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */

    public boolean añadirpromocion(PromocionesDTO c) {/*   */

        try {

            try {

                PreparedStatement ps;
                ps = conn.getConn().prepareStatement(SQL_INSERT);
                ps.setInt(1, c.getId());
                ps.setString(2, c.getDescripcion());
                ps.setInt(3, c.getValor());

                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "promocion añadida correctamente");
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
     * Metodo que elimina datos dentro de la tabla Promociones que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */
    public boolean eliminarpromocion(PromocionesDTO c) {
        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Promocion Eliminada");
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
     * Metodo que modifica datos dentro de la tabla Promociones que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */

    public boolean modificarpeomocion(PromocionesDTO c) {

        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getDescripcion());
            ps.setInt(2, c.getValor());
            ps.setInt(3, c.getId());
            
            if (ps.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Promocion modificada correctamente");
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
     * Metodo que busca datos dentro de la tabla Promociones que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un objeto de tipo PromocionesDTO
     */

    public PromocionesDTO buscarpromocion(PromocionesDTO c) {

    PreparedStatement ps;
        ResultSet res;
        PromocionesDTO promodto = null;
        try {

            ps = conn.getConn().prepareStatement(SQL_READ);
            ps.setInt(1, c.getId());
            res = ps.executeQuery();

            while (res.next()) {
                promodto = new PromocionesDTO(res.getInt(1), res.getString(2), res.getInt(3));

            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        return promodto;

    }
    /**
     * Metodo que muestra todos los datos dentro de la tabla Promociones que se encuentra en la base de datos
     * @return Metodo que retorna un arraylist
     */
    public ArrayList<PromocionesDTO> mostartodos() {
        
        ArrayList<PromocionesDTO> arrpromo = new ArrayList<>();
        ResultSet res;
        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_READALL);
            res = ps.executeQuery();

            while (res.next()) {

                arrpromo.add(new PromocionesDTO(res.getInt(1), res.getString(2), res.getInt(3)));

            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        return arrpromo;
    }
}
