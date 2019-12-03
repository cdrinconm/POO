/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

/**
 *
 * @author oscar
 */
public class Producto {
    
    private String nombre;
    private String tipo;
    private int horasproduccion;
    private double minproduccion;
    private double produccionhora;

    public Producto(String nombre, String tipo, int horasproduccion, double minproduccion, double produccionhora) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.horasproduccion = horasproduccion;
        this.minproduccion = minproduccion;
        this.produccionhora = produccionhora;
    }

    public double getMinproduccion() {
        return minproduccion;
    }

    public void setMinproduccion(double minproduccion) {
        this.minproduccion = minproduccion;
    }

    public double getProduccionhora() {
        return produccionhora;
    }

    public void setProduccionhora(double produccionhora) {
        this.produccionhora = produccionhora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHorasproduccion() {
        return horasproduccion;
    }

    public void setHorasproduccion(int horasproduccion) {
        this.horasproduccion = horasproduccion;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", tipo=" + tipo + ", horasproduccion=" + horasproduccion + '}';
    }   
}
