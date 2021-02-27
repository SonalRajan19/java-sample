/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_handling;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sonal L R
 */
public class mouse_adapter extends MouseAdapter{  
    Frame f;  
    mouse_adapter()
    {  
        f=new Frame("Mouse Adapter");  
        f.addMouseListener(this);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
    }  
    public void mouseClicked(MouseEvent e) {  
        Graphics g=f.getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
    public static void main(String[] args) {  
        new mouse_adapter();  
    } 
}
