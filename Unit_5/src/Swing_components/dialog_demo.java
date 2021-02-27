/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sonal L R
 */
public class dialog_demo {
    private static JDialog d;  
    dialog_demo() {  
        JFrame f=new JFrame();  
        d=new JDialog(f,"Dialog Example",true);  
        d.setLayout(new FlowLayout());  
        JButton b=new JButton ("OK");  
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) {  
                dialog_demo.d.setVisible(false);  
            }  
        });  
        d.add(new JLabel("Click button to continue."));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);       
    }  
    public static void main(String[] args){
        new dialog_demo();
    }
}