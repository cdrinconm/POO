package ejerciciobono;

//ThreadEx3.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame
{
    public void simular(){
        Turtle john = new Turtle(this);
        Turtle laura = new Turtle(this, Color.red);
        Turtle sara = new Turtle(this, Color.green);
        Turtle Bonus = new Turtle(this, Color.black);
        
        john.setPos(-30, 125);
        laura.setPos(-10, -20);
        sara.setPos(60, 75);
        Bonus.setPos(-160,-180);
        
        laura.setPenColor(Color.red);
        sara.setPenColor(Color.green);
        Bonus.setPenColor(Color.black);
        
        new Pez(john).start();
        new Planta(laura).start();
        new Cara(sara).start();
        new Bonus(Bonus).start();
        
    }


public static void main(String[] args)
{
   ThreadEx3 tablero =  new ThreadEx3();
   tablero.simular();
}
}