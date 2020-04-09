package com.mashibing.tank;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class Tank {
    //坦克行驶速度
    private Integer speed=10;
    //坦克朝向
    public Dir dir=Dir.DOWN;

    private int x=200;

    private int y=200;

    private String name;

    private int bullet_num=6;

    private Graphics graphics;

    private Queue<Bullet> bulletQueue=new ArrayDeque<>(bullet_num);


    /**
     * 行驶状态
     */
    public boolean moving=false;

    /**
     * 移动
     */
    public void move(){
        if(moving) {
            switch (dir) {
                case LEFT:
                    x -= speed;
                    if(x<0){
                        x=0;
                    }
                    break;
                case UP:
                    y -= speed;
                    if(y<0){
                        y=0;
                    }
                    break;
                case RIGHT:
                    x += speed;
                    if(x>750){
                        x=750;
                    }
                    break;
                case DOWN:
                    y += speed;
                    if(y>750){
                        y=750;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("x:"+x+"y:"+y);
            this.graphics.fillRect(x,y,50,50);

    }

    /**
     * 攻击
     */
    public void attack(){
        Iterator<Bullet> iterator = bulletQueue.iterator();
        while (iterator.hasNext()){
            Bullet bullet = iterator.next();
            if(bullet!=null&&bullet_num>0){
                bullet.move(graphics);
            }
        }

    }

    public Tank(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tank() {
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public int getBullet_num() {
        return bullet_num;
    }

    public void setBullet_num(int bullet_num) {
        this.bullet_num = bullet_num;
    }

    public Queue<Bullet> getBulletQueue() {
        return bulletQueue;
    }

    public void setBulletQueue(Queue<Bullet> bulletQueue) {
        this.bulletQueue = bulletQueue;
    }
}
