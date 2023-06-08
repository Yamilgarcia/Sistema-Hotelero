/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class InicioSesion {
    int ID_InicioSesion;
    int ID_Empleado;
    String Usuario;
    int Contraseña;

    public InicioSesion(int ID_InicioSesion, int ID_Empleado, String Usuario, int Contraseña) {
        this.ID_InicioSesion = ID_InicioSesion;
        this.ID_Empleado = ID_Empleado;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public int getID_InicioSesion() {
        return ID_InicioSesion;
    }

    public void setID_InicioSesion(int ID_InicioSesion) {
        this.ID_InicioSesion = ID_InicioSesion;
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

    public int getContraseña() {
        return Contraseña;
    }

    public void setContraseña(int Contraseña) {
        this.Contraseña = Contraseña;
    }
    
}
