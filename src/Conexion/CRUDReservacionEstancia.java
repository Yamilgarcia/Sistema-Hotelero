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
/**
 *
 * @author Usuario
 */
public class CRUDReservacionEstancia {
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
    
    public void Guardar(ReservacionEstancia Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearEstaReserv(?,?,?,?,?,?)}");

            cbst.setInt(1, Cl.getID_cliente());
            cbst.setDate(2, Cl.getF_entrada());
            cbst.setDate(3, Cl.getF_salida());
            cbst.setInt(4, Cl.getID_Empleado());
            cbst.setString(5, Cl.getTipoServicio());
            cbst.setString(6, Cl.getEstadoReserva());
            

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
}
