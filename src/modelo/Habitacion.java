/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Habitacion {
    int N_de_habitacion;
    int ID_tipoHabitacion;
    boolean Estado;// en la base de dato sale como bit, preguntar si seria double
    int precio;

    public Habitacion(int N_de_habitacion, int ID_tipoHabitacion, boolean Estado, int precio) {
        this.N_de_habitacion = N_de_habitacion;
        this.ID_tipoHabitacion = ID_tipoHabitacion;
        this.Estado = Estado;
        this.precio = precio;
    }

    public int getN_de_habitacion() {
        return N_de_habitacion;
    }

    public void setN_de_habitacion(int N_de_habitacion) {
        this.N_de_habitacion = N_de_habitacion;
    }

    public int getID_tipoHabitacion() {
        return ID_tipoHabitacion;
    }

    public void setID_tipoHabitacion(int ID_tipoHabitacion) {
        this.ID_tipoHabitacion = ID_tipoHabitacion;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
