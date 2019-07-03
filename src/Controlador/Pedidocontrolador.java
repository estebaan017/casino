/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.PedidoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.PedidoDTO;

/**
 *
 * @author esteb
 */
public class Pedidocontrolador {
    
    /**
     * 
     * @return Metodo que retorna un arraylist
     */

    public ArrayList<PedidoDTO> mostrarpedido() {

        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidoDAO.verpedido();

        return pedidoDAO.verpedido();
    }
    
    /**
     * 
     * @param id 
     */

    public void eliminarpeidos(String id) {

        int codp = 0;

        if (id.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en codigo");
        } else {
            try {
                codp = Integer.parseInt(id);

                PedidoDTO pedidodto = new PedidoDTO(codp);
                PedidoDAO pedidodao = new PedidoDAO();
                pedidodao.eliminarpedido(pedidodto);

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "solo se permiten numeros en el codigo");
            }
        }

    }
    /**
     * 
     * @param id
     * @return Metodo que retorna un objeto de tipo PedidoDTO
     */

    public PedidoDTO buscarpedido(String id) {

        PedidoDAO pedidodao = new PedidoDAO();
        int codp = 0;
        if (id.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios en codigo");
        } else {

            if (pedidodao.verpedido().isEmpty()) {

                JOptionPane.showMessageDialog(null, "no hay registros ");
                return null;

            }
            try {

                try {
                    codp = Integer.parseInt(id);

                    PedidoDTO pedidodto = new PedidoDTO(codp);

                    return pedidodao.buscarpedido(pedidodto);

                } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "no hay registros");
                
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "solo se permiten numeros en codigo");
            }
        }
        return null;
    }
    
    /**
     * 
     * @param id
     * @param descripcion
     * @param cantidad 
     */

    public void modificarpedido(String id, String descripcion, String cantidad) {

        int codp = 0;
        int cant = 0;

        if (id.equals("") || descripcion.equals("") || cantidad.equals("")) {

            JOptionPane.showMessageDialog(null, "no se permiten campos vacios");
        } else {
            try {

                codp = Integer.parseInt(id);
                cant = Integer.parseInt(cantidad);

                PedidoDAO pedidodao = new PedidoDAO();
                PedidoDTO pedidodto = new PedidoDTO(codp, descripcion, cant);
                pedidodao.modificarpedido(pedidodto);

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "solo se pemiten numeros en el campo  id y cantidad");
            }

        }
    }

}
