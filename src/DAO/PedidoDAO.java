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
import javax.xml.transform.Result;
import modelo.PedidoDTO;

/**
 *
 * @author Administrador
 */
public class PedidoDAO {

   
    private static final String SQL_DELETE = "delete from pedidos where idPedidos=?";
    private static final String SQL_UPDATE = "update pedidos set descripcion=?, cantidad=? where idPedidos=?";
    private static final String SQL_READ = "select * from pedidos where idPedidos=?";
    private static final String SQL_READALL = "select * from pedidos";

    private static final Conexion conn = Conexion.saberestado();
    
    /**
     * Metodo que muestra todos los datos dentro de la tabla Pedidos que se encuentra en la base de datos
     * @return Metodo que retorna un arraylist de tipo PedidoDTO
     */
  
    public ArrayList<PedidoDTO> verpedido() { 
        
        ArrayList<PedidoDTO> arrp = new ArrayList<>();
        ResultSet res;
        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_READALL);
            res = ps.executeQuery();

            while (res.next()) {

                arrp.add(new PedidoDTO(res.getInt(1), res.getString(2), res.getInt(3)));

            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        return arrp;
    }
        /**
         * Metodo que busca datos dentro de la tabla Pedidos que se encuentra en la base de datos
         * @param c
         * @return Metodo que retorna una clase de tipo PedidoDTO
         */
    public PedidoDTO buscarpedido(PedidoDTO c) {
        PreparedStatement ps;
        ResultSet res;
        PedidoDTO pedidodto = null;
        try {

            ps = conn.getConn().prepareStatement(SQL_READ);
            ps.setInt(1, c.getId());
            res = ps.executeQuery();

            while (res.next()) {
                pedidodto = new PedidoDTO(res.getInt(1), res.getString(2), res.getInt(3));

            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.cerrarconexion();
        }
        return pedidodto;
    }
    /**
     * Metodo que elimina datos dentro de la tabla Pedidos que se encuentraen la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */
    public boolean eliminarpedido(PedidoDTO c) {/*   */

        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Pedido Eliminado");
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
     * Metodo que modifica datos dentro de la tabla Pedidos que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */

    public boolean modificarpedido(PedidoDTO c) {

        try {
            PreparedStatement ps;
            ps = conn.getConn().prepareStatement(SQL_UPDATE);
            
            ps.setString(1, c.getDescripcion());
            ps.setInt(2, c.getCantidad());
            ps.setInt(3, c.getId());

            if (ps.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Pedido modificado correctamente");
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
}
