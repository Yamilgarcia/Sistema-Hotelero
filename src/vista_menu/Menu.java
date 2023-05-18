/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista_menu;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "C:\\Users\\Usuario\\Documents\\Sistema-Hotelero\\src\\vistaimagen\\hotel (1).png" );
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelFondo43, "C:\\Users\\Usuario\\Documents\\Sistema-Hotelero\\src\\vistaimagen\\FondoHotel.jpg" );
        
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
        jLabelNombregrandeHotel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonIngreso = new javax.swing.JButton();
        jButtonBusquedaReserva = new javax.swing.JButton();
        jButtonRegistroReservacion = new javax.swing.JButton();
        jButtonBusquedaDeCliente = new javax.swing.JButton();
        jButtonRegistroCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo43 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 94, 144));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelNombregrandeHotel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelNombregrandeHotel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombregrandeHotel.setText("Hotel Nuevo Milenio");

        jLabelNombregrandeHotel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelNombregrandeHotel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombregrandeHotel1.setText("Nuevo Milenio-Juigalpa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNombregrandeHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabelNombregrandeHotel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1257, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombregrandeHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombregrandeHotel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1765, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1595, 1052, 170, 2));

        jPanel3.setBackground(new java.awt.Color(98, 137, 179));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButtonIngreso.setBackground(new java.awt.Color(179, 140, 98));
        jButtonIngreso.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonIngreso.setText("Ingresos");
        jButtonIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoActionPerformed(evt);
            }
        });

        jButtonBusquedaReserva.setBackground(new java.awt.Color(179, 140, 98));
        jButtonBusquedaReserva.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonBusquedaReserva.setText("Busqueda Reservacion");
        jButtonBusquedaReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBusquedaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaReservaActionPerformed(evt);
            }
        });

        jButtonRegistroReservacion.setBackground(new java.awt.Color(179, 140, 98));
        jButtonRegistroReservacion.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistroReservacion.setText("Registro Reservacion");
        jButtonRegistroReservacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistroReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroReservacionActionPerformed(evt);
            }
        });

        jButtonBusquedaDeCliente.setBackground(new java.awt.Color(179, 140, 98));
        jButtonBusquedaDeCliente.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonBusquedaDeCliente.setText("Busqueda Cliente");
        jButtonBusquedaDeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBusquedaDeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaDeClienteActionPerformed(evt);
            }
        });

        jButtonRegistroCliente.setBackground(new java.awt.Color(179, 140, 98));
        jButtonRegistroCliente.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistroCliente.setText("Registro Cliente");
        jButtonRegistroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroClienteActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaimagen/hotel (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBusquedaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegistroReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBusquedaDeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButtonRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButtonBusquedaDeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonRegistroReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonBusquedaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 210, 900));

        jLabelFondo43.setText("jLabel1");
        jLabelFondo43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelFondo43, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 136, 1440, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresoActionPerformed

    private void jButtonBusquedaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBusquedaReservaActionPerformed

    private void jButtonRegistroReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroReservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistroReservacionActionPerformed

    private void jButtonBusquedaDeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaDeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBusquedaDeClienteActionPerformed

    private void jButtonRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistroClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusquedaDeCliente;
    private javax.swing.JButton jButtonBusquedaReserva;
    private javax.swing.JButton jButtonIngreso;
    private javax.swing.JButton jButtonRegistroCliente;
    private javax.swing.JButton jButtonRegistroReservacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo43;
    private javax.swing.JLabel jLabelNombregrandeHotel;
    private javax.swing.JLabel jLabelNombregrandeHotel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
