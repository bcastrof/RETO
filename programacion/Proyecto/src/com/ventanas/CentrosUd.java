/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventanas;

import com.clases.Centro;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bcastrof
 */
public class CentrosUd extends javax.swing.JFrame {

    private static BigDecimal idCent;
    private static String name;
    private DefaultTableModel centros;
    private List<Centro> centro;

    private void listarCentros() {
        centros = (DefaultTableModel) jTable1.getModel();
        centro = Centro.listarCentros();
          
        //esto lo hacemos nosotros 
        /*for (Centro c : centro) {
            centros.insertRow(centros.getRowCount(), new Object[]{c.getIDcent(), c.getNombre(),
                c.getCalle(), c.getNumero(), c.getCiudad(), c.getCodigoPostal(), c.getProvincia(), c.getTelefonos()});
        }*/ 
        
        //esto es lo que el netbeans considera gonito
        centro.forEach((c) -> {
            centros.insertRow(centros.getRowCount(), new Object[]{c.getIDcent(), c.getNombre(),
                c.getCalle(), c.getNumero(), c.getCiudad(), c.getCodigoPostal(), c.getProvincia(), c.getTelefonos()});
        });

    }

    private void filtrarCentos() {
        centros.setRowCount(0);
        centros = (DefaultTableModel) jTable1.getModel();
        centro = Centro.filtrarcentCentros(name);
        //esto lo hacemos nosotros      
           /*for (Centro c : centro) {
            centros.insertRow(centros.getRowCount(), new Object[]{c.getIDcent(), c.getNombre(),
                c.getCalle(), c.getNumero(), c.getCiudad(), c.getCodigoPostal(), c.getProvincia(), c.getTelefonos()});
        }*/
       
        //esto es lo que el netbeans considera gonito   
        centro.forEach((c) -> {
            centros.insertRow(centros.getRowCount(), new Object[]{c.getIDcent(), c.getNombre(),
                c.getCalle(), c.getNumero(), c.getCiudad(), c.getCodigoPostal(), c.getProvincia(), c.getTelefonos()});
        });
    }

    public CentrosUd() {
        initComponents();
        listarCentros();
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
        jTable1 = new javax.swing.JTable();
        bname = new javax.swing.JTextField();
        filtrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listado = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        uNombre = new javax.swing.JTextField();
        uCalle = new javax.swing.JTextField();
        uCiudad = new javax.swing.JTextField();
        uCodigoPostal = new javax.swing.JTextField();
        uNumero = new javax.swing.JTextField();
        uProvincia = new javax.swing.JTextField();
        uTelefono = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listado, Actualizacion y Eliminación de Centros");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CALLE", "NUMERO", "CIUDAD", "CODIGO POSTAL", "PROVINCIA", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        filtrar.setText("filtrar");
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        listado.setText("LISTAR");
        listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoActionPerformed(evt);
            }
        });

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("DETALLE/EDICIÓN");

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(uProvincia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(uCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(uCalle, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(uNumero)
                                .addComponent(uCodigoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(modificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(filtrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listado)
                .addGap(64, 64, 64)
                .addComponent(eliminar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtrar)
                    .addComponent(jLabel1)
                    .addComponent(listado)
                    .addComponent(eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addComponent(uNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar))
                .addGap(0, 143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarActionPerformed
        // TODO add your handling code here:
        name = bname.getText();

        filtrarCentos();


    }//GEN-LAST:event_filtrarActionPerformed

    private void listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoActionPerformed
        centros.setRowCount(0);
        listarCentros();
    }//GEN-LAST:event_listadoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // mapeo los campos de la fila seleccionada
        int index = jTable1.getSelectedRow();
        centros = (DefaultTableModel) jTable1.getModel();
        String nombre = centros.getValueAt(index, 1).toString();
        String calle = centros.getValueAt(index, 2).toString();
        String numero = centros.getValueAt(index, 3).toString();
        String ciudad = centros.getValueAt(index, 4).toString();
        String codigoPostal = centros.getValueAt(index, 5).toString();
        String provincia = centros.getValueAt(index, 6).toString();
        String telefono = centros.getValueAt(index, 7).toString();

        //ñapa para recoger el id y pasarlo a BigDecimal si alguien lo sabe hacer mas simple que lo haga
        String cd = centros.getValueAt(index, 0).toString();
        //int dc=Integer.parseInt(cd);
        idCent = new BigDecimal(cd);

        //translado los valores del mapeo a los diferentes campos del formulario
        uNombre.setText(nombre);
        uCalle.setText(calle);
        uNumero.setText(numero);
        uCiudad.setText(ciudad);
        uCodigoPostal.setText(codigoPostal);
        uProvincia.setText(provincia);
        uTelefono.setText(telefono);
    }//GEN-LAST:event_jTable1MouseClicked

    public void limpiarFormulario() {
        uNombre.setText("");
        uCalle.setText("");
        uNumero.setText("");
        uCiudad.setText("");
        uCodigoPostal.setText("");
        uProvincia.setText("");
        uTelefono.setText("");
    }

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        //recojo los valores transladados para pasarlos al metodo modificarCentro
        String name = uNombre.getText();
        String street = uCalle.getText();
        // int number = Integer.parseInt(uNumero.getText());
        BigDecimal number = new BigDecimal(uNumero.getText());
        String city = uCiudad.getText();
        // int postalCode=Integer.parseInt(uCodigoPostal.getText());
        BigDecimal postalCode = new BigDecimal(uCodigoPostal.getText());
        String province = uProvincia.getText();
        //  int phoneNumber=Integer.parseInt(uTelefono.getText());
        BigDecimal phoneNumber = new BigDecimal(uTelefono.getText());

        //creo centro para pasar al metodo modificar.
        Centro centro = new Centro(name, street, number, city, postalCode, province, phoneNumber);

        boolean modifcar = centro.modificarCentro(idCent);

        if (modifcar) {
            JOptionPane.showMessageDialog(null, "Centro modificado correctamente", "Modificado", JOptionPane.INFORMATION_MESSAGE);
        }
        //limpio tabla
        centros.setRowCount(0);
        //cargo lista actualizada
        listarCentros();
        //limpio formulario
        limpiarFormulario();
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        Centro.bajaCenro(idCent);

        //limpio formulario
        limpiarFormulario();

        //limpio tabla 
        centros.setRowCount(0);

        //cargo lista de nuevo
        listarCentros();
    }//GEN-LAST:event_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CentrosUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentrosUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentrosUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentrosUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentrosUd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bname;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton filtrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton listado;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField uCalle;
    private javax.swing.JTextField uCiudad;
    private javax.swing.JTextField uCodigoPostal;
    private javax.swing.JTextField uNombre;
    private javax.swing.JTextField uNumero;
    private javax.swing.JTextField uProvincia;
    private javax.swing.JTextField uTelefono;
    // End of variables declaration//GEN-END:variables
}
