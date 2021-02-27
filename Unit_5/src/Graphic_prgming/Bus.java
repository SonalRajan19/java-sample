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
public class Bus extends Applet {
    public void paint(Graphics g){
        setBackground(Color.LIGHT_GRAY);
        
        g.setColor(Color.black);
        g.fillRect(10,30,100,50);
        
        g.setColor(Color.red);
        g.fillOval(20,70,20,20);
        g.fillOval(80,70,20,20);
        
        g.setColor(Color.cyan);
        g.fillRect(80,40,30,20);
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