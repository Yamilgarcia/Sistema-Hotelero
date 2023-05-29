/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuaris
 */
public class Cliente extends Persona {

    int ID_cliente;
    String Procedencia;

    public Cliente(int ID_cliente, String Procedencia, int ID_Persona, String Cedula, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        super(ID_Persona, Cedula, Nombre1, Nombre2, Apellido1, Apellido2, Telefono);
        this.ID_cliente = ID_cliente;
        this.Procedencia = Procedencia;
    }
//Este es para guardar cliente

    public Cliente(String Procedencia, String Cedula, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        super(Cedula, Nombre1, Nombre2, Apellido1, Apellido2, Telefono);
        this.Procedencia = Procedencia;
    }
//Este es para actualizar

    public Cliente(String Procedencia, int ID_Persona, String Cedula, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono) {
        super(ID_Persona, Cedula, Nombre1, Nombre2, Apellido1, Apellido2, Telefono);
        this.Procedencia = Procedencia;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }

}
