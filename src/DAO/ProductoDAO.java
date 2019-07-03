/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ProductoDTO;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.sun.org.glassfish.gmbal.ParameterNames;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.mysql.jdbc.MysqlDataTruncation;

/**
 *
 * @author esteb
 */
public class ProductoDAO {

    private static final String SQL_INSERT = "insert into producto values(?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "delete from producto where idProducto=?";
    private static final String SQL_UPDATE = "update producto SET descripcion=?,FechaDeProducto=?,stock=?,valor=?,nombre=?,FechaDeCaducidad=?,FechaDeElaboracion=?,nombre_categoria=?where idProducto=?";
    private static final String SQL_READ = "select * from producto where idProducto=?";
    private static final String SQL_READALL = "select * from producto";

    private static final Conexion conn = Conexion.saberestado();
    
    /**
     *  Metodo que inserta datos dentro de la tabla Producto que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */
    public boolean añadirproducto(ProductoDTO c) {/* */
        try {

            try {
                try {
                    PreparedStatement ps;
                    ps = conn.getConn().prepareStatement(SQL_INSERT);
                    ps.setInt(1, c.getId());
                    ps.setString(2, c.getDescripcion());
                    ps.setString(3, c.getFechaproducto());
                    ps.setInt(4, c.getStock());
                    ps.setInt(5, c.getPrecio());
                    ps.setString(6, c.getNombre());
                    ps.setString(7, c.getFechacaducidad());
                    ps.setString(8, c.getFechaelaboracion());
                    ps.setString(9, c.getNombrecategoria());

                    if (ps.executeUpdate() > 0) {

                        JOptionPane.showMessageDialog(null, "Producto registrado correctamente");
                        return true;
                    }
                } catch (MysqlDataTruncation ef) {
                        JOptionPane.showMessageDialog(null, "Formato de fecha debe ser MM/DD/AAAA");
                }

            } catch (MySQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "codigo ya existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        JOptionPane.showMessageDialog(null, "no se ha podido registrar");
        return false;

    }
    /**
     * Metodo que modifica datos dentro de la tabla Producto que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */

    public boolean modificarproducto(ProductoDTO c) {

        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getDescripcion());
            ps.setString(2, c.getFechaproducto());
            ps.setInt(3, c.getStock());
            ps.setInt(4, c.getPrecio());
            ps.setString(5, c.getNombre());
            ps.setString(6, c.getFechacaducidad());
            ps.setString(7, c.getFechaelaboracion());
            ps.setString(8, c.getNombrecategoria());
            ps.setInt(9, c.getId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Modificado correctamente");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            conn.cerrarconexion();
        }
        JOptionPane.showMessageDialog(null, "no se ha podido modificar");
        return false;
    }
    /**
     * Metodo que elimina datos dentro de la tabla Producto que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */
    public boolean eliminarproducto(ProductoDTO c) {
        
        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getId());

            if (ps.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Prudcto eliminado exitosamente");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        JOptionPane.showMessageDialog(null, "No se ha podido registrar");
        return false;

    }
    /**
     * Metodo que busca datos dentro de la tabla Producto que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna una clase de tipo ProductoDTO
     */

    public ProductoDTO buscarproducto(ProductoDTO c) {
        PreparedStatement ps;
        ResultSet res;
        ProductoDTO arrpdto = null;

        try {
            ps = conn.getConn().prepareStatement(SQL_READ);
            ps.setInt(1, c.getId());
            res = ps.executeQuery();
            while (res.next()) {

                arrpdto = new ProductoDTO(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4), res.getInt(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9));

            }
            return arrpdto;

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }

        return null;
    }
    /**
     * Metodo que muestra todos los datos dentro de la tabla Producto que se encuentra en la base de datos
     * @return Metodo que retorna un arraylist de tipo ProductoDTO
     */
    public ArrayList<ProductoDTO> mostrartodos() {


        PreparedStatement ps;
        ResultSet res;
        ArrayList<ProductoDTO> arr = new ArrayList();
        try {

            ps = conn.getConn().prepareStatement(SQL_READALL);
            res = ps.executeQuery();
            while (res.next()) {

                arr.add(new ProductoDTO(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4), res.getInt(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error vuelva a intentar");
        } finally {
            conn.cerrarconexion();

        }
        return arr;

    }

}
