/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Sonal L R
 */
public class list_demo {
    list_demo()
    {
        JFrame f=new JFrame();
        JLabel l=new JLabel();
        l.setSize(500,100);
        JButton b=new JButton("Show");
        b.setBounds(200,150,80,30);
        
        DefaultListModel<String> l1=new DefaultListModel<>();
        l1.addElement("C");
        l1.addElement("C++");
        l1.addElement("Java");
        l1.addElement("Python");
        JList<String> list1=new JList<>(l1);
        list1.setBounds(100,100,75,75);
        
        DefaultListModel<String> l2=new DefaultListModel<>();
        l2.addElement("Turbo C++");
        l2.addElement("Struts");
        l2.addElement("Netbeans");
        l2.addElement("IDLE");
        JList<String> list2=new JList<>(l2);
        list2.setBounds(100,200,75,75);
        
        f.add(list1);
        f.add(list2);
        f.add(b);
        f.add(l);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String data="";
                if(list1.getSelectedIndex()!=-1){
                    data="Programming Language Selected : "+list1.getSelectedValue();
                    //l.setText(data);
                }
                if(list2.getSelectedIndex()!=-1){
                    data+="Framework Selected : ";
                    for(Object frame:list2.getSelectedValues()){
                        data+=frame+" ";
                    }
                }
                l.setText(data);
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new list_demo();
    }
}