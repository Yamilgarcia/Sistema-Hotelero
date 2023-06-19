/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Usuario
 */
public class DetalleReservacion extends ReservacionEstancia{
    int ID_DetalleReservacion;
    int N_de_habitacion;
    int ID_Reservaciones;

    public DetalleReservacion(int ID_DetalleReservacion, int N_de_habitacion, int ID_Reservaciones, int ID_cliente, Date F_entrada, Timestamp F_salida, int ID_Empleado, String TipoServicio, String EstadoReserva) {
        super(ID_Reservaciones, ID_cliente, F_entrada, F_salida, ID_Empleado, TipoServicio, EstadoReserva);
        this.ID_DetalleReservacion = ID_DetalleReservacion;
        this.N_de_habitacion = N_de_habitacion;
        this.ID_Reservaciones = ID_Reservaciones;
    }

        public DetalleReservacion(int N_de_habitacion, int ID_Reservaciones ) {
        super(ID_Reservaciones);
        this.N_de_habitacion = N_de_habitacion;
        this.ID_Reservaciones = ID_Reservaciones;
    }

    public DetalleReservacion() {
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

   

    
    
}
