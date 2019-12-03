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
public class Supervisor {
    
    private TreeMap<Integer,Trabajador> trabajador;
    private final int valoradiccionalhorasextras = 10000;
    
    public Supervisor() {
        this.trabajador = new TreeMap<>();
    }
    
    public void añadirt(Trabajador t){
        this.trabajador.put(t.getCodigo(),t);
    }

    public void añadirhorastrabajo(int a, String b, int c, int d){
        if(this.trabajador.containsKey(a)){
            Trabajador p1= this.trabajador.get(a);
            p1.agregarhoradia(b, c, d);
            p1.sumarhoras(c);
            p1.sumarminutos(d);
        }System.out.println("Horas correctamente añadidas");
    }
    
    public void añadirhorasextras(int a,String b, int c, int d){
        if(this.trabajador.containsKey(a)){
            Trabajador p1= this.trabajador.get(a);
            System.out.println(p1+"__");
            p1.sumarhorase(c);
            p1.sumarminutose(d);
            p1.agregarhoradiae(b, c, d);
        }System.out.println("Horas correctamente añadidas");
    }
    
    public TreeMap<String, ArrayList<Integer>> reportepersonal(int a){
    return this.trabajador.get(a).getHoradia(); 
    }
    public TreeMap<String, ArrayList<Integer>> reportepersonalhorase(int a){
    return this.trabajador.get(a).getHoradiae();
    }
    
    public  HashMap<ArrayList<Integer>,Trabajador> tfaltas(){        
        HashMap<ArrayList<Integer>,Trabajador> tr=new HashMap<>();
        ArrayList<Integer>b=new ArrayList<>();
        for(Trabajador trj: this.trabajador.values()){
            if(trj!=null){
               if(trj.getHorastrabajo()<(8*30)){
                b.add(trj.getHorastrabajo());
                b.add(trj.getMintrabajo());
                tr.put(b, trj);
               }
            }
        }
    return tr;
    }
    
    public double nominamestrabajador(int cod){
        double a=0;
        if(this.trabajador.containsKey(cod)){
            Trabajador p1= this.trabajador.get(cod);
            a=((p1.getHorastrabajo() + (p1.getMintrabajo()/60))*p1.getSalariohora())+((p1.getHorasextra()+ (p1.getMintrabajoextra()/60))*(p1.getSalariohora()+this.valoradiccionalhorasextras));        
        }
    return a;
    }
    
    public double nominastotalmes(){
        double a=0;
        for(Trabajador p1: this.trabajador.values()){
            if(p1!=null){
                a+=((p1.getHorastrabajo() + (p1.getMintrabajo()/60))*p1.getSalariohora())+((p1.getHorasextra()+ (p1.getMintrabajoextra()/60))*(p1.getSalariohora()+this.valoradiccionalhorasextras));
            }           
        }
    return a;
    }
}