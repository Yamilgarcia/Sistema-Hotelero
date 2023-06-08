/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Conexion.CRUDCliente;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.Cliente;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class PantallaClienteRegistro extends javax.swing.JFrame {

    /**
     * Creates new form PantallaClienteRegistro
     */
    public PantallaClienteRegistro() {
        initComponents();
        jTextFieldIDPersona.setEnabled(false);
        jTextFieldIDPersona.setVisible(false);
        jTextFieldIDCliente.setEnabled(false);
        jTextFieldIDCliente.setVisible(false);
        
        

        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelFondo, "src\\vistaimagen\\FondoHotel.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src\\vistaimagen\\hotel.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "src\\vistaimagen\\hotel icono.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel4, "src\\vistaimagen\\icons8_contacts_512px_1.png");
    }

    
    public void guardarCliente() {
        CRUDCliente cc = new CRUDCliente();
        Cliente cl = new Cliente(jFormattedTextFieldCedula.getText(),
                jTextFieldNombre1.getText(),
                jTextFieldNombre2.getText(),
                jTextFieldApellido1.getText(),
                jTextFieldApellido2.getText(),
                jTextFieldProcedencia.getText(),
                jFormattedTextFieldTelefono.getText());
        cc.Guardar(cl);

    }

    public void editarCliente() {

        CRUDCliente cc = new CRUDCliente();

        Cliente cl = new Cliente((jTextFieldProcedencia.getText()),
                Integer.parseInt(jTextFieldIDPersona.getText()),
                jFormattedTextFieldCedula.getText(),
                jTextFieldNombre1.getText(),
                jTextFieldNombre2.getText(),
                jTextFieldApellido1.getText(),
                jTextFieldApellido2.getText(),
                jFormattedTextFieldTelefono.getText());

        cc.ActualizarDatos(cl);

    }

    public void limpiar() {
        jTextFieldNombre1.setText("");
        jTextFieldNombre2.setText("");
        jTextFieldApellido1.setText("");
        jTextFieldApellido2.setText("");
        jFormattedTextFieldCedula.setText("");
        jTextFieldProcedencia.setText("");
        jFormattedTextFieldTelefono.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombregrandeHotel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonRegistrarClient = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jLabelSegundoNombre = new javax.swing.JLabel();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jLabelPrimerApellido = new javax.swing.JLabel();
        jTextFieldApellido2 = new javax.swing.JTextField();
        jLabelSegundoApellido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldProcedencia = new javax.swing.JTextField();
        jLabelPrimerApellido2 = new javax.swing.JLabel();
        jLabelPrimerApellido3 = new javax.swing.JLabel();
        jFormattedTextFieldCedula = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jTextFieldIDPersona = new javax.swing.JTextField();
        jTextFieldIDCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 94, 144));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombregrandeHotel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelNombregrandeHotel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombregrandeHotel.setText("Registro de clientes");
        jPanel1.add(jLabelNombregrandeHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 441, 60));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 300, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1765, 130));

        jPanel2.setBackground(new java.awt.Color(162, 179, 216));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabel1.setText("Nombre del Cliente");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 35, -1, -1));

        jButtonRegistrarClient.setBackground(new java.awt.Color(179, 140, 98));
        jButtonRegistrarClient.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistrarClient.setText("Registrar");
        jButtonRegistrarClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarClientActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegistrarClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 195, 50));

        jButtonActualizar.setBackground(new java.awt.Color(179, 140, 98));
        jButtonActualizar.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 195, 50));

        jTextFieldNombre1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 71, 200, 50));

        jTextFieldNombre2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextFieldNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 71, 200, 50));

        jLabelSegundoNombre.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelSegundoNombre.setText("Segundo Nombre");
        jPanel2.add(jLabelSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 35, -1, -1));

        jTextFieldApellido1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextFieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 207, 200, 50));

        jLabelPrimerApellido.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrimerApellido.setText("Primer Apellido");
        jPanel2.add(jLabelPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 171, -1, -1));

        jTextFieldApellido2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldApellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextFieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 207, 200, 50));

        jLabelSegundoApellido.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelSegundoApellido.setText("Segundo Apellido");
        jPanel2.add(jLabelSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 171, -1, -1));

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 35, 213, 235));

        jLabelCedula.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelCedula.setText("Cedula Cliente ");
        jPanel2.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 300, -1, -1));

        jTextFieldProcedencia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldProcedencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextFieldProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 330, 200, 50));

        jLabelPrimerApellido2.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrimerApellido2.setText("Procedencia");
        jPanel2.add(jLabelPrimerApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 294, -1, -1));

        jLabelPrimerApellido3.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrimerApellido3.setText("Telefono");
        jPanel2.add(jLabelPrimerApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 294, 91, -1));
        jPanel2.add(jFormattedTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 330, 200, 50));
        jPanel2.add(jFormattedTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 330, 200, 50));

        jTextFieldIDPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDPersonaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldIDPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 7, -1, -1));

        jTextFieldIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 7, -1, -1));

        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 60, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 860, 510));

        jLabelFondo.setText("Jlabelfondo");
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1730, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarClientActionPerformed

        CRUDCliente cl = new CRUDCliente();
        try {
            if ((jFormattedTextFieldCedula.getText().equals(""))
                    || (jTextFieldNombre1.getText().equals(""))
                    || (jTextFieldNombre2.getText().equals(""))
                    || (jTextFieldApellido1.getText().equals(""))
                    || (jTextFieldApellido2.getText().equals(""))
                    || (jTextFieldProcedencia.getText().equals(""))
                    || (jFormattedTextFieldTelefono.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");
            } else {
                guardarCliente();
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }


    }//GEN-LAST:event_jButtonRegistrarClientActionPerformed

    private void jTextFieldNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre1ActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try {
            if (jTextFieldIDPersona.getText().isEmpty()
                    || jFormattedTextFieldCedula.getText().isEmpty()
                    || jTextFieldNombre1.getText().isEmpty()
                    || jTextFieldNombre2.getText().isEmpty()
                    || jTextFieldApellido1.getText().isEmpty()
                    || jTextFieldApellido2.getText().isEmpty()
                    || jTextFieldProcedencia.getText().isEmpty()
                    || jFormattedTextFieldTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacíos");
            } else {
                editarCliente();
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                dispose();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextFieldIDPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDPersonaActionPerformed

    private void jTextFieldIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDClienteActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaClienteRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaClienteRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaClienteRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaClienteRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaClienteRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonActualizar;
    public static javax.swing.JButton jButtonRegistrarClient;
    public static javax.swing.JFormattedTextField jFormattedTextFieldCedula;
    public static javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombregrandeHotel;
    private javax.swing.JLabel jLabelPrimerApellido;
    private javax.swing.JLabel jLabelPrimerApellido2;
    private javax.swing.JLabel jLabelPrimerApellido3;
    private javax.swing.JLabel jLabelSegundoApellido;
    private javax.swing.JLabel jLabelSegundoNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField jTextFieldApellido1;
    public static javax.swing.JTextField jTextFieldApellido2;
    public static javax.swing.JTextField jTextFieldIDCliente;
    public static javax.swing.JTextField jTextFieldIDPersona;
    public static javax.swing.JTextField jTextFieldNombre1;
    public static javax.swing.JTextField jTextFieldNombre2;
    public static javax.swing.JTextField jTextFieldProcedencia;
    // End of variables declaration//GEN-END:variables
}
