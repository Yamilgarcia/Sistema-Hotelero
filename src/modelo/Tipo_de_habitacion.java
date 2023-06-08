/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Tipo_de_habitacion {
    int ID_TipoHabitacion;
    String Nombre;
    String Descripcion;

    public Tipo_de_habitacion(int ID_TipoHabitacion, String Nombre, String Descripcion) {
        this.ID_TipoHabitacion = ID_TipoHabitacion;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public Tipo_de_habitacion() {
    }

    public Tipo_de_habitacion(String Nombre) {
        this.Nombre = Nombre;
    }

    
    
    
    
    public int getID_TipoHabitacion() {
        return ID_TipoHabitacion;
    }

    public void setID_TipoHabitacion(int ID_TipoHabitacion) {
        this.ID_TipoHabitacion = ID_TipoHabitacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
