/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Pedidocontrolador;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esteb
 */
public class Ventanacajero extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ventanacajero
     */
    public Ventanacajero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnbuscarpedido = new javax.swing.JButton();
        btnmodificarpedido = new javax.swing.JButton();
        btneliminarpedido = new javax.swing.JButton();
        btnverpedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        txtidpedido = new javax.swing.JTextField();
        txtdescripcionpedido = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Pedidos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbuscarpedido.setBackground(new java.awt.Color(255, 0, 0));
        btnbuscarpedido.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarpedido.setText("Buscar pedido");
        btnbuscarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarpedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscarpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        btnmodificarpedido.setBackground(new java.awt.Color(255, 0, 0));
        btnmodificarpedido.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificarpedido.setText("Modificar Pedido");
        btnmodificarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarpedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificarpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        btneliminarpedido.setBackground(new java.awt.Color(255, 0, 0));
        btneliminarpedido.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarpedido.setText("Eliminar pedido");
        btneliminarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarpedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminarpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        btnverpedido.setBackground(new java.awt.Color(255, 0, 0));
        btnverpedido.setForeground(new java.awt.Color(255, 255, 255));
        btnverpedido.setText("ver pedido  ");
        btnverpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverpedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnverpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 687, 91));
        getContentPane().add(txtidpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 90, -1));
        getContentPane().add(txtdescripcionpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 90, -1));
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 90, -1));

        jLabel2.setText("Descripciion pedido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel3.setText("Id pedido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnverpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverpedidoActionPerformed
        Pedidocontrolador pec=new Pedidocontrolador();
       t=new DefaultTableModel();
       tabla2.setModel(t);
       
       t.addColumn("Id pedido");
       t.addColumn("descripcion");
       t.addColumn("cantidad");
        for (int i = 0; i < pec.mostrarpedido().size(); i++) {
            
            Object fila[]=new Object[3];
            
            fila[0]=pec.mostrarpedido().get(i).getId();
            fila[1]=pec.mostrarpedido().get(i).getDescripcion();
            fila[2]=pec.mostrarpedido().get(i).getCantidad();
            t.addRow(fila);
        }
    }//GEN-LAST:event_btnverpedidoActionPerformed

    private void btnbuscarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarpedidoActionPerformed
      Pedidocontrolador pec=new Pedidocontrolador();
      
      
     txtdescripcionpedido.setText(pec.buscarpedido(txtidpedido.getText()).getDescripcion());
     txtcantidad.setText(pec.buscarpedido(txtidpedido.getText()).getCantidad()+"");
      
    }//GEN-LAST:event_btnbuscarpedidoActionPerformed

    private void btnmodificarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarpedidoActionPerformed
     Pedidocontrolador pec=new Pedidocontrolador();
     pec.modificarpedido(txtidpedido.getText(), txtdescripcionpedido.getText(), txtcantidad.getText());
    }//GEN-LAST:event_btnmodificarpedidoActionPerformed

    private void btneliminarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarpedidoActionPerformed
     Pedidocontrolador pec=new Pedidocontrolador();
     pec.eliminarpeidos(txtidpedido.getText());
    }//GEN-LAST:event_btneliminarpedidoActionPerformed

    DefaultTableModel t;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarpedido;
    private javax.swing.JButton btneliminarpedido;
    private javax.swing.JButton btnmodificarpedido;
    private javax.swing.JButton btnverpedido;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcionpedido;
    private javax.swing.JTextField txtidpedido;
    // End of variables declaration//GEN-END:variables
}
