/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

import java.util.*;

/**
 *
 * @author oscar
 */
public class OficinadeCostos {
    private Supervisor supervisor;
    private ArrayList<Linea> linea;

    public OficinadeCostos() {
        this.linea = new ArrayList<>();
        this.supervisor = new Supervisor();
    }
    
    
    public double CalcularCostos(){
        double b=0;
        for(Linea l: this.linea){
            if(l!=null){
                ArrayList<Integer>a=l.Calcularhorasproduccion();
                b+= (a.get(0)+(a.get(1)/60))*l.getCostodeoperacion();
            }
          
        }
    return b+= this.supervisor.nominastotalmes();
    }
}

