/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaladeCine;

/**
 *
 * @author Ofar Rincon
 */
public class Main {

    
    public static void main(String[] args) {
        
        
        //java.util.Scanner lectura = new java.util.Scanner(System.in);
        System.out.println("Buenos Dias este es el sistema para reserva de boletas");
        Silla s1 = new Silla();   /* 
        
        s1.setFilaSilla();        
        s1.setNumeroSilla();*/
        
        
        
        Tarcine t1 = new Tarcine();
        t1.verificartarjeta(s1,t1);
        
        /*
        System.out.println(t1.saldo);
        t1.subirsaldo(50000);
        System.out.println(t1.saldo);*/
        imprimirValorapagar(s1);
        
    }
    public static void imprimirValorapagar(Silla s){
            System.out.println("Tipo de silla: " + s.tiposilla + " Precio: " + s.costosilla);
            System.out.println("Gracias por su Compra. ¡Disfrute la Funcion!");
    }    
    
}
