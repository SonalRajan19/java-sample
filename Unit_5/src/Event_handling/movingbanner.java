/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_handling;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sonal L R
 */
public class movingbanner extends Frame implements Runnable {
    Thread t;
    String str="Java Programming ";
    char c;
    movingbanner()
    {
        t=new Thread(this);
        t.start();
        setSize(600,400);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    public void run()
    {
        try
        {
            while(true)
            {
                c=str.charAt(0);
                str=str.substring(1);
                str=str+c;
                Thread.sleep(100);
                repaint();
            }
        }
        catch(Exception e)
        {
            
        }
    }
    public void paint(Graphics g)
    {
        setBackground(Color.CYAN);
        setForeground(Color.ORANGE);
        Font f=new Font("Arial",Font.BOLD,40);
        g.setFont(f);
        g.drawString(str,100,100);
    }
    public static void main(String[] args){
        new movingbanner();
    }
}