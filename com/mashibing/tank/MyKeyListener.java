package com.mashibing.tank;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.printf("按下了"+e.getExtendedKeyCode()+"code:"+e.getKeyCode());
        if(e.getKeyCode()==37){
            System.out.printf("往上走");
        }
        if(e.getKeyCode()==38){
            System.out.println("往上走");
        }
        if(e.getKeyCode()==39){
            System.out.println("往右走");
        }
        if(e.getKeyCode()==40){
            System.out.println("往下走");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
    }
}
