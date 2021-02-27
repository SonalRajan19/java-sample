/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sonal L R
 */
public class Frame_demo2 {
    Frame f;
    Frame_demo2()
    {
        f=new Frame("Frame Demo-2");
        f.setSize(600,400);
        f.setBackground(Color.yellow);
        f.setVisible(true);
        f.repaint();
        f.addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent we)
            {
                f.dispose();;
            }
        });
    }
    public static void main(String[] args){
        
    }
}
