/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class DetalleReservacion {
    int ID_DetalleReservacion;
    int N_de_habitacion;
    int ID_Reservaciones;

    public DetalleReservacion(int ID_DetalleReservacion, int N_de_habitacion, int ID_Reservaciones) {
        this.ID_DetalleReservacion = ID_DetalleReservacion;
        this.N_de_habitacion = N_de_habitacion;
        this.ID_Reservaciones = ID_Reservaciones;
    }

    public int getID_DetalleReservacion() {
        return ID_DetalleReservacion;
    }

    public void setID_DetalleReservacion(int ID_DetalleReservacion) {
        this.ID_DetalleReservacion = ID_DetalleReservacion;
    }

    public int getN_de_habitacion() {
        return N_de_habitacion;
    }

    public void setN_de_habitacion(int N_de_habitacion) {
        this.N_de_habitacion = N_de_habitacion;
    }

    public int getID_Reservaciones() {
        return ID_Reservaciones;
    }

    public void setID_Reservaciones(int ID_Reservaciones) {
        this.ID_Reservaciones = ID_Reservaciones;
    }
    
}
