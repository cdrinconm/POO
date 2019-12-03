import java.util.Scanner;
public class Loteria1 {
static int puntaje;
java.util.Scanner entrada= new java.util.Scanner(System.in);
public static void main(String[] args) {
java.util.Scanner entrada= new java.util.Scanner(System.in);	
int[] combinacion = new int[3];
for(int i=0; i<3; i++){
 do{
 System.out.print("Introduzca  un numero(" + (i+1) + ") entre el 1 y el 9: ");
 combinacion[i] = entrada.nextInt(); 
 } while ((combinacion[i] < 0) || (combinacion[i] > 9) );
}
System.out.println("Su combinacion es: " + combinacion[0] + combinacion[1] + combinacion[2]);
    
int sorteo[] = new int[3];
for (int i=0; i<3; i++) {
  do {
   int generar = (int) Math.floor((Math.random()*10)+1) ;
   sorteo[i] = generar;
   } while ((sorteo[i] < 0) || (sorteo[i] > 9));
   }
System.out.println("El sorteo es: " + sorteo[0] + sorteo[1] + sorteo[2]);
int a=3;
if(combinacion[0]==combinacion[2] || combinacion [1]==combinacion[2]){
        a--;    
    }
if( combinacion[0]==combinacion[1]){
combinacion[1] = combinacion[2];
a--;
}
    int c=3;
if(sorteo[0]==sorteo[2] || sorteo [1]==sorteo[2]){
        c--;    
    }
if( sorteo[0]==sorteo[1]){
sorteo[1] = sorteo[2];
c--;
}
int d=0;
    for (int i=0; i<a;i++){
  for(int j =0; j<c; j++){
    if (combinacion [i]==sorteo[j]){
        d++;
    }
  }  
  } 
System.out.println("Numero de aciertos = " + d);
if(d==1){
	puntaje+=10;
	System.out.println("Su puntaje es de $"+puntaje);
	main (null);
}else if(d==2){
	puntaje+=100;
	System.out.println("Su puntaje es de $"+puntaje);
	main (null);
	} else if(d==3){
		puntaje+=100;
		System.out.println("Su puntaje es de $"+puntaje);
		main (null);
	}else {
Perdio();}
}
public static int Perdio(){
	 System.out.println("Lo sentimos, no hay aciertos");
	 System.out.println(":'("+"\nInt�ntelo de nuevo"+"\nSu puntaje total fue de $"+ puntaje);
		 VolverAJugar();
		 return puntaje=0;	
	}
public static int VolverAJugar(){
	int desicion;
	System.out.println("Ingrese 1 si desea volver a jugar, 2 si desea salir del Juego");
	java.util.Scanner entrada= new java.util.Scanner(System.in);
	desicion=entrada.nextInt();
	 while((desicion!=1)&&(desicion!=2)){
		 System.out.println("N�mero inv�lido, Ingrese 1 si desea volver a jugar, 2 si desea salir del juego");
		 desicion=entrada.nextInt();}
	 if(desicion==2){
	 System.out.println("GRACIAS por jugar, hasta una pr�xima oportuniad");
	 System.exit(0);
	}else{
	puntaje=0;
	System.out.println("GRACIAS por volver a Jugar\nEn un momento podr� jugar de nuevo\n.\n..\n...\n....");
    main(null);
	}
	return 0;
 }
}
