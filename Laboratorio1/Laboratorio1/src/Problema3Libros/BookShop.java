/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshop;

/**
 *
 * @author oscar
 */
public class BookShop {
    
public static String [] ingresocb(String x[], String y[], int z[], int a){
 java.util.Scanner lectura = new java.util.Scanner(System.in);
System.out.println("ingrese el codigo del libro");
x[a-1]=lectura.nextLine();
System.out.println("ingrese el nombre del libro");
y[a-1]=lectura.nextLine();
System.out.println("ingrese el valor del libro");
z[a-1]=lectura.nextInt();
return (x);
}

public static String[] compra(String x[],String y[],String p[],String g[],int k[], int z[],int q[],int a, int b,int c, int d){
for(int i=0;i<a;i++){
        if(i==0){
            java.util.Scanner lectura = new java.util.Scanner(System.in);
            System.out.println("digite el codigo del libro a comprar");
        p[b]=lectura.nextLine();
} 
if(x[i].equals(p[b])){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        System.out.println("¿cuantas unidades del ejemplar"+y[i]+"' desea?");
        int h;
        h=lectura.nextInt();
        q[b]=z[i]*h;
        System.out.println("Numero de libros"+"\t"+"Codigo"+"\t"+"Nombre"+"\t"+"Costo unidad");
        System.out.println(h+"\t"+x[i]+"\t"+y[i]+"\t"+z[i]);
        System.out.println("valor total compra: "+q[b]);

        System.out.println("Digite 1 si desea realizar otra compra, de lo contrario 0");
        int t;
        t=lectura.nextInt();
               if(t==1){
                         i=-1;
                         int m=b+1;
                         b=m;
               }else{
                    int n=0;
                    int l=0;
                            for(int s=0;s<=b;s++){
                                            n=l+q[s];
                                            l=n;
                                                   }
      System.out.println("EL VALOR TOTAL DE LA FACTURA ES: "+"$"+l);
      System.out.println("DIGITE 0 PARA TERMINAR PROCESO O 1 PARA ELIMINAR ALGUN PRODUCTO?");
      int w;
      w=lectura.nextInt();
        if(w==1){
                for(int e=0 ;e<=b;e++){
                        if(e==0){
                            System.out.println("digite el codigo del libro a eliminar");
                            java.util.Scanner ready = new java.util.Scanner(System.in);
                                 g[d]=ready.nextLine();
        }               if(g[d].equals(p[e])){
                        System.out.println("¿cuantas unidades del ejemplar '"+p[i]+"' desea eliminar?");
                        c=lectura.nextInt();
                        k[e]=(q[e]*c)/h;
                       System.out.println(k[e]);
                       System.out.println("Numero de libros eliminados"+"\t"+"Valor restado");
                       System.out.println("\t"+k[i]);
                       System.out.println("Digite 1 si desea eliminar otro libro, de lo contrario 0");
                       int T;
                       T=lectura.nextInt();
       if(t==1){
                i=-1;
                int m=b+1;
                b=m;
       }else{
             int N=0;
             int L=0;
        for(int I=0;I<=i;I++){
            N=L+k[I];
            L=N;
}
    System.out.println("EL VALOR TOTAL DE LA FACTURA ES: "+"$"+(l-L));
}
}
}
}
}
}
}
return (p);
}
    public static void main(String[] args) {
  java.util.Scanner lectura = new java.util.Scanner(System.in);
   int NoBook=5;
   int cm=100;
   int compra=0;
   int eliminacion=0;
   int booku=0;
     String cod[]= new String[cm];
     String book[]= new String[cm];
     String ebook[]= new String[cm];
     int val[]= new int[cm];
     String bookc[]= new String[cm];
    int Valcompra[]= new int[cm];
    int Valcomprae[]= new int[cm];
    
    cod[0]= "cg3-mj2"; book[0]= "Ecuaciones Diferenciales "; val[0]= 315235;
      cod[1]= "14a-pr5"; book[1]= "Calculo en una variable  "; val[1]= 123012;
      cod[2]= "91c-sr1"; book[2]= "Calculo  multivariable   "; val[2]= 195236;
      cod[3]= "25a-fe5"; book[3]= "Estadistica fundamental  "; val[3]= 205698;
      cod[4]= "84c-mg1"; book[4]= "Programacion orientada   "; val[4]= 174325;
      
      System.out.println("codigo" + "\t" + "libro" + "                           " + "costo");
      
      for(int i=0; i<NoBook;i++){
System.out.println( cod[i] + "\t" + book[i] + "\t" + "$" + val[i]);
  

}
      System.out.println("FUNCIONES DISPONIBLES:");
      System.out.println("1.Ingresar nuevo libro");
System.out.println("2. Facturar libros");
System.out.println("*Solo podrar realizar una funcion a la vez*");
int a;
a=lectura.nextInt();
if(a==1){
    NoBook++;
    ingresocb(cod,book,val,NoBook);
        for(int i=0; i<NoBook;i++){
    System.out.println( cod[i] + "\t" + book[i] + "\t" + "$" + val[i]);
    
}
}else if(a==2){
compra(cod,book,bookc,ebook,Valcomprae,val,Valcompra,NoBook,compra,booku, eliminacion);
}
}
}


