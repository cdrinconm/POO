/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companiaagate;

import java.util.ArrayList;

/**
 *
 * @author CLARA
 */
public class cliente {
    
    private String Nombre;
    private String Direccion;
    private contactoPrincipal contacto;
    private Staff Personal_De_Contacto;
    private ArrayList<CampanaPublicitaria> CampanasP;
    
    public cliente(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.contacto = null;
        this.CampanasP = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public contactoPrincipal getContacto() {
        return contacto;
    }

    public void AgregarContacto(contactoPrincipal contacto) {
        this.contacto = contacto;
    }
    
    public void AgregarPersonaldeContacto(Staff p){
        this.Personal_De_Contacto = p;
    }
    
    public void RegistrarCampana(CampanaPublicitaria C){
        this.CampanasP.add(C);
    }    
}
