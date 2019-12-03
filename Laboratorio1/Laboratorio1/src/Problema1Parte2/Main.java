/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1Parte2;

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
        EL programa es un juego de adivinar el numero que el sistema tomo aleatoriamente, 
        y el usuario tiene siete oportunidades para adivinarlo.Al final se le da al
        usuario la oportunidad de volver a jugar.
        */
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        char playAgain = 'y';
        while(!(playAgain != 'y')){
            GuessingGame();
            System.out.println("Would you like to play another game(y/n): ");
            playAgain = lectura.next().charAt(0);
        }
    }
    
    private static void GuessingGame(){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int answer = (int) Math.floor((Math.random()*100)+1);
        int guess = 0;
        int numGuesses = 1;
        while(!((numGuesses > 7) || (guess == answer))){
            System.out.println("Guess a number");
            guess = lectura.nextInt();
            if(guess < answer){
                System.out.println("Higher...");
            }else{
                if(guess > answer){
                    System.out.println("Lower...");
                }else{
                    System.out.println("You Win...");
                }
            }
            numGuesses = numGuesses + 1;
        }
        if(numGuesses > 7){
            System.out.println("You loser");
        }             
    }
    
}
