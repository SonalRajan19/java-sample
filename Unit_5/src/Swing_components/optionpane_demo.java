/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonal L R
 */
public class optionpane_demo {
    JFrame f;
    optionpane_demo()
    {
        f=new JFrame();
        //JOptionPane.showMessageDialog(f,"Hello, Welcome to Java Class!");
        //JOptionPane.showMessageDialog(f,"Successfully Updated!"," ",JOptionPane.WARNING_MESSAGE);
        String name=JOptionPane.showInputDialog(f,"Enter name:");
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new optionpane_demo();
    }
}