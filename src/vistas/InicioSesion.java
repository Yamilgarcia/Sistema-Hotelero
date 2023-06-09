package vistas;

import Conexion_bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.ValidarCampos;
import vista_menu.Menu;

/**
 *
 * @author Usuario
 */
public class InicioSesion extends javax.swing.JFrame {

    ValidarCampos validar = new ValidarCampos();
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "src\\vistaimagen\\FondoHotel.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src\\vistaimagen\\icons8_contacts_512px_2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel4, "src\\vistaimagen\\icons8_lock_32px.png");

        //Cambiar icono
        setIconImage(new ImageIcon(getClass().getResource("../vistaimagen/icon3.png")).getImage());
    }
    //Metodo para autenticar usuarios en la base de datos.

    private boolean Autenticacion(String username, String password) {
        try {
            String sql = "SELECT * FROM Empleado WHERE Usuario = ? AND Contraseña = ?";
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String user = result.getString("Usuario");
                String pass = result.getString("Contraseña");
                boolean isAdmin = user.equals("Admin"); // Verificar si el usuario es "Admin"
                // Realizar acciones adicionales para el usuario "Admin" si es necesario

                return username.equals(user) && password.equals(pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void AccesoBoton(java.awt.event.ActionEvent evt) {
        String username = txtUsuario.getText();
        String password = new String(txtPassword.getPassword());
        if (Autenticacion(username, password)) {
            Menu principal = new Menu();
            boolean isAdmin = username.equals("Admin"); // Verificar si el usuario es "Admin"
            if (!isAdmin) {
                principal.jButtonIngreso.setEnabled(false); // Desactivar el botón si no es administrador
            }
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            principal.setResizable(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Acceso concedido.");
        } else {
            txtUsuario.setText("");
            txtPassword.setText("");
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
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

        jPanel2 = new javax.swing.JPanel();
        jLabelBusquedaReservacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        Contraseñajlabel = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        InicioSeci = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 94, 144));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBusquedaReservacion.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelBusquedaReservacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBusquedaReservacion.setText("Inicio de Sesión");
        jPanel2.add(jLabelBusquedaReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 441, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 120));

        jPanel1.setBackground(new java.awt.Color(162, 179, 216));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        jLabelNombre.setText("Nombre");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 46, 143, 49));

        Contraseñajlabel.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        Contraseñajlabel.setText("Contraseña");
        jPanel1.add(Contraseñajlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 209, 143, 49));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 101, 290, 50));

        txtPassword.setText("**********");
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 270, 290, 50));

        InicioSeci.setBackground(new java.awt.Color(216, 199, 162));
        InicioSeci.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        InicioSeci.setText("Iniciar Sesión");
        InicioSeci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InicioSeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioSeciActionPerformed(evt);
            }
        });
        jPanel1.add(InicioSeci, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaimagen/icons8_contacts_512px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaimagen/icons8_contacts_512px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 80, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 620, 430));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioSeciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioSeciActionPerformed
        AccesoBoton(evt);
    }//GEN-LAST:event_InicioSeciActionPerformed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        if (txtPassword.getText().equals("**********")) {
            txtPassword.setText("");

        }


    }//GEN-LAST:event_txtPasswordMouseClicked

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
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseñajlabel;
    private javax.swing.JButton InicioSeci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBusquedaReservacion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
