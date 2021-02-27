/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonal L R
 */
public class checkbox_demo extends JFrame implements ItemListener {
    JCheckBox c1,c2,c3;
    JButton b;
    JLabel l;
    checkbox_demo()
    {
        c1=new JCheckBox("Frock"); 
        c1.setBounds(100,100,100,50);
        c2=new JCheckBox("Saree"); 
        c2.setBounds(100,170,100,50);
        c3=new JCheckBox("Skirt"); 
        c3.setBounds(100,240,100,50);
        b=new JButton("Click");
        b.setBounds(150,360,100,50);
        l=new JLabel("Result");
        l.setBounds(50,50,100,100);
        
        add(c1);
        add(c2);
        add(c3);
        add(b);
        add(l);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        setSize(600,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent ie){
        if(c1.isSelected())
            JOptionPane.showMessageDialog(this,c1.getText()+" Selected");
        if(c2.isSelected())
            JOptionPane.showMessageDialog(this,c2.getText()+" Selected");
        if(c3.isSelected())
            JOptionPane.showMessageDialog(this,c3.getText()+" Selected");
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s="";
        if(c1.isSelected())
            s=s+c1.getText();
        if(c2.isSelected())
            s=s+c3.getText();
        if(c2.isSelected())
            s=s+c3.getText();
        l.setText(s);
    }
    public static void main(String[] args){
        new checkbox_demo();
    }
}