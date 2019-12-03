/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companiaagate;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author CLARA
 */
public class CompaniaAgate {
    public HashMap<String , cliente> Clientes;
    public HashMap<String , Staff> Personal;
    public HashMap<Integer, ArrayList<Staff>> orden;

    public CompaniaAgate() {
        this.Clientes = new HashMap<>();
        this.Personal = new HashMap<>();
    }    
    
    public void RegistrarCliente(cliente Cliente){
        if(this.Clientes.containsKey(Cliente.getNombre())){
            System.out.println("Cliente ya existe ");
        }else{
            this.Clientes.put(Cliente.getNombre(), Cliente);
        }
    }
    
    public void RegistrarPersonal(Staff Personal){
        if(this.Personal.containsKey(Personal.getId())){
            System.out.println("Cliente ya existe ");
        }else{
            this.Personal.put(Personal.getId(),Personal);
        }
    }
    
    public void AgregarCampaña(String a, CampanaPublicitaria b){
        cliente c = null;
        if(this.Clientes.containsKey(a)){
        c = this.Clientes.get(a);
        c.RegistrarCampana(b);
        this.Clientes.replace(a, c);
        }else{
            System.out.println("Cliente no existe");
        }
    }

    public void RegistarPorNiveles(){
       for(Staff a:this.Personal){
           this.orden.put(a.NivelLaboral, a);
       }
    }  
}
