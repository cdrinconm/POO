//import java.util.Scanner;
public class JuegoPig{
private static int PuntosJ=0;
private static int PuntosC;
private static int PuntajeTotalJ;
private static int PuntajeTotalC;
private static int dj2;
static int dj1;
static int desicion;
static java.util.Scanner entrada= new java.util.Scanner(System.in);
private static int dc1;
private static int dc2;
public static void main(String[] args) {
System.out.println("BIENVENIDO al Juego Pig \nUsted se enfrentar� a la computadora\nEmpecemos!!!");
if(PuntajeTotalJ<100||PuntajeTotalC<100){
Jugador();
Pausa();
Computadora();	
Pausa();
}
}
public static int Jugador(){
while(desicion==1||dj1!=1||dj2!=1||PuntajeTotalJ<100){
Evaluar();
System.out.println("Los dados est�n rodando\n.\n..\n...\n....");
int dj1 = (int) Math.floor((Math.random()*6)+1);
int dj2 = (int) Math.floor((Math.random()*6)+1);
System.out.println("Su primer dado es:"+"\n"+dj1);
System.out.println("Su segundo dado es:"+"\n"+dj2);
if(dj1==1&&dj2==1){
 PuntajeTotalJ=0;
 System.out.println("Que mala suerte, su nuevo puntaje es "+PuntajeTotalJ+ " Y a dem�s pierde su turno");
 Pausa();
 Computadora();
}else{
if(dj1==1||dj2==1){
 //PuntosJ=0;
 System.out.println("Lo sentimos, ha obtenido un 1" +"\nPuntaje total del Jugador: "+PuntajeTotalJ+"\nTurno de la Computadora");
 Pausa();
 Computadora();
}else{
 PuntosJ =dj1+dj2;
 System.out.println("Puntaje del Jugador en este turno "+ (dj1+dj2)
		 +"\nPuntaje total "+PuntajeTotalJ);
 System.out.println("Ingrese 1 si desea volver a jugar\n2 si desea ceder el turno a la computadora seguido de la tecla ENTER");
 desicion=entrada.nextInt();
 while((desicion!=1)&&(desicion!=2)){
	 System.out.println("N�mero inv�lido, Ingrese 1 si desea volver a jugar\n2 si desea ceder el turno a la computadora seguido de la tecla ENTER");
	 desicion=entrada.nextInt();}
 PuntajeTotalJ +=PuntosJ;
if(desicion==2){
 System.out.println("Usted ha decidio ceder el turno"+"\nPuntaje total del Jugador: "+PuntajeTotalJ+ "\nTurno de la Computadora");
 Pausa();
 Computadora();
   }
  }
 }

}
PuntajeTotalJ +=PuntosJ;
return PuntajeTotalJ;
}
public static int Computadora(){
while(desicion==1||dc1!=1||dc2!=1||PuntajeTotalC<100){
Evaluar();
System.out.println("Los dados est�n rodando\n.\n..\n...\n....");
 int dc1 = (int) Math.floor((Math.random()*6)+1);
 int dc2 = (int) Math.floor((Math.random()*6)+1);
 System.out.println("Primer dado de la Computadora"+"\n"+dc1);
 System.out.println("Segundo dado de la Computadora"+"\n"+dc2);
 if(dc1==1&&dc2==1){
 PuntajeTotalC=0;
 System.out.println("La Computadora pierde su turno y todos sus puntos"+"\nPuntaje de la computadora: "+PuntajeTotalC);
 Jugador();
}else
if(dc1==1||dc2==1){
 PuntosC=0;
 System.out.println("La computadora ha obtenido un 1"+"\nPuntaje total de la Computadora: "+PuntajeTotalC+"\nTurno del Jugador");
 Jugador();
}else{
 PuntosC =dc1+dc2;
 System.out.println("Puntaje de la Computadora en este turno "+(dc1+dc2)
		 +"\nPuntaje total de la computadora "+PuntajeTotalC);
 System.out.println("La Computadora decidir� si jugar de nuevo, o bien, cederle el turno\n.\n..\n...\n....");
 desicion=(int) Math.floor((Math.random()*2)+1);
  PuntajeTotalC +=PuntosC;
 if(desicion==2){
 System.out.println("La computadora ha decidido cederte el turno" +"\nPuntaje total de la Computadora: "+PuntajeTotalC+"\nTu turno");
 Jugador();
}else{
System.out.println("La computadora ha decidido volver a jugar");
Computadora();
   }
  }
 }
PuntajeTotalC +=PuntosC;
return PuntajeTotalC;
}
public static void Pausa(){
	System.out.println("Presione 0 para continar");
	desicion=entrada.nextInt();
}
public static void Evaluar(){
	if(PuntajeTotalJ>=100){
		System.out.println("Felicitaciones Jugador, ha VENCIDO a la computadora\nCon un total de "+PuntajeTotalJ+"puntos.");
		System.out.println("El juego ha Finalizado");
		VolverAJugar();
	}
	if(PuntajeTotalC>=100){
		System.out.println("Lo sentimos, pero fue DERROTADO por la computadora\nCon un total de "+PuntajeTotalC+"puntos");
		System.out.println("El juego ha Finalizado");
		VolverAJugar();
  }
}
public static int VolverAJugar(){
	System.out.println("Ingrese 1 si desea volver a jugar, 2 si desea salir del Juego");
	 desicion=entrada.nextInt();
	 while((desicion!=1)&&(desicion!=2)){
		 System.out.println("N�mero inv�lido, Ingrese 1 si desea volver a jugar, 2 si desea salir del juego");
		 desicion=entrada.nextInt();}
	 if(desicion==2){
	 System.out.println("GRACIAS por jugar, hasta una pr�xima oportuniad");
	 System.exit(0);
	}else{
	System.out.println("GRACIAS por volver a Jugar\nEn un momento podr� jugar de nuevo\n.\n..\n...\n....");
	PuntajeTotalJ=0; 
	PuntajeTotalC=0;
	PuntosJ=0;
	PuntosC=0;
	main(null);
	}
	return 0;
}
}