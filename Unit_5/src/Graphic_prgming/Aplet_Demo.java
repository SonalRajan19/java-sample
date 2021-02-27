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
public class Aplet_Demo extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String str="Java programming";
    public void init() {
    // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {
        setBackground(Color.pink);
        Font f=new Font("TimesNewRoman",Font.BOLD,20);
        g.setFont(f);
        setForeground(Color.YELLOW);
        g.drawString(str, 100, 100); //Java programming
        g.drawLine(0,100,100,100); //________Java programming
        g.drawRect(100,100,100,100); //rectangle is drawn
        
        g.setColor(Color.red);
        g.fillRect(200,200,100,100); //other rectangle is drawn filled with red colour
        
        g.setColor(Color.BLUE);
        g.fillRoundRect(300,300,100,100,20,20); //rectangle with round edges filled with blue color is drawn
        
        //g.setColor(Color.black);
        g.setColor(new Color(20,17,23));
        g.drawOval(400,400,100,100);
    }
    // TODO overwrite start(), stop() and destroy() methods
}