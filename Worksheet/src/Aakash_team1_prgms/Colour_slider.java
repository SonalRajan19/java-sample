/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JScrollBar;

/**
 *
 * @author Sonal L R
 */
public class Colour_slider implements AdjustmentListener{
    JFrame f;
    JScrollBar s1,s2,s3;
    Colour_slider()
    {
        f=new JFrame("Color Slider");
        s1=new JScrollBar(JScrollBar.VERTICAL,0,0,0,128);
        s2=new JScrollBar(JScrollBar.VERTICAL,0,0,0,128);
        s3=new JScrollBar(JScrollBar.VERTICAL,0,0,0,128);
        s1.setBounds(100,100,30,100);
        s2.setBounds(140,100,30,100);
        s3.setBounds(180,100,30,100);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        f.add(s1);
        f.add(s2);
        f.add(s3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        int red=s1.getValue();
        int green=s1.getValue();
        int blue=s1.getValue();
        System.out.println(red);
        f.getContentPane().setBackground(new Color(red,green,blue));
    }
    public static void main(String[] args){
        new Colour_slider();
    }   
}