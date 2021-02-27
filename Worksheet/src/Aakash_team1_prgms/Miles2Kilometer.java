/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sonal L R
 */
public class Miles2Kilometer extends JFrame implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JTextField tf1,tf2;
    JButton b;
    Miles2Kilometer()
    {
        f=new JFrame("Miles to Kilometer Coverter");
        f.setSize(350,200);
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER,20,20);
        f.setLayout(fl);
        Font f1=new Font("Algerian",Font.BOLD,20);
        Font f2=new Font("Algerian",Font.BOLD,20);
        l1=new JLabel("Miles:");
        l1.setBounds(100,25,100,30);
        l2=new JLabel("Kilometers:");
        l2.setBounds(200,75,100,30);
        l1.setFont(f1);
        l2.setFont(f1);
        tf1=new JTextField("",15);
        tf2=new JTextField("",15);   
        tf1.setFont(f1);
        tf2.setFont(f1);
        b=new JButton("Convert!");
        b.setFont(f2);
        f.add(l1);
        f.add(tf1);
        //f.add(b);
        f.add(l2);
        f.add(tf2);
        f.add(b);
        b.addActionListener(this);
        f.setVisible(true);  
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        double m=Double.parseDouble(tf1.getText());
        double km=m*1.609;
        tf2.setText(Double.toString(km));
    }
    public static void main(String[] args){
        new Miles2Kilometer();
    }   
}