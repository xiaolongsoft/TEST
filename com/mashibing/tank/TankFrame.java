package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TankFrame extends Frame {

    int x=200,y=200;
    public TankFrame() throws HeadlessException {
        this.setVisible(true);
        setResizable(false);
        setTitle("tank war");
        setSize(800,600);
        addKeyListener(new MyKeyListener(this));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.printf("退出程序");
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g){
        System.out.print("graphics 画笔");
        g.fillRect(x,y,50,50);
        x+=10;
        y+=10;
    }
}
