/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sonal L R
 */
public class label_demo implements ActionListener {
    JFrame f;
    JLabel l1,l2;
    JButton b;
    label_demo()
    {
        f=new JFrame();
        f.setVisible(true);
        f.setLayout(null);
        l1=new JLabel("First Label");
        l1.setBounds(50,50,100,30);
        l2=new JLabel("Second Label");
        l2.setBounds(50,100,100,30);
        b=new JButton(new ImageIcon("Button.jpg"));
        b.setBounds(50,150,80,70);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.setSize(300,300);
        b.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        String s=l1.getText();
        l2.setText(s);
    }   
    public static void main(String[] args){
        new label_demo();
    }
}