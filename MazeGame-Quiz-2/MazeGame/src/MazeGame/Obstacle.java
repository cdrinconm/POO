/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Ofar Rincon
 */
public class Obstacle {
    
    String name;
    String nObstaclesLevel;
    
    private int iniposx = 400;
    private int iniposy = 400;
    
    private Tile tile = new Tile("Obstacle.PNG",1);
    
    private ImageIcon imageIcon = new ImageIcon(tile.getNamefile());
    private Image image = imageIcon.getImage();
    
    public Obstacle() {
        this.name = name;
        this.nObstaclesLevel = nObstaclesLevel;        
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
}
