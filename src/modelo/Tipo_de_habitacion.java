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
    int ID_tipoHabitacion;
    String Baño;
    int Num_cama;
    boolean Aire_Acondi;// salen como bit en la bd, preguntar si es asi, de igual manera con television
    boolean Television;

    public Tipo_de_habitacion(int ID_tipoHabitacion, String Baño, int Num_cama, boolean Aire_Acondi, boolean Television) {
        this.ID_tipoHabitacion = ID_tipoHabitacion;
        this.Baño = Baño;
        this.Num_cama = Num_cama;
        this.Aire_Acondi = Aire_Acondi;
        this.Television = Television;
    }

    public int getID_tipoHabitacion() {
        return ID_tipoHabitacion;
    }

    public void setID_tipoHabitacion(int ID_tipoHabitacion) {
        this.ID_tipoHabitacion = ID_tipoHabitacion;
    }

    public String getBaño() {
        return Baño;
    }

    public void setBaño(String Baño) {
        this.Baño = Baño;
    }

    public int getNum_cama() {
        return Num_cama;
    }

    public void setNum_cama(int Num_cama) {
        this.Num_cama = Num_cama;
    }

    public boolean isAire_Acondi() {
        return Aire_Acondi;
    }

    public void setAire_Acondi(boolean Aire_Acondi) {
        this.Aire_Acondi = Aire_Acondi;
    }

    public boolean isTelevision() {
        return Television;
    }

    public void setTelevision(boolean Television) {
        this.Television = Television;
    }
    
}
