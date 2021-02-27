/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Data_file {
    public static void main(String[] args){
        try
        {
            DataOutputStream ds=new DataOutputStream(new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\all.txt"));
            ds.writeInt(10);     //integer
            ds.writeChar('s');   //character
            ds.writeUTF("java"); //string
            ds.close();          //closing the file
            
            DataInputStream ds1=new DataInputStream(new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\all.txt"));
            System.out.println(ds1.readInt());
            System.out.println(ds1.readChar());
            System.out.println(ds1.readUTF());
            ds1.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}