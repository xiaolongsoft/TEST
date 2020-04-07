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

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.printf("按下了"+e.getExtendedKeyCode()+"code:"+e.getKeyCode());
        if(e.getKeyCode()==37){
            System.out.printf("往左走");
            frame.x-=20;
        }
        if(e.getKeyCode()==38){
            frame.y+=20;
            System.out.println("往上走");
        }
        if(e.getKeyCode()==39){
            frame.x+=20;
            System.out.println("往右走");
        }
        if(e.getKeyCode()==40){
            frame.x-=20;
            System.out.println("往下走");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
    }
}
