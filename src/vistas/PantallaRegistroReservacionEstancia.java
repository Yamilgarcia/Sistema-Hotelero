/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Conexion.CRUDCliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PantallaRegistroReservacionEstancia extends javax.swing.JFrame {

    /**
     * Creates new form PantallaRegistroReservacion
     */
    public PantallaRegistroReservacionEstancia() {
        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src\\vistaimagen\\FondoHotel.jpg");
        mostrar();
    }

    
    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDCliente cli = new CRUDCliente();
            modelo = cli.mostrarDatos();
            jTableClienteMuestra.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        panel4 = new java.awt.Panel();
        panel5 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldFechEntrada = new javax.swing.JTextField();
        jLabelFechaEntrada = new javax.swing.JLabel();
        jTextFieldFechSalida = new javax.swing.JTextField();
        jLabelFechaSalida = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButtonEstadia = new javax.swing.JRadioButton();
        jButtonRegistrarClient = new javax.swing.JButton();
        jTextFieldHabitacion = new javax.swing.JTextField();
        jLabelHabitacion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jbuttonBuscar = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClienteMuestra = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel5.setBackground(new java.awt.Color(0, 94, 144));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagina Estancia/Reservaciones");
        panel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 630, -1));

        panel4.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 120));

        jPanel1.setBackground(new java.awt.Color(162, 179, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldFechEntrada.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldFechEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextFieldFechEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 200, 32));

        jLabelFechaEntrada.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelFechaEntrada.setText("Fecha Entrada");
        jPanel1.add(jLabelFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jTextFieldFechSalida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldFechSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextFieldFechSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 200, 32));

        jLabelFechaSalida.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelFechaSalida.setText("Fecha Salida");
        jPanel1.add(jLabelFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jRadioButton1.setText("Reservacion");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jRadioButtonEstadia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jRadioButtonEstadia.setText("Estadia");
        jRadioButtonEstadia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonEstadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadiaActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonEstadia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jButtonRegistrarClient.setBackground(new java.awt.Color(216, 199, 162));
        jButtonRegistrarClient.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistrarClient.setText("Registrar");
        jButtonRegistrarClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarClientActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrarClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 415, 195, 50));

        jTextFieldHabitacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextFieldHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 200, 32));

        jLabelHabitacion.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelHabitacion.setText("Habitacion");
        jPanel1.add(jLabelHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton1.setText("+");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        panel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 450, 580));

        jPanel2.setBackground(new java.awt.Color(162, 179, 216));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jLabelCliente.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabelCliente.setText("Cliente");

        jTableClienteMuestra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableClienteMuestra);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jbuttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        panel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 770, 580));

        jLabel2.setText("jLabel10");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1600, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarClientActionPerformed

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
                jTableClienteMuestra.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbuttonBuscarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButtonEstadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstadiaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaRegistroReservacionEstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistroReservacionEstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistroReservacionEstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistroReservacionEstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistroReservacionEstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegistrarClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelFechaEntrada;
    private javax.swing.JLabel jLabelFechaSalida;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButtonEstadia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClienteMuestra;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldFechEntrada;
    private javax.swing.JTextField jTextFieldFechSalida;
    private javax.swing.JTextField jTextFieldHabitacion;
    private javax.swing.JButton jbuttonBuscar;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    // End of variables declaration//GEN-END:variables
}