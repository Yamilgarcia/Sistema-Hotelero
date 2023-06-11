/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Habitacion extends Tipo_de_habitacion {

    int N_de_habitacion;
    int ID_tipoHabitacion;
    int Num_Cama;
    boolean Estado;
    float Precio;
    
    

    public Habitacion(int N_de_habitacion, int ID_tipoHabitacion, int Num_Cama, boolean Estado, float Precio, int ID_TipoHabitacion, String Nombre, String Descripcion) {
        super(ID_TipoHabitacion, Nombre, Descripcion);
        this.N_de_habitacion = N_de_habitacion;
        this.ID_tipoHabitacion = ID_tipoHabitacion;
        this.Num_Cama = Num_Cama;
        this.Estado = Estado;
        this.Precio = Precio;
    }

    public Habitacion(int N_de_habitacion, int Num_Cama, boolean Estado, float Precio) {
        this.N_de_habitacion = N_de_habitacion;
        this.Num_Cama = Num_Cama;
        this.Estado = Estado;
        this.Precio = Precio;
    }
    
    
    
    

    public Habitacion() {
        super();
    }

    public Habitacion(int N_de_habitacion, String Nombre) {
        super(Nombre);
        this.N_de_habitacion = N_de_habitacion;
    }

    public int getN_de_habitacion() {
        return N_de_habitacion;
    }

    public void setN_de_habitacion(int N_de_habitacion) {
        this.N_de_habitacion = N_de_habitacion;
    }

    public int getNum_Cama() {
        return Num_Cama;
    }

    public void setNum_Cama(int Num_Cama) {
        this.Num_Cama = Num_Cama;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return N_de_habitacion + " - " + getNombre();
    }

    

}


