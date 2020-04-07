package com.mashibing.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener extends KeyAdapter {
    public MyKeyListener() {
        super();
    }
    private TankFrame frame;

    public  MyKeyListener(TankFrame f) {
        this.frame=f;
    }

    /**
     * 方向标记
     */
    Boolean BL=false;
    Boolean BU=false;
    Boolean BR=false;
    Boolean BD=false;
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.printf("往左走");
            BL=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            BU=true;
            System.out.println("往上走");
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){

            BR=true;
            System.out.println("往右走");
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            BD=true;

            System.out.println("往下走");
        }
        frame.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.printf("往左走");
            BL=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            BU=false;
            System.out.println("往上走");
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){

            BR=false;
            System.out.println("往右走");
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            BD=false;

            System.out.println("往下走");
        }
    }
}
