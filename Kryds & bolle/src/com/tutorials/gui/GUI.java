package com.tutorials.gui;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    Toolkit tk;
    private final int width = 550, height = 500;
    JPanel jpanel;

    public GUI(){
        tk = Toolkit.getDefaultToolkit();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(width,height));
        this.setLocation((int)(tk.getScreenSize().getWidth()-width)/2, (int)(tk.getScreenSize().getHeight()-height)/2);

        jpanel = new Board();
        this.add(jpanel);


        this.setVisible(true);
    }




}
