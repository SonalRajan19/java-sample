/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 *
 * @author Sonal L R
 */
public class checkbox_demo1 implements ItemListener{
    JLabel l;
    JCheckBox cb1,cb2;
    JScrollBar s1,s2,s3;
    checkbox_demo1()
    {
        JFrame f=new JFrame("Check Box Demo");
        cb1=new JCheckBox("Python");
        cb1.setBounds(100,100,100,50);
        cb2=new JCheckBox("Java");
        cb2.setBounds(100,150,100,50);
        l=new JLabel();
        l.setBounds(100,200,200,50);
        f.add(cb1);
        f.add(cb2);
        f.add(l);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent ae)
    {
        // Object source = ie.getItemSelectable();
           if(cb1.isSelected())
           {
            l.setText("Python Selected");
            //checkBox1.setSelected(false);
           }
            else if(cb2.isSelected())
            l.setText("Java Selected");
           else
            l.setText("Not Selected any item");
    }
    public static void main(String[] args){
        new checkbox_demo1();
    }
}