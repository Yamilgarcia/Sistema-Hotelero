/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Conexion.CRUDCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import modelo.ValidarCampos;
import vista_menu.Menu;

/**
 *
 * @author Usuario
 */
public class PantallaBusquedaCliente extends javax.swing.JFrame {

    ValidarCampos validar = new ValidarCampos();
    int datoSeleccionado = -1;

    CRUDCliente Actu = new CRUDCliente();

    /**
     * Creates new form PantallaBusquedaCliente
     */
    public PantallaBusquedaCliente() {
        initComponents();

        jtextButtonAggCliReser.setEnabled(false);
        jtextButtonAggCliReser.setVisible(false);

        jtextButtonRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshTablaCliente();
            }
        });

        mostrar();

        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src\\vistaimagen\\FondoHotel.jpg");

    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDCliente cli = new CRUDCliente();
            modelo = cli.mostrarDatos();
            jTableCliente.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void refreshTablaCliente() {

        // se llama a un método de consulta a la base de datos
        // obtenemos los nuevos datos en un objeto DefaultTableModel llamado "modelo"
        CRUDCliente cl2 = new CRUDCliente();
        DefaultTableModel modelo = cl2.mostrarDatos();

        // Actualizar el modelo de la tabla jTableCliente con los nuevos datos
        jTableCliente.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jbuttonBuscar = new javax.swing.JButton();
        jbuttonEditar = new javax.swing.JButton();
        jbuttonEliminar = new javax.swing.JButton();
        jtextButtonAggCliReser = new javax.swing.JButton();
        jtextButtonRefresh = new javax.swing.JButton();
        panel5 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(98, 137, 179));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });
        panel2.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 660, 50));

        jTableCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCliente);

        panel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 820, 260));

        jbuttonBuscar.setBackground(new java.awt.Color(216, 199, 162));
        jbuttonBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbuttonBuscar.setText("Buscar");
        jbuttonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonBuscarMouseClicked(evt);
            }
        });
        jbuttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonBuscarActionPerformed(evt);
            }
        });
        panel2.add(jbuttonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 80, 50));

        jbuttonEditar.setBackground(new java.awt.Color(216, 199, 162));
        jbuttonEditar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbuttonEditar.setText("Editar");
        jbuttonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonEditarMouseClicked(evt);
            }
        });
        jbuttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonEditarActionPerformed(evt);
            }
        });
        panel2.add(jbuttonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 120, 50));

        jbuttonEliminar.setBackground(new java.awt.Color(216, 199, 162));
        jbuttonEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbuttonEliminar.setText("Eliminar");
        jbuttonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonEliminarMouseClicked(evt);
            }
        });
        jbuttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonEliminarActionPerformed(evt);
            }
        });
        panel2.add(jbuttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 120, 50));

        jtextButtonAggCliReser.setBackground(new java.awt.Color(216, 199, 162));
        jtextButtonAggCliReser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtextButtonAggCliReser.setText("Incorporar Cliente");
        jtextButtonAggCliReser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtextButtonAggCliReser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtextButtonAggCliReserMouseClicked(evt);
            }
        });
        jtextButtonAggCliReser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextButtonAggCliReserActionPerformed(evt);
            }
        });
        panel2.add(jtextButtonAggCliReser, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 200, 50));

        jtextButtonRefresh.setBackground(new java.awt.Color(216, 199, 162));
        jtextButtonRefresh.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtextButtonRefresh.setText("Refrescar");
        jtextButtonRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtextButtonRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtextButtonRefreshMouseClicked(evt);
            }
        });
        jtextButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextButtonRefreshActionPerformed(evt);
            }
        });
        panel2.add(jtextButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 100, 50));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 1000, 510));

        panel5.setBackground(new java.awt.Color(0, 94, 144));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Busqueda de Cliente");
        panel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 450, -1));

        panel1.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 120));

        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1600, 900));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonBuscarMouseClicked

    }//GEN-LAST:event_jbuttonBuscarMouseClicked

    private void jbuttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonBuscarActionPerformed
        try {
            DefaultTableModel modelo;
            CRUDCliente cli = new CRUDCliente();
            modelo = cli.buscarDatos(jTextFieldBuscar.getText());
            if (jTextFieldBuscar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
                mostrar();
            } else {
                jTableCliente.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbuttonBuscarActionPerformed

    private void jbuttonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonEditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonEditarMouseClicked

    private void jbuttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonEditarActionPerformed

        PantallaClienteRegistro cliente = new PantallaClienteRegistro();
        cliente.setLocationRelativeTo(null); // Opcional: Centrar la ventana en la pantalla
        cliente.setVisible(true);

        if (datoSeleccionado >= 0) {
            PantallaClienteRegistro.jTextFieldIDPersona.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 0)));
            PantallaClienteRegistro.jTextFieldIDCliente.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 1)));
            PantallaClienteRegistro.jFormattedTextFieldCedula.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 2)));
            PantallaClienteRegistro.jTextFieldNombre1.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 3)));
            PantallaClienteRegistro.jTextFieldNombre2.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 4)));
            PantallaClienteRegistro.jTextFieldApellido1.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 5)));
            PantallaClienteRegistro.jTextFieldApellido2.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 6)));
            PantallaClienteRegistro.jTextFieldProcedencia.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 7)));
            PantallaClienteRegistro.jFormattedTextFieldTelefono.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 8)));

            PantallaClienteRegistro.jButtonRegistrarClient.setVisible(false);
            cliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }


    }//GEN-LAST:event_jbuttonEditarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        datoSeleccionado = jTableCliente.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jbuttonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonEliminarMouseClicked

    private void jbuttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonEliminarActionPerformed
        if (datoSeleccionado >= 0) {
            int dato = Integer.valueOf(jTableCliente.getValueAt(datoSeleccionado, 0).toString());
            CRUDCliente cli = new CRUDCliente();
            if (JOptionPane.showConfirmDialog(rootPane,
                    "Se eliminará el registro, ¿desea continuar?",
                    "Eliminar Registro",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {

                cli.Eliminar(dato);
                mostrar();
                JOptionPane.showMessageDialog(null,
                        "Dato eliminado correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_jbuttonEliminarActionPerformed

    private void jtextButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtextButtonRefreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextButtonRefreshMouseClicked

    private void jtextButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextButtonRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextButtonRefreshActionPerformed

    private void jtextButtonAggCliReserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtextButtonAggCliReserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextButtonAggCliReserMouseClicked

    private void jtextButtonAggCliReserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextButtonAggCliReserActionPerformed
        PantallaRegistroReservacionEstancia.jTextFieldClienteReser.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 3)));
        PantallaRegistroReservacionEstancia.jTextFieldClienteApellido.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 5)));
        PantallaRegistroReservacionEstancia.jTextFieldIDclienteER.setText(String.valueOf(jTableCliente.getValueAt(datoSeleccionado, 1)));

        dispose();
    }//GEN-LAST:event_jtextButtonAggCliReserActionPerformed

    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        // TODO add your handling code here:
        validar.KeyTipedTXT(evt);
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

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
            java.util.logging.Logger.getLogger(PantallaBusquedaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaBusquedaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaBusquedaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaBusquedaCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaBusquedaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JButton jbuttonBuscar;
    public static javax.swing.JButton jbuttonEditar;
    public static javax.swing.JButton jbuttonEliminar;
    public static javax.swing.JButton jtextButtonAggCliReser;
    public static javax.swing.JButton jtextButtonRefresh;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel5;
    // End of variables declaration//GEN-END:variables
}
