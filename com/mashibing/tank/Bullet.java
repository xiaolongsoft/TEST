package com.mashibing.tank;

import java.awt.*;

/**
 * 子弹类
 */
public class Bullet {
    private static final int SPEED=30;
    private int x,y;
    private Dir dir;
    public Bullet(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Bullet() {
    }

    public void move(Graphics g){
            switch (dir) {
                case LEFT:
                    x -= SPEED;
                    break;
                case UP:
                    y -= SPEED;
                    break;
                case RIGHT:
                    x += SPEED;
                    break;
                case DOWN:
                    y += SPEED;
                    break;
                default:
                    break;
            }

        g.fillOval(x,y,10,10);

    }

}
