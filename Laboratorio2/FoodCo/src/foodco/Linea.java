/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

/**
 *
 * @author oscar
 */import java.util.*;
public class Linea {
    
    private int numerodelinea;
    private double costodeoperacion;
    private int jornadac=8;
    private ArrayList<Producto>producto;

    public Linea(int numerodelinea){
        this.numerodelinea = numerodelinea;
        this.producto = new ArrayList<>();
    }
    
    public void añadirlineaproduccion(Producto p){
        this.producto.add(p);
    }

    public ArrayList<Integer> Calcularhorasproduccion (){
        
        ArrayList<Integer>b=new ArrayList<>();
        int a,c,d,f;
        a=c=d=f=0;
        for(Producto p :this.producto){
            a+=p.getHorasproduccion();
            c+=p.getMinproduccion();
            if(c==60){
                a+=1;
                c=0;
            }
        }
        if(a<this.jornadac){
           d=60-c;
           if((a+1)<this.jornadac){
               f=this.jornadac-(a+1);
           }
        }
        b.add(0, a);
        b.add(1, c);
        b.add(2, f);
        b.add(3, d);
    return b;
    }

    public TreeMap<Double,String> Calcularproduccion(){
        
        TreeMap<Double,String>a=new TreeMap<>();
        double b;
        for(Producto p :this.producto){
            b=(p.getHorasproduccion()+(p.getMinproduccion()/60))*p.getProduccionhora();
            a.put(b,p.getNombre());
        }
    return a;
    }

    public int getNumerodelinea() {
        return numerodelinea;
    }

    public void setNumerodelinea(int numerodelinea) {
        this.numerodelinea = numerodelinea;
    }

    public double getCostodeoperacion() {
        return costodeoperacion;
    }

    public void setCostodeoperacion(double costodeoperacion) {
        this.costodeoperacion = costodeoperacion;
    }

    public int getJornadac() {
        return jornadac;
    }

    public void setJornadac(int jornadac) {
        this.jornadac = jornadac;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Linea{" + "numerodelinea=" + numerodelinea + ", costodeoperacion=" + costodeoperacion + ", jornadac=" + jornadac + ", producto=" + producto + '}';
    }
}
