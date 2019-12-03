/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobono;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class Planta extends Thread{
  private Turtle turtle;

  Planta(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {  
     segment(turtle);
 }

 private void segment(Turtle t)
 {
    for (int i = 0; i < 2; i++){
        t.right(90);
        t.forward(40);
        t.right(90);
        t.forward(20);
    }
    t.left(90);
    t.forward(10);
    t.right(90);
    t.forward(10);
    t.right(90);
    t.forward(35);
    t.left(90);
    t.forward(50);
    t.left(90);
    t.forward(20);
    t.left(90);
    t.forward(10);
    t.left(90);
    t.forward(30);
    t.left(90);
    t.forward(10);
    t.left(90);
    t.forward(10);
    t.right(90);    
    t.forward(20);
    for (int i = 0; i < 2; i++){
        t.right(90);
        t.forward(10);
    }
    t.right(90);
    t.forward(30);
    for (int i = 0; i < 2; i++){
        t.right(90);
        t.forward(10);
    }
    t.right(90);
    t.forward(70);
    t.left(90);
    t.forward(35);
    t.right(90);
    t.forward(10);
    t.right(90);
    t.forward(10);
    t.left(90);
    t.penUp();
    t.forward(40);
 }
}
