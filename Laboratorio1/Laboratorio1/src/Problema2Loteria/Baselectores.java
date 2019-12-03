package Problema2Loteria;
public class Baselectores {
public static void edades(String x[], int y[], String z[]){
    System.out.println("personas con edad menor a 20");
    for(int i =0; i<10;i++){
    if(y[i]<20){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
    }System.out.println("personas con edad mayor a 20 años y menor a 29");
    for(int i =0; i<10;i++){
    if(y[i]>=20 && y[i]<=29 ){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}System.out.println("personas con edad mayor a 30 años y menor a 39");
    for(int i =0; i<10;i++){
    if(y[i]>=30 && y[i]<=39){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}System.out.println("personas con edad mayor a 40 años y menor a 49");
    for(int i =0; i<10;i++){
    if(y[i]>=40 && y[i]<=49){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}System.out.println("personas con edad mayor a 50");
    for(int i =0; i<10;i++){
    if(y[i]>=50){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}
}
    
public static void edadesgenero (String x[], int y[], String z[], char w[]){
    
     System.out.println("hombres con edad menor a 20 años");
    for(int i =0; i<10;i++){
    if(y[i]<20 && w[i]=='m'){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}
     System.out.println("mujeres con edad menor a 20 años");
    for(int i =0; i<10;i++){
    if(y[i]<20 && w[i]=='f'){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}
}
public static void cingreso (String x[], int y[], String z[]){
    
     System.out.println("personas con ingresos menores a $30000");
    for(int i =0; i<10;i++){
    if(y[i]<30000){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}System.out.println("personas con ingresos mayores a $30000 y menores a $49999");
    for(int i =0; i<10;i++){
    if(y[i]>=30000 && y[i]<=49999 ){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}System.out.println("personas con ingresos mayores a $50000 y menores a $59999");
    for(int i =0; i<10;i++){
    if(y[i]>=50000 && y[i]<=59999){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}System.out.println("personas con ingresos mayores a $60000 y menores a $69999");
    for(int i =0; i<10;i++){
    if(y[i]>=60000 && y[i]<69999){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}System.out.println("personas con ingresos mayores a $70000");
    for(int i =0; i<10;i++){
    if(y[i]>=70000){
        System.out.println(x[i]+"\t"+z[i]+"\t"+y[i]);
    }
}
}
    public static void main(String[] args) {
        
        String nombre[]=new String [10];
        String apellido[]=new String [10];
        int edad[] = new int [10];
        char genero[]=new char[10];
        String estadoc[]= new String[10];
        int ingresos[]=new int[10];
        
        nombre[0]="David";     apellido[0]="Gomez";   edad[0]=24; genero[0]='m'; estadoc[0]="casado";  ingresos[0]=30000;
        nombre[1]="Carlos";    apellido[1]="Sanchez"; edad[1]=15; genero[1]='m'; estadoc[1]="soltero"; ingresos[1]=35000;
        nombre[2]="Maria";     apellido[2]="Coy";     edad[2]=18; genero[2]='f'; estadoc[2]="casado";  ingresos[2]=71000;
        nombre[3]="Luis";      apellido[3]="Segura";  edad[3]=17; genero[3]='m'; estadoc[3]="casado";  ingresos[3]=33000;  
        nombre[4]="Daniela";   apellido[4]="Santos";  edad[4]=40; genero[4]='f'; estadoc[4]="soltero"; ingresos[4]=58000;
        nombre[5]="Sara";      apellido[5]="Olaya";   edad[5]=21; genero[5]='f'; estadoc[5]="soltero"; ingresos[5]=60000;
        nombre[6]="Valentina"; apellido[6]="Castro";  edad[6]=23; genero[6]='f'; estadoc[6]="casado";  ingresos[6]=31000;
        nombre[7]="Juan";      apellido[7]="Gomez";   edad[7]=32; genero[7]='m'; estadoc[7]="casado";  ingresos[7]=61000;
        nombre[8]="Sebastian"; apellido[8]="Puerta";  edad[8]=19; genero[8]='m'; estadoc[8]="casado";  ingresos[8]=55000;
        nombre[9]="Diego";     apellido[9]="Zapata";  edad[9]=30; genero[9]='m'; estadoc[9]="soltero"; ingresos[9]=78000;
System.out.println("Bienvenido se�or lector");
System.out.println("\nsi desea conocer los lectores por edad, ingrese 1"
+ "\nSi desea conocer los lectores por edad y g�nero, ingrese 2"
+ "\nSi desea conocer los lectores por sus ingreseos, ingrese 3"
+ "\nSi desea salir, ingrese 4");
java.util.Scanner entrada= new java.util.Scanner(System.in);
int desicion=entrada.nextInt();
   switch(desicion){
   case 1:edades(nombre,edad,apellido);
   break;
   case 2:edadesgenero(nombre,edad,apellido,genero);
   break;
   case 3:cingreso(nombre,ingresos,apellido);
   break;
   case 4:System.out.println("Hasta luego");
   break;
   }   
 }
}
