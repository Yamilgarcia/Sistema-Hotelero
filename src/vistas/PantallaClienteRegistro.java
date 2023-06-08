/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Conexion.CRUDCliente;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
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
    }

    public void guardarCliente() {
        CRUDCliente cc = new CRUDCliente();
        Cliente cl = new Cliente(jtextCedula.getText(),
                jTextNombre1.getText(),
                jTextNombre2.getText(),
                jTextApellido1.getText(),
                jTextApellido2.getText(),
                jTextFieldProcedencia.getText(),
                jtextTelefono.getText());
        cc.Guardar(cl);

    }

    public void editarCliente() {

        CRUDCliente cc = new CRUDCliente();

        Cliente cl = new Cliente((jTextFieldProcedencia.getText()),
                Integer.parseInt(jTextFieldIDPersona.getText()),
                jtextCedula.getText(),
                jTextNombre1.getText(),
                jTextNombre2.getText(),
                jTextApellido1.getText(),
                jTextApellido2.getText(),
                jtextTelefono.getText());
        cc.ActualizarDatos(cl);

    }

    public void limpiar() {
        jTextNombre1.setText("");
        jTextNombre2.setText("");
        jTextApellido1.setText("");
        jTextApellido2.setText("");
        jtextCedula.setText("");
        jTextFieldProcedencia.setText("");
        jtextTelefono.setText("");

    }
    
    private void TypedText(java.awt.event.KeyEvent evt){
            char car = evt.getKeyChar();
       if ((car < 'a'||car >'z')&& (car < 'A'|| car > 'Z')
           && car != 'á' //Minúsculas
           && car != 'é'
           && car != 'í' 
           && car != 'ó'  
           && car != 'ú'
           && car != 'Á' //Mayúsculas
           && car != 'É'
           && car != 'Í'
           && car != 'Ó'
           && car != 'Ú'
           && car != 'Ü'
           && car != 'ü'
           && car != 'Ñ'
           && car != 'ñ'
           && (car  != (char) KeyEvent.VK_SPACE)) {
        evt.consume();
        }
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
        jButtonRegistrarCliente = new javax.swing.JButton();
        jTextNombre1 = new javax.swing.JTextField();
        jTextNombre2 = new javax.swing.JTextField();
        jLabelSegundoNombre = new javax.swing.JLabel();
        jTextApellido1 = new javax.swing.JTextField();
        jLabelPrimerApellido = new javax.swing.JLabel();
        jTextApellido2 = new javax.swing.JTextField();
        jLabelSegundoApellido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldProcedencia = new javax.swing.JTextField();
        jLabelPrimerApellido2 = new javax.swing.JLabel();
        jLabelPrimerApellido3 = new javax.swing.JLabel();
        jtextCedula = new javax.swing.JFormattedTextField();
        jtextTelefono = new javax.swing.JFormattedTextField();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldIDPersona = new javax.swing.JTextField();
        jTextFieldIDCliente = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabel1.setText("Nombre del Cliente");

        jButtonRegistrarCliente.setBackground(new java.awt.Color(179, 140, 98));
        jButtonRegistrarCliente.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistrarCliente.setText("Registrar");
        jButtonRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarClienteActionPerformed(evt);
            }
        });

        jTextNombre1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombre1ActionPerformed(evt);
            }
        });
        jTextNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombre1KeyTyped(evt);
            }
        });

        jTextNombre2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombre2KeyTyped(evt);
            }
        });

        jLabelSegundoNombre.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelSegundoNombre.setText("Segundo Nombre");

        jTextApellido1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellido1KeyTyped(evt);
            }
        });

        jLabelPrimerApellido.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrimerApellido.setText("Primer Apellido");

        jTextApellido2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextApellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextApellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellido2KeyTyped(evt);
            }
        });

        jLabelSegundoApellido.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelSegundoApellido.setText("Segundo Apellido");

        jLabel2.setText("jLabel2");

        jLabelCedula.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelCedula.setText("Cedula Cliente ");

        jTextFieldProcedencia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldProcedencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldProcedencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProcedenciaKeyTyped(evt);
            }
        });

        jLabelPrimerApellido2.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrimerApellido2.setText("Procedencia");

        jLabelPrimerApellido3.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrimerApellido3.setText("Telefono");

        try {
            jtextCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtextTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonActualizar.setBackground(new java.awt.Color(179, 140, 98));
        jButtonActualizar.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTextFieldIDPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDPersonaActionPerformed(evt);
            }
        });

        jTextFieldIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrimerApellido)
                    .addComponent(jTextApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCedula)
                    .addComponent(jLabel1)
                    .addComponent(jtextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelPrimerApellido2)
                        .addGap(54, 54, 54)))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSegundoNombre)
                    .addComponent(jTextNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSegundoApellido)
                    .addComponent(jTextApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrimerApellido3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jTextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jTextFieldIDPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jButtonRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIDPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelSegundoNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelPrimerApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelSegundoApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jLabelCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrimerApellido3)
                            .addComponent(jLabelPrimerApellido2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 860, 510));

        jLabelFondo.setText("Jlabelfondo");
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1730, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarClienteActionPerformed

        CRUDCliente cl = new CRUDCliente();
        try {
            if ((jtextCedula.getText().equals(""))
                    || (jTextNombre1.getText().equals(""))
                    || (jTextNombre2.getText().equals(""))
                    || (jTextApellido1.getText().equals(""))
                    || (jTextApellido2.getText().equals(""))
                    || (jTextFieldProcedencia.getText().equals(""))
                    || (jtextTelefono.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");
            } else {
                guardarCliente();
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }


    }//GEN-LAST:event_jButtonRegistrarClienteActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try {
            if (jTextFieldIDPersona.getText().isEmpty()
                    || jtextCedula.getText().isEmpty()
                    || jTextNombre1.getText().isEmpty()
                    || jTextNombre2.getText().isEmpty()
                    || jTextApellido1.getText().isEmpty()
                    || jTextApellido2.getText().isEmpty()
                    || jTextFieldProcedencia.getText().isEmpty()
                    || jtextTelefono.getText().isEmpty()) {
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

    private void jTextNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombre1ActionPerformed

    private void jTextApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellido1KeyTyped
        TypedText(evt);
                 
    }//GEN-LAST:event_jTextApellido1KeyTyped

    private void jTextNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombre1KeyTyped
        TypedText(evt);
    }//GEN-LAST:event_jTextNombre1KeyTyped

    private void jTextApellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellido2KeyTyped
        TypedText(evt);
    }//GEN-LAST:event_jTextApellido2KeyTyped

    private void jTextNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombre2KeyTyped
         TypedText(evt);
    }//GEN-LAST:event_jTextNombre2KeyTyped

    private void jTextFieldProcedenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcedenciaKeyTyped
         TypedText(evt);
    }//GEN-LAST:event_jTextFieldProcedenciaKeyTyped

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
    public static javax.swing.JButton jButtonRegistrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    public static javax.swing.JTextField jTextApellido1;
    public static javax.swing.JTextField jTextApellido2;
    public static javax.swing.JTextField jTextFieldIDCliente;
    public static javax.swing.JTextField jTextFieldIDPersona;
    public static javax.swing.JTextField jTextFieldProcedencia;
    public static javax.swing.JTextField jTextNombre1;
    public static javax.swing.JTextField jTextNombre2;
    public static javax.swing.JFormattedTextField jtextCedula;
    public static javax.swing.JFormattedTextField jtextTelefono;
    // End of variables declaration//GEN-END:variables
}
