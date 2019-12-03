/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

/**
 *
 * @author Ofar Rincon
 */
public class Tile {
    
    String namefile;
    int nPosition;

    public Tile(String namefile, int nPosition) {
        this.namefile = namefile;
        this.nPosition = nPosition;
    }    

    public String getNamefile() {
        return namefile;
    }
    
    
}
