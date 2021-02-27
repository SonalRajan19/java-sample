/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sonal L R
 */
public class Frame_demo1 extends Frame{
    int x,y;
    Frame_demo1()
    {
        setSize(600,400);
        setTitle("Frame Demo");
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }
    public static void main(String[] args){
        new Frame_demo1();
    }
}