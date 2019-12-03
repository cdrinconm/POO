/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1Parte1;

/**
 *
 * @author Ofar Rincon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Explicacion del funcionamiento del programa:
        Primeramente se envia por consola un mensaje "Primera funcion en Main", luego de eso llama a la funcion func1,
        y la hace correr, la cual solo envia un mensaje de consola("Segunda funcion") y vuelve al main, luego de eso se
        llama la funcion func2 que actua de manera similar a la primera enviando un mensaje por consola ("Tercera funcion"),
        luego de eso se vuelve al main el cual envia un ultimo mensaje "Se termina Main" y finaliza el programa.       
        */
        System.out.println("Primera funcion en Main");
        func1();
        func2();
        System.out.println("Se termina Main");
    }
    
    static public void func1(){
        System.out.println("Segunda funcion");
    }
    static public void func2(){
        System.out.println("Tercera funcion");
    }
    
}
