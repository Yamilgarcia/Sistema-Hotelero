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
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class CRUDCliente {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_General","ID_Cliente", "Cedula_cliente", "Nombre", "Segundo Nombre", "Apellido", "Segundo Apellido", "Procedencia", "Telefono"};
        String[] registro = new String[9];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarClientes}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Persona");
                registro[1] = rs.getString("ID_Cliente");
                registro[2] = rs.getString("Cedula");
                registro[3] = rs.getString("Nombre1");
                registro[4] = rs.getString("Nombre2");
                registro[5] = rs.getString("Apellido1");
                registro[6] = rs.getString("Apellido2");
                registro[7] = rs.getString("Procedencia");
                registro[8] = rs.getString("Telefono");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public DefaultTableModel buscarDatos(String Dato) {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Cliente", "Cedula_cliente", "Nombre", "Segundo Nombre", "Apellido", "Segundo Apellido", "Procedencia", "Telefono"};
        String[] registro = new String[8];
        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement call = cn.prepareCall("{call ConsultarClientes(?)}");
            call.setString(1, Dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_cliente");
                registro[1] = rs.getString("Cedula");
                registro[2] = rs.getString("Nombre1");
                registro[3] = rs.getString("Nombre2");
                registro[4] = rs.getString("Apellido1");
                registro[5] = rs.getString("Apellido2");
                registro[6] = rs.getString("Procedencia");
                registro[7] = rs.getString("Telefono");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
//Preguntar como se hace esto xd

    public void ActualizarDatos(Cliente C1) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarCliente(?,?,?,?,?,?,?,?)}");

            cbst.setInt(1, C1.getID_Persona());
            cbst.setString(2, C1.getCedula());
            cbst.setString(3, C1.getNombre1());
            cbst.setString(4, C1.getNombre2());
            cbst.setString(5, C1.getApellido1());
            cbst.setString(6, C1.getApellido2());
            cbst.setString(7, C1.getProcedencia());
            cbst.setString(8, C1.getTelefono());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Eliminar(int ID_Persona) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCliente(?)}");
            cbst.setInt(1, ID_Persona);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Guardar(Cliente Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearCliente(?,?,?,?,?,?,?)}");
            cbst.setString(1, Cl.getProcedencia());
            cbst.setString(2, Cl.getCedula());
            cbst.setString(3, Cl.getNombre1());
            cbst.setString(4, Cl.getNombre2());
            cbst.setString(5, Cl.getApellido1());
            cbst.setString(6, Cl.getApellido2());
            cbst.setString(7, Cl.getTelefono());

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public boolean VerificarDatos(String Dato) {
        ResultSet rs;
        try {
            CallableStatement call = cn.prepareCall("{call ConsultarClientes(?)}");
            call.setString(1, Dato);
            rs = call.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

}
