/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ofar Rincon
 */
public class Hero {
    
    String name;
    int lives;
    int score;
    String animation;    
    private int iniposx=100;
    private int iniposy=50;    
    
    private ImageIcon imageIcon = new ImageIcon("Hero.PNG");
    private Image image = imageIcon.getImage();
    
    private boolean left = false;
    private boolean rigth = false;
    private boolean up = false;
    private boolean down = false;

    public Hero(String name) {
        this.name = name;
        this.lives = 3;
        this.score = 0;
        this.animation = "Jmmm";        
    }    
    
    public void doDrawing(Graphics g, int pocisionx, int posiciony) {       
       iniposx = pocisionx;
       iniposy = posiciony;
       g.drawImage(image, iniposx, iniposy, 50, 50, null);       
    }
    
    public boolean Victory(int objetivos){
        if(objetivos == 0){
            JOptionPane.showMessageDialog(null, "¡Ganaste!");
            return true;
        }
        return false;
    }
    public boolean Defeat(int vida, int time){
        if(vida == 0){
            JOptionPane.showMessageDialog(null, "¡Perdiste tus vidas!");            
            return true;
        }
        if(time == 0){
            JOptionPane.showMessageDialog(null, "¡Se acabo el tiempo!");            
            return true;
        }
        return false;
    }
    public void MoveUp(){
        iniposy -= 5;
    }
    public void MoveDown(){
        iniposy += 5;
    }
    public void MoveLeft(){
        iniposx -= 5;
    }
    public void MoveRigth(){
        iniposx += 5;
    } 

    public int getIniposx() {
        return iniposx;
    }

    public int getIniposy() {
        return iniposy;
    }

    public void setIniposXY(int iniposx,int iniposy) {
        this.iniposx = iniposx;
        this.iniposy = iniposy;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRigth(boolean rigth) {
        this.rigth = rigth;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRigth() {
        return rigth;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }
    
    
}
