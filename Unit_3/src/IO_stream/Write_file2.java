/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Write_file2 {
    public static void main(String[] args){
        File f=new File("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\second.txt");
        String str="Object Oriented Programming";
        byte b[]=str.getBytes();
        for(byte b1:b)
        {
            System.out.println(b1+".."+(char)b1); //shows the index value of each characters
        }
        try
        {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\second.txt");
            fos.write(b);
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
