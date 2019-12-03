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
public class Bonus extends Thread{
  private Turtle turtle;

  Bonus(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {   
    segment(turtle);
 }

 private void segment(Turtle t)
 {
    t.right(60);
    t.forward(10);
    t.left(60);
    t.forward(30);
    t.left(60);
    t.forward(10);
    t.left(30);
    t.forward(30);
    t.left(180);
    t.forward(30);
    t.left(30);
    t.forward(10);
    t.left(60);
    t.forward(30);
    t.left(60);
    t.forward(10);
    t.left(30);
    t.forward(30);
    t.left(90);
    t.forward(80);
    t.left(90);
    t.forward(30);
    t.penUp();
    t.forward(30);
    //O
    t.penDown();
    for (int i = 0; i < 2; i++){
        t.forward(40);
        t.left(90);
        t.forward(80);
        t.left(90);
    }
    t.forward(40);    
    t.penUp();
    t.forward(20);
    t.left(90);
    //N
    t.penDown();    
    t.forward(80);
    t.right(150);
    t.forward(90);
    t.left(150);
    t.forward(80);
    t.right(90);
    t.penUp();
    t.forward(20);
    //U
    t.penDown();
    t.right(90);
    t.forward(80);
    t.left(90);
    t.forward(40);
    t.left(90);
    t.forward(80);
    t.right(90);
    t.penUp();   
    t.forward(20);
    //S
    t.penDown();
    t.forward(40);
    t.right(180);
    t.forward(40);
    t.left(90);
    t.forward(40);
    t.left(90);
    t.forward(40);
    t.right(90);
    t.forward(40);
    t.right(90);
    t.forward(40);
    t.left(90);
    t.penUp();
    t.forward(10);
    t.left(90);
    t.forward(80);
    t.left(90);
    t.forward(50);
 }
}
