/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ProductoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ProductoDTO;

/**
 *
 * @author esteb
 */
public class Productocontrolador {
    
    /**
     * 
     * @param id
     * @param descripcion
     * @param fechaproducto
     * @param stock
     * @param valor
     * @param nombre
     * @param fechacaducidad
     * @param fechaelaboracion
     * @param nombrecat 
     */

    public void registrar(String id, String descripcion, String fechaproducto, String stock, String valor, String nombre, String fechacaducidad, String fechaelaboracion , String nombrecat) {

        int cod = 0;
        int st = 0;
        int pre = 0;

        if (id.equals("") || descripcion.equals("") || fechaproducto.equals("") || stock.equals("") || valor.equals("") || nombre.equals("") || fechacaducidad.equals("") || fechaelaboracion.equals("")||nombrecat.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios");
        } else {
            try {
                cod = Integer.parseInt(id);
                st = Integer.parseInt(stock);
                pre = Integer.parseInt(valor);
                ProductoDTO pdto = new ProductoDTO(cod, descripcion, fechaproducto, st, pre, nombre, fechacaducidad, fechaelaboracion,nombrecat);
                ProductoDAO pdao = new ProductoDAO();
                pdao.añadirproducto(pdto);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "solo se permiten numeros en los campos id.stock,precio");
            }
        }

    }
    /**
     * 
     * @param id 
     */
    public void eliminar(String id) {
        int cod = 0;
        if (id.equals("")) {

            JOptionPane.showMessageDialog(null, "Para eliminar debe completar el campo id");
        } else {
            try {

                cod = Integer.parseInt(id);
                ProductoDTO pdto = new ProductoDTO(cod);
                ProductoDAO pdao = new ProductoDAO();
                pdao.eliminarproducto(pdto);

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "solo se permiten numeros en el campos id");
            }
        }
    }
    /**
     * 
     * @param id
     * @param descripcion
     * @param fechaproducto
     * @param stock
     * @param valor
     * @param nombre
     * @param fechacaducidad
     * @param fechaelaboracion
     * @param nombrecat 
     */
    public void modificar(String id, String descripcion, String fechaproducto, String stock, String valor, String nombre, String fechacaducidad, String fechaelaboracion,String nombrecat) {

        int st = 0;
        int pre = 0;
        int cod = 0;
        if (descripcion.equals("") || fechaproducto.equals("") || stock.equals("") || valor.equals("") || nombre.equals("") || fechacaducidad.equals("") || fechaelaboracion.equals("")||nombrecat.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios");
        } else {
            try {

                st = Integer.parseInt(stock);
                pre = Integer.parseInt(valor);
                cod = Integer.parseInt(id);
                ProductoDTO pdto = new ProductoDTO(cod, descripcion, fechaproducto, st, pre, nombre, fechacaducidad, fechaelaboracion ,nombrecat);
                ProductoDAO pdao = new ProductoDAO();
                pdao.modificarproducto(pdto);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "solo se permiten numeros en los campos id,stock,precio");
            }

        }

    }
    /**
     * 
     * @param id
     * @return Metodo que retorna un objeto de tipo ProductoDTO 
     */
    public ProductoDTO buscar(String id) {

        ProductoDAO pdao = new ProductoDAO();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en codigo");
        } else {
            if (pdao.mostrartodos().isEmpty()) {
                JOptionPane.showMessageDialog(null, "no hay registros");
                return null;
            }
            try {

                try {

                    int cod = Integer.parseInt(id);
                    ProductoDTO pdto = new ProductoDTO(cod);

                    return pdao.buscarproducto(pdto);

                } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "no hay registros");
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "solo se permiten numeros en el campo codigo");
            }

        }
        return null;
    }
    
    /**
     * 
     * @return Metodo que retorna un arrayList
     */
    
    public ArrayList<ProductoDTO> mostartodos() {

        ProductoDAO pDAO = new ProductoDAO();
        pDAO.mostrartodos();

        return pDAO.mostrartodos();
    }

}
