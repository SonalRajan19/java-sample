/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonal L R
 */
public class optionpane_demo1 extends WindowAdapter{  
    JFrame f;  
    optionpane_demo1()
    {  
        f=new JFrame();   
        f.addWindowListener(this);  
        f.setSize(300, 300);  
        f.setLayout(null);  
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
        f.setVisible(true);  
    }  
    public void windowClosing(WindowEvent we) {  
        int a=JOptionPane.showConfirmDialog(f,"Are you sure you want to quit?");  
        if(a==JOptionPane.YES_OPTION){  
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        }  
    }     
    public static void main(String[] args) {  
        new  optionpane_demo1();  
    }
}