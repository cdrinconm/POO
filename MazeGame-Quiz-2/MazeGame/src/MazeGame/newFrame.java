/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author DELMIA
 */


public class newFrame extends JFrame implements ActionListener{
    
  
    public newFrame() {        
        setTitle("Maze Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        
        //Menu
        JMenuBar mb = new JMenuBar();
        JMenu Game = new JMenu("Juego");
        mb.add(Game);        
        JMenuItem NuevoJuego = new JMenuItem("Nuevo Juego");        
        Game.add(NuevoJuego);        
        NuevoJuego.addActionListener(this);
        mb.setVisible(true);
        setJMenuBar(mb);
        
        Game game = new Maze();
        setSize(game.getScreen().getWidth(), game.getScreen().getHeigth());
        add(game.getWorld1(), BorderLayout.CENTER);
        
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        new newFrame();
    }
}
