/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Conexion.CRUDHabitacion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Habitacion;

/**
 *
 * @author Usuario
 */
public class VistaHabitaciones extends javax.swing.JFrame {

    int datoSeleccionado = -1;

    public VistaHabitaciones() {
        initComponents();
        mostrar();
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src\\vistaimagen\\FondoHotel.jpg");

//        ocultartabla();
    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDHabitacion cli = new CRUDHabitacion();
            modelo = cli.mostrarDatosHabitacion();
            jTablevistahabitacion.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ocultartabla() {
        int columnIndex = 0; // Índice de la columna que deseas ocultar
        TableColumnModel columnModel = jTablevistahabitacion.getColumnModel();
        columnModel.getColumn(columnIndex).setWidth(0);
        columnModel.getColumn(columnIndex).setMinWidth(0);
        columnModel.getColumn(columnIndex).setMaxWidth(0);
        columnModel.getColumn(columnIndex).setPreferredWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablevistahabitacion = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jbottonChangeSucio = new javax.swing.JButton();
        jbottonChangeDisponible = new javax.swing.JButton();
        jbuttonBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelBusquedaReservacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(98, 137, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablevistahabitacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTablevistahabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablevistahabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablevistahabitacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablevistahabitacion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 860, 360));

        jTextFieldBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBuscar.setText("Buscar");
        jTextFieldBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscarMouseClicked(evt);
            }
        });
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 720, 50));

        jbottonChangeSucio.setBackground(new java.awt.Color(102, 102, 0));
        jbottonChangeSucio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbottonChangeSucio.setForeground(new java.awt.Color(255, 255, 255));
        jbottonChangeSucio.setText("Sucio");
        jbottonChangeSucio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonChangeSucioActionPerformed(evt);
            }
        });
        jPanel1.add(jbottonChangeSucio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 130, 50));

        jbottonChangeDisponible.setBackground(new java.awt.Color(0, 102, 102));
        jbottonChangeDisponible.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbottonChangeDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jbottonChangeDisponible.setText("Disponible");
        jbottonChangeDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonChangeDisponibleActionPerformed(evt);
            }
        });
        jPanel1.add(jbottonChangeDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 130, 50));

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
        jPanel1.add(jbuttonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 80, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 1070, 590));

        jPanel2.setBackground(new java.awt.Color(0, 94, 144));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBusquedaReservacion.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelBusquedaReservacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBusquedaReservacion.setText("Habitaciones");
        jPanel2.add(jLabelBusquedaReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 270, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 120));

        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1600, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarMouseClicked
        if (jTextFieldBuscar.getText().equals("Buscar")) {
            jTextFieldBuscar.setText("");
            jTextFieldBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldBuscarMouseClicked

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jbottonChangeSucioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonChangeSucioActionPerformed

//PRINCIPAL PRINCIPAL PRINCIPAL PRINCIPAL PRINCIPAL
        if (datoSeleccionado != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTablevistahabitacion.getModel();
            String estadoActual = (String) modelo.getValueAt(datoSeleccionado, 5);

            if (!estadoActual.equals("Sucio")) {
                if (!estadoActual.equals("Disponible")) {
                    modelo.setValueAt("Sucio", datoSeleccionado, 5);
                    jTablevistahabitacion.setModel(modelo);

                    // Obtener el número de habitación de la fila seleccionada
                    String idhabitacion = (String) modelo.getValueAt(datoSeleccionado, 1);
                    int numeroHabitacion = Integer.parseInt(idhabitacion);

                    String nuevoEstado = "Sucio";
                    Habitacion habitacion = new Habitacion();
                    habitacion.setID_Habitacion(numeroHabitacion);
                    habitacion.setEstado(nuevoEstado);

                    // Actualizar el estado en la base de datos
                    CRUDHabitacion crudHabitacion = new CRUDHabitacion();
                    crudHabitacion.ActualizarDatosEstadoHabit(habitacion);
                    mostrar();
                } else {
                    JOptionPane.showMessageDialog(null, "La habitación está en estado 'Disponible'. No se puede cambiar a 'Sucio'.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La habitación ya está en estado 'Sucio'.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila de la tabla.");
        }


    }//GEN-LAST:event_jbottonChangeSucioActionPerformed

    private void jTablevistahabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablevistahabitacionMouseClicked
        datoSeleccionado = jTablevistahabitacion.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTablevistahabitacionMouseClicked

    private void jbottonChangeDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonChangeDisponibleActionPerformed
        

        if (datoSeleccionado != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTablevistahabitacion.getModel();
            String estadoActual = (String) modelo.getValueAt(datoSeleccionado, 5);

            if (!estadoActual.equals("Disponible")) {
                if (!estadoActual.equals("Ocupada")) {
                    modelo.setValueAt("Disponible", datoSeleccionado, 5);
                    jTablevistahabitacion.setModel(modelo);

                    // Obtener el número de habitación de la fila seleccionada
                    String idhabitacion = (String) modelo.getValueAt(datoSeleccionado, 1);
                    int numeroHabitacion = Integer.parseInt(idhabitacion);

                    String nuevoEstado = "Disponible";
                    Habitacion habitacion = new Habitacion();
                    habitacion.setID_Habitacion(numeroHabitacion);
                    habitacion.setEstado(nuevoEstado);

                    // Actualizar el estado en la base de datos
                    CRUDHabitacion crudHabitacion = new CRUDHabitacion();
                    crudHabitacion.ActualizarDatosEstadoHabit(habitacion);
                    mostrar();
                } else {
                    JOptionPane.showMessageDialog(null, "La habitación está en estado 'Ocupada'. No se puede cambiar a 'Disponible'.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La habitación ya está en estado 'Sucio'.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila de la tabla.");
        }

    }//GEN-LAST:event_jbottonChangeDisponibleActionPerformed

    private void jbuttonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonBuscarMouseClicked

    }//GEN-LAST:event_jbuttonBuscarMouseClicked

    private void jbuttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonBuscarActionPerformed
        try {
            DefaultTableModel modelo;
            DefaultTableModel modelo2;
            CRUDHabitacion cli = new CRUDHabitacion();
            modelo = cli.buscarDatos(jTextFieldBuscar.getText());

            if (jTextFieldBuscar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
                mostrar();
            } else {
                jTablevistahabitacion.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbuttonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaHabitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBusquedaReservacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTablevistahabitacion;
    private javax.swing.JTextField jTextFieldBuscar;
    public static javax.swing.JButton jbottonChangeDisponible;
    public static javax.swing.JButton jbottonChangeSucio;
    private javax.swing.JButton jbuttonBuscar;
    // End of variables declaration//GEN-END:variables
}
