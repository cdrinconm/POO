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
public class CampanaPublicitaria {
    private String Titulo;
    private int[] FechaInicioPlanificado;
    private int[] FechaFinalPlanificado;
    private double CostosEstimados;
    private double Presupuesto;
    private int[] FechaFinalReal;
    private double CostosReal;
    private int Porcentaje_de_finalizacion;
    private ArrayList<Anuncio> Anuncios;
    private double pagos;
    private ArrayList<Staff> Personal;
    private Contabilidad Director;
    private ArrayList<String> notas;

    public CampanaPublicitaria(String Titulo, int[] FechaInicioPlanificado, int[] FechaFinalPlanificado, double CostosEstimados, double Presupuesto) {
        this.Titulo = Titulo;
        this.FechaInicioPlanificado = FechaInicioPlanificado;
        this.FechaFinalPlanificado = FechaFinalPlanificado;
        this.CostosEstimados = CostosEstimados;
        this.Presupuesto = Presupuesto;
        this.FechaFinalReal = null;
        this.CostosReal = 0;
    }
    
    public void registrarPago(double pago){
        this.pagos += pago;
    }
    
    public void Registrarpersonal(Contabilidad p){
        this.Personal.add((Staff) p);
    }
    
    public void RegistrarDirector(Contabilidad D){
        this.Director = D;
    }
    
    public boolean DentroDePresupuesto(){
        double costosTotales = 0;
        for (Anuncio a : this.Anuncios) {
              costosTotales += a.getCosto();            
        }       
        if(costosTotales <= this.Presupuesto){
            return true;
        }else{
            return false;
        }
    }
    
    public void AddNotas(String s){
        this.notas.add(s);
    }
    
    public void MostrarNotas(){
        System.out.println("Notas de Campaña: ");       
        for(String a: this.notas){
            System.out.println(a);
        }
    }   
}
    
    
    

