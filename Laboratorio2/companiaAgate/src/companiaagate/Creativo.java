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
public class Creativo extends Staff{

    public Creativo(String Id, String Nombre, int NivelLaboral) {
        super(Id, Nombre, NivelLaboral);
    }
    
    public void RegistrarNotasCP(String s, CampanaPublicitaria cp){
        cp.AddNotas(s);           
    }
    
    public void RegistrarNotasA(String s, Anuncio a){
        a.AddNotas(s);           
    }
    
    public void RegistrarDetalleA(String s, Anuncio a){
        a.setDetalles(s);           
    }
    
    public void ProgramarFecha(int[] i, Anuncio a){
        a.setFechaDeEstreno(i);
    } 
}
