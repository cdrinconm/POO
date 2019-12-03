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
public class Anuncio {
    private String Nombre;
    private String Tipo;
    private double Costo;
    private String Detalles;
    private int porcentajeDeFianlizacion;
    private ArrayList<String> notas;
    private int[] FechaDeEstreno= new int[3];

    public Anuncio(String Nombre, String Tipo, double Costo, String Detalles) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Costo = Costo;
        this.Detalles = Detalles;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public int getPorcentajeDeFianlizacion() {
        return porcentajeDeFianlizacion;
    }

    public void setPorcentajeDeFianlizacion(int porcentajeDeFianlizacion) {
        this.porcentajeDeFianlizacion = porcentajeDeFianlizacion;
    }
 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    public void AddNotas(String s){
        this.notas.add(s);
    }
    
    public void MostrarNotas(){
        System.out.println("Notas de anuncios:");
        for(String s : this.notas){
            System.out.println(s);
        }
    }

    public int[] getFechaDeEstreno() {
        return FechaDeEstreno;
    }

    public void setFechaDeEstreno(int[] FechaDeEstreno) {
        for (int i = 0; i < 3; i++) {
            this.FechaDeEstreno[i] = FechaDeEstreno[i];            
        }
    }   
}
