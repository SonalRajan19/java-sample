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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sonal L R
 */
public class usernamecheck_demo extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    usernamecheck_demo()
    {
        l1=new JLabel("Username:");
        l1.setBounds(100,100,150,30);
        l2=new JLabel("Password:");
        l2.setBounds(100,150,150,30);
        t1=new JTextField();
        t1.setBounds(200,100,150,30);
        t2=new JTextField();
        t2.setBounds(200,150,150,30);
        b1=new JButton("Click");
        b1.setBounds(180,200,150,30);
        
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        
        b1.addActionListener(this);
        
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(t1.getText().equals("sonal") && t2.getText().equals("123"))
        {
            JOptionPane.showMessageDialog(null," Welcome "+t1.getText()+"!!");
        }
        else
            JOptionPane.showMessageDialog(null,"Invalid username and password!");
    }
    public static void main(String[] args){
        new usernamecheck_demo();
    }
}