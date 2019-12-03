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
public abstract class Staff {
    
    protected String Id;
    protected String Nombre;
    protected int NivelLaboral;
    protected double Pago;
    protected ArrayList<CampanaPublicitaria> ProyectosEnQueTrabaja;
    
    public Staff(String Id, String Nombre, int NivelLaboral){
        this.Id = Id;
        this.Nombre = Nombre;
        this.NivelLaboral = NivelLaboral;
    }
    
    public String getId(){
        return Id;
    }

    public void setId(String Id){
        this.Id = Id;
    }
    
    public double CalcularIncentivoAnual(){
        double IncentivoAnual =0;
        IncentivoAnual = this.ProyectosEnQueTrabaja.size()*this.NivelLaboral;
        return IncentivoAnual;
    }   
    
    public void MostrarNotas(CampanaPublicitaria cp){
        cp.MostrarNotas();
    } 
    
    public void MostrarNotas(Anuncio a){} 
}
