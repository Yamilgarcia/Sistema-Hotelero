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

    public int Actualizar(String consulta) {
        try {//para manejar errores al realizar la conexión y transaccion en BD
            Statement st = conexion.createStatement();
            return st.executeUpdate(consulta);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return 0;

    }

    private List OrganizarDatos(ResultSet rs) {
        List filas = new ArrayList();//Arreglo elementos

        try {
            int numColumnas = rs.getMetaData().getColumnCount();
            while (rs.next()) {//recorre cada registro de la tabla
                Map<String, Object> renglon = new HashMap();
                for (int i = 1; i <= numColumnas; i++) {
                    //Se obtiene el nombre de campo en la BD
                    String nombreCampo = rs.getMetaData().getColumnName(i);
                    Object valor = rs.getObject(nombreCampo);
                    //por cada campo, se obtiene el numero y el valor del mismo
                    renglon.put(nombreCampo, valor);
                }
                filas.add(renglon);//se agrega al arreglo cada registro
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filas;

    }

    public List Listar(String consulta) {
        ResultSet rs = null;
        List resultado = new ArrayList();
        try {
            Statement st = conexion.createStatement();
            rs = st.executeQuery(consulta);
            resultado = OrganizarDatos(rs);
        } catch (SQLException e) {
            System.out.println("No se realizo la consulta");
            e.printStackTrace();
        }
        return resultado;
    }

    public boolean ejecutarProcedimiento(String nombre) {
        try {
            CallableStatement cs = conexion.prepareCall("{Call" + nombre + "}");
            return cs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
