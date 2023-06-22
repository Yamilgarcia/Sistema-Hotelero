package vistas;

import Conexion.CRUDEmpleado;
import Conexion.CRUDReservacionEstancia;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PantallBusquedaReservacionEstancia extends javax.swing.JFrame {

    private JTextField txtBuscar;
    
    

    /**
     * Creates new form PantallaReservacion
     */
    public PantallBusquedaReservacionEstancia() {
        initComponents();

        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelFondoBusCliente, "src\\vistaimagen\\FondoHotel.jpg");

        mostrar();
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelBusquedaReservacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableReservaEstancia = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabelFondoBusCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jTableReservaEstancia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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
        jScrollPane2.setViewportView(jTableReservaEstancia);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 1100, 400));

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
        }

    }//GEN-LAST:event_jTextField1MouseClicked

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
    // End of variables declaration//GEN-END:variables
}
