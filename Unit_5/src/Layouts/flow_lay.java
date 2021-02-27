/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Sonal L R
 */
public class flow_lay {
    public static void main(String[] args){
        new flowdemo();
    }
}
class flowdemo extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    flowdemo()
    {
        b1=new JButton("1");
        b1=new JButton("2");
        b1=new JButton("3");
        b1=new JButton("4");
        b1=new JButton("5");
        b1=new JButton("6");
        b1=new JButton("7");
        b1=new JButton("8");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        setSize(400,400);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        //setLayout(new FlowLayout(FlowLayout.RIGHT));
        //setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}