package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TankFrame extends Frame {

    public static final int  WIDTH=800;
    public static final int  HEIGHT=800;
    Tank tank=new Tank("龙神号");

    public TankFrame() throws HeadlessException {
        this.setVisible(true);
        setResizable(false);
        setTitle("tank war");
        setSize(WIDTH,HEIGHT);




        addKeyListener(new MyKeyListener(tank));
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
        tank.setGraphics(g);
        tank.move();
        tank.attack();
    }
}
