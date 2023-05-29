/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_bd;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    

    private final String 
            conexionUrl = "jdbc:sqlserver://localhost:49899;"
            + "database=DB_HotelMilenio;"
            + "integratedSecurity = true;" + " encrypt= true;trustServerCertificate= true;";

    Connection cn;

    public Connection conectar() { //constructor de la clase
        try {
            //usando Driver Conector y cadena de conexion para conectar BD
            cn = DriverManager.getConnection(conexionUrl);
            System.out.println("Conexión Establecida");
            return cn;

        } catch (SQLException e) {
            System.out.println("Error de la conexión: " + e);

        }
        return null;
    }

}
