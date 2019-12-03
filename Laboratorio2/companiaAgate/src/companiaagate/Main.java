/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companiaagate;

import java.util.Scanner;

/**
 *
 * @author CLARA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Selector =0;
        int opcionExtra=0;
        Scanner sc = new Scanner(System.in);
        cliente a = null;
        Staff s = null;
        Anuncio an = null;
        CampanaPublicitaria cp = null;
        CompaniaAgate ag= new CompaniaAgate();
        contactoPrincipal Con = null;
        
        String Aa;
        String Bb;
        int Cc;
        String Dd;
        int Cat;
        
        while(Selector !=3) {
            System.out.println("seleccione una de las siguentes opciones");
            System.out.println("1 para agregar");
            System.out.println("2 para mostrar");
            System.out.println("3 para finalizar");
            Selector = sc.nextInt();
            
            switch(Selector){
                case 1:
                    System.out.println("1 para agregar campañia");
                    System.out.println("2 para agregar Staff");
                    System.out.println("3 para agregar Campaña publicitaria");
                    
                    opcionExtra = sc.nextInt();
                    switch(opcionExtra){
                        case 1:
                            System.out.println("ingrse Nombre");
                            Aa = sc.next();
                            System.out.println("Ingese Direccion");
                            Bb = sc.next();
                            a= new cliente(Aa, Bb);
                            System.out.println("agregar contacto principal");
                            System.out.println("Nombre de Contacto");
                            Aa= sc.next();
                            System.out.println("Apellido de Contacto");
                            Bb=sc.next();
                            System.out.println("id de contacto");
                            Dd=sc.next();
                            Con= new contactoPrincipal(Aa,Bb,Dd);
                            a.AgregarContacto(Con);
                            System.out.println("agregar contacto de Empresa");
                            System.out.println("ingrse Nombre");
                            Aa = sc.next();
                            System.out.println("ingrse Id");
                            Bb = sc.next();
                            System.out.println("ingrse nivel Laboral");
                            Cc = sc.nextInt();
                            s = new Creativo(Bb, Aa, Cc);
                            a.AgregarPersonaldeContacto(s);
                            
                            ag.RegistrarCliente(a);
                            break;
                        case 2:
                            System.out.println("ingrse Nombre");
                            Aa = sc.next();
                            System.out.println("ingrse Id");
                            Bb = sc.next();
                            System.out.println("ingrse nivel Laboral");
                            Cc = sc.nextInt();
                            System.out.println("ingrse 1 para contabilidad, 2 para creativo, 3 para administracion, 4 para informatico");
                            Cat = sc.nextInt();
                            if(Cat == 1){
                                s = new Contabilidad(Bb, Aa, Cc);
                            }else if(Cat == 2){
                                s = new Creativo(Bb, Aa, Cc);
                            }else if(Cat == 3){
                                s = new Administracion(Bb, Aa, Cc);
                            }else if(Cat == 4){
                                s = new Informatica(Bb, Aa, Cc);
                            }else{
                                System.out.println("Opcion incorrecta");
                            }
                            ag.RegistrarPersonal(s);
                            break;
                        case 3:
                            System.out.println("ingrese nombre de Compañia");
                            Aa= sc.next();
                            String Titulo;
                            int[] FechaInicioPlanificado = new int[3];
                            int[] FechaFinalPlanificado = new int[3];
                            double CostosEstimados;
                            double Presupuesto;
                            System.out.println("ingrese titulo");
                            Titulo = sc.next();
                            System.out.println("ingrese dia de inicio");
                            FechaInicioPlanificado[0] = sc.nextInt();
                            System.out.println("ingrese mes de inicio");
                            FechaInicioPlanificado[1] = sc.nextInt();
                            System.out.println("ingrese año de inicio");
                            FechaInicioPlanificado[2] = sc.nextInt();
                            System.out.println("ingrese dia de finalizacion");
                            FechaFinalPlanificado[0] = sc.nextInt();
                            System.out.println("ingrese mes de finalizacion");
                            FechaFinalPlanificado[1] = sc.nextInt();
                            System.out.println("ingrese año de finalizacion");
                            FechaFinalPlanificado[2] = sc.nextInt();
                            System.out.println("Costos estimados sin simbolos");
                            CostosEstimados = sc.nextDouble();
                            System.out.println("Presupuesto ");
                            Presupuesto = sc.nextDouble();
                            cp = new CampanaPublicitaria(Titulo, FechaInicioPlanificado, FechaFinalPlanificado, CostosEstimados, Presupuesto);
                            ag.AgregarCampaña(Aa, cp);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 para mostrar clientes");
                    System.out.println("2 para mostrar Staff");
                    System.out.println("3 para mostrar staff por nivel laboral");
                    
                    opcionExtra = sc.nextInt();
                    switch(opcionExtra){
                        case 1:
                            System.out.println(ag.Clientes.values());
                    break;
                        case 2:
                            System.out.println(ag.Personal.values());
                        break;
                        case 3:
                            ag.RegistarPorNiveles();
                            System.out.println(ag.orden.values());
                        break;
                    }
                break;
            }
        }        
    }    
}
