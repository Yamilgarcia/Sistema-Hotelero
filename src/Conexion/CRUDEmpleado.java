/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Conexion_bd.Conexion;
import java.awt.PageAttributes;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class CRUDEmpleado {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatosEmpleado() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Persona","ID_Empleado", "Nombre", "Segundo Nombre", "Apellido", "Segundo Apellido", "Telefono", "Usuario", "Contraseña"};
        String[] registro = new String[9];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarEmpleados}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Persona");
                registro[1] = rs.getString("ID_Empleado");
                registro[2] = rs.getString("Nombre1");
                registro[3] = rs.getString("Nombre2");
                registro[4] = rs.getString("Apellido1");
                registro[5] = rs.getString("Apellido2");
                registro[6] = rs.getString("Telefono");
                registro[7] = rs.getString("Usuario");
                registro[8] = rs.getString("Contraseña");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public DefaultTableModel buscarDatosEmpleado(String Dato) {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Empleado", "Nombre", "Segundo Nombre", "Apellido", "Segundo Apellido", "Telefono", "Usuario", "Contraseña"};
        String[] registro = new String[8];
        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement call = cn.prepareCall("{call ConsultarEmpleado(?)}");
            call.setString(1, Dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Empleado");
                registro[1] = rs.getString("Nombre1");
                registro[2] = rs.getString("Nombre2");
                registro[3] = rs.getString("Apellido1");
                registro[4] = rs.getString("Apellido2");
                registro[5] = rs.getString("Telefono");
                registro[6] = rs.getString("Usuario");
                registro[7] = rs.getString("Contraseña");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void Guardar(Empleado Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearEmpleado(?,?,?,?,?,?,?)}");

            cbst.setString(1, Cl.getNombre1());
            cbst.setString(2, Cl.getNombre2());
            cbst.setString(3, Cl.getApellido1());
            cbst.setString(4, Cl.getApellido2());
            cbst.setString(5, Cl.getTelefono());
            cbst.setString(6, Cl.getUsuario());
            cbst.setString(7, Cl.getContraseña());

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ActualizarDatosEmpleado(Empleado C5) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarEmpleado(?,?,?,?,?,?,?,?)}");

            cbst.setInt(1, C5.getID_Persona());
            cbst.setString(2, C5.getNombre1());
            cbst.setString(3, C5.getNombre2());
            cbst.setString(4, C5.getApellido1());
            cbst.setString(5, C5.getApellido2());
            cbst.setString(6, C5.getTelefono());
            cbst.setString(7, C5.getUsuario());
            cbst.setString(8, C5.getContraseña());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
