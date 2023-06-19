/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Conexion_bd.Conexion;
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
        String[] titulos = {"Numero de habitacion", "Nombre", "Descripcion", "Num_cama", "Estado", "Precio"};
        String[] registro = new String[6];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarHabitacion}");
            rs = cbstc.executeQuery();

            while (rs.next()) {

                registro[0] = rs.getString("N_de_habitacion");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Descripcion");
                registro[3] = rs.getString("Num_Cama");
                registro[4] = rs.getString("Estado");
                registro[5] = rs.getString("Precio");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
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

    
    
    
    public void ActualizarDatosEstadoHabit(Habitacion C5) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarEstadoHabitacion(?,?)}");

            cbst.setInt(1, C5.getN_de_habitacion());
            cbst.setString(2, C5.getEstado());
            
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    
    
   

    
    
}
