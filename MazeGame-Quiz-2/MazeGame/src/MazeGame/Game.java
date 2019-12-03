/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ofar Rincon
 */
public class Game {
    
    String title;
    String description;
    String author;

    public Game() {        
        this.title = "MazeGame - New Game ";
        this.description = "Recoge todos los items para pasar el nivel";
        this.author = "Poo - Unal";
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }
    
    public int getTime() {return 0;}

    public World getWorld1() {return null;}
    
    public Screen getScreen() {return null;}
    
    public static void main(String[] args) {        
        new newFrame();
    }
    
}
