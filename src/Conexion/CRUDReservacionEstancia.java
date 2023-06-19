/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Conexion_bd.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import modelo.ReservacionEstancia;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleReservacion;

/**
 *
 * @author Usuario
 */
public class CRUDReservacionEstancia {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public void GuardarReservacionYDetalle(ReservacionEstancia reservacion, DetalleReservacion detalle) {
    try {
        CallableStatement cbst = cn.prepareCall("{call InsertarReservaEstayDetalleReserva(?,?,?,?,?,?,?)}");

        // Parámetros de la tabla ReservacionEstancia
        cbst.setInt(1, reservacion.getID_cliente());
        cbst.setDate(2, reservacion.getF_entrada());
        cbst.setTimestamp(3, reservacion.getF_salida());
        cbst.setInt(4, reservacion.getID_Empleado());
        cbst.setString(5, reservacion.getTipoServicio());
        cbst.setString(6, reservacion.getEstadoReserva());

        // Parámetros de la tabla DetalleReservacion
        cbst.setInt(7, detalle.getN_de_habitacion());

        boolean result = cbst.execute();

        if (result) {
            ResultSet rs = cbst.getResultSet();
            if (rs.next()) {
                int idReservaEstancia = rs.getInt("ID_ReservaEstancia");
                int idDetalleReservacion = rs.getInt("ID_DetalleReservacion");
                
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

    
    
    
    
    public DefaultTableModel mostrarDatosReservaEstancia() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_ReservaEstancia", "ID_DetalleReservacion", "Nombre",  "Apellido",  "Cedula", "F_entrada",
            "F_Salida","Tipo_Servicio","N_Habitacion", "Nombre Empleado"};
        String[] registro = new String[10];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarReservacionDetalle}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_ReservaEstancia");
                registro[1] = rs.getString("ID_DetalleReservacion");
                registro[2] = rs.getString("Nombre");
                registro[3] = rs.getString("Apellido");
                registro[4] = rs.getString("Cedula");
                registro[5] = rs.getString("F_entrada");
                registro[6] = rs.getString("F_salida");
                registro[7] = rs.getString("TipoServicio");
                registro[8] = rs.getString("N_de_habitacion");
                registro[9] = rs.getString("NombreEmpleado");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    


}
