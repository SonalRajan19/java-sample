/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_handling;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Sonal L R
 */
public class window_demo extends Frame implements WindowListener {
    window_demo()
    {
        addWindowListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new window_demo();
    }
    public void WindowActivated(WindowEvent arg0)
    {
        System.out.println("Activated");
    }
    public void WindowClosed(WindowEvent arg0)
    {
        System.out.println("Closed");
    }
    public void WindowClosing(WindowEvent arg0)
    {
        System.out.println("Closing");
        dispose();
    }
    public void windowDeactivated(WindowEvent arg0)
    {
        System.out.println("Deactivated");
    }
    public void windowDeiconified(WindowEvent arg0) 
    {  
        System.out.println("deiconified");  
    }  
    public void windowIconified(WindowEvent arg0) 
    {  
        System.out.println("iconified");  
    }  
    public void windowOpened(WindowEvent arg0) 
    {  
        System.out.println("opened");  
    }    
}