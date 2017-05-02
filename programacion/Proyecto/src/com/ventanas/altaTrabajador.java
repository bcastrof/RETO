/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventanas;

import com.clases.Trabajador;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author BCASTROF
 */
public class altaTrabajador extends javax.swing.JFrame {
     private static String category;
    /**
     * Creates new form altaTrabajador
     */
    public altaTrabajador() {
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

        uDni = new javax.swing.JTextField();
        uNombre = new javax.swing.JTextField();
        uPrimerApellido = new javax.swing.JTextField();
        uSegundoApellido = new javax.swing.JTextField();
        uCalle = new javax.swing.JTextField();
        uNumero = new javax.swing.JTextField();
        uPiso = new javax.swing.JTextField();
        uMano = new javax.swing.JTextField();
        uCiudad = new javax.swing.JTextField();
        uCodigoPostal = new javax.swing.JTextField();
        uIdCent = new javax.swing.JTextField();
        uProvincia = new javax.swing.JTextField();
        uMovilEmpresa = new javax.swing.JTextField();
        uMovilPersonal = new javax.swing.JTextField();
        uFechaNacimiento = new javax.swing.JTextField();
        altaTrabajador = new javax.swing.JButton();
        uCategoria = new javax.swing.JComboBox<>();
        uSalario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(50, 20));

        uDni.setMinimumSize(new java.awt.Dimension(97, 20));
        uDni.setPreferredSize(new java.awt.Dimension(97, 20));

        uNombre.setPreferredSize(new java.awt.Dimension(97, 20));

        uPrimerApellido.setPreferredSize(new java.awt.Dimension(97, 20));

        uSegundoApellido.setPreferredSize(new java.awt.Dimension(97, 20));

        uCalle.setPreferredSize(new java.awt.Dimension(97, 20));

        uNumero.setPreferredSize(new java.awt.Dimension(30, 20));

        uPiso.setMinimumSize(new java.awt.Dimension(30, 20));
        uPiso.setPreferredSize(new java.awt.Dimension(30, 20));

        uCodigoPostal.setPreferredSize(new java.awt.Dimension(30, 20));

        altaTrabajador.setText("ALTA");
        altaTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaTrabajadorActionPerformed(evt);
            }
        });

        uCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración", "Logistica" }));
        uCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uCategoriaMouseClicked(evt);
            }
        });

        uSalario.setPreferredSize(new java.awt.Dimension(65, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(uCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uDni, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uMano, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uCiudad)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uMovilEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uMovilPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uIdCent, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(altaTrabajador)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uMano, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uMovilEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uMovilPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uIdCent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaTrabajador)
                    .addComponent(uSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaTrabajadorActionPerformed
        // TODO add your handling code here:
        Trabajador t = new Trabajador();
        BigDecimal id = t.autoincremente();
        
        
        Trabajador s = new Trabajador();
        s.setId(id);
        String dci = uDni.getText();
        s.setDni(dci);
        String name = uNombre.getName();
        s.setNombre(name);
        String fSurname = uPrimerApellido.getText();
        s.setPrimerApellido(fSurname);
        String sSurname = uSegundoApellido.getName();
        s.setSegundoApellido(sSurname);
        
        String cat = category;
        s.setCategoria(category);
        
        String street = uCalle.getText(); 
        s.setCalle(street);
        BigDecimal number = new  BigDecimal(uNumero.getText());
        s.setNumero(number);
        BigDecimal flood = new BigDecimal(uPiso.getText());
        s.setPiso(flood);
        String hand = uMano.getText();
        s.setMano(hand);
        
        String city = uCiudad.getText();
        s.setCiudad(city);
        BigDecimal postalCode = new BigDecimal(uCodigoPostal.getText());
        s.setCodigoPostal(postalCode);
        String province = uProvincia.getText();
        s.setProvincia(province);

        BigDecimal companyPhone = new BigDecimal(uMovilEmpresa.getText());
        s.setMovilEmpresa(companyPhone);
        BigDecimal personalNumber = new BigDecimal(uMovilPersonal.getText());
        s.setMovilPersonal(personalNumber);
        BigDecimal salary = new BigDecimal(uSalario.getText());
        s.setSalario(salary);
        String bornDate = uFechaNacimiento.getText();
        s.setFechaNacimiento(bornDate);
        BigDecimal idcenter = new BigDecimal (uIdCent.getText());
        s.setIdCent(idcenter);
        
        boolean guardado = t.altaTrabajador11g();

        if (guardado) {
            //todo intentar poner este mensaje mas guapo
            JOptionPane.showMessageDialog(null, "Centro dado de alta correctamente", "Alta", JOptionPane.INFORMATION_MESSAGE);
        }

        //limpiarFormulario();
     
    }//GEN-LAST:event_altaTrabajadorActionPerformed

    private void uCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uCategoriaMouseClicked
        // TODO add your handling code here:
        int index = uCategoria.getSelectedIndex();
        if(index == 1){
            category="administracion";
        }else{
            category="logistica";
        }
           
    }//GEN-LAST:event_uCategoriaMouseClicked

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
            java.util.logging.Logger.getLogger(altaTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(altaTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(altaTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(altaTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new altaTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaTrabajador;
    private javax.swing.JTextField uCalle;
    private javax.swing.JComboBox<String> uCategoria;
    private javax.swing.JTextField uCiudad;
    private javax.swing.JTextField uCodigoPostal;
    private javax.swing.JTextField uDni;
    private javax.swing.JTextField uFechaNacimiento;
    private javax.swing.JTextField uIdCent;
    private javax.swing.JTextField uMano;
    private javax.swing.JTextField uMovilEmpresa;
    private javax.swing.JTextField uMovilPersonal;
    private javax.swing.JTextField uNombre;
    private javax.swing.JTextField uNumero;
    private javax.swing.JTextField uPiso;
    private javax.swing.JTextField uPrimerApellido;
    private javax.swing.JTextField uProvincia;
    private javax.swing.JTextField uSalario;
    private javax.swing.JTextField uSegundoApellido;
    // End of variables declaration//GEN-END:variables
}
