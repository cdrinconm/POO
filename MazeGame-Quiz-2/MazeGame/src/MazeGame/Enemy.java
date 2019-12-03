/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author DELMIA
 */
public class Enemy {
    
    private Timer timer;
    private int xrecgran=100;    
    private int xrecfuera=95;
    String name;
    String nSpeed;
    String nEnemiesLevel;
    String animation;
    
    private int iniposx;
    private int iniposy;
    
    private Tile tile;
    
    private ImageIcon imageIcon;
    private Image image;
    
    private int nMoveAttack;

    public Enemy(int i) {
        this.timer = timer;
        this.name = name;
        this.nSpeed = nSpeed;
        this.nEnemiesLevel = nEnemiesLevel;
        this.animation = animation;
        nMoveAttack = i;
        iniPos(nMoveAttack);
        //iniposx =(int) (Math.random()*750+1);
        //iniposy = 100 + (int) (Math.random()*450+1);
        enemyColor();
        image = imageIcon.getImage();
    }
    
    public void doDrawing(Graphics g, int pocisionx, int posiciony) {       
       iniposx = pocisionx;
       iniposy = posiciony;
       g.drawImage(image, iniposx, iniposy, 50, 50, null);
    }  

    
    public void iniPos(int i){
        if(nMoveAttack==1){
            iniposx =(int) (Math.random()*750+1);
            iniposy = 150 + (int) (Math.random()*400+1);
        }
        if(nMoveAttack==2){
            iniposx = 200 + (int) (Math.random()*750+1);
            iniposy = (int) (Math.random()*450+1);
        }
    }
    
    public int getIniposx() {
        return iniposx;
    }

    public int getIniposy() {
        return iniposy;
    }
    
    public void MoveAttack(){
        
        if(nMoveAttack==1){
            if (iniposx < 0) {            
                iniposx = 800;
            }       
            iniposx -= (int) (Math.random()*5+1);
        }
        if(nMoveAttack==2){
            if (iniposy < 0) {            
                iniposy = 600;
            }       
            iniposy -= (int) (Math.random()*5+1);
        }
        
        
        
    }
    
    private void enemyColor(){
        
        int i = (int) (Math.random()*3+1);        
        if(i==1){           
           tile = new Tile("GhostRed.PNG",1);
        }
        if(i==2){           
           tile = new Tile("GhostBlue.PNG",1);
        }
        if(i==3){           
           tile = new Tile("GhostGreen.PNG",1);
        }
        
        imageIcon = new ImageIcon(tile.getNamefile());
    }

    
}
