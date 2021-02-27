/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sonal L R
 */
public class combobox_demo {
    JFrame f;
    combobox_demo()
    {
        f=new JFrame("Combo Box Demo");
        final JLabel l=new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400,100);
        JButton b=new JButton("Show");
        b.setBounds(200,100,75,20);
        String languages[]={"C","C++","Python","Oop","Java","C#"};
        final JComboBox cb=new JComboBox(languages);
        cb.setBounds(50,100,90,20);
        f.add(cb);
        f.add(l);
        f.add(b);
        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                String data="Programming language selected : "+cb.getItemAt(cb.getSelectedIndex()); //name(index)
                l.setText(data);
            }
        });
    }
    public static void main(String[] args){
        new combobox_demo();
    }
}