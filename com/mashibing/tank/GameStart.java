package com.mashibing.tank;

import java.awt.*;

public class GameStart {
    public static void main(String[] args) throws InterruptedException {
        Frame frame=new TankFrame();
        while (true){
            Thread.sleep(50);
            frame.repaint();
        }
    }
}
