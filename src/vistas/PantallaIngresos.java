/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Conexion_bd.Conexion;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class PantallaIngresos extends javax.swing.JFrame {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public PantallaIngresos() {

        initComponents();
        jTextFieldAño.setEnabled(false);
        jTextFieldMes.setEnabled(false);
        jTextFieldDia.setEnabled(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelfondoingreso, "src\\vistaimagen\\ingresos.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelfondoingreso1, "src\\vistaimagen\\ingresos (1).png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1fondo, "src\\vistaimagen\\FondoHotel.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelingre, "src\\vistaimagen\\ingresos (2).png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelingre1, "src\\vistaimagen\\ingresos (2).png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelingre2, "src\\vistaimagen\\ingresos (2).png");

        // Obtener la fecha actual
        Calendar calendar = Calendar.getInstance();
        int diaActual = calendar.get(Calendar.DAY_OF_MONTH);
        int mesActual = calendar.get(Calendar.MONTH) + 1; // Sumar 1 porque los meses en Calendar van de 0 a 11
        int añoActual = calendar.get(Calendar.YEAR);

        // Obtener las fechas del mes actual
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int primerDiaMes = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        int ultimoDiaMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Llenar el JComboBox con las fechas del mes actual
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (int dia = primerDiaMes; dia <= ultimoDiaMes; dia++) {
            model.addElement(String.format("%02d/%02d/%04d", dia, mesActual, añoActual));
        }

        // Establecer el modelo del JComboBox
        jComboBoxDia.setModel(model);

        // Seleccionar el día actual en el JComboBox
        jComboBoxDia.setSelectedItem(String.format("%02d/%02d/%04d", diaActual, mesActual, añoActual));

        // Agregar ActionListener al JComboBox
        jComboBoxDia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jComboBoxDia) {
                    // Código para calcular el ingreso total por día
                    String fechaSeleccionada = (String) jComboBoxDia.getSelectedItem();

                    // Convertir el formato de fecha de entrada a "dd/MM/yyyy"
                    DateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
                    DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = null;
                    try {
                        date = inputFormat.parse(fechaSeleccionada);
                    } catch (ParseException ex) {
                        Logger.getLogger(PantallaIngresos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String fechaSQL = outputFormat.format(date);

                    try {
                        String sql = "{ CALL CalcularTotalIngresos(?, ?) }";
                        CallableStatement statement = cn.prepareCall(sql);
                        statement.setString(1, fechaSQL);
                        statement.registerOutParameter(2, Types.FLOAT); // Tipo de dato del total de ingresos

                        statement.execute();

                        float totalIngresos = statement.getFloat(2);
                        jTextFieldDia.setText(String.valueOf(totalIngresos + " $"));

                        statement.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        });

        // ActionListener para el jComboBoxMes
        jComboBoxMes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jComboBoxMes) {
                    // Código para calcular el ingreso total por mes
                    String mesSeleccionado = (String) jComboBoxMes.getSelectedItem();
                    int mesNumero = obtenerNumeroMes(mesSeleccionado);

                    try {
                        String sql = "{ CALL CalcularTotalIngresosMes(?, ?) }";
                        CallableStatement statement = cn.prepareCall(sql);
                        statement.setInt(1, mesNumero);
                        statement.registerOutParameter(2, Types.FLOAT); // Tipo de dato del total de ingresos

                        statement.execute();

                        float totalIngresos = statement.getFloat(2);
                        jTextFieldMes.setText(String.valueOf(totalIngresos) + " $");

                        statement.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        jComboBoxAño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jComboBoxAño) {
                    // Código para calcular el ingreso total por año
                    String añoSeleccionado = (String) jComboBoxAño.getSelectedItem();
                    int año = Integer.parseInt(añoSeleccionado);

                    try {
                        String sql = "{ CALL CalcularTotalIngresosAño(?, ?) }";
                        CallableStatement statement = cn.prepareCall(sql);
                        statement.setInt(1, año);
                        statement.registerOutParameter(2, Types.FLOAT); // Tipo de dato del total de ingresos

                        statement.execute();

                        float totalIngresos = statement.getFloat(2);
                        jTextFieldAño.setText(String.valueOf(totalIngresos) + " $");

                        statement.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }

        });

        //Cambiar icono
        setIconImage(new ImageIcon(getClass().getResource("../vistaimagen/icon3.png")).getImage());

    }

    private int obtenerNumeroMes(String nombreMes) {
        switch (nombreMes) {
            case "Enero":
                return 1;
            case "Febrero":
                return 2;
            case "Marzo":
                return 3;
            case "Abril":
                return 4;
            case "Mayo":
                return 5;
            case "Junio":
                return 6;
            case "Julio":
                return 7;
            case "Agosto":
                return 8;
            case "Septiembre":
                return 9;
            case "Octubre":
                return 10;
            case "Noviembre":
                return 11;
            case "Diciembre":
                return 12;
            default:
                return -1; // Valor por defecto en caso de no coincidir con ningún mes
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelDia = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabelMes = new javax.swing.JLabel();
        jComboBoxAño = new javax.swing.JComboBox<>();
        jLabelAño = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jTextFieldAño = new javax.swing.JTextField();
        jLabelingre = new javax.swing.JLabel();
        jLabelingre1 = new javax.swing.JLabel();
        jLabelingre2 = new javax.swing.JLabel();
        jLabel1fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombregrandeHotel = new javax.swing.JLabel();
        jLabelfondoingreso1 = new javax.swing.JLabel();
        jLabelfondoingreso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(162, 179, 216));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDia.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDia.setText("Dia");
        jPanel2.add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 45, 99, -1));

        jComboBoxDia.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBoxDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxDia.setPreferredSize(new java.awt.Dimension(111, 25));
        jPanel2.add(jComboBoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 81, 200, 50));

        jComboBoxMes.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jComboBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 205, 200, 50));

        jLabelMes.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMes.setText("Mes");
        jPanel2.add(jLabelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 169, 99, -1));

        jComboBoxAño.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jComboBoxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", " " }));
        jComboBoxAño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jComboBoxAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 346, 200, 50));

        jLabelAño.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAño.setText("Año");
        jPanel2.add(jLabelAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 309, 99, -1));

        jTextFieldDia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextFieldDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 81, 200, 50));

        jTextFieldMes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextFieldMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 205, 200, 50));

        jTextFieldAño.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldAño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextFieldAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 345, 200, 50));

        jLabelingre.setText("jLabel1");
        jPanel2.add(jLabelingre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 80, 60));

        jLabelingre1.setText("jLabel1");
        jPanel2.add(jLabelingre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 80, 60));

        jLabelingre2.setText("jLabel1");
        jPanel2.add(jLabelingre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 80, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 570, 460));

        jLabel1fondo.setText("jLabel1");
        jLabel1fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1644, 820));

        jPanel1.setBackground(new java.awt.Color(0, 94, 144));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombregrandeHotel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelNombregrandeHotel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombregrandeHotel.setText("Ingresos");
        jPanel1.add(jLabelNombregrandeHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 200, 60));
        jPanel1.add(jLabelfondoingreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 130));
        jPanel1.add(jLabelfondoingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, 170, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1765, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PantallaIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaIngresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAño;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabel1fondo;
    private javax.swing.JLabel jLabelAño;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelNombregrandeHotel;
    private javax.swing.JLabel jLabelfondoingreso;
    private javax.swing.JLabel jLabelfondoingreso1;
    private javax.swing.JLabel jLabelingre;
    private javax.swing.JLabel jLabelingre1;
    private javax.swing.JLabel jLabelingre2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldMes;
    // End of variables declaration//GEN-END:variables
}
