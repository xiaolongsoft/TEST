package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tank {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setVisible(true);
        f.setResizable(false);
        f.setTitle("tank war");
        f.setSize(800,600);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }
}
