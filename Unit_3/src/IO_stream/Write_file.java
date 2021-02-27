/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

/**
 *
 * @author SONAL L R
 */
public class Write_file {
    public static void main(String[] args){
        File f=new File("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\first.txt");
        String str="Welcome to oops class";
        byte b[]=str.getBytes();
        try
        {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\first.txt");
            fos.write(b);
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}