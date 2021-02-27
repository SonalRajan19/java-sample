/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_5;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sonal L R
 */
public class Demo {
    public static void main(String[] args) {
        JFrame f=new JFrame("My Frame");
        f.add(new JButton("Ok"));
        f.add(new JButton("Cancel"));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
