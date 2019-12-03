/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companiaagate;

/**
 *
 * @author CLARA
 */
public class contactoPrincipal {
    private String Nombre;
    private String Apellido;
    private String ID;

    public contactoPrincipal(String Nombre, String Apellido, String ID) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }   
}
