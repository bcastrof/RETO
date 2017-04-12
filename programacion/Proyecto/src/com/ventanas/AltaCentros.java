/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventanas;
import com.clases.Centro;
import com.clases.Administracion;
/**
 *
 * @author bcastrof
 */
public class AltaCentros extends javax.swing.JFrame {

    /**
     * Creates new form AltaCentros
     */
    public AltaCentros() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        codigoPostal = new javax.swing.JTextField();
        provincia = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        alta = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Centros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 20, -1, -1));

        jLabel2.setText("Calle");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 51, -1, -1));

        jLabel3.setText("Numero");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 87, -1, -1));

        jLabel4.setText("Ciudad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 125, -1, -1));

        jLabel5.setText("Codigo Postal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 163, -1, -1));

        jLabel6.setText("Provincia");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 201, -1, -1));

        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 239, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 17, 184, -1));
        getContentPane().add(calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 48, 184, -1));
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 84, 184, -1));
        getContentPane().add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 122, 184, -1));
        getContentPane().add(codigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 160, 184, -1));
        getContentPane().add(provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 198, 184, -1));
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 236, 184, -1));

        alta.setText("Alta");
        alta.setPreferredSize(new java.awt.Dimension(97, 23));
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });
        getContentPane().add(alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        limpiar.setText("Limpiar");
        limpiar.setPreferredSize(new java.awt.Dimension(97, 23));
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        volver.setText("Volver");
        volver.setPreferredSize(new java.awt.Dimension(97, 23));
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//ESTO FUNCIONA
    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        
       
        String name = nombre.getText();
        String street = calle.getText();
        int number = Integer.parseInt(numero.getText());
        String city = ciudad.getText();
        int postalCode = Integer.parseInt(codigoPostal.getText());
        String province = provincia.getText();
        int phone = Integer.parseInt(telefono.getText());
        Centro c = new Centro (name, street, number, city, postalCode, province, phone);
        c.gestionCentros();
        
    }//GEN-LAST:event_altaActionPerformed

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
            java.util.logging.Logger.getLogger(AltaCentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaCentros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField codigoPostal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField telefono;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
