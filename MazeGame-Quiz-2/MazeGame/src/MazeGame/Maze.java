/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import javax.swing.*;

/**
 *
 * @author Ofar Rincon
 */
public class Maze extends Game{
    
    int time;
    World world1;
    Screen screen;

    public Maze() {
        this.time = 60;
        this.screen = new Screen();        
        this.world1 = new World(screen.getWidth(), screen.getHeigth(),time);
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public World getWorld1() {
        return world1;
    }

    @Override
    public Screen getScreen() {
        return screen;
    }    
}
