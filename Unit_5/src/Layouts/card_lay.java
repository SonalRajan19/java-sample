/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sonal L R
 */
public class card_lay extends JFrame implements ActionListener {
    CardLayout card;
    JButton b1,b2,b3; 
    Container c;
    card_lay()
    {
        c=getContentPane();
        card=new CardLayout(40,30);
        //create CardLayout object with 40 hor space and 30 ver space 
        c.setLayout(card);
        b1=new JButton("Apple");
        b2=new JButton("Orange");
        b3=new JButton("Banana");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);
    }
    public void actionPerformed(ActionEvent ae)
    {
        card.next(c); //calling other component in card layout
    }
    public static void main(String[] args){
        new card_lay();
    }
}