/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Date;
/**
 *
 * @author Usuario
 */
public class Reservacion {
    int ID_Reservaciones;
    int ID_cliente;
    Date F_entreda;
    Date F_salida;
    int ID_Empleado;

    public Reservacion(int ID_Reservaciones, int ID_cliente, Date F_entreda, Date F_salida, int ID_Empleado) {
        this.ID_Reservaciones = ID_Reservaciones;
        this.ID_cliente = ID_cliente;
        this.F_entreda = F_entreda;
        this.F_salida = F_salida;
        this.ID_Empleado = ID_Empleado;
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

    public Date getF_entreda() {
        return F_entreda;
    }

    public void setF_entreda(Date F_entreda) {
        this.F_entreda = F_entreda;
    }

    public Date getF_salida() {
        return F_salida;
    }

    public void setF_salida(Date F_salida) {
        this.F_salida = F_salida;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }
    
    
}
