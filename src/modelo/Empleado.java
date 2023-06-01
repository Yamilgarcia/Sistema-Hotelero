/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {

    int ID_Empleado;
    int ID_Persona;
    String Usuario;
    String Contraseña;

    public Empleado(int ID_Empleado, String Usuario, String Contraseña, int ID_Persona, String Cedula, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        super(ID_Persona, Cedula, Nombre1, Nombre2, Apellido1, Apellido2, Telefono);
        this.ID_Empleado = ID_Empleado;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public Empleado(String Usuario, String Contraseña, int ID_Persona, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        super(ID_Persona, Nombre1, Nombre2, Apellido1, Apellido2, Telefono);
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public Empleado(String Usuario, String Contraseña, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        super(Nombre1, Nombre2, Apellido1, Apellido2, Telefono);
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public Empleado() {
        super(); // Llama al constructor vacío de la clase padre (Persona)
        // Resto de la lógica específica del constructor de Empleado
    }

    public Empleado(int ID_Empleado, String Nombre1) {
        super(Nombre1);
        this.ID_Empleado = ID_Empleado;
    }

    

   

    
    
    
    
    
    
    
    
    
    
    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

     @Override
    public String toString() {
        return ID_Empleado + " - " + Nombre1;
    }

}
