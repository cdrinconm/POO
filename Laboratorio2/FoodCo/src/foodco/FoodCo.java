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
public class FoodCo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    
    Linea l1= new Linea(1);
    Linea l2= new Linea(2);
    Linea l3= new Linea(3);
    
    Producto p1= new Producto("lechuga","ensaladas lavadas",3,15,100505.32);
    Producto p2= new Producto("col","productos no cocinados",3,20,97250.75);
    Producto p3= new Producto("remolacha azucarera","verduras crudas preparadas",7,25,59320.13);
    Producto p4= new Producto("aceite de semillas","productos no cocinados",6,30,152360.75);
    
    Supervisor s=new Supervisor();
    
    Trabajador t1 = new Trabajador("Carlos","Martinez",25000,1001);
    Trabajador t2 = new Trabajador("Alejandro","Paez",20000,1002);
    Trabajador t3 = new Trabajador("Sara","Triana",30000,1003);
    Trabajador t4 = new Trabajador("Sebastian","Gomez",20000,1004);
    
    l1.añadirlineaproduccion(p1);
    l1.añadirlineaproduccion(p2);
    l2.añadirlineaproduccion(p3);
    l3.añadirlineaproduccion(p4);
    
    s.añadirt(t1);
    s.añadirt(t2);
    s.añadirt(t3);
    s.añadirt(t4);
    
    OficinadeCostos y=new OficinadeCostos();  
    
    ArrayList<Integer> a = l1.Calcularhorasproduccion();
    TreeMap<Double,String> b=l1.Calcularproduccion();
    
    for(int i=0; i<1;i++){
        System.out.println(" Ingrese el valor de la accion a realizar");
        System.out.println("1. Calcular horas y produccion de una linea");
        System.out.println("2. Añadir horas a un trabajador");
        System.out.println("3. Añadir horas extras a un trabajador");
        System.out.println("4. Dar reporte personal");
        System.out.println("5. Dar reporte personal horas extras");
        System.out.println("6. Reportar trabajadores con faltas");
        System.out.println("7. Calcular nomina trabajador");
        System.out.println("8. Calcular nominas total mes");
        System.out.println("9. Calcular costos");
        int z = lectura.nextInt();
        if(z==1){System.out.println("Ingrese numero de linea");
            int m=lectura.nextInt();
                switch (m) {
                    case 1:
                        {
                            ArrayList<Integer> j= l1.Calcularhorasproduccion();//System.out.println(j);
                            System.out.println("Hora de produccion: "+ j.get(0)+" Min de produccion:"+j.get(1)+" horas sin produccion: "+j.get(2)+" min sin produccion: "+ j.get(3));
                            System.out.println("Cantidad de produccion por tonelada /" + " Nombre de producto ");
                            TreeMap<Double,String> h=l1.Calcularproduccion();System.out.println(h);
                            break;
                        }
                    case 2:
                        {
                            ArrayList<Integer> j= l2.Calcularhorasproduccion();System.out.println(j);
                            System.out.println("Hora de produccion: "+ j.get(0)+" Min de produccion:"+j.get(1)+" horas sin produccion: "+j.get(2)+" min sin produccion: "+ j.get(3));
                            System.out.println("Cantidad de produccion por tonelada /" + " Nombre de producto ");
                            TreeMap<Double,String> h=l2.Calcularproduccion();System.out.println(h);
                            break;
                        }
                    case 3:
                        {
                            ArrayList<Integer> j= l3.Calcularhorasproduccion();System.out.println(j);
                            System.out.println("Hora de produccion: "+ j.get(0)+" Min de produccion:"+j.get(1)+" horas sin produccion: "+j.get(2)+" min sin produccion: "+ j.get(3));
                            System.out.println("Cantidad de produccion por tonelada /" + " Nombre de producto ");
                            TreeMap<Double,String> h=l3.Calcularproduccion();System.out.println(h);
                            break;
                        }
                    default:
                        break;
                } System.out.println("ingrese 1 si desea realizar otra accion, de lo contrario 0");
                int q=lectura.nextInt();
                if(q==1){
                    i--;
                }

        }
        else if(z==2){
            System.out.println("Ingrese codigo, fecha, horas y minutos de trabajo");
            int m=lectura.nextInt();
            String n=lectura.next();
            int o=lectura.nextInt();
            int p=lectura.nextInt();
            s.añadirhorastrabajo(m, n, o, p);
            System.out.println("ingrese 1 si desea realizar otra accion, de lo contrario 0");
                int q=lectura.nextInt();
                if(q==1){
                    i--;
                }
        }else if(z==3){System.out.println("Ingrese codigo, fecha, horas y minutos de trabajo");
            int m=lectura.nextInt();
            String n=lectura.next();
            int o=lectura.nextInt();
            int p=lectura.nextInt();
            s.añadirhorasextras(m, n, o, p);
            System.out.println("ingrese 1 si desea realizar otra accion, de lo contrario 0");
                int q=lectura.nextInt();
                if(q==1){
                    i--;
                }
        }else if(z==4){System.out.println("Ingrese codigo trabajador");
        int m=lectura.nextInt();
        TreeMap<String, ArrayList<Integer>> n = s.reportepersonal(m);
        System.out.println("Horas y min trabajados / Horas y min faltantes para completar jornada");
          for(ArrayList<Integer> e: n.values()){
              System.out.println(a);
          }System.out.println("ingrese 1 si desea realizar otra accion, de lo contrario 0");
                int q=lectura.nextInt();
                if(q==1){
                    i--;
                }
        }else if(z==5){System.out.println("Ingrese codigo trabajador");
        int m=lectura.nextInt();
        TreeMap<String, ArrayList<Integer>> n = s.reportepersonalhorase(m);
        System.out.println("Horas y min trabajados / Horas y min faltantes para completar jornada");
          for(ArrayList<Integer> e: n.values()){
              System.out.println(e);
        }System.out.println("Horas y min de trabajo extras");
                int q=lectura.nextInt();
                if(q==1){
                    i--;
                }
        }else if(z==6){System.out.println("Ingrese codigo trabajador");
            HashMap<ArrayList<Integer>,Trabajador> f = s.tfaltas();
            System.out.println("Fallas de trabajadores");
            for(Trabajador e: f.values()){
                System.out.println(e);}
            System.out.println("ingrese 1 si desea realizar otra accion, de lo contrario 0");
                int q=lectura.nextInt();
                if(q==1){
                    i--;
                }
        }else if(z==7){System.out.println("Ingrese codigo trabajador");
        int m=lectura.nextInt();
        System.out.println("Valor de la nomina actual del trabajador con codigo"+m+": " +s.nominamestrabajador(m));
        System.out.println("ingrese 1 si desea realizar otra accion, de lo contrario 0");
                int q=lectura.nextInt();
                if(q==1){
                    i--;
                }
        }else if(z==8){System.out.println("Nominas total mes");
            System.out.println(s.nominastotalmes());
            System.out.println("ingrese 1 si desea realizar otra accion, de lo contrario 0");
                int q=lectura.nextInt();
                if(q==1){
                    i--;
                }
        }else if(z==9){System.out.println("Costos total mes");
            System.out.println(y.CalcularCostos());
            System.out.println("ingrese 1 si desea realizar otra accion, de lo contrario 0");
            int q=lectura.nextInt();
            if(q==1){
                i--;
            }
        }
    }
  
    }
}

