/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Byte_array_demo2 {
    public static void main(String[] args){
        try
        {
            //To write 5 files in the same content.
            FileOutputStream f=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\a.txt");
            FileOutputStream f1=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\b.txt");
            FileOutputStream f2=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\c.txt");
            ByteArrayOutputStream ba=new ByteArrayOutputStream();
            String str="The complete reference in tha java programming.";
            //FileInputStream f3=new FileInputStream("two.txt");
            byte b[]=str.getBytes(); //string converted to byte
            for(byte b1:b)
                System.out.println(b1);
            ba.write(b); //writing inside stream
            //writing inside the file
            ba.writeTo(f);
            ba.writeTo(f1);
            ba.writeTo(f2);
            ba.close();
            f.close();
            f1.close();
            f2.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
