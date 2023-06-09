/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Conexion_bd.Conexion;
import java.security.Timestamp;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Habitacion;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 *
 * @author Usuario
 */
public class CRUDHabitacion {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatosHabitacion() {

        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Habitacion", "N_de_habitacion", "Nombre", "Descripcion", "Num_Cama", "Estado", "Precio", "F_entrada", "F_salida"};
        String[] registro = new String[9];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarHabitacion}");
            rs = cbstc.executeQuery();

            // Obtener el formato deseado para la fecha
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                registro[0] = rs.getString("ID_Habitacion");
                registro[1] = rs.getString("N_de_habitacion");
                registro[2] = rs.getString("Nombre");
                registro[3] = rs.getString("Descripcion");
                registro[4] = rs.getString("Num_Cama");
                registro[5] = rs.getString("Estado");
                registro[6] = rs.getString("Precio");

                // Obtener la fecha de entrada como una cadena de texto
                String fechaEntrada = rs.getString("F_entrada");

                // Obtener la fecha de salida como una cadena de texto
                String fechaSalida = rs.getString("F_salida");

                // Verificar si la cadena de fecha de entrada no está vacía
                if (!fechaEntrada.isEmpty()) {
                    // Formatear la fecha de entrada al formato dd/MM/yyyy
                    Date fechaEntradaDate = formatoFecha.parse(fechaEntrada);
                    fechaEntrada = formatoFecha.format(fechaEntradaDate);
                }

                // Verificar si la cadena de fecha de salida no está vacía
                if (!fechaSalida.isEmpty()) {
                    // Formatear la fecha de salida al formato dd/MM/yyyy
                    Date fechaSalidaDate = formatoFecha.parse(fechaSalida);
                    fechaSalida = formatoFecha.format(fechaSalidaDate);
                }

                registro[7] = fechaEntrada;
                registro[8] = fechaSalida;

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public ArrayList<Habitacion> mostrarDatosCombo2() {
        ArrayList<Habitacion> habit = new ArrayList<>();

        try {
            CallableStatement cbstc = cn.prepareCall("{call RellenarHabitacion}");
            ResultSet rs = cbstc.executeQuery();

            while (rs.next()) {
                Habitacion ha = new Habitacion();
                ha.setID_Habitacion(Integer.parseInt(rs.getString("ID_Habitacion")));
                ha.setN_de_habitacion(Integer.parseInt(rs.getString("N_de_habitacion")));
                ha.setNombre(rs.getString("Nombre"));
                ha.setDescripcion(rs.getString("Descripcion"));
                ha.setNum_Cama(rs.getInt("Num_cama"));
                ha.setEstado(rs.getString("Estado"));
                ha.setPrecio(rs.getFloat("Precio"));
                habit.add(ha);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return habit;
    }

    //PRINCIPAL
    public void ActualizarDatosEstadoHabit(Habitacion habitacion) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarEstadoHabitacion(?, ?)}");

            cbst.setInt(1, habitacion.getID_Habitacion());
            cbst.setString(2, habitacion.getEstado());

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel buscarDatos(String Dato) {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Reserva", "Numero de habitacion", "Nombre", "Descripcion", "Num_cama", "Estado", "Precio", "F_Entrada", "F_Salida"};
        String[] registro = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement call = cn.prepareCall("{call ConsultarHabitacion(?)}");
            call.setString(1, Dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_ReservaEstancia");
                registro[1] = rs.getString("N_de_habitacion");
                registro[2] = rs.getString("Nombre");
                registro[3] = rs.getString("Descripcion");
                registro[4] = rs.getString("Num_Cama");
                registro[5] = rs.getString("Estado");
                registro[6] = rs.getString("Precio");
                registro[7] = rs.getString("F_entrada");
                registro[8] = rs.getString("F_salida");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
