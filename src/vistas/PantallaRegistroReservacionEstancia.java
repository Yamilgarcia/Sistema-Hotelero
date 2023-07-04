/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Conexion.CRUDCliente;
import Conexion.CRUDEmpleado;
import Conexion.CRUDHabitacion;
import Conexion.CRUDReservacionEstancia;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.CryptoPrimitive;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleReservacion;
import modelo.Empleado;
import modelo.Habitacion;
import modelo.Persona;
import modelo.ReservacionEstancia;
import modelo.ValidarCampos;
import static vistas.RegistrarEmpleado.jTextFieldIDEmpleado;

/**
 *
 * @author HP
 */
public class PantallaRegistroReservacionEstancia extends javax.swing.JFrame {

    ValidarCampos validar = new ValidarCampos();
    int columnaPrecio = 6;
    double sumaTotal = 0.0;

    DefaultTableModel modelo;
    int datoSeleccionado = -1;
    String[] titulos = {"ID_Habitacion", "N_habitacion", "Nombre", "Descripcion", "Num_Cama", "Estado", "Precio"};
    String[] datos = new String[7];

    public PantallaRegistroReservacionEstancia() {

        initComponents();

        jTextFieldIDReservaEstancia.setVisible(false);
        jTextFieldSeleccion.setEnabled(false);
        jTextFieldSeleccion.setVisible(false);

        jRadioButtonReservacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextFieldSeleccion.setText(jRadioButtonReservacion.getText());
            }
        });

        jRadioButtonEstadia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextFieldSeleccion.setText(jRadioButtonEstadia.getText());
            }
        });

        ButtonGroup grupoRadios = new ButtonGroup();
        grupoRadios.add(jRadioButtonReservacion);
        grupoRadios.add(jRadioButtonEstadia);

        jTextFieldIDclienteER.setVisible(false);

        jTextFieldPrecio.setEnabled(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src\\vistaimagen\\FondoHotel.jpg");

        llenarCombo1();
        llenarCombo2();
        modelo = new DefaultTableModel(null, titulos);

    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDHabitacion cli = new CRUDHabitacion();
            modelo = cli.mostrarDatosHabitacion();
            jTablehabitaciones.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void llenarCombo1() {
        CRUDEmpleado gr = new CRUDEmpleado();
        ArrayList<Empleado> listaEmpleados = gr.mostrarDatosCombo();
        jComboBoxEmpleado.removeAllItems();
        for (int i = 0; i < listaEmpleados.size(); i++) {
            jComboBoxEmpleado.addItem(new Empleado(
                    listaEmpleados.get(i).getID_Empleado(),
                    listaEmpleados.get(i).getNombre1()));
        }

    }

    public void llenarCombo2() {
        CRUDHabitacion EMP = new CRUDHabitacion();
        ArrayList<Habitacion> listaHabitacion = EMP.mostrarDatosCombo2();
        jComboBoxHabitacion.removeAllItems();

        // Configurar el renderizado personalizado del JComboBox
        jComboBoxHabitacion.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                // Obtener el objeto Habitacion
                Habitacion habitacion = (Habitacion) value;

                // Construir el texto del JLabel incluyendo el estado
                String labelText = habitacion.getN_de_habitacion() + " - " + habitacion.getNombre(); //+ " (" + habitacion.getEstado() + ")";

                // Configurar el texto del JLabel
                label.setText(labelText);

                return label;
            }
        });

        // Añadir los elementos al JComboBox
        for (int i = 0; i < listaHabitacion.size(); i++) {
            Habitacion habitacion = listaHabitacion.get(i);
            jComboBoxHabitacion.addItem(habitacion);
        }
    }

//    public void llenarCombo2() {
//        CRUDHabitacion EMP = new CRUDHabitacion();
//        ArrayList<Habitacion> listaHabitacion = EMP.mostrarDatosCombo2();
//        jComboBoxHabitacion.removeAllItems();
//        for (int i = 0; i < listaHabitacion.size(); i++) {
//            Habitacion habitacion = listaHabitacion.get(i);
//            jComboBoxHabitacion.addItem(habitacion);
//        }
//    }
    public void guardarRE() {

        String strFecha = jTextFieldFechEntrada1.getText();
        java.sql.Date fecha = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFecha = format.parse(strFecha);
            fecha = new java.sql.Date(utilFecha.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String sttrFecha = jTextFieldFechSalida.getText();
        java.sql.Timestamp fechass = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFecha = format.parse(sttrFecha);

            // Crear un objeto Calendar y establecer la fecha y hora
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(utilFecha);
            calendar.set(Calendar.HOUR_OF_DAY, 9);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);

            // Obtener la fecha y hora modificadas
            java.util.Date fechaHoraSalida = calendar.getTime();
            fechass = new java.sql.Timestamp(fechaHoraSalida.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Empleado empleadoSeleccionado = (Empleado) jComboBoxEmpleado.getSelectedItem();
        int idEmpleado = empleadoSeleccionado.getID_Empleado();

        CRUDReservacionEstancia cc = new CRUDReservacionEstancia();
        ReservacionEstancia ct = new ReservacionEstancia(Integer.parseInt(jTextFieldIDclienteER.getText()),
                fecha,
                fechass,
                empleadoSeleccionado.getID_Empleado(),
                jTextFieldSeleccion.getText(),
                "Activa");

        DetalleReservacion detalleReservacion = new DetalleReservacion();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            int nhabitacion = Integer.parseInt(jTablehabitaciones.getValueAt(i, 0).toString());
            detalleReservacion.setID_Habitacion(nhabitacion);

            cc.GuardarReservacionYDetalle(ct, detalleReservacion);

        }
    }

    public void limpiar() {
        jTextFieldClienteReser.setText("");
        jTextFieldClienteApellido.setText("");
        jTextFieldSeleccion.setText("");
        jTextFieldFechEntrada1.setText("");
        jTextFieldFechSalida.setText("");
        jTextFieldPrecio.setText("");

    }

    private void limpiarTabla(DefaultTableModel modelo) {
        // Elimina todas las filas de la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void editarEstadoReseEstancia() {
        try {
            // Obtener el número de columna de N_habitacion y Estado en la tabla
            int columnaIDHabitacion = 0;
            int columnaEstado = 5;

            // Obtener el valor del JTextFieldSeleccion
            String seleccion = jTextFieldSeleccion.getText();

            // Verificar el valor del JTextFieldSeleccion
            if (seleccion.equals("Estadia")) {
                // Iterar sobre las filas de la tabla
                for (int i = 0; i < jTablehabitaciones.getRowCount(); i++) {
                    // Obtener el número de habitación y el nuevo estado de la fila
                    int idhabitacion = Integer.parseInt(jTablehabitaciones.getValueAt(i, columnaIDHabitacion).toString());
                    String nuevoEstado = "Ocupado"; // Reemplaza con el nuevo estado que desees

                    // Crear un objeto Habitacion con el número de habitación y el nuevo estado
                    Habitacion habitacion = new Habitacion();
                    habitacion.setID_Habitacion(idhabitacion);
                    habitacion.setEstado(nuevoEstado);

                    // Llamar al método para actualizar el estado de la habitación
                    CRUDHabitacion crudHabitacion = new CRUDHabitacion();
                    crudHabitacion.ActualizarDatosEstadoHabit(habitacion);
                }

                // Refrescar el ComboBox
                llenarCombo2();

            } else if (seleccion.equals("Reservacion")) {
                for (int i = 0; i < jTablehabitaciones.getRowCount(); i++) {
                    // Obtener el número de habitación y el nuevo estado de la fila
                    int idhabitacion = Integer.parseInt(jTablehabitaciones.getValueAt(i, columnaIDHabitacion).toString());
                    String nuevoEstado = "Reservado"; // Reemplaza con el nuevo estado que desees

                    // Crear un objeto Habitacion con el número de habitación y el nuevo estado
                    Habitacion habitacion = new Habitacion();
                    habitacion.setID_Habitacion(idhabitacion);
                    habitacion.setEstado(nuevoEstado);

                    // Llamar al método para actualizar el estado de la habitación
                    CRUDHabitacion crudHabitacion = new CRUDHabitacion();
                    crudHabitacion.ActualizarDatosEstadoHabit(habitacion);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void EditarReservaEstancia() {

        String FechaENTRADA = jTextFieldFechEntrada1.getText();
        java.sql.Date FechEntra = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFecha = format.parse(FechaENTRADA);
            FechEntra = new java.sql.Date(utilFecha.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String sttrFecha = jTextFieldFechSalida.getText();
        java.sql.Timestamp fechasstt = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFecha = format.parse(sttrFecha);

            // Crear un objeto Calendar y establecer la fecha y hora
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(utilFecha);
            calendar.set(Calendar.HOUR_OF_DAY, 9);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);

            // Obtener la fecha y hora modificadas
            java.util.Date fechaHoraSalida = calendar.getTime();
            fechasstt = new java.sql.Timestamp(fechaHoraSalida.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        CRUDReservacionEstancia cc = new CRUDReservacionEstancia();

        ReservacionEstancia cl = new ReservacionEstancia((Integer.parseInt(jTextFieldIDReservaEstancia.getText())),
                jTextFieldSeleccion.getText(),
                FechEntra,
                fechasstt);

        cc.ActualizarDatos(cl);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new java.awt.Panel();
        panel5 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablehabitaciones = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabelPrecio2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldSeleccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbuttonRegistrahabitacionNow = new javax.swing.JButton();
        labelHabitacion = new javax.swing.JLabel();
        jTextFieldClienteReser = new javax.swing.JTextField();
        labelcliente = new javax.swing.JLabel();
        jbuttonBuscarCliente = new javax.swing.JButton();
        labelcliente1 = new javax.swing.JLabel();
        jComboBoxEmpleado = new javax.swing.JComboBox<>();
        jRadioButtonReservacion = new javax.swing.JRadioButton();
        jRadioButtonEstadia = new javax.swing.JRadioButton();
        jLabelFechaEntrada1 = new javax.swing.JLabel();
        jLabelFechaSalida = new javax.swing.JLabel();
        jTextFieldFechEntrada1 = new javax.swing.JTextField();
        jTextFieldFechSalida = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jComboBoxHabitacion = new javax.swing.JComboBox<>();
        jbuttonIrRegistroCliente = new javax.swing.JButton();
        jButtonRegistrarReservaEstancia = new javax.swing.JButton();
        jButtonACTUALIZAR = new javax.swing.JButton();
        jTextFieldClienteApellido = new javax.swing.JTextField();
        labelcliente2 = new javax.swing.JLabel();
        jbuttonRestarhabitacionNow1 = new javax.swing.JButton();
        jTextFieldIDclienteER = new javax.swing.JTextField();
        jTextFieldIDReservaEstancia = new javax.swing.JTextField();
        jbottonVerHabitacion = new javax.swing.JButton();
        jbottonVerReservaciones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel5.setBackground(new java.awt.Color(0, 94, 144));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagina Estancia/Reservaciones");
        panel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 630, -1));

        panel4.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 120));

        jPanel1.setBackground(new java.awt.Color(162, 179, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablehabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablehabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablehabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablehabitaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 430, 200));

        jPanel3.setBackground(new java.awt.Color(162, 179, 216));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPrecio2.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrecio2.setText("Habitaciones");
        jPanel3.add(jLabelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 450, 20));

        jTextFieldSeleccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextFieldSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 200, 32));

        panel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 450, 520));

        jPanel2.setBackground(new java.awt.Color(162, 179, 216));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbuttonRegistrahabitacionNow.setBackground(new java.awt.Color(216, 199, 162));
        jbuttonRegistrahabitacionNow.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbuttonRegistrahabitacionNow.setText("+");
        jbuttonRegistrahabitacionNow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonRegistrahabitacionNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonRegistrahabitacionNowMouseClicked(evt);
            }
        });
        jbuttonRegistrahabitacionNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonRegistrahabitacionNowActionPerformed(evt);
            }
        });
        jPanel2.add(jbuttonRegistrahabitacionNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        labelHabitacion.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        labelHabitacion.setText("Habitacion");
        jPanel2.add(labelHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jTextFieldClienteReser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldClienteReser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldClienteReser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClienteReserKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldClienteReser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 130, 32));

        labelcliente.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        labelcliente.setText("Apellido");
        jPanel2.add(labelcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jbuttonBuscarCliente.setBackground(new java.awt.Color(216, 199, 162));
        jbuttonBuscarCliente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbuttonBuscarCliente.setText("...");
        jbuttonBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonBuscarClienteMouseClicked(evt);
            }
        });
        jbuttonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbuttonBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 50, -1));

        labelcliente1.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        labelcliente1.setText("Empleado");
        jPanel2.add(labelcliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jComboBoxEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBoxEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxEmpleado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEmpleadoItemStateChanged(evt);
            }
        });
        jComboBoxEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 200, 32));

        jRadioButtonReservacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jRadioButtonReservacion.setText("Reservacion");
        jRadioButtonReservacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonReservacionActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 194, -1, -1));

        jRadioButtonEstadia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jRadioButtonEstadia.setText("Estadia");
        jRadioButtonEstadia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonEstadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadiaActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonEstadia, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 194, -1, -1));

        jLabelFechaEntrada1.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelFechaEntrada1.setText("Fecha Entrada");
        jPanel2.add(jLabelFechaEntrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabelFechaSalida.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelFechaSalida.setText("Fecha Salida");
        jPanel2.add(jLabelFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jTextFieldFechEntrada1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldFechEntrada1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextFieldFechEntrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 200, 32));

        jTextFieldFechSalida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldFechSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldFechSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechSalidaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldFechSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 200, 32));

        jTextFieldPrecio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 200, 32));

        jLabelPrecio.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        jLabelPrecio.setText("Total a pagar");
        jPanel2.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jComboBoxHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBoxHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxHabitacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxHabitacionItemStateChanged(evt);
            }
        });
        jComboBoxHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHabitacionActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 200, 32));

        jbuttonIrRegistroCliente.setBackground(new java.awt.Color(216, 199, 162));
        jbuttonIrRegistroCliente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbuttonIrRegistroCliente.setText("+");
        jbuttonIrRegistroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonIrRegistroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonIrRegistroClienteMouseClicked(evt);
            }
        });
        jbuttonIrRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonIrRegistroClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbuttonIrRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jButtonRegistrarReservaEstancia.setBackground(new java.awt.Color(216, 199, 162));
        jButtonRegistrarReservaEstancia.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonRegistrarReservaEstancia.setText("Registrar");
        jButtonRegistrarReservaEstancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarReservaEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarReservaEstanciaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegistrarReservaEstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 120, 40));

        jButtonACTUALIZAR.setBackground(new java.awt.Color(216, 199, 162));
        jButtonACTUALIZAR.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        jButtonACTUALIZAR.setText("Actualizar");
        jButtonACTUALIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACTUALIZARActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 120, 40));

        jTextFieldClienteApellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextFieldClienteApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldClienteApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClienteApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldClienteApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 130, 32));

        labelcliente2.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        labelcliente2.setText("Cliente");
        jPanel2.add(labelcliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jbuttonRestarhabitacionNow1.setBackground(new java.awt.Color(216, 199, 162));
        jbuttonRestarhabitacionNow1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbuttonRestarhabitacionNow1.setText("-");
        jbuttonRestarhabitacionNow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonRestarhabitacionNow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonRestarhabitacionNow1MouseClicked(evt);
            }
        });
        jbuttonRestarhabitacionNow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonRestarhabitacionNow1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbuttonRestarhabitacionNow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));
        jPanel2.add(jTextFieldIDclienteER, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 30));
        jPanel2.add(jTextFieldIDReservaEstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 40, 20));

        jbottonVerHabitacion.setBackground(new java.awt.Color(216, 199, 162));
        jbottonVerHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbottonVerHabitacion.setText("Ver Habitaciones");
        jbottonVerHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbottonVerHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonVerHabitacionActionPerformed(evt);
            }
        });
        jPanel2.add(jbottonVerHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 140, 30));

        jbottonVerReservaciones.setBackground(new java.awt.Color(216, 199, 162));
        jbottonVerReservaciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbottonVerReservaciones.setText("Ver Reservaciones");
        jbottonVerReservaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbottonVerReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonVerReservacionesActionPerformed(evt);
            }
        });
        jPanel2.add(jbottonVerReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 150, 30));

        panel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 560, 520));

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

    private void jButtonRegistrarReservaEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarReservaEstanciaActionPerformed
        CRUDReservacionEstancia cl = new CRUDReservacionEstancia();
        try {
            if (jTextFieldClienteReser.getText().equals("")
                    || jTextFieldClienteApellido.getText().equals("")
                    || jTextFieldSeleccion.getText().equals("")
                    || jTextFieldFechEntrada1.getText().equals("")
                    || jTextFieldFechSalida.getText().equals("")
                    || jTextFieldPrecio.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
                JOptionPane.showMessageDialog(null, "Si no tiene campos vacíos, seleccione nuevamente el tipo de servicio");
            } else {
                int columnaEstado = 5;
                boolean habitacionOcupada = false;

                for (int i = 0; i < jTablehabitaciones.getRowCount(); i++) {
                    habitacionOcupada = jTablehabitaciones.getValueAt(i, columnaEstado).equals("Ocupado");
                    if (habitacionOcupada) {
                        break;
                    }
                }

                if (habitacionOcupada) {
                    JOptionPane.showMessageDialog(null, "Hay habitaciones ocupadas. Seleccione otra habitación");
                } else {
                    guardarRE();
                    editarEstadoReseEstancia();
                    limpiar();
                    DefaultTableModel modelo = (DefaultTableModel) jTablehabitaciones.getModel();
                    limpiarTabla(modelo);

                    JOptionPane.showMessageDialog(null, "Datos guardados");
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }


    }//GEN-LAST:event_jButtonRegistrarReservaEstanciaActionPerformed

    private void jbuttonRegistrahabitacionNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonRegistrahabitacionNowMouseClicked

    }//GEN-LAST:event_jbuttonRegistrahabitacionNowMouseClicked

    private void jbuttonRegistrahabitacionNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonRegistrahabitacionNowActionPerformed

        try {
            CRUDHabitacion hab = new CRUDHabitacion();
            boolean band = true;

            // Obtener habitación seleccionada del combo
            Habitacion habitacionSeleccionada = (Habitacion) jComboBoxHabitacion.getSelectedItem();
            int idhab = habitacionSeleccionada.getID_Habitacion();
            int cod = habitacionSeleccionada.getN_de_habitacion();
            String nombre = habitacionSeleccionada.getNombre();
            String descripcion = habitacionSeleccionada.getDescripcion();
            int num_camas = habitacionSeleccionada.getNum_Cama();
            String estado = habitacionSeleccionada.isEstado();
            float precio = habitacionSeleccionada.getPrecio();

            // Obtener el índice de la columna de precio en la tabla
            int columnaPrecio = 6;

            // Verificar si la habitación ya ha sido agregada a la tabla
            if (modelo.getRowCount() >= 0) {
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    int dato = Integer.parseInt(jTablehabitaciones.getValueAt(i, 0).toString());
                    if (cod == dato) {
                        band = false;
                        break;
                    }
                }
            }

            if (band) {
                datos[0] = String.valueOf(idhab);
                datos[1] = String.valueOf(cod);
                datos[2] = nombre;
                datos[3] = descripcion;
                datos[4] = String.valueOf(num_camas);
                datos[5] = String.valueOf(estado);
                datos[6] = String.valueOf(precio);

                modelo.addRow(datos);
                jTablehabitaciones.setModel(modelo);

                // Actualizar el JTextField con el precio de la habitación seleccionada
                jTextFieldPrecio.setText(String.valueOf(precio));

                // Obtener la suma total actualizada
                double sumaTotal = 0.0;
                for (int i = 0; i < jTablehabitaciones.getRowCount(); i++) {
                    double precioHabitacion = Double.parseDouble(jTablehabitaciones.getValueAt(i, columnaPrecio).toString());
                    sumaTotal += precioHabitacion;
                }
                jTextFieldPrecio.setText(String.valueOf(sumaTotal));

            } else {
                JOptionPane.showMessageDialog(null, "Dato ya ha sido agregado");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jbuttonRegistrahabitacionNowActionPerformed


    private void jRadioButtonReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReservacionActionPerformed


    }//GEN-LAST:event_jRadioButtonReservacionActionPerformed

    private void jRadioButtonEstadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadiaActionPerformed

    }//GEN-LAST:event_jRadioButtonEstadiaActionPerformed

    private void jbuttonBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonBuscarClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonBuscarClienteMouseClicked

    private void jbuttonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonBuscarClienteActionPerformed
        PantallaBusquedaCliente BusCl = new PantallaBusquedaCliente();
        BusCl.setVisible(true);
        PantallaBusquedaCliente.jtextButtonAggCliReser.setVisible(true);
        PantallaBusquedaCliente.jtextButtonAggCliReser.setEnabled(true);
        PantallaBusquedaCliente.jbuttonEditar.setVisible(false);
        PantallaBusquedaCliente.jbuttonEliminar.setVisible(false);
        PantallaBusquedaCliente.jtextButtonRefresh.setVisible(false);
    }//GEN-LAST:event_jbuttonBuscarClienteActionPerformed

    private void jTextFieldFechSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechSalidaActionPerformed

    }//GEN-LAST:event_jTextFieldFechSalidaActionPerformed


    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jComboBoxEmpleadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEmpleadoItemStateChanged

    }//GEN-LAST:event_jComboBoxEmpleadoItemStateChanged

    private void jComboBoxHabitacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxHabitacionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHabitacionItemStateChanged

    private void jbuttonIrRegistroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonIrRegistroClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonIrRegistroClienteMouseClicked

    private void jbuttonIrRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonIrRegistroClienteActionPerformed
        PantallaClienteRegistro Cli = new PantallaClienteRegistro();
        Cli.setVisible(true);
        PantallaClienteRegistro.jButtonActualizar.setVisible(false);
    }//GEN-LAST:event_jbuttonIrRegistroClienteActionPerformed

    private void jComboBoxEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEmpleadoActionPerformed

    private void jTablehabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablehabitacionesMouseClicked
        datoSeleccionado = jTablehabitaciones.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTablehabitacionesMouseClicked

    private void jbuttonRestarhabitacionNow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonRestarhabitacionNow1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonRestarhabitacionNow1MouseClicked

    private void jbuttonRestarhabitacionNow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonRestarhabitacionNow1ActionPerformed
        try {
            int filaSeleccionada = jTablehabitaciones.getSelectedRow();

            if (filaSeleccionada != -1) {
                double precioHabitacionEliminada = Double.parseDouble(jTablehabitaciones.getValueAt(filaSeleccionada, columnaPrecio).toString());

                // Restar el precio de la habitación eliminada
                double sumaTotal = Double.parseDouble(jTextFieldPrecio.getText());
                sumaTotal -= precioHabitacionEliminada;
                jTextFieldPrecio.setText(String.valueOf(sumaTotal));

                // Eliminar la fila seleccionada de la tabla
                modelo.removeRow(filaSeleccionada);
                jTablehabitaciones.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una habitación para eliminar.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el precio de la habitación.");
        }
    }//GEN-LAST:event_jbuttonRestarhabitacionNow1ActionPerformed

    private void jComboBoxHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHabitacionActionPerformed

    private void jTextFieldClienteReserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClienteReserKeyTyped
        // TODO add your handling code here:
        validar.KeyTipedTXT(evt);
    }//GEN-LAST:event_jTextFieldClienteReserKeyTyped

    private void jTextFieldClienteApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClienteApellidoKeyTyped
        // TODO add your handling code here:
        validar.KeyTipedTXT(evt);
    }//GEN-LAST:event_jTextFieldClienteApellidoKeyTyped

    private void jButtonACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonACTUALIZARActionPerformed
        try {
            if (jTextFieldIDReservaEstancia.getText().isEmpty()
                    || jTextFieldFechEntrada1.getText().isEmpty()
                    || jTextFieldFechSalida.getText().isEmpty()
                    || jTextFieldSeleccion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacíos");
            } else {
                EditarReservaEstancia();
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                dispose();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonACTUALIZARActionPerformed

    private void jbottonVerHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonVerHabitacionActionPerformed
        VistaHabitaciones VH = new VistaHabitaciones();
        VH.setVisible(true);
        VH.jbottonChangeSucio.setVisible(false);
        VH.jbottonChangeDisponible.setVisible(false);
    }//GEN-LAST:event_jbottonVerHabitacionActionPerformed

    private void jbottonVerReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonVerReservacionesActionPerformed
        PantallBusquedaReservacionEstancia BUR = new PantallBusquedaReservacionEstancia();
        BUR.setVisible(true);
    }//GEN-LAST:event_jbottonVerReservacionesActionPerformed

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
    public static javax.swing.JButton jButtonACTUALIZAR;
    public static javax.swing.JButton jButtonRegistrarReservaEstancia;
    public static javax.swing.JComboBox<Empleado> jComboBoxEmpleado;
    private javax.swing.JComboBox<Habitacion> jComboBoxHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFechaEntrada1;
    private javax.swing.JLabel jLabelFechaSalida;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelPrecio2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonEstadia;
    private javax.swing.JRadioButton jRadioButtonReservacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablehabitaciones;
    public static javax.swing.JTextField jTextFieldClienteApellido;
    public static javax.swing.JTextField jTextFieldClienteReser;
    public static javax.swing.JTextField jTextFieldFechEntrada1;
    public static javax.swing.JTextField jTextFieldFechSalida;
    public static javax.swing.JTextField jTextFieldIDReservaEstancia;
    public static javax.swing.JTextField jTextFieldIDclienteER;
    private javax.swing.JTextField jTextFieldPrecio;
    public static javax.swing.JTextField jTextFieldSeleccion;
    private javax.swing.JButton jbottonVerHabitacion;
    private javax.swing.JButton jbottonVerReservaciones;
    private javax.swing.JButton jbuttonBuscarCliente;
    private javax.swing.JButton jbuttonIrRegistroCliente;
    private javax.swing.JButton jbuttonRegistrahabitacionNow;
    private javax.swing.JButton jbuttonRestarhabitacionNow1;
    private javax.swing.JLabel labelHabitacion;
    private javax.swing.JLabel labelcliente;
    private javax.swing.JLabel labelcliente1;
    private javax.swing.JLabel labelcliente2;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    // End of variables declaration//GEN-END:variables
}
