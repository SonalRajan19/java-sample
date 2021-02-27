/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author SONAL L R
 */
public class Sequence_demo1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream f=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\a.txt");
        FileInputStream f1=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\first.txt");
        FileInputStream f2=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\all.txt");
        FileInputStream f3=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\b.txt");
        Vector v=new Vector();
        v.add(f);
        v.add(f1);
        v.add(f2);
        v.add(f3);
        Enumeration e=v.elements();
        SequenceInputStream sq=new SequenceInputStream(f,f1);
        int read; //reads file
        while((read=sq.read())!=-1)
            System.out.print((char)read);
        sq.close();
        f.close();
        f1.close();
    }
}