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
public class Trabajador{
    
    private String nombre;
    private String apellido;
    private int salariohora;
    private int horastrabajo;
    private int mintrabajo;
    private int horasextra;
    private int mintrabajoextra;
    private int codigo;
    private TreeMap<String,ArrayList<Integer>> horadia;
    private TreeMap<String,ArrayList<Integer>> horadiae;
   

    public Trabajador(String nombre, String apellido, int salariohora, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salariohora = salariohora;
        this.codigo = codigo;
        this.horadia=new TreeMap<>();
        this.horadiae=new TreeMap<>();
    }
    
    public void sumarhoras(int a){
        this.horastrabajo+=a;
    }
    
    public void sumarminutos (int a){
        this.mintrabajo+=a;
        if(this.mintrabajo>60){
            this.horastrabajo+=1;
            this.mintrabajo=0;
        }
    }
    
    public void sumarhorase (int a){
        this.horasextra+=a;
    }
    
    public void sumarminutose (int a){
        this.mintrabajoextra+=a;
        if(this.mintrabajoextra>60){
            this.horasextra+=1;
            this.mintrabajoextra=0;
        }
    }
    
    public void agregarhoradia(String fecha, int hora, int minu ){
        ArrayList<Integer>a=new ArrayList<>();
        a.add(hora);
        a.add(minu);
        this.horadia.put(fecha,a);
    }
    
    public void agregarhoradiae(String fecha, int hora, int minu ){
        ArrayList<Integer>a=new ArrayList<>();
        a.add(hora);
        a.add(minu);
        this.horadia.put(fecha,a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalariohora() {
        return salariohora;
    }

    public void setSalariohora(int salariohora) {
        this.salariohora = salariohora;
    }

    public int getHorastrabajo() {
        return horastrabajo;
    }

    public void setHorastrabajo(int horastrabajo) {
        this.horastrabajo = horastrabajo;
    }

    public int getMintrabajo() {
        return mintrabajo;
    }

    public void setMintrabajo(int mintrabajo) {
        this.mintrabajo = mintrabajo;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public int getMintrabajoextra() {
        return mintrabajoextra;
    }

    public void setMintrabajoextra(int mintrabajoextra) {
        this.mintrabajoextra = mintrabajoextra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public TreeMap<String, ArrayList<Integer>> getHoradia() {
        return horadia;
    }

    public void setHoradia(TreeMap<String, ArrayList<Integer>> horadia) {
        this.horadia = horadia;
    }

    public TreeMap<String, ArrayList<Integer>> getHoradiae() {
        return horadiae;
    }

    public void setHoradiae(TreeMap<String, ArrayList<Integer>> horadiae) {
        this.horadiae = horadiae;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido=" + apellido + ", salariohora=" + salariohora + ", horastrabajo=" + horastrabajo + ", mintrabajo=" + mintrabajo + ", horasextra=" + horasextra + ", mintrabajoextra=" + mintrabajoextra + ", codigo=" + codigo + ", horadia=" + horadia + ", horadiae=" + horadiae + '}';
    }   
}
