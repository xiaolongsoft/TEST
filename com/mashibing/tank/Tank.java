package com.mashibing.tank;

import java.awt.*;

public class Tank {
    //坦克行驶速度
    private Integer speed=10;
    //坦克朝向
    public Dir dir=Dir.DOWN;

    private int x=200;

    private int y=200;

    private String name;
    /**
     * 行驶状态
     */
    public boolean moving=false;

    /**
     * 移动
     */
    public void move(Graphics g){
        if(moving) {
            switch (dir) {
                case LEFT:
                    x -= speed;
                    break;
                case UP:
                    y -= speed;
                    break;
                case RIGHT:
                    x += speed;
                    break;
                case DOWN:
                    y += speed;
                    break;
                default:
                    break;
            }
        }
            g.fillRect(x,y,50,50);

    }

    /**
     * 攻击
     */
    public void attack(){

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
}
