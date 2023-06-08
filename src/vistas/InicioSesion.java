
package vistas;

import Conexion_bd.Conexion;
import com.sun.source.tree.TryTree;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vista_menu.Menu;


/**
 *
 *@author Usuario
 */
public class InicioSesion extends javax.swing.JFrame {

    private Conexion con = new Conexion();
    private Connection cn = (Connection) con.conectar();
    
    public InicioSesion() {
        initComponents(); 
//        RSScaleLabel.RSScaleLabel.setScaleLabel(jLabel3, "C:\\Users\\Usuario\\Documents\\Sistema-Hotelero\\src\\vistaimagen\\FondoHotel.jpg");
        
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

    public void nv() {
        String usuIngre = txtUsuario.getText();
        char[] MostrarPassword = txtPassword.getPassword();
        String password = new String(MostrarPassword);
        if (Autenticacion(usuIngre, password)) {
            Menu principal = new Menu();
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            principal.setResizable(false);
            this.setVisible(false);
//            lbAdvertencia.setForeground(new Color(0, 204, 0));
//            lbAdvertencia.setText("Acceso correcto.");
        } else {
//            lbAdvertencia.setForeground(new Color(255, 0, 0));
//            lbAdvertencia.setText("Acceso incorrecto.");
            txtUsuario.setText("");
            txtPassword.setText("");
        }

    }
    
    //Metodo para autenticar usuarios en la base de datos.
    private boolean Autenticacion(String username, String password) {
        try {
            String sql = "SELECT * FROM IniciodeSesion WHERE usuario_sesion = ? AND contrasena_sesion = ?";
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String user = result.getString("usuario_sesion");
                String pass = result.getString("contrasena_sesion");
                return username.equals(user) && password.equals(pass);

            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
     private void LimpiarCampos() {
        txtUsuario.setText("");
        txtPassword.setText("");
    }

    //Metodo para ingresar con la accion de boton.
    private void AccesoBoton(java.awt.event.ActionEvent evt) {
        String username = txtUsuario.getText();
        String password = new String(txtPassword.getPassword());
        if (Autenticacion(username, password)) {
            Menu principal = new Menu();
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            principal.setResizable(false);
            this.dispose();
//            lbAdvertencia.setForeground(new Color(0, 204, 0));
//            lbAdvertencia.setText("Acceso concedido.");
        } else {
//            lbAdvertencia.setForeground(new Color(255, 0, 0));
//            lbAdvertencia.setText("Acceso denegado.");
            LimpiarCampos();
//            MostraPassword(evt, btnMostrar, btnOcultar);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelBusquedaReservacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        usernameField = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 94, 144));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBusquedaReservacion.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelBusquedaReservacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBusquedaReservacion.setText("Inicio de Sesión");
        jPanel2.add(jLabelBusquedaReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 441, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 120));

        jPanel1.setBackground(new java.awt.Color(162, 179, 216));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        jLabelNombre.setText("Nombre");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 46, 143, 49));

        jLabelContraseña.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        jLabelContraseña.setText("Contraseña");
        jPanel1.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 209, 143, 49));

        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 264, 290, 50));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 101, 290, 50));

        usernameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameField.setText("Ingresar");
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 620, 430));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        if (txtPassword.getText().equals("**********")) {
            txtPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        AccesoBoton(evt);
    
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
         TypedText(evt);
    }//GEN-LAST:event_txtUsuarioKeyTyped

  
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBusquedaReservacion;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JButton usernameField;
    // End of variables declaration//GEN-END:variables
}
