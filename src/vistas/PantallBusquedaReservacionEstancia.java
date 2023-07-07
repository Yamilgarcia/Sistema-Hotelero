package vistas;

import Conexion.CRUDEmpleado;
import Conexion.CRUDReservacionEstancia;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PantallBusquedaReservacionEstancia extends javax.swing.JFrame {

    private JTextField txtBuscar;

    int datoSeleccionado = -1;

    /**
     * Creates new form PantallaReservacion
     */
    public PantallBusquedaReservacionEstancia() {
        initComponents();

        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelFondoBusCliente, "src\\vistaimagen\\FondoHotel.jpg");

        mostrar();
        
        
        
        jtextButtonRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshTablaCliente();
            }
        });
        
        
        //Cambiar icono
        setIconImage(new ImageIcon(getClass().getResource("../vistaimagen/icon3.png")).getImage());
    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDReservacionEstancia cli = new CRUDReservacionEstancia();
            modelo = cli.mostrarDatosReservaEstancia();
            jTableReservaEstancia.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void refreshTablaCliente() {

        // se llama a un método de consulta a la base de datos
        // obtenemos los nuevos datos en un objeto DefaultTableModel llamado "modelo"
        CRUDReservacionEstancia cl2 = new CRUDReservacionEstancia();
        DefaultTableModel modelo = cl2.mostrarDatosReservaEstancia();

        // Actualizar el modelo de la tabla jTableCliente con los nuevos datos
        jTableReservaEstancia.setModel(modelo);
        
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelBusquedaReservacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtextButtonRefresh = new javax.swing.JButton();
        jbuttonBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableReservaEstancia = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jbottonEditar = new javax.swing.JButton();
        jbottonEliminar = new javax.swing.JButton();
        jbottonCancelar = new javax.swing.JButton();
        jLabelFondoBusCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 94, 144));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBusquedaReservacion.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelBusquedaReservacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBusquedaReservacion.setText("Reservaciones-Estancias");
        jPanel2.add(jLabelBusquedaReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 520, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 120));

        jPanel1.setBackground(new java.awt.Color(98, 137, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jtextButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 110, 40));

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
        jPanel1.add(jbuttonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 60, 80, 50));

        jTableReservaEstancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTableReservaEstancia.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableReservaEstancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReservaEstanciaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableReservaEstancia);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 1100, 340));

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Buscar");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 720, 50));

        jbottonEditar.setBackground(new java.awt.Color(216, 199, 162));
        jbottonEditar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbottonEditar.setText("Editar");
        jbottonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbottonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbottonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 110, 40));

        jbottonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        jbottonEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbottonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbottonEliminar.setText("Eliminar");
        jbottonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbottonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbottonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 110, 40));

        jbottonCancelar.setBackground(new java.awt.Color(216, 199, 162));
        jbottonCancelar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbottonCancelar.setText("Cancelar Reserva");
        jbottonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbottonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbottonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 1300, 610));

        jLabelFondoBusCliente.setText("jLabel1");
        jLabelFondoBusCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelFondoBusCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        if (jTextField1.getText().equals("Buscar")) {
            jTextField1.setText("");
            jTextField1.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_jTextField1MouseClicked

    private void jbottonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonEditarActionPerformed
        PantallaRegistroReservacionEstancia RESTANCIA = new PantallaRegistroReservacionEstancia();
        RESTANCIA.setLocationRelativeTo(null); // Opcional: Centrar la ventana en la pantalla
        RESTANCIA.setVisible(true);

        if (datoSeleccionado >= 0) {
            PantallaRegistroReservacionEstancia.jTextFieldIDReservaEstancia.setText(String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 0)));
            PantallaRegistroReservacionEstancia.jTextFieldClienteReser.setText(String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 2)));
            PantallaRegistroReservacionEstancia.jTextFieldClienteApellido.setText(String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 3)));

            PantallaRegistroReservacionEstancia.jTextFieldSeleccion.setText(String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 7)));

            PantallaRegistroReservacionEstancia.jButtonRegistrarReservaEstancia.setVisible(false);
            PantallaRegistroReservacionEstancia.jTextFieldClienteReser.setEnabled(false);
            PantallaRegistroReservacionEstancia.jTextFieldClienteApellido.setEnabled(false);
            PantallaRegistroReservacionEstancia.jComboBoxEmpleado.setEnabled(false);
            RESTANCIA.setVisible(true);
            

            // Obtener la fecha de la tabla en formato "yyyy/mm/dd"
            String fechaTabla = String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 5));

            try {
                // Parsear la fecha de entrada en formato "yyyy-MM-dd" a un objeto LocalDate
                LocalDate fechaLocal = LocalDate.parse(fechaTabla, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));

                // Crear un objeto DateTimeFormatter para el formato de salida "dd/MM/yyyy"
                DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                // Formatear la fecha en el formato deseado "dd/mm/yyyy"
                String fechaFormateada = fechaLocal.format(formatoSalida);

                // Establecer el valor formateado en el JTextField
                PantallaRegistroReservacionEstancia.jTextFieldFechEntrada1.setText(fechaFormateada);
            } catch (DateTimeParseException e) {
                // Manejar cualquier error de parsing de la fecha
                e.printStackTrace();
            }

            // Obtener la fecha de la tabla en formato "yyyy/mm/dd"
            String fechaTablaas = String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 6));

            try {
                // Parsear la fecha de entrada en formato "yyyy-MM-dd" a un objeto LocalDate
                LocalDate fechaLocal = LocalDate.parse(fechaTablaas, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));

                // Crear un objeto DateTimeFormatter para el formato de salida "dd/MM/yyyy"
                DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                // Formatear la fecha en el formato deseado "dd/mm/yyyy"
                String fechaFormateada = fechaLocal.format(formatoSalida);

                // Establecer el valor formateado en el JTextField
                PantallaRegistroReservacionEstancia.jTextFieldFechSalida.setText(fechaFormateada);
                
                
            } catch (DateTimeParseException e) {
                // Manejar cualquier error de parsing de la fecha
                e.printStackTrace();
            }
            

            PantallaRegistroReservacionEstancia.jButtonRegistrarReservaEstancia.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }
    }//GEN-LAST:event_jbottonEditarActionPerformed

    private void jTableReservaEstanciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReservaEstanciaMouseClicked
        datoSeleccionado = jTableReservaEstancia.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableReservaEstanciaMouseClicked

    private void jtextButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtextButtonRefreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextButtonRefreshMouseClicked

    private void jtextButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextButtonRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextButtonRefreshActionPerformed

    private void jbottonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonEliminarActionPerformed
        if (datoSeleccionado >= 0) {
            int dato = Integer.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 1).toString());
            CRUDReservacionEstancia cli = new CRUDReservacionEstancia();
            if (JOptionPane.showConfirmDialog(rootPane,
                "Se eliminará el registro, ¿desea continuar?",
                "Eliminar Registro",
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION) {

            cli.EliminarReservaEstancia(dato);
            mostrar();
            JOptionPane.showMessageDialog(null,
                "Dato eliminado correctamente");
        }
        } else {
            JOptionPane.showMessageDialog(null,
                "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_jbottonEliminarActionPerformed

    private void jbottonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonCancelarActionPerformed
         PantallaRegistroReservacionEstancia RESTANCIA = new PantallaRegistroReservacionEstancia();
        RESTANCIA.setLocationRelativeTo(null); // Opcional: Centrar la ventana en la pantalla
        RESTANCIA.setVisible(true);

        if (datoSeleccionado >= 0) {
            PantallaRegistroReservacionEstancia.jTextFieldIDReservaEstancia.setText(String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 0)));
            PantallaRegistroReservacionEstancia.jTextFieldClienteReser.setText(String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 2)));
            PantallaRegistroReservacionEstancia.jTextFieldClienteApellido.setText(String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 3)));

            PantallaRegistroReservacionEstancia.jTextFieldSeleccion.setText(String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 7)));

            PantallaRegistroReservacionEstancia.jButtonRegistrarReservaEstancia.setVisible(false);
            PantallaRegistroReservacionEstancia.jTextFieldClienteReser.setEnabled(false);
            PantallaRegistroReservacionEstancia.jTextFieldClienteApellido.setEnabled(false);
            PantallaRegistroReservacionEstancia.jComboBoxEmpleado.setEnabled(false);
            PantallaRegistroReservacionEstancia.jTextFieldFechEntrada1.setEnabled(false);
            PantallaRegistroReservacionEstancia.jTextFieldFechSalida.setEnabled(false);
            RESTANCIA.setVisible(true);
            

            // Obtener la fecha de la tabla en formato "yyyy/mm/dd"
            String fechaTabla = String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 5));

            try {
                // Parsear la fecha de entrada en formato "yyyy-MM-dd" a un objeto LocalDate
                LocalDate fechaLocal = LocalDate.parse(fechaTabla, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));

                // Crear un objeto DateTimeFormatter para el formato de salida "dd/MM/yyyy"
                DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                // Formatear la fecha en el formato deseado "dd/mm/yyyy"
                String fechaFormateada = fechaLocal.format(formatoSalida);

                // Establecer el valor formateado en el JTextField
                PantallaRegistroReservacionEstancia.jTextFieldFechEntrada1.setText(fechaFormateada);
            } catch (DateTimeParseException e) {
                // Manejar cualquier error de parsing de la fecha
                e.printStackTrace();
            }

            // Obtener la fecha de la tabla en formato "yyyy/mm/dd"
            String fechaTablaas = String.valueOf(jTableReservaEstancia.getValueAt(datoSeleccionado, 6));

            try {
                // Parsear la fecha de entrada en formato "yyyy-MM-dd" a un objeto LocalDate
                LocalDate fechaLocal = LocalDate.parse(fechaTablaas, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));

                // Crear un objeto DateTimeFormatter para el formato de salida "dd/MM/yyyy"
                DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                // Formatear la fecha en el formato deseado "dd/mm/yyyy"
                String fechaFormateada = fechaLocal.format(formatoSalida);

                // Establecer el valor formateado en el JTextField
                PantallaRegistroReservacionEstancia.jTextFieldFechSalida.setText(fechaFormateada);
                
                
            } catch (DateTimeParseException e) {
                // Manejar cualquier error de parsing de la fecha
                e.printStackTrace();
            }
            

            PantallaRegistroReservacionEstancia.jButtonRegistrarReservaEstancia.setVisible(false);
            PantallaRegistroReservacionEstancia.jButtonACTUALIZAR.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }
    }//GEN-LAST:event_jbottonCancelarActionPerformed

    private void jbuttonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonBuscarMouseClicked

    }//GEN-LAST:event_jbuttonBuscarMouseClicked

    private void jbuttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonBuscarActionPerformed
        try {
            DefaultTableModel modelo;

            CRUDReservacionEstancia cli = new CRUDReservacionEstancia();
            modelo = cli.buscarDatos(jTextField1.getText());

            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
                mostrar();
            } else {
                jTableReservaEstancia.setModel(modelo);
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
            java.util.logging.Logger.getLogger(PantallBusquedaReservacionEstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallBusquedaReservacionEstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallBusquedaReservacionEstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallBusquedaReservacionEstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallBusquedaReservacionEstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBusquedaReservacion;
    private javax.swing.JLabel jLabelFondoBusCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableReservaEstancia;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbottonCancelar;
    private javax.swing.JButton jbottonEditar;
    private javax.swing.JButton jbottonEliminar;
    private javax.swing.JButton jbuttonBuscar;
    public static javax.swing.JButton jtextButtonRefresh;
    // End of variables declaration//GEN-END:variables
}
