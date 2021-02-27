/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sonal L R
 */
public class grid_lay {
    public static void main(String[] args) {
       new griddemo();
    }  
}
class griddemo extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    griddemo()
    {
        
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        setSize(400,400);
        setLayout(new GridLayout(3,3));
       // setLayout(new FlowLayout(FlowLayout.RIGHT));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}