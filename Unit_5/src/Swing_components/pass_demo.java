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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sonal L R
 */
public class pass_demo implements ActionListener {  
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField tf2;  
    JButton b1;  
    JFrame f;
    pass_demo()
    {  
        f=new JFrame(); 
        l1=new JLabel("User Name");
        l1.setBounds(50,50,150,20);  
        l2=new JLabel("Password");
        l2.setBounds(50,100,150,20);  
        l3=new JLabel();
        l3.setBounds(50,150,150,20); 
        tf1=new JTextField();  
        tf1.setBounds(200,50,150,20);  
        tf2=new  JPasswordField();  
        tf2.setBounds(200,100,150,20);  
        b1=new JButton("Submit");  
        b1.setBounds(150,200,150,50);  
        b1.addActionListener(this);  
        f.add(l1); 
        f.add(l2); 
        f.add(l3);
        f.add(tf1);
        f.add(tf2);
        f.add(b1);
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        char s2[]=tf2.getPassword(); 
        String s3=new String(s2);
        if(s1.equals("abc")&&s3.equals("123"))
            JOptionPane.showMessageDialog(f,"WELCOME............."+s1);
        else
             JOptionPane.showMessageDialog(null,"Invalid User name & Password");
    }  
    public static void main(String[] args) {  
        new pass_demo();  
    }
}