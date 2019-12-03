/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5SaladeCine;

/**
 *
 * @author Ofar Rincon
 */
public class SaladeCine {

    
    public static void main(String[] args) {
        
        
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        boolean validar;
        int numeroreserva;
        
        
        
        
        
        //se usan como ejemplo
        long numerotarjeta = 1234;
        double saldo = 70000;
        String[] filaejemplo = new String[2];
        int[] numerosillaejemplo = new int[2];
        
        filaejemplo[0] = "A";
        numerosillaejemplo[0] = 1;
        filaejemplo[1] = "B";
        numerosillaejemplo[1] = 1;
        
        System.out.println("Bienvenido a nuestro cinema TARCINE");
        System.out.println("Seleccione la opcion que quiere realizar");
        System.out.println("1.Tarjeta TARCINE");
        System.out.println("2.Reservas");
        System.out.println("3.Boletas");
        int opcion = lectura.nextInt();
        switch(opcion){
            case 1: 
                    System.out.println("Seleccione la opcion que quiere realizar");
                    System.out.println("1.Venta de tarjeta TARCINE");
                    System.out.println("2.Recarga tarjeta TARCINE");
                    opcion = lectura.nextInt();
                    switch(opcion){
                        case 1: creartarjeta(saldo);
                        break;
                        case 2: recargarTarjeta(saldo,numerotarjeta);
                        break;
                    }
            break;
            case 2: System.out.println("Seleccione la opcion que quiere realizar");
                    System.out.println("1.Hacer Reserva");
                    System.out.println("2.Pagar Reserva");
                    System.out.println("3.Cancelar Reserva");
                    opcion = lectura.nextInt();
                    switch(opcion){
                        case 1: System.out.println("Cuentas boletas desea reservar");
                                int x = lectura.nextInt();
                                String[] fila = new String[x];
                                int[] numerosilla = new int[x];
                                String filaescogida;
                                double preciototal = 0;
                                double costosilla;
                                numeroreserva = (int) Math.floor((Math.random()*100)+1);
                                for(int i=0; i<x; i=i+1){                                    
                                    System.out.println("Escoja una Fila (A - K)");
                                    filaescogida = lectura.next().toUpperCase();
                                    fila[i]=filaescogida;
                                    System.out.println("Escoja un Numero de silla del 1 - 20");
                                    int numeroescogido = lectura.nextInt();
                                    numerosilla[i]=numeroescogido;                                    
                                }
                                System.out.println("Boletas reservadas: " );
                                for(int i=0; i<x; i=i+1){                                    
                                    System.out.println("Fila: " + fila[i]);
                                    String tiposilla = setTipoSilla(fila[i]);
                                    System.out.println("Tipo de silla: " + tiposilla);
                                    costosilla = costoFila(tiposilla);
                                    System.out.println("Costo silla: " + costosilla);
                                    preciototal = preciototal + costosilla;
                                    System.out.println("Numero de silla escogido: " + numerosilla[i]);                                                                        
                                }                                
                                System.out.println("Precio total por boletas: " + preciototal);
                                System.out.println("Numero reserva: " + numeroreserva);
                                System.out.println("¡Boletas reservadas exitosamente!");
                                
                        break;
                        case 2: System.out.println("¿De que forma desea pagar?");
                                System.out.println("1.Efectivo");
                                System.out.println("2.Tarjeta TARCINE");
                                opcion = lectura.nextInt();
                                switch(opcion){
                                    case 1: double totalapagar = 0;
                                            double costosillaejemplo = 0;
                                            for(int i=0; i<filaejemplo.length; i=i+1){
                                                String tiposilla = setTipoSilla(filaejemplo[i]);
                                                System.out.println("Tipo de silla: " + tiposilla);
                                                costosillaejemplo = costoFila(tiposilla);
                                                System.out.println("Costo silla: " + costosillaejemplo);
                                                totalapagar = totalapagar + costosillaejemplo;
                                                System.out.println("Numero de silla escogido: " + numerosillaejemplo[i]);
                                            }
                                            System.out.println("Total dinero en efectivo a pagar por boletas: " + totalapagar);
                                    break;
                                    case 2: validar = verificarnumerotarjeta(numerotarjeta);
                                            totalapagar = 0;
                                            if(validar == true){
                                                for(int i=0; i<filaejemplo.length; i=i+1){
                                                    String tiposilla = setTipoSilla(filaejemplo[i]);
                                                    System.out.println("Tipo de silla: " + tiposilla);
                                                    costosillaejemplo = costoFila(tiposilla);
                                                    System.out.println("Costo silla: " + costosillaejemplo);
                                                    totalapagar = totalapagar + costosillaejemplo;
                                                    System.out.println("Numero de silla escogido: " + numerosillaejemplo[i]);
                                                }
                                                saldo = saldo - totalapagar;
                                                saldo = hacerDescuento(saldo);
                                                System.out.println("Saldo Actual: " + saldo);
                                            }
                                    break;
                                }
                        break;
                        case 3: System.out.println("Boletas reservadas: ");
                                double totalapagar = 0;
                                double costosillaejemplo = 0;
                                for(int i=0; i<filaejemplo.length; i=i+1){
                                    String tiposilla = setTipoSilla(filaejemplo[i]);
                                    System.out.println("Tipo de silla: " + tiposilla);
                                    costosillaejemplo = costoFila(tiposilla);
                                    System.out.println("Costo silla: " + costosillaejemplo);
                                    totalapagar = totalapagar + costosillaejemplo;
                                    System.out.println("Numero de silla escogido: " + numerosillaejemplo[i]);
                                }                                
                                System.out.println("Total dinero por reserva: " + totalapagar);
                                verificarCancelacion(filaejemplo,numerosillaejemplo);
                                
                        break;
                    }
            break;
            case 3: System.out.println("Seleccione la opcion que quiere realizar");
                    System.out.println("1.Comprar Boletas");
                    System.out.println("2.Dinero recaudado por venta de boletas");
                    opcion = lectura.nextInt();
                    switch(opcion){
                        case 1: System.out.println("Cuentas boletas desea comprar");
                                int x = lectura.nextInt();
                                String[] fila = new String[x];
                                int[] numerosilla = new int[x];
                                String filaescogida;
                                double preciototal = 0;
                                double costosilla;
                                for(int i=0; i<x; i=i+1){                                    
                                    System.out.println("Escoja una Fila (A - K)");
                                    filaescogida = lectura.next().toUpperCase();
                                    fila[i]=filaescogida;
                                    System.out.println("Escoja un Numero de silla del 1 - 20");
                                    int numeroescogido = lectura.nextInt();
                                    numerosilla[i]=numeroescogido;                                    
                                }
                                System.out.println("Boletas compradas: " );
                                for(int i=0; i<x; i=i+1){                                    
                                    System.out.println("Fila: " + fila[i]);
                                    String tiposilla = setTipoSilla(fila[i]);
                                    System.out.println("Tipo de silla: " + tiposilla);
                                    costosilla = costoFila(tiposilla);
                                    System.out.println("Costo silla: " + costosilla);
                                    preciototal = preciototal + costosilla;
                                    System.out.println("Numero de silla escogido: " + numerosilla[i]);                                                                        
                                }                                
                                System.out.println("Precio total por boletas: " + preciototal);
                                System.out.println("¡Disfrute la Funcion! ");
                        break;
                        case 2: double dinerorecaudado = 0;
                                double costosillaejemplo = 0;
                                for(int i=0; i<filaejemplo.length; i=i+1){
                                    String tiposilla = setTipoSilla(filaejemplo[i]);
                                    System.out.println("Tipo de silla: " + tiposilla);
                                    costosillaejemplo = costoFila(tiposilla);
                                    System.out.println("Costo silla: " + costosillaejemplo);
                                    dinerorecaudado = dinerorecaudado + costosillaejemplo;
                                }
                                System.out.println("Total dinero recaudado por venta de boletas: " + dinerorecaudado);
                        break;
                    }
        break;        
        }        
    }    
        
    public static void recargarTarjeta(double saldo,long numerotarjeta){
        boolean validar = false;
        validar = verificarnumerotarjeta(numerotarjeta);        
        if(validar == true){
            saldo += 50000;
            System.out.println("Valor de " + 50000 + " incrementado en su cuenta");
            System.out.println("Saldo actual: " + saldo);
        } 
    }

    public static boolean verificartarjeta(long numerotarjeta){
        System.out.println("¿Tiene tarjeta TARCINE? Y/N");
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        String verificacion = lectura.nextLine().toUpperCase();
        boolean validar = false;
        if(verificacion.equals("Y")){            
            validar = verificarnumerotarjeta(numerotarjeta);
        }   
    return validar;
    }

    public static boolean verificarnumerotarjeta(long numerotarjeta){        
            System.out.println("Para verificar su tarjeta Ingrese su cedula");        
            java.util.Scanner lectura = new java.util.Scanner(System.in);
            long numeroescogido = lectura.nextLong();            
            if(numeroescogido != numerotarjeta){
                System.out.println("Intente de Nuevo");
                verificarnumerotarjeta(numerotarjeta);
            }
    return true;
    }

    public static void creartarjeta(double saldo){
            System.out.println("¿Desea adquirir una Tarjeta TARCINE? Y/N");                  
            java.util.Scanner lectura = new java.util.Scanner(System.in);
            String verificacion = lectura.nextLine().toUpperCase();            
            if(verificacion.equals("Y")){
                System.out.println("Ingrese su cedula");
                long numerotarjeta = lectura.nextLong();
                System.out.println("Numero de Tarjeta: " + numerotarjeta);
                System.out.println("Saldo Inicial: " + saldo);
            }
    } 
    
    private static String setTipoSilla(String filaescogida){
        String[] posiblestiposillas = new String[3];
        posiblestiposillas[0] = "I";
        posiblestiposillas[1] = "J";
        posiblestiposillas[2] = "K";
        String tiposilla = "Null";
        for(int i=0; i<posiblestiposillas.length; i=i+1){
            if(filaescogida.equals(posiblestiposillas[i])){
                tiposilla = "Preferencial";                
            }else{
                tiposilla = "General";                
            }
        }
    return tiposilla;
    }
    private static double costoFila(String filaescogida){
        double precio;
        if(filaescogida.equals("Preferencial")){
            precio=11000;            
        }else{
            precio=8000;            
        }
    return precio;
    }
    
    public static void verificarCancelacion(String[] filaejemplo, int[] numerosillaejemplo){
            System.out.println("¿Desea cancelar la reserva? Y/N");
            java.util.Scanner lectura = new java.util.Scanner(System.in);
            String verificacion = lectura.nextLine().toUpperCase();            
            if(verificacion.equals("Y")){
                for(int i=0; i<filaejemplo.length; i=i+1){
                    filaejemplo[i] = "Null";
                    numerosillaejemplo[i] = 0;
                }
            }
            System.out.println("Reserva Cancelada");           
    }
      

    public static double hacerDescuento(double saldo){
        saldo = saldo*10/100;
    return saldo;
    }
}
