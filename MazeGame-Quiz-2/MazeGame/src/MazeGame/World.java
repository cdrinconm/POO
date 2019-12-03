/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Ofar Rincon
 */
public class World extends JPanel implements ActionListener {
    
    private Timer timer;
    int number;
    private int width;
    private int heigth;
    //private int time;
    Time ti;
    Thread t;
    private int vida = 3;
    private int objetivos = 10;
    
    private ImageIcon imageIcon = new ImageIcon("BackGround.PNG");
    private Image image = imageIcon.getImage();
    
    Hero h = new Hero("Daniel");
    
    Enemy e = new Enemy(1);
    Enemy e2 = new Enemy(1);
    Enemy e3 = new Enemy(1);
    Enemy e4 = new Enemy(2);
    Enemy e5 = new Enemy(2);
    Enemy e6 = new Enemy(2);
    
    
    Obstacle o = new Obstacle();
    
    Objetive ob = new Objetive();
    Objetive ob2 = new Objetive();
    
    
    
    public World(int width, int heigth, int time) {
        addKeyListener(new TAdapter());
        setFocusable(true);
        this.number = 1;
        this.width = width;
        this.heigth = heigth;
        setSize(width,heigth);
        timer = new Timer(10,this);
        timer.start();
        //this.time = time;
        ti = new Time(time);
        t = new Thread(ti);
        t.start();
    }
        
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        
        if (this.image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
        h.doDrawing(g,h.getIniposx(),h.getIniposy());
        e.doDrawing(g, e.getIniposx(), e.getIniposy());
        e2.doDrawing(g, e2.getIniposx(), e2.getIniposy());
        e3.doDrawing(g, e3.getIniposx(), e3.getIniposy());
        e4.doDrawing(g, e4.getIniposx(), e4.getIniposy());
        e5.doDrawing(g, e5.getIniposx(), e5.getIniposy());
        e6.doDrawing(g, e6.getIniposx(), e6.getIniposy());
        //o.doDrawing(g,o.getIniposx(),o.getIniposy());
        ob.doDrawing(g, ob.getIniposx(), ob.getIniposy());
        ob2.doDrawing(g, ob2.getIniposx(), ob2.getIniposy());
        //Tiempo
        g.drawImage(new ImageIcon("Relog.png").getImage(), 100, 25, 20, 20, this);
        g.drawRect(150, 30, 120, 10);
        g.setColor(Color.WHITE);        
        g.fillRect(150, 30, ti.time*2, 10);
        //Objetivos
        g.drawImage(new Objetive().image, 350, 25, 20, 20, this);
        g.drawString("X " + String.valueOf(objetivos), 380, 40);
        //Vidas
        g.setColor(Color.white);
        g.drawImage(new ImageIcon("heart.png").getImage(), 550, 25, 20, 20, this);
        g.drawString("X " + String.valueOf(vida), 580, 40);       
    }
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        if(h.Defeat(vida,ti.time) || h.Victory(objetivos)){
            timer.stop();            
        }        
        e.MoveAttack();
        e2.MoveAttack();
        e3.MoveAttack();
        e4.MoveAttack();
        e5.MoveAttack();
        e6.MoveAttack();
        checkCollisions();        
        repaint();
    }
    
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();            
            if(key == KeyEvent.VK_LEFT){
                h.setLeft(false);
                moveHero();
            }
            if(key == KeyEvent.VK_RIGHT){
                h.setRigth(false);
                moveHero();
            }

            if(key == KeyEvent.VK_DOWN){
                h.setDown(false);
                moveHero();
            }            
            if(key == KeyEvent.VK_UP){
                h.setUp(false);
                moveHero();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
            int key = e.getKeyCode();            
            if(key == KeyEvent.VK_LEFT){
                h.setLeft(true);
                moveHero();
            }
            if(key == KeyEvent.VK_RIGHT){
                h.setRigth(true);
                moveHero();
            }

            if(key == KeyEvent.VK_DOWN){
                h.setDown(true);
                moveHero();
            }            
            if(key == KeyEvent.VK_UP){
                h.setUp(true);
                moveHero();
            }
        }
    }
    
    public void moveHero(){
        if (h.isLeft()) {
            h.MoveLeft();
        }
        if (h.isRigth()) {
            h.MoveRigth();
        }
        if (h.isDown()) {
            h.MoveDown();
        }
        if (h.isUp()) {
            h.MoveUp();
        }
    }
    
    public void checkCollisions(){
           
        Rectangle recHero = new Rectangle(h.getIniposx(), h.getIniposy(), 50, 50);        
        Rectangle recObjetive = new Rectangle(ob.getIniposx(), ob.getIniposy(), 50, 50);
        Rectangle recObjetive2 = new Rectangle(ob2.getIniposx(), ob2.getIniposy(), 50, 50);
        Rectangle recObstacle = new Rectangle(o.getIniposx(), o.getIniposy(), 50, 50);
        Rectangle recEnemy = new Rectangle(e.getIniposx(), e.getIniposy(), 50, 50);
        Rectangle recEnemy2 = new Rectangle(e2.getIniposx(), e2.getIniposy(), 50, 50);
        Rectangle recEnemy3 = new Rectangle(e3.getIniposx(), e3.getIniposy(), 50, 50);
        Rectangle recEnemy4 = new Rectangle(e4.getIniposx(), e4.getIniposy(), 50, 50);
        Rectangle recEnemy5 = new Rectangle(e5.getIniposx(), e5.getIniposy(), 50, 50);
        Rectangle recEnemy6 = new Rectangle(e6.getIniposx(), e6.getIniposy(), 50, 50);
        
        if(recEnemy.intersects(recHero)){
            //timer.stop();
            vida -= 1;
            h.setIniposXY(100, 50);
            System.out.println("Colision");
        }
        if(recEnemy2.intersects(recHero)){
            //timer.stop();
            vida -= 1;
            h.setIniposXY(100, 50);
            System.out.println("Colision");
        }
        if(recEnemy3.intersects(recHero)){
            //timer.stop();
            vida -= 1;
            h.setIniposXY(100, 50);
            System.out.println("Colision");
        }
        if(recEnemy4.intersects(recHero)){
            //timer.stop();
            vida -= 1;
            h.setIniposXY(100, 50);
            System.out.println("Colision");
        }
        if(recEnemy5.intersects(recHero)){
            //timer.stop();
            vida -= 1;
            h.setIniposXY(100, 50);
            System.out.println("Colision");
        }
        if(recEnemy6.intersects(recHero)){
            //timer.stop();
            vida -= 1;
            h.setIniposXY(100, 50);
            System.out.println("Colision");
        }        
        if(recObjetive.intersects(recHero)){
            //timer.stop();
            objetivos -= 1;
            System.out.println("Colision");
            ob.setIniposxy();            
        }
        if(recObjetive2.intersects(recHero)){
            //timer.stop();
            objetivos -= 1;
            System.out.println("Colision");            
            ob2.setIniposxy();
        }        
        if(recObstacle.intersects(recHero)){
            //timer.stop();
            //puntos -= 100;
            System.out.println("Colision");
        }
    }
    
}

class Time implements Runnable{
    int time;
    int ciclos;

    public Time(int time) {
        this.time = time;
        this.ciclos = time;
    }    
    
    @Override
    public void run() {
        try{
            for(int i=0; i<ciclos; i++){
                Thread.sleep(1000);
                time -= 2;
            }
        }catch(InterruptedException e){}
    }
}