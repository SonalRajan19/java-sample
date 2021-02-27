/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_prgming;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Sonal L R
 */
public class Lamp extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(30,250,250,30);
        
        //base of the lamp
        g.drawLine(125,250,125,160);
        g.drawLine(175,250,175,160);
        
        //lamp shade,top and bottom edges
        g.drawArc(85,157,130,50,-65,312);
        g.drawArc(85,87,130,50,62,58);
        
        //lamp shade, sides
        g.drawLine(85,177,119,89);
        g.drawLine(215,177,181,89);
        
        //dots on shade
        g.fillArc(78,120,40,40,63,-174);
        g.fillOval(120,96,40,40);
        g.fillArc(173,100,40,40,110,180);
    }
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
