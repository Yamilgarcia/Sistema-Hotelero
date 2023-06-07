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
import modelo.Habitacion;

/**
 *
 * @author Usuario
 */
public class CRUDHabitacion {
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    
    public ArrayList<Habitacion> mostrarDatosCombo2() {
    ArrayList<Habitacion> habit = new ArrayList<>();

    try {
        CallableStatement cbstc = cn.prepareCall("{call RellenarHabitacion}");
        ResultSet rs = cbstc.executeQuery();

        while (rs.next()) {
            Habitacion ha = new Habitacion();
            ha.setN_de_habitacion(Integer.parseInt(rs.getString("N_de_habitacion")));
            ha.setNombre(rs.getString("Nombre"));
            habit.add(ha);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }

    return habit;
}

    
}
