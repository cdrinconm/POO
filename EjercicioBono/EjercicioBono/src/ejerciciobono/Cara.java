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
public class Cara extends Thread{
  private Turtle turtle;

  Cara(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {   
     segment(turtle);
 }

 private void segment(Turtle t)
 {
    for (int i = 0; i < 4; i++){
        t.forward(100);
        t.right(90);
    }
    t.forward(30);
    t.right(90);
    t.penUp();
    t.forward(15);
    t.penDown();
    t.forward(70);    
    t.right(90);
    t.forward(10);
    t.right(90);
    t.forward(70);
    t.right(90);
    t.forward(10);
    t.penUp();
    t.forward(30);
    t.penDown();    
    t.right(90);
    t.forward(20);
    for (int i = 0; i < 4; i++){
        t.left(90);
        t.forward(20);    
    }    
    t.penUp();  
    t.forward(30);
    t.penDown();
    for (int i = 0; i < 3; i++){
        t.forward(20);
        t.left(90);
    }
    t.forward(20);
    t.penUp();
    t.forward(20);
    t.right(90);
    t.forward(5);
    t.penDown();
    for (int i = 0; i < 2; i++){
        t.forward(20);
        t.right(120);    
    }
    t.forward(20);
    t.right(30);
    t.penUp();
    t.forward(60);
 }
}
