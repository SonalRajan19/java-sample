/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sonal L R
 */
public class button_demo extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    button_demo()
    {
        setLayout(null);
        b1=new JButton("Red");
        b1.setBounds(100,100,100,50);
        b1.setBackground(Color.red);
        b2=new JButton("Yellow");
        b2.setBounds(210,100,100,50);
        b2.setBackground(Color.yellow);
        b3=new JButton("Blue");
        b3.setBounds(320,100,100,50);
        b3.setBackground(Color.blue);
        
        add(b1);
        add(b2);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setSize(600,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
            getContentPane().setBackground(Color.red);
        if(ae.getSource()==b2)
            getContentPane().setBackground(Color.yellow);
        if(ae.getSource()==b3)
            getContentPane().setBackground(Color.blue);
    }
    public static void main(String[] args){
        new button_demo();
    }
}