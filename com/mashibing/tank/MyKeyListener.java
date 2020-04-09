package com.mashibing.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener extends KeyAdapter {
    public MyKeyListener() {
        super();
    }
    private Tank tank;

    public  MyKeyListener(Tank tank) {
        this.tank=tank;
    }

    /**
     * 方向标记
     */
    Boolean BL=false;
    Boolean BU=false;
    Boolean BR=false;
    Boolean BD=false;
    Dir dir=Dir.DOWN;
    @Override
    public void keyPressed(KeyEvent e) {
        tank.moving=true;
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.printf("往左走");
            BL=true;
            dir=Dir.LEFT;
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            BU=true;
            dir=Dir.UP;
            System.out.println("往上走");
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            BR=true;
            dir=Dir.RIGHT;
            System.out.println("往右走");
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            BD=true;
            dir=Dir.DOWN;
            System.out.println("往下走");
        }
        tank.setDir(dir);
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

        if(BD==false&&BR==false&BU==false&&BL==false){
            tank.moving=false;
            System.out.println(tank.getName()+"停车");
        }
    }
}
