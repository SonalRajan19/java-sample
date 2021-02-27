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
public class Smiley extends Applet {
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(20,20,150,150);
        g.setColor(Color.BLACK);
        g.fillOval(50,60,15,25);
        g.fillOval(120,60,15,25);
        int x[]={95,85,106,95};
        int y[]={85,104,104,85};
        g.drawPolygon(x,y,4);
        g.drawArc(55,95,78,50,0,-180);
        g.drawLine(50,126,60,116);
        g.drawLine(128,115,139,126);
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
