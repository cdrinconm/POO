/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package traductor;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.nio.channels.Selector;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Traductor {
    
    Scanner sc = new Scanner(System.in); // El Scanner
     
    public static int separarFrase1(String s) {
        int cp = 0; // Cantidad de palabras
         
        // Recorremos en busca de espacios
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // Si es un espacio
                cp++; // Aumentamos en uno la cantidad de palabras
            }
        }return cp;
    }
    public static String[] SepararFrase2(String s, int cp){
        // "Este blog es genial" tiene 3 espacios y 3 + 1 palabras
        String[] partes = new String[cp + 1];
        for (int i = 0; i < partes.length; i++) {
            partes[i] = ""; // Se inicializa en "" en lugar de null (defecto)
        }
         
        int ind = 0; // Creamos un Ã­ndice para las palabras
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // Si hay un espacio
                ind++; // Pasamos a la siguiente palabra
                continue; // PrÃ³ximo i
            }
            partes[ind] += s.charAt(i); // Sino, agregamos el carÃ¡cter a la palabra actual
        }
        return partes; // Devolvemos las partes
    }
    public static void Imprimir(String[] a,int tf){
        for (int i = 0; i < tf; i++) {
            System.out.println(a[i] + " ");
            
        }
    }
    
    public static String[] T_EspanolOtro(String[] frase,int traducido,String[] Es,String[] In, String[] It, String[] Fr,int a,int b){
        
        String[] tr = new String[a];
        
        if(traducido ==2){
            for(int i=0;i<a;i++){
                for(int j = 0;j<b;j++){    
                    if(frase[i].equals(Es[j])){
                        tr[a]=In[j];
                    }
                }
            } 
        }if(traducido == 3){
            for(int i=0;i<a;i++){
                for(int j = 0;j<b;j++){    
                    if(frase[i].equals(Es[j])){
                        tr[a]=Fr[j];
                    }
                }
            }
        }if(traducido == 4){
            for(int i=0;i<a;i++){
                for(int j = 0;j<b;j++){    
                    if(frase[i].equals(Es[j])){
                        tr[a]=It[j];
                    }
                }
            }
        }
        return tr;
    }
    public static String[] InglesEspanol(String[] frase,String[] Es,String[] In,int a,int b){
        String[] tr = new String [a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(frase[i].equals(In[j])){
                    tr[a] = Es[j];
                }
            }
        }
        return tr;
    }    
    public static String[] FrancesEspanol(String[] frase,String[] Es,String[] Fr,int a,int b) {
        String[] tr = new String [a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(frase[i].equals(Fr[j])){
                    tr[a] = Es[j];
                }
            }
        }
        return tr;
    }
    public static String[] ItalianoEspanol(String[] frase,String[] Es,String[] It,int a,int b) {
        String[] tr = new String [a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(frase[i].equals(It[j])){
                    tr[a] = Es[j];
                }
            }
        }
        return tr;
    }
    
    public static void Selector(String[] frase,int idioma,int traducido,String[] Es,String[] In, String[] It, String[] Fr,int a, int b){
            if(idioma == 1){
                T_EspanolOtro(frase,traducido,Es,In,It,Fr,a,b);
            }
            if(idioma == 2){
                Inglesotro(frase,traducido,Es,In,It,Fr,a,b);
            }
            if(idioma == 3){
                Francesotro(frase,traducido,Es,In,It,Fr,a,b);
            }
            if(idioma == 4){
                Italianootro(frase,traducido,Es,In,It,Fr,a,b);
            }
    }
    public static void Inglesotro(String[] frase, int traducido,String[] Es,String[] In, String[] It, String[] Fr,int a,int b) {
        if(traducido==1){
            InglesEspanol(frase,Es,In,a,b);
        }
        if(traducido==3 || traducido == 4){
            T_EspanolOtro(InglesEspanol(frase, Es, In, a, b), traducido, Es, In, It, Fr, a, b);
        }
    }
    public static void Francesotro(String[] frase, int traducido,String[] Es,String[] In, String[] It, String[] Fr,int a,int b) {
        if(traducido==1){
            FrancesEspanol(frase,Es,Fr,a,b);
        }
        if(traducido==2 || traducido ==4){
            T_EspanolOtro(FrancesEspanol(frase, Es, Fr, a, b), traducido, Es, In, It, Fr, a, b);
        }
        
    }
    public static void Italianootro(String[] frase, int traducido,String[] Es,String[] In, String[] It, String[] Fr,int a,int b) {
        if(traducido==1){
            ItalianoEspanol(frase,Es,It,a,b);
        }
        if(traducido==2 || traducido==3){
            T_EspanolOtro(ItalianoEspanol(frase, Es, It, a, b), traducido, Es, In, It, Fr, a, b);
        }
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fn = new Scanner(System.in);
        //int cm = 100;
        int td = 7;
        int inicio;
        int traducido;
        
        String frase;
                
        String[] espanol = new String[td];
        String[] ingles = new String[td];
        String[] frances = new String[td];
        String[] italiano = new String[td];
        
        espanol[0]="hola";ingles[0]="hello";frances[0]="salut";italiano[0]="ciao";
        espanol[1]="como";ingles[1]="how";frances[1]="comme";italiano[1]="come";
        espanol[2]="esta";ingles[2]="are";frances[2]="ces";italiano[2]="questa";
        espanol[3]="esto";ingles[3]="this";frances[3]="cette";italiano[3]="questo";
        espanol[4]="es";ingles[4]="is";frances[4]="est";italiano[1]="è";
        espanol[5]="una";ingles[5]="a";frances[5]="un";italiano[5]="una";
        espanol[6]="prueba";ingles[6]="test";frances[6]="test";italiano[6]="prova";
               System.out.println("ingrese la frase");
        frase = fn.nextLine();
        int tf = separarFrase1(frase);
        
        java.lang.String[] Frase2 = SepararFrase2(frase,tf);
        System.out.println("Seleccione idioma de inicio" );
        System.out.println("1 para español");
        System.out.println("2 para ingles");
        System.out.println("3 para Frances");
        System.out.println("4 para Italiano");
        inicio = fn.nextInt();
        System.out.println("Seleccione idioma de traducción" );
        System.out.println("1 para español");
        System.out.println("2 para ingles");
        System.out.println("3 para Frances");
        System.out.println("4 para Italiano");
        traducido = fn.nextInt();
        
        Selector(Frase2,inicio,traducido,espanol,ingles,italiano,frances,tf,td);
          
        Imprimir(Frase2,tf);
            
        }
}
