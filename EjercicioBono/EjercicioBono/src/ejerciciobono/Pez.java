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
public class Pez extends Thread{
  private Turtle turtle;

  Pez(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
    segment(turtle);
 }

 private void segment(Turtle t)
 {
    t.right(180);
    t.forward(50);
    t.right(110);
    t.forward(146);
    t.right(140);
    t.forward(146);
    t.right(110);
    t.forward(60);
    
    t.right(110);
    t.forward(29);
    t.right(140);
    t.forward(58);
    t.right(110);
    t.forward(40);
    t.right(110);
    t.forward(40);
    t.left(20);
    t.penUp();
    t.forward(80);
    t.penDown();
    for (int i = 0; i < 4; i++){
        t.right(90);
        t.forward(10);
    }
    t.penUp();
    t.left(90);
    t.forward(30);
    
 }
 
 
}
