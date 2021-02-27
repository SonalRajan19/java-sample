/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Sonal L R
 */
public class menu_demo {
    public static void main(String[] args){
        new CreationMenu();
    }
}
class CreationMenu extends JFrame implements ActionListener {
    JMenu m1,m2,m3,m4;
    JMenuBar mb=new JMenuBar();
    JTextArea ta;
    JMenuItem mi,mo,ms;
    CreationMenu()
    {
        m1=new JMenu("File");
        m1=new JMenu("Edit");
        m1=new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mi=new JMenuItem("New");
        mo=new JMenuItem("Open");
        m4=new JMenu("Save");
        ms=new JMenuItem("Save As");
        m1.add(mi);
        m1.add(mo);
        m4.add(ms);
        m1.add(m4);
        ta=new JTextArea(400,400);
        add(ta);
        mi.addActionListener(this);
        mo.addActionListener(this);
        ms.addActionListener(this);
        setJMenuBar(mb);
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("New")) {
            ta.setBounds(0,0,600,400);
        }
        if(ae.getActionCommand().equals("Open")) {
            JFileChooser fc=new JFileChooser();
            int i=fc.showOpenDialog(this);
            if(i==JFileChooser.APPROVE_OPTION) {
                File f=fc.getSelectedFile();
                String filepath=f.getPath();
                try {
                    BufferedReader br=new BufferedReader(new FileReader(filepath));
                    String s1="",s2="";
                    while((s1=br.readLine())!=null) {
                        s2+=s1+"\n";
                    }
                    ta.setBounds(0,0,600,400);
                    ta.setText(s2);
                    br.close();
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        if(ae.getActionCommand().equals("Save As")) {
            String name=JOptionPane.showInputDialog(null,"Enter Name:");
            try {
                FileWriter fw=new FileWriter(name+".txt");
                fw.write(ta.getText());
                fw.close();
            }
            catch(IOException e) {
                
            }
            finally {
                ta.setText(" ");
            }
        }
    }
}