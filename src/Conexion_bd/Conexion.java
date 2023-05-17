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

    String conexionUrl = "jdb:sqlserver://localhost:51745;"
            + "database=DB_HotelMilenio;"
            + "integratedSecurity = true;" + " encrypt= true;trustServerCertificate= true;";

    public Connection conexion;//para la conexion con la BD

    public Conexion() { //constructor de la clase
        try {
            //usando Driver Conector y cadena de conexion para conectar BD
            conexion = DriverManager.getConnection(conexionUrl);
            System.out.println("Conexión Establecida");

        } catch (SQLException e) {
            System.out.println("Error de la conexión");
            e.printStackTrace();

        }
    }

}
