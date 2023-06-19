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
public class ReservacionEstancia {

    int ID_Reservaciones;
    int ID_cliente;
    Date F_entrada;
    Timestamp F_salida;
    int ID_Empleado;
    String TipoServicio;
    String EstadoReserva;

    public ReservacionEstancia(int ID_Reservaciones, int ID_cliente, Date F_entrada, Timestamp F_salida, int ID_Empleado, String TipoServicio, String EstadoReserva) {
        this.ID_Reservaciones = ID_Reservaciones;
        this.ID_cliente = ID_cliente;
        this.F_entrada = F_entrada;
        this.F_salida = F_salida;
        this.ID_Empleado = ID_Empleado;
        this.TipoServicio = TipoServicio;
        this.EstadoReserva = EstadoReserva;
    }

    public ReservacionEstancia(int ID_cliente, Date F_entrada, Timestamp F_salida, int ID_Empleado, String TipoServicio, String EstadoReserva) {
        this.ID_cliente = ID_cliente;
        this.F_entrada = F_entrada;
        this.F_salida = F_salida;
        this.ID_Empleado = ID_Empleado;
        this.TipoServicio = TipoServicio;
        this.EstadoReserva = EstadoReserva;
    }

    public ReservacionEstancia(int ID_Reservaciones) {
        this.ID_Reservaciones = ID_Reservaciones;
    }

    public ReservacionEstancia() {
    }

    public int getID_Reservaciones() {
        return ID_Reservaciones;
    }

    public void setID_Reservaciones(int ID_Reservaciones) {
        this.ID_Reservaciones = ID_Reservaciones;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public Date getF_entrada() {
        return F_entrada;
    }

    public void setF_entrada(Date F_entrada) {
        this.F_entrada = F_entrada;
    }

    public Timestamp getF_salida() {
        return F_salida;
    }

    public void setF_salida(Timestamp F_salida) {
        this.F_salida = F_salida;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getTipoServicio() {
        return TipoServicio;
    }

    public void setTipoServicio(String TipoServicio) {
        this.TipoServicio = TipoServicio;
    }

    public String getEstadoReserva() {
        return EstadoReserva;
    }

    public void setEstadoReserva(String EstadoReserva) {
        this.EstadoReserva = EstadoReserva;
    }

}
