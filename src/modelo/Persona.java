/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Persona {

    int ID_Persona;
    String Cedula;
    String Nombre1;
    String Nombre2;
    String Apellido1;
    String Apellido2;
    String Telefono;

    public Persona(int ID_Persona, String Cedula, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        this.ID_Persona = ID_Persona;
        this.Cedula = Cedula;
        this.Nombre1 = Nombre1;
        this.Nombre2 = Nombre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Telefono = Telefono;
    }

    public Persona(String Cedula, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        this.Cedula = Cedula;
        this.Nombre1 = Nombre1;
        this.Nombre2 = Nombre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Telefono = Telefono;
    }

    public Persona(int ID_Persona, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        this.ID_Persona = ID_Persona;
        this.Nombre1 = Nombre1;
        this.Nombre2 = Nombre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Telefono = Telefono;
    }

    public Persona(String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        this.Nombre1 = Nombre1;
        this.Nombre2 = Nombre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Telefono = Telefono;
    }

    public Persona() {
    }

    public Persona(String Nombre1) {
        this.Nombre1 = Nombre1;
    }

    

    

    

    
     
    
    
    
    
    

    public int getID_Persona() {
        return ID_Persona;
    }

    public void setID_Persona(int ID_Persona) {
        this.ID_Persona = ID_Persona;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre1() {
        return Nombre1;
    }

    public void setNombre1(String Nombre1) {
        this.Nombre1 = Nombre1;
    }

    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

}
