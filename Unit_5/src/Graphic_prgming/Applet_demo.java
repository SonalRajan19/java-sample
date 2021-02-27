/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_prgming;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Sonal L R
 */
public class Applet_demo extends Applet {
    String str="java programming";
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g)
    {
        //setBackground(Color.PINK);
        Font f=new Font("TimesRoman",Font.BOLD,40);
        g.setFont(f);
        setForeground(Color.GREEN);
        g.drawString(str, 100, 100);
        g.drawLine(0, 100, 100, 100);
        g.drawRect(100, 100, 100, 100);
        g.setColor(Color.red);
        g.fillRect(200, 200, 100, 100);
        g.setColor(Color.cyan);
        g.fillRoundRect(300,300,100,100,20,20);
        g.setColor(new Color(200,100,140));
        g.drawOval(400, 400, 100, 100);
    }
}