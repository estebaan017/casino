/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Productocontrolador;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esteb
 */
public class VentanaProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaProducto
     */
    public VentanaProducto() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfechaelaboracion = new javax.swing.JTextField();
        txtfechacaducidad = new javax.swing.JTextField();
        txtvalor = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        txtfechaproducto = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtidproducto = new javax.swing.JTextField();
        txtnombreproducto = new javax.swing.JTextField();
        añadirbtn = new javax.swing.JButton();
        buscarbtn = new javax.swing.JButton();
        modifcarbtn = new javax.swing.JButton();
        Mostrartodos = new javax.swing.JButton();
        eliminarbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtnombrecat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Producto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 750, 91));

        jLabel2.setText("id prudcto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 164, -1, -1));

        jLabel3.setText("descripcion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 194, -1, -1));

        jLabel4.setText("fecha producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 224, -1, -1));

        jLabel5.setText("stock");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 254, -1, -1));

        jLabel6.setText("valor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 284, -1, -1));

        jLabel7.setText("nombre producto");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 314, -1, -1));

        jLabel8.setText("fecha caducidad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 344, -1, -1));

        jLabel9.setText("fecha elaboracion");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 374, -1, -1));
        getContentPane().add(txtfechaelaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 374, 130, -1));
        getContentPane().add(txtfechacaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 344, 130, -1));
        getContentPane().add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 284, 130, -1));
        getContentPane().add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 254, 130, -1));
        getContentPane().add(txtfechaproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 224, 130, -1));
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 194, 130, -1));
        getContentPane().add(txtidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 164, 130, -1));
        getContentPane().add(txtnombreproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 314, 130, -1));

        añadirbtn.setBackground(new java.awt.Color(255, 0, 0));
        añadirbtn.setForeground(new java.awt.Color(255, 255, 255));
        añadirbtn.setText("Añadir ");
        añadirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirbtnActionPerformed(evt);
            }
        });
        getContentPane().add(añadirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        buscarbtn.setBackground(new java.awt.Color(255, 0, 0));
        buscarbtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarbtn.setText("Buscar");
        buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        modifcarbtn.setBackground(new java.awt.Color(255, 0, 0));
        modifcarbtn.setForeground(new java.awt.Color(255, 255, 255));
        modifcarbtn.setText("Modificar");
        modifcarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifcarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(modifcarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        Mostrartodos.setBackground(new java.awt.Color(255, 0, 0));
        Mostrartodos.setForeground(new java.awt.Color(255, 255, 255));
        Mostrartodos.setText("Mostrar todos");
        Mostrartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrartodosActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrartodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, -1, -1));

        eliminarbtn.setBackground(new java.awt.Color(255, 0, 0));
        eliminarbtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarbtn.setText("Eliminar");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        jLabel10.setText("Nombre categoria");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 407, -1, -1));
        getContentPane().add(txtnombrecat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 407, 130, -1));

        jLabel1.setText("Subir imagen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirbtnActionPerformed
        Productocontrolador pcd = new Productocontrolador();
        pcd.registrar(txtidproducto.getText(), txtdescripcion.getText(), txtfechaproducto.getText(), txtstock.getText(), txtvalor.getText(), txtnombreproducto.getText(), txtfechacaducidad.getText(), txtfechaelaboracion.getText(),txtnombrecat.getText());
        
        Productocontrolador pdc = new Productocontrolador();
        t = new DefaultTableModel();
        tabla1.setModel(t);

        t.addColumn("Id");
        t.addColumn("Descripcion");
        t.addColumn("Fecha de producto");
        t.addColumn("Stock");
        t.addColumn("Valor");
        t.addColumn("Nombre");
        t.addColumn("Fecha de caducidad");
        t.addColumn("Fecha de elaboracion");
        t.addColumn("nombre categoria");
        for (int i = 0; i < pdc.mostartodos().size(); i++) {

            Object fila[] = new Object[9];

            fila[0] = pdc.mostartodos().get(i).getId();
            fila[1] = pdc.mostartodos().get(i).getDescripcion();
            fila[2] = pdc.mostartodos().get(i).getFechaproducto();
            fila[3] = pdc.mostartodos().get(i).getStock();
            fila[4] = pdc.mostartodos().get(i).getPrecio();
            fila[5] = pdc.mostartodos().get(i).getNombre();
            fila[6] = pdc.mostartodos().get(i).getFechacaducidad();
            fila[7] = pdc.mostartodos().get(i).getFechaelaboracion();
            fila[8]=pdc.mostartodos().get(i).getNombrecategoria();
            t.addRow(fila);
        }
    }//GEN-LAST:event_añadirbtnActionPerformed

    private void buscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtnActionPerformed
        Productocontrolador pdc = new Productocontrolador();

        txtdescripcion.setText(pdc.buscar(txtidproducto.getText()).getDescripcion());
        txtfechaproducto.setText(pdc.buscar(txtidproducto.getText()).getFechaproducto());
        txtstock.setText(pdc.buscar(txtidproducto.getText()).getStock() + "");
        txtvalor.setText(pdc.buscar(txtidproducto.getText()).getPrecio() + "");
        txtnombreproducto.setText(pdc.buscar(txtidproducto.getText()).getNombre());
        txtfechacaducidad.setText(pdc.buscar(txtidproducto.getText()).getFechacaducidad());
        txtfechaelaboracion.setText(pdc.buscar(txtidproducto.getText()).getFechaelaboracion());
        txtnombrecat.setText(pdc.buscar(txtidproducto.getText()).getNombrecategoria());

    }//GEN-LAST:event_buscarbtnActionPerformed

    private void modifcarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifcarbtnActionPerformed
        Productocontrolador pdc = new Productocontrolador();
        pdc.modificar(txtidproducto.getText(), txtdescripcion.getText(), txtfechaproducto.getText(), txtstock.getText(), txtvalor.getText(), txtnombreproducto.getText(), txtfechacaducidad.getText(), txtfechaelaboracion.getText(),txtnombrecat.getText());
    }//GEN-LAST:event_modifcarbtnActionPerformed

    private void MostrartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrartodosActionPerformed
        Productocontrolador pdc = new Productocontrolador();
        t = new DefaultTableModel();
        tabla1.setModel(t);

        t.addColumn("Id");
        t.addColumn("Descripcion");
        t.addColumn("Fecha de producto");
        t.addColumn("Stock");
        t.addColumn("Valor");
        t.addColumn("Nombre");
        t.addColumn("Fecha de caducidad");
        t.addColumn("Fecha de elaboracion");
        t.addColumn("nombre categoria");
        for (int i = 0; i < pdc.mostartodos().size(); i++) {

            Object fila[] = new Object[9];

            fila[0] = pdc.mostartodos().get(i).getId();
            fila[1] = pdc.mostartodos().get(i).getDescripcion();
            fila[2] = pdc.mostartodos().get(i).getFechaproducto();
            fila[3] = pdc.mostartodos().get(i).getStock();
            fila[4] = pdc.mostartodos().get(i).getPrecio();
            fila[5] = pdc.mostartodos().get(i).getNombre();
            fila[6] = pdc.mostartodos().get(i).getFechacaducidad();
            fila[7] = pdc.mostartodos().get(i).getFechaelaboracion();
            fila[8]=pdc.mostartodos().get(i).getNombrecategoria();
            t.addRow(fila);
        }
    }//GEN-LAST:event_MostrartodosActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
        Productocontrolador pdc = new Productocontrolador();
        pdc.eliminar(txtidproducto.getText());
    }//GEN-LAST:event_eliminarbtnActionPerformed

DefaultTableModel t;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mostrartodos;
    private javax.swing.JButton añadirbtn;
    private javax.swing.JButton buscarbtn;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifcarbtn;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtfechacaducidad;
    private javax.swing.JTextField txtfechaelaboracion;
    private javax.swing.JTextField txtfechaproducto;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtnombrecat;
    private javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
