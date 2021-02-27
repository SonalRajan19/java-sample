/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_handling;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Sonal L R
 */
public class mouselistener extends Applet implements MouseListener {
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseEntered(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.red);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    @Override
    public void mousePressed(MouseEvent e) 
    {
        Graphics g=getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    @Override
    public void mouseReleased(MouseEvent e) 
    {
        Graphics g=getGraphics();
        g.setColor(Color.yellow);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseExited(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.GREEN);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    // TODO overwrite start(), stop() and destroy() methods
}