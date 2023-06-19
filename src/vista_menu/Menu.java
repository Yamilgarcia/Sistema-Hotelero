/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista_menu;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import vistas.PantallBusquedaReservacionEstancia;
import vistas.PantallaBusquedaCliente;
import vistas.PantallaClienteRegistro;
import vistas.PantallaIngresos;
import vistas.RegistrarEmpleado;
import vistas.PantallaRegistroReservacionEstancia;
import vistas.VistaHabitaciones;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setExtendedState(Menu.MAXIMIZED_BOTH);

        

        // Crear los JLabel para la fecha y la hora
        jLabel3 = new JLabel();
        jLabel1 = new JLabel();

        
        

        // Actualizar la fecha y la hora en los JLabel
        updateDateTime();

        // Crear un hilo que actualiza la fecha y la hora cada segundo
        Thread updateThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    updateDateTime();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Iniciar el hilo de actualización
        updateThread.start();

        // Ajustar el tamaño del JFrame automáticamente
        pack();

        // Mostrar el JFrame
        setVisible(true);

        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src\\vistaimagen\\hotel (1).png" );
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelFondo43, "src\\vistaimagen\\FondoHotel.jpg" );
        
    }
    
    private void updateDateTime() {
        // Obtener la fecha y la hora actual
        Date now = new Date();

        // Crear el formato para la fecha y la hora
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formato12Horas = new SimpleDateFormat("hh:mm a");

        // Formatear la fecha y la hora actual
        String formattedDate = dateFormat.format(now);
        String formattedTime = formato12Horas.format(now);

        // Actualizar los JLabel con la fecha y la hora formateadas
        jLabel3.setText("Fecha: " + formattedDate);
        jLabel1.setText("Hora: " + formattedTime);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelxd = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonIngreso = new javax.swing.JButton();
        jButtonBusquedaReserva = new javax.swing.JButton();
        jButtonRegistroReservacionEstancia = new javax.swing.JButton();
        jButtonBusquedaDeCliente = new javax.swing.JButton();
        jButtonRegistroCliente = new javax.swing.JButton();
        jButtonEmpleado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonHabitaciones = new javax.swing.JButton();
        jLabelFondo43 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 94, 144));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombregrandeHotel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelNombregrandeHotel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombregrandeHotel.setText("Hotel Nuevo Milenio");
        jPanel1.add(jLabelNombregrandeHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 441, 60));

        jLabelNombregrandeHotel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelNombregrandeHotel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombregrandeHotel1.setText("Nuevo Milenio-Juigalpa");
        jPanel1.add(jLabelNombregrandeHotel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 71, 441, 60));

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 217, 51));

        jLabel3.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, 217, 36));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1765, -1));

        jPanelxd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelxdLayout = new javax.swing.GroupLayout(jPanelxd);
        jPanelxd.setLayout(jPanelxdLayout);
        jPanelxdLayout.setHorizontalGroup(
            jPanelxdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanelxdLayout.setVerticalGroup(
            jPanelxdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1595, 1052, 170, 2));

        jPanel3.setBackground(new java.awt.Color(98, 137, 179));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonIngreso.setBackground(new java.awt.Color(179, 140, 98));
        jButtonIngreso.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonIngreso.setText("Ingresos");
        jButtonIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 195, 50));

        jButtonBusquedaReserva.setBackground(new java.awt.Color(179, 140, 98));
        jButtonBusquedaReserva.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonBusquedaReserva.setText("Busqueda Reservacion");
        jButtonBusquedaReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBusquedaReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBusquedaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaReservaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBusquedaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 195, 50));

        jButtonRegistroReservacionEstancia.setBackground(new java.awt.Color(179, 140, 98));
        jButtonRegistroReservacionEstancia.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistroReservacionEstancia.setText("Registro Estancia/Reserv");
        jButtonRegistroReservacionEstancia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegistroReservacionEstancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistroReservacionEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroReservacionEstanciaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonRegistroReservacionEstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 195, 50));

        jButtonBusquedaDeCliente.setBackground(new java.awt.Color(179, 140, 98));
        jButtonBusquedaDeCliente.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonBusquedaDeCliente.setText("Busqueda Cliente");
        jButtonBusquedaDeCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBusquedaDeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBusquedaDeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBusquedaDeClienteMouseClicked(evt);
            }
        });
        jButtonBusquedaDeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaDeClienteActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBusquedaDeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 195, 50));

        jButtonRegistroCliente.setBackground(new java.awt.Color(179, 140, 98));
        jButtonRegistroCliente.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistroCliente.setText("Registro Cliente");
        jButtonRegistroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegistroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroClienteActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 195, 50));

        jButtonEmpleado.setBackground(new java.awt.Color(179, 140, 98));
        jButtonEmpleado.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonEmpleado.setText("Empleado");
        jButtonEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 195, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaimagen/hotel (1).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 150, 110));

        jButtonHabitaciones.setBackground(new java.awt.Color(179, 140, 98));
        jButtonHabitaciones.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonHabitaciones.setText("Habitaciones");
        jButtonHabitaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionesActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 195, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 220, 910));

        jLabelFondo43.setText("jLabel1");
        jLabelFondo43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelFondo43, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 1430, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoActionPerformed
        PantallaIngresos Ing= new PantallaIngresos();
        Ing.setVisible(true);
    }//GEN-LAST:event_jButtonIngresoActionPerformed

    private void jButtonBusquedaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaReservaActionPerformed
        PantallBusquedaReservacionEstancia BusRE = new PantallBusquedaReservacionEstancia();
        BusRE.setVisible(true);
    }//GEN-LAST:event_jButtonBusquedaReservaActionPerformed

    private void jButtonRegistroReservacionEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroReservacionEstanciaActionPerformed
        PantallaRegistroReservacionEstancia ReReser= new PantallaRegistroReservacionEstancia();
        ReReser.setVisible(true);
    }//GEN-LAST:event_jButtonRegistroReservacionEstanciaActionPerformed

    private void jButtonBusquedaDeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaDeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBusquedaDeClienteActionPerformed

    private void jButtonRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroClienteActionPerformed
        
        PantallaClienteRegistro ventanaNueva = new PantallaClienteRegistro();
        ventanaNueva.setVisible(true);
    }//GEN-LAST:event_jButtonRegistroClienteActionPerformed

    private void jButtonBusquedaDeClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBusquedaDeClienteMouseClicked
        PantallaBusquedaCliente ventanaBusquedaCliente = new PantallaBusquedaCliente();
        ventanaBusquedaCliente.setVisible(true);
    }//GEN-LAST:event_jButtonBusquedaDeClienteMouseClicked

    private void jButtonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadoActionPerformed
        RegistrarEmpleado VentanaRegistroEmpleado = new RegistrarEmpleado();
        VentanaRegistroEmpleado.setVisible(true);
    }//GEN-LAST:event_jButtonEmpleadoActionPerformed

    private void jButtonHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabitacionesActionPerformed
        VistaHabitaciones VH= new VistaHabitaciones();
        VH.setVisible(true);
    }//GEN-LAST:event_jButtonHabitacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Crear instancia de la pantalla principal
        Menu frame = new Menu();
        
        // Establecer el comportamiento de cierre para la pantalla principal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Establecer la visibilidad de la pantalla principal
        frame.setVisible(true);
        
        
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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusquedaDeCliente;
    private javax.swing.JButton jButtonBusquedaReserva;
    private javax.swing.JButton jButtonEmpleado;
    private javax.swing.JButton jButtonHabitaciones;
    private javax.swing.JButton jButtonIngreso;
    private javax.swing.JButton jButtonRegistroCliente;
    private javax.swing.JButton jButtonRegistroReservacionEstancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabelFondo43;
    private javax.swing.JLabel jLabelNombregrandeHotel;
    private javax.swing.JLabel jLabelNombregrandeHotel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanelxd;
    // End of variables declaration//GEN-END:variables
}
