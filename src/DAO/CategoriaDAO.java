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
import modelo.CategoriaDTO;
import modelo.PromocionesDTO;

/**
 *
 * @author esteb
 */
public class CategoriaDAO {
    
    
    private static final String SQL_INSERT = "insert into categorias values(?,?,?,?)";
    private static final String SQL_DELETE = "delete from categorias where idCategorias=?; delete from promociones where idPromociones=?"; 
    private static final String SQL_UPDATE = "update categorias SET tipo_producto=? where idCategorias=?";
    private static final String SQL_READ = "select * from categorias where idCategorias=?";
    private static final String SQL_READALL = "select * from categorias";

    private static final Conexion conn = Conexion.saberestado();

    /**
     * 
     *  Metodo que inserta datos en la tabla categorias que se encuentra en la base de datos
     * @param c
     * @return Metodo que retorna un boolean
     */
    public boolean añadircategoria(CategoriaDTO c) {

            try {
            
        
        try {
                       
            PreparedStatement ps; 
            ps=conn.getConn().prepareStatement(SQL_INSERT);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getTipodeproducto());
            ps.setInt(3, c.getIdmenu());
            ps.setInt(4, c.getIdpromocion());
          
             
            
            if(ps.executeUpdate()>0){
              
                JOptionPane.showMessageDialog(null, "categoria añadida correctamente");
                return true;
            }
        } catch (MySQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "codigo ya existe");
        }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conn.cerrarconexion();
        }
         JOptionPane.showMessageDialog(null, "error al registrar");
        return false;
    }
    
    
    
    
    
/**
 * Metodo que permite eliminar datos dentro de la tabla categorias que se encuentra en la base de datos
 * @param c
 * @return Metodo que retorna un boolean 
 */
    public boolean eliminarcategoria(CategoriaDTO c) {
            
        try {
            PreparedStatement ps;
            ps=conn.getConn().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getId());
            
            if(ps.executeUpdate()>0){
                
                JOptionPane.showMessageDialog(null, "elminado correctamente");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,  "error al eliminar");
        return false;
    }
    
    
    
    
    
   /**
    * Metodo que modifica los datos dentro de la tabla categorias que se encuentraen la base de datos 
    * @param c
    * @return  Metodo que retorna un boolean
    */ 
    public boolean modificarcategoria(CategoriaDTO c){
        
        try {
            PreparedStatement ps;
            ps=conn.getConn().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getTipodeproducto());
            ps.setInt(2, c.getId());
            
            
            if(ps.executeUpdate()>0){
                
                JOptionPane.showMessageDialog(null, "modificado correctamente");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "error al modificar");
        return false;
    }
    
    
    
    
    /**
     * Metodo que permite buscar datos dentro de la tabla categorias de la base de datos
     * @param c
     * @return Metodo que retorna  un objeto de tipo CateogiriaDTO
     */
    public CategoriaDTO buscarcategoria(CategoriaDTO c){ 
        PreparedStatement ps;
        ResultSet res;
        CategoriaDTO cdto=null;
        try {
            
             
            ps=conn.getConn().prepareStatement(SQL_READ);
            ps.setInt(1, c.getId());
            
            res= ps.executeQuery();
            while (res.next()) {
               
                 cdto=new CategoriaDTO(res.getInt(1), res.getString(2), res.getInt(3), res.getInt(4));
                
            }
            return cdto;
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
            }
    
    
    /**
     * Metodo que almacena un objeto de tipo CategoriaDTO, y permite mostrar todos los datos de la tabla categorias que se encientra en la base de datos 
     * @return Metodo que retorna un ArrayList 
     */
    public ArrayList<CategoriaDTO>mostrartodos(){
        
         PreparedStatement ps;
            ResultSet res;
            ArrayList <CategoriaDTO>arr=new ArrayList();
        try {
            
            ps=conn.getConn().prepareStatement(SQL_READALL);
            res=ps.executeQuery();
            while (res.next()){
                
                arr.add(new CategoriaDTO(res.getInt(1), res.getString(2), res.getInt(3), res.getInt(4)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error vuelva a intentar");
        }finally{
            conn.cerrarconexion();
            
        }
        return arr;
    }

}
