package com.mashibing.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Queue;

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

        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.printf("往左走");
            BL=true;
            dir=Dir.LEFT;
            tank.moving=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            BU=true;
            dir=Dir.UP;
            tank.moving=true;
            System.out.println("往上走");
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            BR=true;
            dir=Dir.RIGHT;
            tank.moving=true;
            System.out.println("往右走");
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            BD=true;
            dir=Dir.DOWN;
            tank.moving=true;
            System.out.println("往下走");
        }
        if(e.getKeyCode()==KeyEvent.VK_ENTER){

            System.out.println("发射子弹!!!");
            if(tank.getBullet_num()==0){
                System.out.println("子弹打光了！需要补给。。");
            }else {
                tank.setBullet_num(tank.getBullet_num()-1);
                Bullet bullet=new Bullet(tank.getX(),tank.getY(),tank.getDir());
                Queue<Bullet> bulletQueue = tank.getBulletQueue();
                bulletQueue.add(bullet);
                tank.setBulletQueue(bulletQueue);
            }

        }
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
            tank.setBullet_num(6);
            System.out.println("补充弹药！");
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
