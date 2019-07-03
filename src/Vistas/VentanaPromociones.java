/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.PromocionesControlador;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esteb
 */
public class VentanaPromociones extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaPromociones
     */
    public VentanaPromociones() {
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
        tabla7 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        añadirbtn = new javax.swing.JButton();
        eliminarbtn = new javax.swing.JButton();
        modificarbtn = new javax.swing.JButton();
        mostrartodos = new javax.swing.JButton();
        buscarbtn = new javax.swing.JButton();
        txtvalor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Promociones");

        tabla7.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla7);

        jLabel1.setText("id Promocion ");

        jLabel2.setText("Descripcion");

        añadirbtn.setBackground(new java.awt.Color(255, 0, 0));
        añadirbtn.setForeground(new java.awt.Color(255, 255, 255));
        añadirbtn.setText("Añadir menu");
        añadirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirbtnActionPerformed(evt);
            }
        });

        eliminarbtn.setBackground(new java.awt.Color(255, 0, 0));
        eliminarbtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarbtn.setText("Eliminar menu");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        modificarbtn.setBackground(new java.awt.Color(255, 0, 0));
        modificarbtn.setForeground(new java.awt.Color(255, 255, 255));
        modificarbtn.setText("Modificar menu");
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });

        mostrartodos.setBackground(new java.awt.Color(255, 0, 0));
        mostrartodos.setForeground(new java.awt.Color(255, 255, 255));
        mostrartodos.setText("Mostrar todos");
        mostrartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrartodosActionPerformed(evt);
            }
        });

        buscarbtn.setBackground(new java.awt.Color(255, 0, 0));
        buscarbtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarbtn.setText("Buscar menu");
        buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(buscarbtn)
                .addGap(68, 68, 68)
                .addComponent(mostrartodos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(añadirbtn)
                        .addGap(64, 64, 64)
                        .addComponent(eliminarbtn)
                        .addGap(39, 39, 39)
                        .addComponent(modificarbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid)
                            .addComponent(txtdescripcion)
                            .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirbtn)
                    .addComponent(eliminarbtn)
                    .addComponent(modificarbtn))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarbtn)
                    .addComponent(mostrartodos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirbtnActionPerformed
        PromocionesControlador promc=new PromocionesControlador();
        promc.añadir(txtid.getText(), txtdescripcion.getText(), txtvalor.getText());
    }//GEN-LAST:event_añadirbtnActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
        PromocionesControlador promc=new PromocionesControlador();
        promc.eliminar(txtid.getText());
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
       PromocionesControlador promc=new PromocionesControlador();
        promc.modificar(txtid.getText(), txtdescripcion.getText(), txtvalor.getText());
    }//GEN-LAST:event_modificarbtnActionPerformed

    private void mostrartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrartodosActionPerformed
        PromocionesControlador promc=new PromocionesControlador();
        t=new DefaultTableModel();
        tabla7.setModel(t);

        t.addColumn("id");
        t.addColumn("descripcion");
        t.addColumn("valor");
        for (int i = 0; i < promc.mostrartodos().size(); i++) {
            Object fila[]=new Object[4];

            fila[0]=promc.mostrartodos().get(i).getId();
            fila[1]=promc.mostrartodos().get(i).getDescripcion();
            fila[2]=promc.mostrartodos().get(i).getValor();
            t.addRow(fila);
        }

    }//GEN-LAST:event_mostrartodosActionPerformed

    private void buscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtnActionPerformed
        PromocionesControlador promc=new PromocionesControlador();
        txtdescripcion.setText(promc.buscar(txtid.getText()).getDescripcion());
        txtvalor.setText(promc.buscar(txtid.getText()).getValor()+"");
    }//GEN-LAST:event_buscarbtnActionPerformed

    DefaultTableModel t;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirbtn;
    private javax.swing.JButton buscarbtn;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JButton mostrartodos;
    private javax.swing.JTable tabla7;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}