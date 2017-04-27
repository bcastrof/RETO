/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventanas;

import com.clases.Trabajador;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bcastrof
 */
public class TrabajadoresUd extends javax.swing.JFrame {

    private DefaultTableModel trabajadores;
    private List<Trabajador> trabajador;
    private static String docI;

    //listar trabajadores
    private void listarTrabajadores() {
        trabajadores = (DefaultTableModel) jTable1.getModel();
        trabajador = Trabajador.listarTrabajadores();

        for (Trabajador t : trabajador) {
            trabajadores.insertRow(trabajadores.getRowCount(), new Object[]{t.getId(), t.getNombre(),
                t.getPrimerApellido(),t.getDni(), t.getCategoria(),
                t.getMovilEmpresa(),
                t.getIdCent()});
        }
    }

    private void filtrarTrabajador() {
        trabajadores.setRowCount(0);
        trabajadores = (DefaultTableModel) jTable1.getModel();
        trabajador = Trabajador.filtrarTrabajador(docI);
        for (Trabajador t : trabajador) {
            trabajadores.insertRow(trabajadores.getRowCount(), new Object[]{t.getId(), t.getNombre(),
                t.getPrimerApellido(), t.getCategoria(),
                t.getMovilEmpresa(),
                t.getIdCent()});
        }
    }

    public TrabajadoresUd() {
        initComponents();
        listarTrabajadores();
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
        uId = new javax.swing.JTextField();
        uNombre = new javax.swing.JTextField();
        uPrimerApellido = new javax.swing.JTextField();
        uSegundoApellido = new javax.swing.JTextField();
        uDni = new javax.swing.JTextField();
        uCategoria = new javax.swing.JTextField();
        uCalle = new javax.swing.JTextField();
        uNumero = new javax.swing.JTextField();
        uPiso = new javax.swing.JTextField();
        uMano = new javax.swing.JTextField();
        uCiudad = new javax.swing.JTextField();
        uCodigoPostal = new javax.swing.JTextField();
        uProvincia = new javax.swing.JTextField();
        uMovilEmpresa = new javax.swing.JTextField();
        uMovilPersonal = new javax.swing.JTextField();
        uSalario = new javax.swing.JTextField();
        uIdcent = new javax.swing.JTextField();
        uFechaNacimiento = new javax.swing.JTextField();
        uFiltro = new javax.swing.JTextField();
        bFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        uId.setPreferredSize(new java.awt.Dimension(50, 20));

        uNombre.setPreferredSize(new java.awt.Dimension(110, 20));

        uPrimerApellido.setPreferredSize(new java.awt.Dimension(110, 20));

        uSegundoApellido.setPreferredSize(new java.awt.Dimension(110, 20));

        uDni.setPreferredSize(new java.awt.Dimension(110, 20));

        uCategoria.setPreferredSize(new java.awt.Dimension(110, 20));

        uCalle.setPreferredSize(new java.awt.Dimension(110, 20));

        uNumero.setPreferredSize(new java.awt.Dimension(110, 20));

        uPiso.setPreferredSize(new java.awt.Dimension(110, 20));

        uMano.setPreferredSize(new java.awt.Dimension(110, 20));

        uCiudad.setPreferredSize(new java.awt.Dimension(110, 20));

        uCodigoPostal.setPreferredSize(new java.awt.Dimension(110, 20));

        uProvincia.setPreferredSize(new java.awt.Dimension(110, 20));

        uMovilEmpresa.setPreferredSize(new java.awt.Dimension(110, 20));

        uMovilPersonal.setPreferredSize(new java.awt.Dimension(110, 20));

        uSalario.setPreferredSize(new java.awt.Dimension(110, 20));

        uIdcent.setPreferredSize(new java.awt.Dimension(50, 20));

        uFechaNacimiento.setPreferredSize(new java.awt.Dimension(110, 20));

        uFiltro.setPreferredSize(new java.awt.Dimension(110, 20));
        uFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uFiltroActionPerformed(evt);
            }
        });

        bFiltrar.setText("FILTRAR");
        bFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uMovilPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uMano, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uMovilEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uIdcent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bFiltrar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFiltrar))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uIdcent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uMovilEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uMano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uMovilPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();

        //creo variables para rellenado del formulario (lo pasais todo pero todo a String)
        String idEmp = trabajador.get(index).getId().toString();
        String docI = trabajador.get(index).getDni();
        String name = trabajador.get(index).getNombre();
        String firstS = trabajador.get(index).getPrimerApellido();
        String secondS = trabajador.get(index).getSegundoApellido();
        String category = trabajador.get(index).getCategoria();
        String street = trabajador.get(index).getCalle();
        String number = trabajador.get(index).getNumero().toString();
        String floor = trabajador.get(index).getPiso().toString();
        String hand = trabajador.get(index).getMano();
        String city = trabajador.get(index).getCiudad();
        String postalCode = trabajador.get(index).getCodigoPostal().toString();
        String province = trabajador.get(index).getProvincia();
        String phoneCompany = trabajador.get(index).getMovilEmpresa().toString();
        String personalPhone = trabajador.get(index).getMovilPersonal().toString();
        String salary = trabajador.get(index).getSalario().toString();
        String bornDate = trabajador.get(index).getFechaNacimiento();
        String idCompany = trabajador.get(index).getIdCent().toString();

        //paso los valores a las cajas del formulario de detalle
        uId.setText(idEmp);
        uDni.setText(docI);
        uNombre.setText(name);
        uPrimerApellido.setText(firstS);
        uSegundoApellido.setText(secondS);
        uCategoria.setText(category);
        uCalle.setText(street);
        uNumero.setText(number);
        uPiso.setText(floor);
        uMano.setText(hand);
        uCiudad.setText(city);
        uCodigoPostal.setText(postalCode);
        uProvincia.setText(province);
        uMovilEmpresa.setText(phoneCompany);
        uMovilPersonal.setText(personalPhone);
        uSalario.setText(salary);
        uFechaNacimiento.setText(bornDate);
        uIdcent.setText(idCompany);
    }//GEN-LAST:event_jTable1MouseClicked

    private void bFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltrarActionPerformed
        docI = uFiltro.getText();
        
        filtrarTrabajador();
    }//GEN-LAST:event_bFiltrarActionPerformed

    private void uFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(TrabajadoresUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrabajadoresUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrabajadoresUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrabajadoresUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrabajadoresUd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFiltrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField uCalle;
    private javax.swing.JTextField uCategoria;
    private javax.swing.JTextField uCiudad;
    private javax.swing.JTextField uCodigoPostal;
    private javax.swing.JTextField uDni;
    private javax.swing.JTextField uFechaNacimiento;
    javax.swing.JTextField uFiltro;
    private javax.swing.JTextField uId;
    private javax.swing.JTextField uIdcent;
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
