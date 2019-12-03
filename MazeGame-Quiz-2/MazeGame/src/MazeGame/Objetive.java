/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ofar Rincon
 */
public class Objetive {
    
    String name;
    String nObjectLevel;
    int value;
    
    private int iniposx = 300 + (int) (Math.random()*450+1);
    private int iniposy = 200 + (int) (Math.random()*300+1);
    
    private Tile tile = new Tile("Objetive.PNG",1);
    
    private ImageIcon imageIcon = new ImageIcon(tile.getNamefile());
    Image image = imageIcon.getImage();    
    
    public Objetive() {
        this.name = name;
        this.nObjectLevel = nObjectLevel;
        this.value = value;        
    }
    
    public void doDrawing(Graphics g, int pocisionx, int posiciony) {       
       iniposx = pocisionx;
       iniposy = posiciony;
       g.drawImage(image, iniposx, iniposy, 50, 50, null);
    }  

    public int getIniposx() {
        return iniposx;
    }

    public int getIniposy() {
        return iniposy;
    }

    public void setIniposxy() {
        this.iniposx = (int) (Math.random()*750+1);
        this.iniposy = (int) (Math.random()*550+1);
    }

    
    
}
