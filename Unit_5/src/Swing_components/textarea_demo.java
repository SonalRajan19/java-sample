/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Sonal L R
 */
public class textarea_demo implements ActionListener{
    JLabel l1,l2;
    JTextArea area;
    JButton b;
    textarea_demo()
    {
        JFrame f=new JFrame();
        l1=new JLabel();
        l1.setBounds(50,250,100,30);
        l2=new JLabel();
        l2.setBounds(150,250,100,30);
        area=new JTextArea(50,50);
        area.setBounds(20,17,250,200);
        b=new JButton("Count words");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String text=area.getText();
        String words[]=text.split(" ");
        l1.setText("Words: "+words.length);
        l2.setText("Character: "+text.length());
    }
    public static void main(String[] args){
        new textarea_demo();
    }
}