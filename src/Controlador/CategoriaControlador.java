/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.CategoriaDAO;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.CategoriaDTO;

/**
 *
 * @author esteb
 */
public class CategoriaControlador {
    
    /**
     * 
     * @param id
     * @param descripcioncat
     * @param idmenu
     * @param idpromocion 
     */

    public void registrarcategoria(String id, String descripcioncat, String idmenu,String idpromocion ) {

        if (id.equals("") || descripcioncat.equals("")||idmenu.equals("")||idpromocion.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios");

        } else {
            
                
            
            try {

                int cod = Integer.parseInt(id);
                int codmenu=Integer.parseInt(idmenu);
                int codpromocion=Integer.parseInt(idpromocion);
                
                CategoriaDAO catdao = new CategoriaDAO();
                CategoriaDTO catdto = new CategoriaDTO(cod, descripcioncat, codmenu, codpromocion);
                catdao.añadircategoria(catdto);
                
           
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros en codigo");
                
            }
            
        }
            

    }
    /**
     * 
     * @param id 
     */

    public void eliminarcategoria(String id) {

        if (id.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en id");

        } else {
            try {
                int cod = Integer.parseInt(id);
                CategoriaDAO catdao = new CategoriaDAO();
                CategoriaDTO catdto = new CategoriaDTO(cod);
                catdao.eliminarcategoria(catdto);

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Solo se permiten numeros en codigo");
            }
        }

    }
    /**
     * 
     * @param id
     * @return 
     */

    public CategoriaDTO buscarcategoria(String id) {
        
        CategoriaDAO catdao = new CategoriaDAO();
        if (id.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en codigo");
        } else {

            if (catdao.mostrartodos().isEmpty()) {

                JOptionPane.showMessageDialog(null, "no hay registros");
                return null;
            }
            try {
                
            
            try {

                int cod = Integer.parseInt(id);
                CategoriaDTO catdto = new CategoriaDTO(cod);
                return catdao.buscarcategoria(catdto);
                
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "no hay registros");
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "solo se permiten numeros en campo id");

            }

        }
        return null;
    }
    /**
     * 
     * @param id
     * @param descripcioncat 
     */
    
    public void modificarCategoria(String id, String descripcioncat){
        
        if (id.equals("") || descripcioncat.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en codigo y descripcion");

        } else {
            try {

                int cod = Integer.parseInt(id);
               
               
                

                CategoriaDAO catdao = new CategoriaDAO();
                CategoriaDTO catdto = new CategoriaDTO(cod, descripcioncat);
                catdao.modificarcategoria(catdto);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros en codigo");
            }
        }
        
    }
    /**
     * 
     * @return Metodo que retorna un arraylist 
     */
    public ArrayList<CategoriaDTO>mostrartodos(){
        
        CategoriaDAO catdao=new CategoriaDAO();
        catdao.mostrartodos();
        return catdao.mostrartodos();
    }

}
