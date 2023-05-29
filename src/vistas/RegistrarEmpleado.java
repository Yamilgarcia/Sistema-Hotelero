/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Conexion.CRUDEmpleado;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Empleado;

/**
 *
 * @author Usuario
 */
public class RegistrarEmpleado extends javax.swing.JFrame {

    int datoSeleccionado = -1;

    /**
     * Creates new form RegistrarEmpleado
     */
    public RegistrarEmpleado() {

        initComponents();
        jTextFieldIDPersona.setEnabled(false);
        jTextFieldIDPersona.setVisible(false);
        jTextFieldIDEmpleado.setEnabled(false);
        jTextFieldIDEmpleado.setVisible(false);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src\\vistaimagen\\FondoHotel.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "src\\vistaimagen\\5-estrellas.png");
        mostrar();

        jtextButtonRefresh2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshTablaEmpleado();
            }
        });

    }

    private void refreshTablaEmpleado() {

        // se llama a un método de consulta a la base de datos
        // obtenemos los nuevos datos en un objeto DefaultTableModel llamado "modelo"
        CRUDEmpleado cl2 = new CRUDEmpleado();
        DefaultTableModel modelo = cl2.mostrarDatosEmpleado();

        // Actualizar el modelo de la tabla jTableCliente con los nuevos datos
        jTableEmpleado.setModel(modelo);
    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDEmpleado cli = new CRUDEmpleado();
            modelo = cli.mostrarDatosEmpleado();
            jTableEmpleado.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void guardarEmpleado() {
        CRUDEmpleado cc = new CRUDEmpleado();
        Empleado ct = new Empleado(jTextFieldusuarioSesion.getText(),
                jPasswordContraseña.getText(),
                jTextFieldNombre1.getText(),
                jTextFieldNombre2.getText(),
                jTextFieldApellido1.getText(),
                jTextFieldApellido2.getText(),
                jTextFieldTelefono.getText());
        cc.Guardar(ct);

    }

    public void limpiar() {
        jTextFieldNombre1.setText("");
        jTextFieldNombre2.setText("");
        jTextFieldApellido1.setText("");
        jTextFieldApellido2.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldusuarioSesion.setText("");
        jPasswordContraseña.setText("");

    }

    public void editarEmpleado() {

        CRUDEmpleado cc = new CRUDEmpleado();

        Empleado cl = new Empleado((jTextFieldusuarioSesion.getText()),
                jPasswordContraseña.getText(),
                Integer.parseInt(jTextFieldIDPersona.getText()),
                jTextFieldNombre1.getText(),
                jTextFieldNombre2.getText(),
                jTextFieldApellido1.getText(),
                jTextFieldApellido2.getText(),
                jTextFieldTelefono.getText());

        cc.ActualizarDatosEmpleado(cl);

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
        jLabelRegistrarEmpleado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jLabelSegundoNombre = new javax.swing.JLabel();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jLabelPrimerApellido = new javax.swing.JLabel();
        jTextFieldApellido2 = new javax.swing.JTextField();
        jLabelSegundoApellido = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelPrimerApellido1 = new javax.swing.JLabel();
        jTextFieldusuarioSesion = new javax.swing.JTextField();
        jLabelusuarioSesion = new javax.swing.JLabel();
        jPasswordContraseña = new javax.swing.JPasswordField();
        jlabelcontra = new javax.swing.JLabel();
        jButtonRegistrarEmpleado = new javax.swing.JButton();
        jTextFieldIDPersona = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldIDEmpleado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbuttonEditar = new javax.swing.JButton();
        jbuttonEliminarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleado = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jbuttonBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtextButtonRefresh2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 94, 144));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelRegistrarEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrarEmpleado.setText("Registro de Empleado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1598, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(578, Short.MAX_VALUE)
                    .addComponent(jLabelRegistrarEmpleado)
                    .addContainerGap(566, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(jLabelRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(162, 179, 216));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNombre1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextFieldNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 50));

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabel1.setText("Nombre del Empleado");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextFieldNombre2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextFieldNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 200, 50));

        jLabelSegundoNombre.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelSegundoNombre.setText("Segundo Nombre");
        jPanel3.add(jLabelSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jTextFieldApellido1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextFieldApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 50));

        jLabelPrimerApellido.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrimerApellido.setText("Primer Apellido");
        jPanel3.add(jLabelPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextFieldApellido2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldApellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextFieldApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 200, 50));

        jLabelSegundoApellido.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelSegundoApellido.setText("Segundo Apellido");
        jPanel3.add(jLabelSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jTextFieldTelefono.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 50));

        jLabelPrimerApellido1.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrimerApellido1.setText("Telefono ");
        jPanel3.add(jLabelPrimerApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jTextFieldusuarioSesion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldusuarioSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextFieldusuarioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 200, 50));

        jLabelusuarioSesion.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelusuarioSesion.setText("Usuario de Sesión");
        jPanel3.add(jLabelusuarioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jPasswordContraseña.setText("**********");
        jPasswordContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordContraseñaMouseClicked(evt);
            }
        });
        jPanel3.add(jPasswordContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 50));

        jlabelcontra.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jlabelcontra.setText("Contraseña");
        jPanel3.add(jlabelcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jButtonRegistrarEmpleado.setBackground(new java.awt.Color(179, 140, 98));
        jButtonRegistrarEmpleado.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistrarEmpleado.setText("Registrar");
        jButtonRegistrarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 195, 50));
        jPanel3.add(jTextFieldIDPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jButtonActualizar.setBackground(new java.awt.Color(179, 140, 98));
        jButtonActualizar.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 195, 50));
        jPanel3.add(jTextFieldIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 190, 540, 580));

        jPanel2.setBackground(new java.awt.Color(162, 179, 216));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jbuttonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 120, 50));

        jbuttonEliminarEmpleado.setBackground(new java.awt.Color(216, 199, 162));
        jbuttonEliminarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbuttonEliminarEmpleado.setText("Eliminar");
        jbuttonEliminarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonEliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonEliminarEmpleadoMouseClicked(evt);
            }
        });
        jbuttonEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonEliminarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbuttonEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 120, 50));

        jTableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpleado);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 660, 250));
        jPanel2.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 660, 50));

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
        jPanel2.add(jbuttonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 80, 50));

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, 130));

        jtextButtonRefresh2.setBackground(new java.awt.Color(216, 199, 162));
        jtextButtonRefresh2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtextButtonRefresh2.setText("Refrescar");
        jtextButtonRefresh2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtextButtonRefresh2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtextButtonRefresh2MouseClicked(evt);
            }
        });
        jtextButtonRefresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextButtonRefresh2ActionPerformed(evt);
            }
        });
        jPanel2.add(jtextButtonRefresh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 100, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 920, 580));

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 1600, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarEmpleadoActionPerformed
        CRUDEmpleado cl = new CRUDEmpleado();
        try {
            if ((jTextFieldNombre1.getText().equals(""))
                    || (jTextFieldNombre2.getText().equals(""))
                    || (jTextFieldApellido1.getText().equals(""))
                    || (jTextFieldApellido2.getText().equals(""))
                    || (jTextFieldTelefono.getText().equals(""))
                    || (jTextFieldusuarioSesion.getText().equals(""))
                    || (jPasswordContraseña.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");
            } else {
                guardarEmpleado();
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonRegistrarEmpleadoActionPerformed

    private void jPasswordContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordContraseñaMouseClicked
        if (jPasswordContraseña.getText().equals("**********")) {
            jPasswordContraseña.setText("");
        }
    }//GEN-LAST:event_jPasswordContraseñaMouseClicked

    private void jbuttonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonBuscarMouseClicked

    }//GEN-LAST:event_jbuttonBuscarMouseClicked

    private void jbuttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonBuscarActionPerformed
        try {
            DefaultTableModel modelo;
            CRUDEmpleado cli = new CRUDEmpleado();
            modelo = cli.buscarDatosEmpleado(jTextFieldBuscar.getText());
            if (jTextFieldBuscar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
                mostrar();
            } else {
                jTableEmpleado.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbuttonBuscarActionPerformed

    private void jtextButtonRefresh2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtextButtonRefresh2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextButtonRefresh2MouseClicked

    private void jtextButtonRefresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextButtonRefresh2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextButtonRefresh2ActionPerformed

    private void jbuttonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonEditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonEditarMouseClicked

    private void jbuttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonEditarActionPerformed

        if (datoSeleccionado >= 0) {
            RegistrarEmpleado.jTextFieldIDPersona.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 0)));
            RegistrarEmpleado.jTextFieldIDEmpleado.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 1)));
            RegistrarEmpleado.jTextFieldNombre1.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 2)));
            RegistrarEmpleado.jTextFieldNombre2.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 3)));
            RegistrarEmpleado.jTextFieldApellido1.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 4)));
            RegistrarEmpleado.jTextFieldApellido2.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 5)));
            RegistrarEmpleado.jTextFieldTelefono.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 6)));
            RegistrarEmpleado.jTextFieldusuarioSesion.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 7)));
            RegistrarEmpleado.jPasswordContraseña.setText(String.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 8)));

            RegistrarEmpleado.jButtonRegistrarEmpleado.setVisible(false);
            

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }

    }//GEN-LAST:event_jbuttonEditarActionPerformed

    private void jTableEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadoMouseClicked
        datoSeleccionado = jTableEmpleado.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableEmpleadoMouseClicked

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try {
            if (jTextFieldIDPersona.getText().isEmpty()
                    || jTextFieldNombre1.getText().isEmpty()
                    || jTextFieldNombre2.getText().isEmpty()
                    || jTextFieldApellido1.getText().isEmpty()
                    || jTextFieldApellido2.getText().isEmpty()
                    || jTextFieldTelefono.getText().isEmpty()
                    || jTextFieldusuarioSesion.getText().isEmpty()
                    || jPasswordContraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacíos");
            } else {
                editarEmpleado();
                limpiar();
                RegistrarEmpleado.jButtonRegistrarEmpleado.setVisible(true);
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");

            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jbuttonEliminarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonEliminarEmpleadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonEliminarEmpleadoMouseClicked

    private void jbuttonEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonEliminarEmpleadoActionPerformed
        if (datoSeleccionado >= 0) {
            int dato = Integer.valueOf(jTableEmpleado.getValueAt(datoSeleccionado, 0).toString());
            CRUDEmpleado cli = new CRUDEmpleado();
            if (JOptionPane.showConfirmDialog(rootPane,
                "Se eliminará el registro, ¿desea continuar?",
                "Eliminar Registro",
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION) {

            cli.EliminarEmpleado(dato);
            mostrar();
            JOptionPane.showMessageDialog(null,
                "Dato eliminado correctamente");
        }
        } else {
            JOptionPane.showMessageDialog(null,
                "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_jbuttonEliminarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonActualizar;
    public static javax.swing.JButton jButtonRegistrarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPrimerApellido;
    private javax.swing.JLabel jLabelPrimerApellido1;
    private javax.swing.JLabel jLabelRegistrarEmpleado;
    private javax.swing.JLabel jLabelSegundoApellido;
    private javax.swing.JLabel jLabelSegundoNombre;
    private javax.swing.JLabel jLabelusuarioSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPasswordField jPasswordContraseña;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleado;
    public static javax.swing.JTextField jTextFieldApellido1;
    public static javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldBuscar;
    public static javax.swing.JTextField jTextFieldIDEmpleado;
    public static javax.swing.JTextField jTextFieldIDPersona;
    public static javax.swing.JTextField jTextFieldNombre1;
    public static javax.swing.JTextField jTextFieldNombre2;
    public static javax.swing.JTextField jTextFieldTelefono;
    public static javax.swing.JTextField jTextFieldusuarioSesion;
    private javax.swing.JButton jbuttonBuscar;
    private javax.swing.JButton jbuttonEditar;
    private javax.swing.JButton jbuttonEliminarEmpleado;
    private javax.swing.JLabel jlabelcontra;
    private javax.swing.JButton jtextButtonRefresh2;
    // End of variables declaration//GEN-END:variables
}