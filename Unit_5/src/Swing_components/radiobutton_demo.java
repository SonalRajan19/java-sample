/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Sonal L R
 */
public class radiobutton_demo implements ItemListener{
    JFrame f;
    JRadioButton b1,b2;
    ButtonGroup bg;
    JLabel l;
    radiobutton_demo()
    {
        f=new JFrame();
        b1=new JRadioButton("Rabbit");
        b2=new JRadioButton("Parrot");
        bg=new ButtonGroup();
        l=new JLabel();
        l.setBounds(200,50,100,30);
         
        bg.add(b1);
        bg.add(b2);
        f.add(b1);
        b1.setBounds(100,50,100,30);
        f.add(b2);
        b2.setBounds(100,100,100,30);
        
        f.add(l);
        b1.addItemListener(this);
        b2.addItemListener(this);
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(b1.isSelected())
            l.setIcon(new ImageIcon("C:\\Users\\lrsub\\OneDrive\\Documents\\NetBeansProjects\\Unit_5\\src\\Swing_components\\Rabbit.jpg"));
        if(b2.isSelected())
            l.setIcon(new ImageIcon("C:\\Users\\lrsub\\OneDrive\\Documents\\NetBeansProjects\\Unit_5\\src\\Swing_components\\Parrot.jpg"));
    }
    public static void main(String[] args){
        new radiobutton_demo();
    }
}