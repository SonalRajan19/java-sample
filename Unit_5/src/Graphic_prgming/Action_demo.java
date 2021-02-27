/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_prgming;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sonal L R
 */
public class Action_demo extends Applet implements ActionListener {
    TextField tf;  
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        tf=new TextField();  
        tf.setBounds(60,50,200,20);  
        Button b=new Button("click me");  
        b.setBounds(50,120,80,30);  
        b.addActionListener(this); 
        add(b);
        add(tf);  
    }
    public void actionPerformed(ActionEvent ae){  
        tf.setText("Welcome");  
    }  
}
    // TODO overwrite start(), stop() and destroy() methods